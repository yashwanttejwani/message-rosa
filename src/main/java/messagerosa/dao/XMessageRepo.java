package messagerosa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface XMessageRepo  extends JpaRepository<XMessageDAO, Long> {
    XMessageDAO findByuserId(String userID);
}

