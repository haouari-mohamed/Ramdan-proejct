package com.jobseekmed.demo.model;


import com.jobseekmed.demo.model.Enum.UserRole;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Admin extends User {

    public void manageUsers(){

    }

    public Admin(Long id, String username, String email, String password, UserRole role) {
        super(id, username, email, password, role);
    }

    public Admin() {
    }

    public void approveJob (Job job){

    }

    public void removeJob(Job job){

    }
}
