package it.chao.domain;

import sun.plugin2.message.SetJVMIDMessage;

/**
 * Administrator
 * 21:57
 **/
public class Menu {
    private int MENU_ID;
    private String MENU_TEXT;
    private String MENU_TYPE;
    private int MENU_PID;
    private String ROUTER_LINK;
    public int getMENU_ID() {
        return MENU_ID;
    }

    public void setMENU_ID(int MENU_ID) {
        this.MENU_ID = MENU_ID;
    }

    public String getMENU_TEXT() {
        return MENU_TEXT;
    }

    public void setMENU_TEX(String MENU_TEXT) {
        this.MENU_TEXT = MENU_TEXT;
    }

    public String getMENU_TYPE() {
        return MENU_TYPE;
    }

    public void setMENU_TYPE(String MENU_TYPE) {
        this.MENU_TYPE = MENU_TYPE;
    }

    public int getMENU_PID() {
        return MENU_PID;
    }

    public void setMENU_PID(int MENU_PID) {
        this.MENU_PID = MENU_PID;
    }

    public String getROUTER_LINK() {
        return ROUTER_LINK;
    }

    public void setROUTER_LINK(String ROUTER_LINK) {
        this.ROUTER_LINK = ROUTER_LINK;
    }
}
