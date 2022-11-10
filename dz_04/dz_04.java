package dz_04;

import java.util.Date;

public class dz_04 {
    public static void main(String[] args) {
        TicketProvider.CreateTickets();
        Customer pePe = new Customer(1);
        pePe.InitializationCashProvider();
        Ticket[] tickets = pePe.searchTicket(new java.sql.Date(2022,11,1), 107);
        for (Ticket t:tickets)
        {
            if (pePe.buyTicket(t))
            {
                System.out.println("Билет куплен");
            }
            else
            {
                System.out.println("Билет не куплен");
            }

            if (pePe.buyTicket(t))
            {
                System.out.println("Билет куплен");
            }
            else
            {
                System.out.println("Билет не куплен");
            }
        }
    }
}
