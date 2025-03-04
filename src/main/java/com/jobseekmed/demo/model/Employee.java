package com.jobseekmed.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee  extends User {

    private String company;
    private List<Referral> referrals;

    public void postJob(){

    }
    public Referral referCandidate (JobSeeker candidate, Job job){
        return new Referral ();
    }

}
