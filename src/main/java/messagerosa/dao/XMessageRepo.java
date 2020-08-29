package messagerosa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XMessageRepo  extends JpaRepository<XMessageDAO, Long> {

    List<XMessageDAO> findAllByFromIdOrderByTimestampDesc(String fromID);


    List<XMessageDAO> findAllByUserId(String userID);

    List<XMessageDAO> findAllByUserIdOrderByTimestampDesc(String userID);

    List<XMessageDAO> findAllByUserIdOrderByTimestamp(String userID);

    XMessageDAO findByGupshupMessageId(String gsmsid);

    XMessageDAO findByWhatsappMessageId(String gsmsid);

    List<XMessageDAO> findAllByFromIdAndMessageStateOrderByTimestamp(String userID,String messageState);

}

