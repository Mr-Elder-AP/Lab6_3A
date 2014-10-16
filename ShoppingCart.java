/**
 * @(#)ShoppingCart.java
 *
 *
 * @author 
 * @version 1.00 2014/10/10
 */
import java.text.*;

public class ShoppingCart {
	
	Item[] items = new Item[5];

	NumberFormat format = NumberFormat.getCurrencyInstance();

    public ShoppingCart() {
    	
    }
    
    public void increaseSize()
    {
    	boolean arrayFull = true;
    	
    	for(int i = 0; i < items.length; i++)
    	{
    		if(items[i] == null)
    			i = items.length;
    		else
    		{
    			arrayFull = true;
    			i = items.length;
    		}
    	}
    	
    	if(arrayFull)
    	{
    		Item[] temp = new Item[items.length];
    		
    		for(int i = 0; i < items.length; i++)
    		{
    			temp[i] = items[i];
    		}
    		
    		items = new Item[temp.length + 3];
    		
    		for(int i = 0; i < temp.length; i++)
    		{
    			items[i] = temp[i];
    		}
    	}
    }
    
    public void addItem(Item item)
    {
    	increaseSize();
    	
    	for(int i = 0; i < items.length; i++)
    	{
    		if(items[i] == null)
    		{
    			items[i] = item;
    			i = items.length;
    		}
    	}
    }
    
    public int getItemCount()
    {
    	int sum = 0;
    	
    	for(int i = 0; i < items.length; i++)
    	{
    		if(items[i] != null)
    		{
    			sum += items[i].getQuantity();
    		}
    	}
    	
    	return sum;
    }
        
   	public double getPriceTotal()
   	{
   		double sum = 0;
   		
   		for(int i = 0; i < items.length; i++)
   		{
   			if(items[i] != null)
   			{
   				sum += items[i].getPrice() * items[i].getQuantity();
   			}
   		}
   		
   		return sum;
   	}
        
    public String toString()
    {
    	String builder = "Item Name \t Price \t Quantity \t Total Price\n\n";
    	
    	for(int i = 0; i < items.length; i++)
    	{
    		if(items[i] != null)
    		{
    			builder += items[i].toString() + "\n";
    		}
    	}
    	
    	builder += "---------------------------------------------------------------\n\n\nTotal Price : " + format.format(getPriceTotal()) + "\nItems Purchased : " + getItemCount();
    	
    	return builder;
    }
}