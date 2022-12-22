package yby.JobPositionManagementSystem.Business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yby.JobPositionManagementSystem.DataAccess.JobPositionDao;
import yby.JobPositionManagementSystem.Entities.JobPosition;

import java.util.List;

@Service
public class JobPositionManager implements yby.JobPositionManagementSystem.Business.JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired //Constructor injection
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }




    @Override
    public List<JobPosition> getAll() {
        System.out.println("All Positions :\n");
        return this.jobPositionDao.findAll();
    }
}
