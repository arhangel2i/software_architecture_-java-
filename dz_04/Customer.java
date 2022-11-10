package dz_04;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/* модуль заказа товаров */
public class Customer {
    /* идентификатор */
    int id;
    /* список купленных билетов */
    Ticket[] tickets;
    /* провайдер проведения оплаты */
    CashProvider cash = new CashProvider();
    public Customer(int id){
        this.id = id;
    }

    public boolean buyTicket(Ticket ticket)
    {
        if (cash.buy(ticket.price))
        {
            TicketProvider tp = new TicketProvider();
            if (tp.updateTicketStatus(ticket))
            {
                return true;
            }
        }
        return false;
    }

    /* dt - дата, busNumber - номер автобуса, возвращает найденные билеты */    
    public Ticket[] searchTicket (Date dt, int busNumber)
    {
        List<Ticket> retTickets = new ArrayList<Ticket>();
        TicketProvider tp = new TicketProvider();
        Ticket[] tickets = tp.getTickets(busNumber);
        for (Ticket ticket:tickets)
        {
            if (ticket.date.compareTo(dt)==0)
            {
                retTickets.add(ticket);
            }
        }
        return retTickets.toArray(new Ticket[0]);
    }
    public void InitializationCashProvider()
    {
        cash.authorization(this);
    }
}
