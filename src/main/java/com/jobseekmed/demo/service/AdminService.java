package com.jobseekmed.demo.service;

import com.jobseekmed.demo.model.Admin;
import com.jobseekmed.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(Long id, Admin adminDetails) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setUsername(adminDetails.getUsername());
            existingAdmin.setPassword(adminDetails.getPassword());
            return adminRepository.save(existingAdmin);
        }
        return null;
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
