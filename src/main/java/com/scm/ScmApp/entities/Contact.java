package com.scm.ScmApp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "contact")
@Table(name = "contacts")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Contact {

    @Id
    private String id;

    private String name;

    private String email;

    private String phoneNum;

    private String address;

    private String pic;

    @Column(length = 200)
    private String desc;

    private boolean favourite = false;

    // private List<String> socialLinks = new ArrayList<>();

    private String websiteLink;

    private String linkedinLink;

    @ManyToOne
    private User user;
}
