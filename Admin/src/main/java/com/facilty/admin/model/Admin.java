package com.facilty.admin.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor

@Document(collection = "admin")
public final class Admin {
    @Setter
    @Getter
    @Id
    private String adminId;
    @NotEmpty
    private String adminName;
    @Email
    private String adminEmail;
    private String adminPassword;
    private String phone;

//    public Admin(String id, String name, String email, String password, String phone) {
//        this.adminId = id;
//        this.adminName = name;
//        this.adminEmail=email;
//        this.adminPassword=password;
//        this.phone=phone;
//    }

    public String getId() {
        return adminId;
    }


    public String getName() {
        return adminName;
    }

    public void setName(String name) {
        this.adminName = name;
    }


    public String getEmail() {
        return adminEmail;
    }

    public void setEmail(String email) {
        this.adminEmail = adminEmail;
    }


    public String getPassword() {
        return adminPassword;
    }

    public void setPassword(String password) {
        this.adminPassword = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //    public void setId(String id) {
//        this.adminId = id;
//    }
}