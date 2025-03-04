package com.jobseekmed.demo.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin extends User {

    public void manageUsers(){

    }

    public void approveJob (Job job){

    }

    public void removeJob(Job job){

    }
}
