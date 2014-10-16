/**
 * @(#)Item.java
 *
 *
 * @author 
 * @version 1.00 2014/10/10
 */
import java.text.*;

public class Item {
	
	private String itemName;
	private double price;
	private int quantity;
	
	NumberFormat format = NumberFormat.getCurrencyInstance();

    public Item(double price, int quantity, String itemName) 
    {
    	this.price = price;
    	this.quantity = quantity;
    	this.itemName = itemName;
    }
    
    public String toString()
    {
    	return "" + itemName + "-------" + format.format(price) + "-------" + quantity + "------" + format.format(quantity * price);
    }
    
    public double getPrice()
    {
    	return this.price;
    }
    
    public int getQuantity()
    {
    	return this.quantity;
    }
    
    public String getItemName()
    {
    	return this.itemName;
    }
    
    
    
}