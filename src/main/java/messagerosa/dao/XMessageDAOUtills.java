package messagerosa.dao;

import messagerosa.core.model.XMessage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class XMessageDAOUtills {

    public static XMessageDAO convertXMessageToDAO(XMessage xmsg) {
        XMessageDAO xmsgDao = new XMessageDAO();
        if (xmsg.getMessageId() != null && xmsg.getMessageId().getChannelMessageId() != null) {
            try{
                xmsgDao.setMessageId(xmsg.getMessageId().getChannelMessageId().split("-")[1]);
                xmsgDao.setCauseId(xmsg.getMessageId().getChannelMessageId().split("-")[0]);
            }catch (Exception e){
                xmsgDao.setMessageId(xmsg.getMessageId().getChannelMessageId());
            }
        }
        xmsgDao.setReplyId(xmsg.getMessageId().getReplyId());

        xmsgDao.setUserId(xmsg.getTo().getUserID());
        xmsgDao.setFromId(xmsg.getFrom().getUserID());

        xmsgDao.setChannel(xmsg.getChannelURI());
        xmsgDao.setProvider(xmsg.getProviderURI());

        xmsgDao.setXMessage(xmsg.getPayload().getText());

        LocalDateTime triggerTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(xmsg.getTimestamp()),
                        TimeZone.getDefault().toZoneId());

        xmsgDao.setTimestamp(LocalDateTime.from(triggerTime));

        if (xmsg.getMessageState() != null) {
            xmsgDao.setMessageState(xmsg.getMessageState().name());
        }

        xmsgDao.setApp(xmsg.getApp());
        return xmsgDao;
    }
}
