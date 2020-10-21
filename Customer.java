package onlineshopping;

public class Customer {
	private String name,address;
	private int age,custid;
	
	Customer()
	{
		name="Sayali";
		address="Shivshakti colony chitod road Dhule";
		age=21;
		custid=12345;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustid() {
		return custid;
	}
	
	public void setCustid(int custid) {
		this.custid = custid;
	}
}
