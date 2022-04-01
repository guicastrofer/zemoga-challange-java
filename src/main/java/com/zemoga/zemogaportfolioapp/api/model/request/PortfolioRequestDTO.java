package com.zemoga.zemogaportfolioapp.api.model.request;

import lombok.Data;

import javax.validation.constraints.Size;
@Data
public class PortfolioRequestDTO {
    @Size(max = 255)
    private String description;
    @Size(max = 255)
    private String experienceSummary;
    @Size(max = 11)
    private Integer id;
    @Size(max = 255)
    private String imageUrl;
    @Size(max = 255)
    private String lastNames;
    @Size(max = 255)
    private String names;
    @Size(max = 255)
    private String tittle;
    @Size(max = 255)
    private String twitterUserId;
    @Size(max = 255)
    private String twitterUserName;
    @Size(max = 255)
    private String userId;
    @Size(max = 255)
    private String address;
    @Size(max = 255)
    private String email;
    @Size(max = 255)
    private String experience;
    @Size(max = 255)
    private String imagePath;
    @Size(max = 255)
    private String name;
    @Size(max = 255)
    private String phone;
    @Size(max = 255)
    private String twitterUser;
    @Size(max = 255)
    private String zipCode;
    @Size(max = 255)
    private String title;
}
