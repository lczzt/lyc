package it.chao.domain;

/**
 * Administrator
 * 9:46
 **/
public class SupplierCheck {
    private int SUPPLIER_ID;
    private String STATE;
    private String SUPPLIER_NAME;
    private int SUP_HOSPITAL_ID;

    public int getSUP_HOSPITAL_ID() {
        return SUP_HOSPITAL_ID;
    }

    public void setSUP_HOSPITAL_ID(int SUP_HOSPITAL_ID) {
        this.SUP_HOSPITAL_ID = SUP_HOSPITAL_ID;
    }

    public int getSUPPLIER_ID() {
        return SUPPLIER_ID;
    }

    public void setSUPPLIER_ID(int SUPPLIER_ID) {
        this.SUPPLIER_ID = SUPPLIER_ID;
    }

    public String getSUPPLIER_NAME() {
        return SUPPLIER_NAME;
    }

    public void setSUPPLIER_NAME(String SUPPLIER_NAME) {
        this.SUPPLIER_NAME = SUPPLIER_NAME;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }
}
