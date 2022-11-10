package dz_04;

/* модуль оплаты товаров */
public class CashProvider {
    long card;
    boolean isAutorization;

    public boolean buy(int price)
    {
        if (isAutorization)
        {
            return true;
        }
        return false;
    }
    public void authorization(Customer customer)
    {
        if (customer.id == 1)
        {
            this.card = 6767676;
            this.isAutorization=true;
        }
    }
}
