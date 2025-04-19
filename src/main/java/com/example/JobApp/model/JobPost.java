package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost() {
    }

    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Getters (explicitly define them)
    public int getPostId() {
        return postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public int getReqExperience() {
        return reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    // Setters (if you need them)
    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProfile='" + postProfile + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExperience=" + reqExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }
}
