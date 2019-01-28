package it.chao.domain;

/**
 * Administrator
 * 23:09
 **/
public class User {
    private String USER_ID;
    private String USER_TYPE;
    private String SUPPLIER_ID;
    private String HOSPITAL_ID;
    private String SUPPLIER_NAME;
    private String HOSPITAL_NAME;
    private String MEDICAL_CODE;
    public String getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public String getSUPPLIER_ID() {
        return SUPPLIER_ID;
    }

    public void setSUPPLIER_ID(String SUPPLIER_ID) {
        this.SUPPLIER_ID = SUPPLIER_ID;
    }

    public String getSUPPLIER_NAME() {
        return SUPPLIER_NAME;
    }

    public void setSUPPLIER_NAME(String SUPPLIER_NAME) {
        this.SUPPLIER_NAME = SUPPLIER_NAME;
    }

    public String getHOSPITAL_ID() {
        return HOSPITAL_ID;
    }

    public void setHOSPITAL_ID(String HOSPITAL_ID) {
        this.HOSPITAL_ID = HOSPITAL_ID;
    }

    public String getHOSPITAL_NAME() {
        return HOSPITAL_NAME;
    }

    public void setHOSPITAL_NAME(String HOSPITAL_NAME) {
        this.HOSPITAL_NAME = HOSPITAL_NAME;
    }

    public String getMEDICAL_CODE() {
        return MEDICAL_CODE;
    }

    public void setMEDICAL_CODE(String MEDICAL_CODE) {
        this.MEDICAL_CODE = MEDICAL_CODE;
    }
}
