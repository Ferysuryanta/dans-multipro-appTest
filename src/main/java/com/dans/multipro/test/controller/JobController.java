package com.dans.multipro.test.controller;

import java.util.List;
import java.util.UUID;

import com.dans.multipro.test.dto.JobDto;
import com.dans.multipro.test.repository.JobFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobFeign jobFeign;

    @GetMapping
    public Object listJob() {

        List<JobDto> listJob = jobFeign.getListJob();
        return listJob;
    }

    @GetMapping("/{id}")
    public JobDto getJob(@PathVariable("id") UUID id) {
        return jobFeign.getJobById(id);
    }
}
