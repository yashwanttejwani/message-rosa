package messagerosa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XMessageRepo  extends JpaRepository<XMessageDAO, Long> {

    List<XMessageDAO> findAllByFromIdOrderByTimestampDesc(String fromID);


    List<XMessageDAO> findAllByUserId(String userID);

    XMessageDAO findFirstByReplyIdOrderByTimestampDesc(String replyId);

    XMessageDAO findFirstByCauseIdAndMessageStateOrderByTimestampDesc(String causeId, String messageState);

    List<XMessageDAO> findAllByUserIdOrderByTimestampDesc(String userID);

    List<XMessageDAO> findAllByUserIdOrderByTimestamp(String userID);

    XMessageDAO findTopByUserIdAndMessageStateOrderByTimestampDesc(String userId, String messageState);
    XMessageDAO findTopByFromIdAndMessageStateOrderByTimestampDesc(String fromId, String messageState);

    XMessageDAO findTopByUserIdOrderByTimestampDesc(String userId);

    List<XMessageDAO> findAllByFromIdAndMessageStateOrderByTimestamp(String userID,String messageState);

}

