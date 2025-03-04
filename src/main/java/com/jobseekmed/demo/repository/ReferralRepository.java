package com.jobseekmed.demo.repository;

import com.jobseekmed.demo.model.Employee;
import com.jobseekmed.demo.model.Enum.ReferralStatus;
import com.jobseekmed.demo.model.JobSeeker;
import com.jobseekmed.demo.model.Referral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferralRepository extends JpaRepository<Referral, Long> {
    List<Referral> findByStatus(ReferralStatus status);
    List<Referral> findByReferredBy(Employee employee);
    List<Referral> findByReferredTo(JobSeeker jobSeeker);
}
