package com.example.Apr24FirstApi.representing_inherritence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name= "dumy_user")
public class User {
    @Id
    private long id;
    private String username;
    private String password;

}
