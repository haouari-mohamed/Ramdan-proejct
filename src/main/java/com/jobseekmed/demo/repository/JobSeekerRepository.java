package com.jobseekmed.demo.repository;

import com.jobseekmed.demo.model.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    List<JobSeeker> findBySkillsIn(List<String> skills);
    JobSeeker findByCv(String cv);
}
