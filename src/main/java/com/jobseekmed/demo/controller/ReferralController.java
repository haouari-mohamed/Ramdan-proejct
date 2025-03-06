package com.jobseekmed.demo.controller;

import com.jobseekmed.demo.model.Referral;
import com.jobseekmed.demo.service.ReferralService;
import com.jobseekmed.demo.model.Enum.ReferralStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referrals")
public class ReferralController {

    @Autowired
    private ReferralService referralService;

    @GetMapping
    public List<Referral> getAllReferrals() {
        return referralService.getAllReferrals();
    }

    @GetMapping("/{id}")
    public Referral getReferralById(@PathVariable Long id) {
        return referralService.getReferralById(id);
    }

    @GetMapping("/status/{status}")
    public List<Referral> getReferralsByStatus(@PathVariable ReferralStatus status) {
        return referralService.getReferralsByStatus(status);
    }

    @PostMapping
    public Referral createReferral(@RequestBody Referral referral) {
        return referralService.createReferral(referral);
    }

    @PutMapping("/{id}")
    public Referral updateReferral(@PathVariable Long id, @RequestBody Referral referralDetails) {
        return referralService.updateReferral(id, referralDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteReferral(@PathVariable Long id) {
        referralService.deleteReferral(id);
    }
}
