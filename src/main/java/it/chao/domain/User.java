package it.chao.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Administrator
 * 23:09
 **/
public class User {
    @JsonProperty("USER_ID")
    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    @JsonProperty("USER_NAME")
    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    @JsonProperty("USER_EMAIL")
    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    public void setUSER_EMAIL(String USER_EMAIL) {
        this.USER_EMAIL = USER_EMAIL;
    }

    @JsonProperty("USER_PHONE")
    public String getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }

    private String USER_ID;
    private  String USER_NAME;
    private String USER_EMAIL;
    private String USER_PHONE;

}
