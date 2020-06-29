package messagerosa.dao;

import messagerosa.core.model.XMessage;

public class XMessageDAOUtills {

    public static XMessageDAO convertXMessageToDAO(XMessage xmsg){
        XMessageDAO xmsgDao = new XMessageDAO();
        xmsgDao.setGupshupMessageID(xmsg.getMessageId().getGupshupMessageID());
        xmsgDao.setWhatsappMessageID(xmsg.getMessageId().getWhatsappMessageID());
        xmsgDao.setUserId(xmsg.getTo().getUserID());
        xmsgDao.setFromId(xmsg.getFrom().getUserID());
        xmsgDao.setChannel(xmsg.getChannelURI());
        xmsgDao.setProvider(xmsg.getProviderURI());
        xmsgDao.setTimestamp(xmsg.getTimestamp());
        xmsgDao.setMessageState(xmsg.getMessageState().name());
        xmsgDao.setApp(xmsg.getApp());
        return xmsgDao;
    }
}
