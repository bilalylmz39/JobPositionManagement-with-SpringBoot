package yby.JobPositionManagementSystem.Entities;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "Positions")

public class JobPosition {

    public JobPosition() {

    }

    @Id
    @GeneratedValue


    @Column(name = "position_id")
    private int id;

    @Column(name = "position_name")
    private int jobPositionName;

    public JobPosition(int id, int jobPositionName) {
        this.id = id;
        this.jobPositionName = jobPositionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJobPositionName() {
        return jobPositionName;
    }

    public void setJobPositionName(int jobPositionName) {
        this.jobPositionName = jobPositionName;
    }
}
