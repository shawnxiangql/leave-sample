package ddd.leave.repository;

import ddd.leave.domain.po.LeaveEventPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveEventDao extends JpaRepository<LeaveEventPO, String> {

}
