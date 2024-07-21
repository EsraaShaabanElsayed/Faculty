package com.facilty.admin.controller;

import com.facilty.admin.model.Admin;
import com.facilty.admin.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@Controller
@RequestMapping("/admin")

public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findByid(@PathVariable String id){
        return ResponseEntity.ok(adminService.findById(id));
    }

    @GetMapping("")
    public  ResponseEntity<?> findAll(){

        return ResponseEntity.ok(adminService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> insert(@Valid @RequestBody Admin entity){
        return ResponseEntity.ok(adminService.insertAdmin(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Admin entity){
        return ResponseEntity.ok(adminService.updateAdmin(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable String id) {
        adminService.deleteAdmin(id);
        return ResponseEntity.ok("Deleted successfully!");
    }

}
