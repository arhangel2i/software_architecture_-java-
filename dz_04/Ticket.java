package dz_04;

import java.sql.Date;

public class Ticket {
    int rootNumber;
    int place;
    int price;
    Date date;
    boolean isValid;
    public Ticket(int rootNumber, int place, int price, Date date, boolean isValid)
    {
        this.rootNumber=rootNumber;
        this.place = place;
        this.date = date;
        this.isValid = isValid;
        this.price = price;
    }
}
