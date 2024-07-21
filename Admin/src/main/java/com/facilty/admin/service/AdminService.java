package com.facilty.admin.service;


import com.facilty.admin.model.Admin;
import com.facilty.admin.repo.AdminRepo;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public Admin findById(String id) {

        return adminRepo.findById(id).get();
    }

    public List<Admin> findAll() {

        return adminRepo.findAll();
    }

    public Admin insertAdmin(Admin admin) {
        if (admin.getId() != null) {
            throw new RuntimeException();
        }
        return adminRepo.insert(admin);
    }

    public Admin updateAdmin(Admin admin) {
        Admin admin1 = findById(admin.getId());
        admin1.setName(admin.getName());
        admin1.setEmail(admin.getEmail());
        admin1.setPassword(admin.getPassword());
        admin1.setPhone(admin.getPhone());

        return adminRepo.save(admin1);
    }

    public void deleteAdmin(String id) {
        adminRepo.deleteById(id);

    }

}
