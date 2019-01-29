package it.chao.VO;

import java.util.Date;

/**
 * Administrator
 * 23:22
 **/
public class UserVo {
    private long ID;
    private String USER_ID;
    private  String USER_NAME;
    private String USER_EMAIL;
    private String USER_PHONE;
    private String USER_PASS;
    private String SEX;
    private Date BDAY;
    private String IS_STOP;
    private String USER_TYPE;
    private int offset;
    private int limit;
    private int pageNo;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    public void setUSER_EMAIL(String USER_EMAIL) {
        this.USER_EMAIL = USER_EMAIL;
    }

    public String getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }

    public String getUSER_PASS() {
        return USER_PASS;
    }

    public void setUSER_PASS(String USER_PASS) {
        this.USER_PASS = USER_PASS;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public Date getBDAY() {
        return BDAY;
    }

    public void setBDAY(Date BDAY) {
        this.BDAY = BDAY;
    }

    public String getIS_STOP() {
        return IS_STOP;
    }

    public void setIS_STOP(String IS_STOP) {
        this.IS_STOP = IS_STOP;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
