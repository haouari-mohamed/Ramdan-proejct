package com.jobseekmed.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends User {
    private String company;

    @OneToMany(mappedBy = "referredBy")
    private List<Referral> referrals;

    public void postJob(Job job) {
    }

    public Referral referCandidate(JobSeeker candidate, Job job) {
        return new Referral();
    }
}
