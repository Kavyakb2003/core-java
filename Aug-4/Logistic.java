class Logistic{
	public static void pickup(){
		String vendorName = "Asha Trader";
		String productName = "Wireless Mouse";
		double price = 799;
		
		System.out.println("Logistic picked up the product");
		Vendor.sell(vendorName,productName,price);
	}
}