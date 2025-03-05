package com.jobseekmed.demo.service;

import com.jobseekmed.demo.model.JobSeeker;
import com.jobseekmed.demo.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService {

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    public List<JobSeeker> getAllJobSeekers() {
        return jobSeekerRepository.findAll();
    }

    public JobSeeker getJobSeekerById(Long id) {
        return jobSeekerRepository.findById(id).orElse(null);
    }

    public List<JobSeeker> findJobSeekersBySkills(List<String> skills) {
        return jobSeekerRepository.findBySkillsIn(skills);
    }

    public JobSeeker getJobSeekerByCv(String cv) {
        return jobSeekerRepository.findByCv(cv);
    }

    public JobSeeker createJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }

    public JobSeeker updateJobSeeker(Long id, JobSeeker jobSeekerDetails) {
        JobSeeker existingJobSeeker = jobSeekerRepository.findById(id).orElse(null);
        if (existingJobSeeker != null) {
            existingJobSeeker.setSkills(jobSeekerDetails.getSkills());
            existingJobSeeker.setCv(jobSeekerDetails.getCv());
            return jobSeekerRepository.save(existingJobSeeker);
        }
        return null;
    }

    public void deleteJobSeeker(Long id) {
        jobSeekerRepository.deleteById(id);
    }
}

