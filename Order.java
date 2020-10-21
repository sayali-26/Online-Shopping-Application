package onlineshopping;

public class Order {

	private int orderId;
	private double total;
	private String date;
	
	Order()
	{
		orderId=123;
		total=1000.20;
		date="27 October 2020";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
