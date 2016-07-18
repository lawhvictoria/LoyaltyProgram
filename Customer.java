import java.util.ArrayList;

/**
 *
 * @author vhlaw
 */
public class Customer {
    private double amountTotal;
    private boolean discount;
    private ArrayList<Integer> shopID;
    
    public Customer()
    {
        this.amountTotal = 0;
        this.discount = false;
        this.shopID = new ArrayList<>();
    }
    
    public double getAmountTotal()
    {
        return amountTotal;
    }
    
    public void makePurchase(double amount, int shop)
    {
        if(shop >=1 && shop <= 20)
        {
            if(!shopID.contains(shop))
            {
                shopID.add(shop);
            }
        }
        else
        {
            return;
        }
        
        if(discount)
        {
            amount -= 10;
            amountTotal -= 100;
            discount = false;
        }
        amountTotal += amount;
        if(amountTotal >= 100 && shopID.size() >= 3)
        {
            discount = true;
        }
    } 
    
    public boolean discountReached()
    {
        return discount;
    }
}
