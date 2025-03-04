package com.jobseekmed.demo.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private Employee postedBy;

    public void post() {
    }

    public void updateDetails(String title, String desc, Double salary) {
        this.title = title;
        this.description = desc;
        this.salary = salary;
    }
}
