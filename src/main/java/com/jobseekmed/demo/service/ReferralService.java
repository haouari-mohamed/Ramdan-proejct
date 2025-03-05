package com.jobseekmed.demo.service;

import com.jobseekmed.demo.model.Employee;
import com.jobseekmed.demo.model.Enum.ReferralStatus;
import com.jobseekmed.demo.model.JobSeeker;
import com.jobseekmed.demo.model.Referral;
import com.jobseekmed.demo.repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferralService {

    @Autowired
    private ReferralRepository referralRepository;

    public List<Referral> getAllReferrals() {
        return referralRepository.findAll();
    }

    public Referral getReferralById(Long id) {
        return referralRepository.findById(id).orElse(null);
    }

    public List<Referral> getReferralsByStatus(ReferralStatus status) {
        return referralRepository.findByStatus(status);
    }

    public List<Referral> getReferralsByReferredBy(Employee employee) {
        return referralRepository.findByReferredBy(employee);
    }

    public List<Referral> getReferralsByReferredTo(JobSeeker jobSeeker) {
        return referralRepository.findByReferredTo(jobSeeker);
    }

    public Referral createReferral(Referral referral) {
        return referralRepository.save(referral);
    }

    public Referral updateReferral(Long id, Referral referralDetails) {
        Referral existingReferral = referralRepository.findById(id).orElse(null);
        if (existingReferral != null) {
            existingReferral.setStatus(referralDetails.getStatus());
            existingReferral.setReferredBy(referralDetails.getReferredBy());
            existingReferral.setReferredTo(referralDetails.getReferredTo());
            return referralRepository.save(existingReferral);
        }
        return null;
    }

    public void deleteReferral(Long id) {
        referralRepository.deleteById(id);
    }
}

