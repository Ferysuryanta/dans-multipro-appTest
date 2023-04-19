package com.dans.multipro.test.repository;

import java.util.List;
import java.util.UUID;

import com.dans.multipro.test.dto.JobDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "job", url = "${app.jobs-url}")
public interface JobFeign {

    @GetMapping("/positions.json")
    List<JobDto> getListJob();

    @GetMapping("/positions/{id}")
    JobDto getJobById(@PathVariable("id") UUID id);
}