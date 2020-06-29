package messagerosa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XMessageRepo  extends JpaRepository<XMessageDAO, Long> {
    XMessageDAO findByuserId(String userID);
}

