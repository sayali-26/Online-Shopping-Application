package onlineshopping;

import java.util.Scanner;

public class ShoppingCart {
	
	private String[] item = new String[20];
	private double price[]=new double[20];
	private double total;
	private int dis;
	
	ShoppingCart()
	{
		for(int i=0;i<item.length;i++)
	      {
				item[i]="";
	      }	
		for(int i=0;i<price.length;i++)
	      {
				price[i]=0;
	      }	
		total=500.40;
	}
	public String[] getItem() {
		return item;
	}
	public void setItem(String[] item) {
		this.item = item;
	}
	public double[] getPrice() {
		return price;
	}
	public void setPrice(double[] price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getDis() {
		return dis;
	}
	public void setDis(int dis) {
		this.dis = dis;
	}
	
}
