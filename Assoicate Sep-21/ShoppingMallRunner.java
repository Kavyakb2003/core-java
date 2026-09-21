class ShoppingMallRunner{

	public static void main(String[] args)
	{
		ShoppingMall shoppingMall = new ShoppingMall();
		shoppingMall.name = "Gopalan Arcade Mall";
		shoppingMall.owner = "Mr.C.Gopalan";
		shoppingMall.theater = new Theater();
		shoppingMall.theater.moviename = "Video";
		shoppingMall.theater.price = 200;
		shoppingMall.theater.totalSeats = 100;
		
		shoppingMall.info();
		shoppingMall.theater.info();
	}



}