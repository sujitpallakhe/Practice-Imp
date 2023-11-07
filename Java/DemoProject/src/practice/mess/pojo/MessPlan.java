package practice.mess.pojo;

public enum MessPlan {

	MONTHLY(3000), QUARTERLY(8000), HALFYEARLY(15000), YEARLY(25000);

	private int price;

	private MessPlan(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
