package messagerosa.dao;

import messagerosa.core.model.XMessage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class XMessageDAOUtills {

    public static XMessageDAO convertXMessageToDAO(XMessage xmsg){
        XMessageDAO xmsgDao = new XMessageDAO();
        xmsgDao.setGupshupMessageId(xmsg.getMessageId().getGupshupMessageId());
        xmsgDao.setWhatsappMessageId(xmsg.getMessageId().getWhatsappMessageId());
        xmsgDao.setUserId(xmsg.getTo().getUserID());
        xmsgDao.setFromId(xmsg.getFrom().getUserID());
        xmsgDao.setChannel(xmsg.getChannelURI());
        xmsgDao.setProvider(xmsg.getProviderURI());
        xmsgDao.setXMessage(xmsg.getPayload().getText());

        xmsgDao.setXMessage(xmsg.getPayload().getText());

        LocalDateTime triggerTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(xmsg.getTimestamp()),
                        TimeZone.getDefault().toZoneId());

        xmsgDao.setTimestamp(LocalDateTime.from(triggerTime));
        if(xmsg.getMessageState()!=null ) {
            xmsgDao.setMessageState(xmsg.getMessageState().name());
        }
        xmsgDao.setApp(xmsg.getApp());
        return xmsgDao;
    }
}
