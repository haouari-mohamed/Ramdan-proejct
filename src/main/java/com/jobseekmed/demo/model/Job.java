package com.jobseekmed.demo.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "posted_by")
    private Employee postedBy;

    public void post() {
    }

    public void updateDetails(String title, String desc, Double salary) {
        this.title = title;
        this.description = desc;
        this.salary = salary;
    }
}
