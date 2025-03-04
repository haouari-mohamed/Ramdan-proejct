package com.jobseekmed.demo.model;


import com.jobseekmed.demo.model.Enum.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id ;
    private String username;
    private String email;
    private String password;

    private UserRole role ;

    public void register(){

    }

    public boolean login(){
        return true;
    }
}
