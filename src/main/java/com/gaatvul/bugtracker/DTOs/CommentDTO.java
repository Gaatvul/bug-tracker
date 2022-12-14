package com.gaatvul.bugtracker.DTOs;

import javax.validation.constraints.NotEmpty;

public class CommentDTO {

    @NotEmpty(message = "Uh oh, looks like there is no text in the comment box!")
    private String commentText;

    private int report_id;
    private String userFullName;
    private String[] names;

    public int getReport_id() {

        return report_id;
    }

    public void setReport_id(int report_id) {

        this.report_id = report_id;
    }

    public String getUserFullName() {

        return userFullName;
    }

    public void setUserFullName(String userFullName) {

        this.userFullName = userFullName;
        setNames(this.userFullName);
    }

    public String getCommentText() {

        return commentText;
    }

    public void setCommentText(String commentText) {

        this.commentText = commentText;
    }

    public void setNames(String fullName) {

        this.names = fullName.split(" ", 2);
    }

    public String[] getNames() {

        return names;
    }

    public String getUserFirstName() {

        return getNames()[0];
    }

    public String getUserSecondName() {

        return getNames()[1];
    }

}
