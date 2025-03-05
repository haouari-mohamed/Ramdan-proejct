package com.jobseekmed.demo.service;

import com.jobseekmed.demo.model.Job;
import com.jobseekmed.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    public List<Job> getJobsByLocation(String location) {
        return jobRepository.findByLocation(location);
    }

    public List<Job> getJobsBySalaryGreaterThan(Double salary) {
        return jobRepository.findBySalaryGreaterThan(salary);
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJob(Long id, Job jobDetails) {
        Job existingJob = jobRepository.findById(id).orElse(null);
        if (existingJob != null) {
            existingJob.setTitle(jobDetails.getTitle());
            existingJob.setDescription(jobDetails.getDescription());
            existingJob.setLocation(jobDetails.getLocation());
            existingJob.setSalary(jobDetails.getSalary());
            return jobRepository.save(existingJob);
        }
        return null;
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
