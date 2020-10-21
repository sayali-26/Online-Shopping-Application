package onlineshopping;

public class Product {

	private String prname;
	private int prid;
	private String desc;
	
	Product()
	{
		prname="Dresses";
		prid=123;
		desc="Short Dress";
	}

	public String getPrname() {
		return prname;
	}

	public void setPrname(String prname) {
		this.prname = prname;
	}

	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
