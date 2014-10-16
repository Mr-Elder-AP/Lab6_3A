/**
 * @(#)ShoppingCartMain.java
 *
 *
 * @author 
 * @version 1.00 2014/10/10
 */


public class ShoppingCartMain {

    public static void main(String[] args)
    {
    	ShoppingCart car = new ShoppingCart();
    	
    	do
    	{
    		String itemName = GetInfo.getString("What is the name of the item?");
    		int quantity = GetInfo.getInt("Enter how many of " + itemName + " do you want?");
    		double price = GetInfo.getDouble("How much does each " + itemName + " cost?");
    		
    		car.addItem(new Item(price, quantity, itemName));
    		
    		GetInfo.showMessage(car.toString());
    	}while(GetInfo.getYesNo("Would you like to purchase another item?"));
    }
    
    
}