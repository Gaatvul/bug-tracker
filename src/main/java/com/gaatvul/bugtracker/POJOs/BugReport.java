package com.gaatvul.bugtracker.POJOs;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class BugReport {

    @NotEmpty(message = "Uh oh, looks like there is no title!")
    @Max(value = 400, message = "Uh oh, your title is too long (max 400 characters)")
    private String title;

    @NotEmpty(message = "Uh oh, looks like there is no description!")
    private String description;

    private String projectAssignedTo, assignee, reporter, owner, criticality, category, status,
            priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectAssignedTo() {
        return projectAssignedTo;
    }

    public void setProjectAssignedTo(String projectAssignedTo) {
        this.projectAssignedTo = projectAssignedTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "BugReport [title=" + title + ", description=" + description + ", projectAssignedTo=" + projectAssignedTo
                + ", assignee=" + assignee + ", reporter=" + reporter + ", owner=" + owner + ", criticality="
                + criticality + ", category=" + category + ", status=" + status + ", priority=" + priority + "]";
    }

    public HashMap<String, String> getAllAttributes() {

        HashMap<String, String> allAttributes = new HashMap<>();
        
        allAttributes.put("title", title);
        allAttributes.put("description", description);
        allAttributes.put("projectAssignedTo", projectAssignedTo);
        allAttributes.put("assignee", assignee);
        allAttributes.put("reporter", reporter);
        allAttributes.put("owner", owner);
        allAttributes.put("criticality", criticality);
        allAttributes.put("category", category);
        allAttributes.put("status", status);
        allAttributes.put("priority", priority);

        return allAttributes;
    }
}
