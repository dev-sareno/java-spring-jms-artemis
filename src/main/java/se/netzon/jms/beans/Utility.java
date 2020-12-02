package se.netzon.jms.beans;

import java.util.Date;

public class Utility {

    public String getTime() {
        return String.valueOf(new Date().getTime());
    }
}
