package dz_04;

import java.security.cert.TrustAnchor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* модуль взаимодействия с базой данных */
public class TicketProvider {
    static List<Ticket> ticketList = new ArrayList<Ticket>();
    /*  статичный класс для создания билетов для псевдо работы БД */
    public static void CreateTickets()
    {
        ticketList.add(new Ticket(106, 1, 27, new java.sql.Date(2022,11, 1), true));
        ticketList.add(new Ticket(107, 34,2, new java.sql.Date(2022,11,1), true));
        ticketList.add(new Ticket(108, 30,3, new java.sql.Date(2022,11,1), true));
        ticketList.add(new Ticket(109, 19,4, new java.sql.Date(2022,11,1), true));
        ticketList.add(new Ticket(110, 17,5, new java.sql.Date(2022,11,1), true));
    }
    public Ticket[] getTickets(int rootNumber)
    {
        List<Ticket> retTicket = new ArrayList<Ticket>();
        for (Ticket ticket:ticketList)
        {
            if (ticket.rootNumber==rootNumber)
            {
                retTicket.add(ticket);
            }
        }
        return retTicket.toArray(new Ticket[0]);
    }
    public boolean updateTicketStatus(Ticket ticket)
    {
        if (ticket.isValid == true)
        {
            ticket.isValid=false;
            return true;
        }
        return false;
    }
}
