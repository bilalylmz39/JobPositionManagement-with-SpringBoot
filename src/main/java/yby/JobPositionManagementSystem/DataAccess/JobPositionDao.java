package yby.JobPositionManagementSystem.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import yby.JobPositionManagementSystem.Entities.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
