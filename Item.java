package onlineshopping;

public class Item {
	
	private String itname;
	private double price;
	private int quantity;
	
	Item()
	{
		itname="shoes";
		price=500.30;
		quantity=1;
	}

	public String getItname() {
		return itname;
	}

	public void setItname(String itname) {
		this.itname = itname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
