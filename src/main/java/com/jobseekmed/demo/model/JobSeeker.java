package com.jobseekmed.demo.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobSeeker extends User {

    private String cv;

    @ElementCollection
    private List<String> skills;


    public void applyForJob(){

    }
    public List<Referral> viewReferrals() {
        return null;
    }
}




}
