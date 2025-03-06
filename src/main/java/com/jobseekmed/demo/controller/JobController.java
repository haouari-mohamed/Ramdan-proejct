package com.jobseekmed.demo.controller;


import com.jobseekmed.demo.model.Job;
import com.jobseekmed.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/location/{location}")
    public List<Job> getJobsByLocation(@PathVariable String location) {
        return jobService.getJobsByLocation(location);
    }

    @GetMapping("/salary/{salary}")
    public List<Job> getJobsBySalaryGreaterThan(@PathVariable Double salary) {
        return jobService.getJobsBySalaryGreaterThan(salary);
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job jobDetails) {
        return jobService.updateJob(id, jobDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
    }
}
