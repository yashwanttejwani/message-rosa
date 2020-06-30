package messagerosa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XMessageRepo  extends JpaRepository<XMessageDAO, Long> {
    List<XMessageDAO> findAllByUserId(String userID);
}

