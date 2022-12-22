package yby.JobPositionManagementSystem.Api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yby.JobPositionManagementSystem.Business.JobPositionService;
import yby.JobPositionManagementSystem.Entities.JobPosition;

import java.util.List;

@RestController
@RequestMapping(value = "/api/jobpositions")
public class JobPositionsController {

    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    private JobPositionService jobPositionService;

    @GetMapping("/getall")
    public List<JobPosition> getAll() {
        return this.jobPositionService.getAll();
    }
}




