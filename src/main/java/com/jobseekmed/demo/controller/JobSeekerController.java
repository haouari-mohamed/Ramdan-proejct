package com.jobseekmed.demo.controller;


import com.jobseekmed.demo.model.JobSeeker;
import com.jobseekmed.demo.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseekers")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @GetMapping
    public List<JobSeeker> getAllJobSeekers() {
        return jobSeekerService.getAllJobSeekers();
    }

    @GetMapping("/{id}")
    public JobSeeker getJobSeekerById(@PathVariable Long id) {
        return jobSeekerService.getJobSeekerById(id);
    }

    @GetMapping("/skills")
    public List<JobSeeker> findJobSeekersBySkills(@RequestParam List<String> skills) {
        return jobSeekerService.findJobSeekersBySkills(skills);
    }

    @GetMapping("/cv/{cv}")
    public JobSeeker getJobSeekerByCv(@PathVariable String cv) {
        return jobSeekerService.getJobSeekerByCv(cv);
    }

    @PostMapping
    public JobSeeker createJobSeeker(@RequestBody JobSeeker jobSeeker) {
        return jobSeekerService.createJobSeeker(jobSeeker);
    }

    @PutMapping("/{id}")
    public JobSeeker updateJobSeeker(@PathVariable Long id, @RequestBody JobSeeker jobSeekerDetails) {
        return jobSeekerService.updateJobSeeker(id, jobSeekerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteJobSeeker(@PathVariable Long id) {
        jobSeekerService.deleteJobSeeker(id);
    }
}
