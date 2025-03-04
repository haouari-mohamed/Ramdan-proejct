package com.jobseekmed.demo.repository;

import com.jobseekmed.demo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByLocation(String location);
    List<Job> findBySalaryGreaterThan(Double salary);
}

