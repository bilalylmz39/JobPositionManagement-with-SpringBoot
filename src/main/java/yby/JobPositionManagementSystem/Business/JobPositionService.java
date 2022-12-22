package yby.JobPositionManagementSystem.Business;

import yby.JobPositionManagementSystem.Entities.JobPosition;

import java.util.List;

public interface JobPositionService {

    List<JobPosition> getAll();
}
