/**
 *
 * @author vhlaw
 */
public class Hw4 {
    public static void main(String[] args) {
        Customer a = new Customer();
        a.makePurchase(90, 21);
        System.out.println("Total Purchase Amount :" + a.getAmountTotal());
        System.out.println("Discount? " + a.discountReached() + "\n");        
        
        a.makePurchase(20, 2);
        System.out.println("Total Purchase Amount :" + a.getAmountTotal());
        System.out.println("Discount? " + a.discountReached() + "\n"); 
        
        a.makePurchase(80, 3);
        System.out.println("Total Purchase Amount :" + a.getAmountTotal());
        System.out.println("Discount? " + a.discountReached() + "\n"); 
        
        a.makePurchase(40, 4);
        System.out.println("Total Purchase Amount :" + a.getAmountTotal());
        System.out.println("Discount? " + a.discountReached() + "\n");   
        
        a.makePurchase(10, 4);
        System.out.println("Total Purchase Amount :" + a.getAmountTotal());
        System.out.println("Discount? " + a.discountReached() + "\n");  
      
    }
}
