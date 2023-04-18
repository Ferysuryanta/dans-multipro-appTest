package com.dans.multipro.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {
    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("company")
    private String company;

    @JsonProperty("company_url")
    private String companyUrl;

    @JsonProperty("location")
    private String location;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;
}