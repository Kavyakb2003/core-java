class FoodItemRunner{
	public static void main(String[] args){
		
		int vegBiryaniPrice = FoodItem.getPriceByFoodItemAndType("Biryani","Veg");
		System.out.println("Price:"+vegBiryaniPrice);
		
		int nonVegBiryaniPrice = FoodItem.getPriceByFoodItemAndType("Biryani","Non Veg");
		System.out.println("Price:"+nonVegBiryaniPrice);
		
		int vegFriedRicePrice = FoodItem.getPriceByFoodItemAndType("Fried Rice","Veg");
		System.out.println("Price:"+vegFriedRicePrice);
		
		int nonVegFriedRicePrice = FoodItem.getPriceByFoodItemAndType("Fried Rice","Non Veg");
		System.out.println("Price:"+nonVegFriedRicePrice);
		
		int vegSamosaPrice = FoodItem.getPriceByFoodItemAndType("Samosa","Veg");
		System.out.println("Price:"+vegSamosaPrice);
		
		int nonVegSamosaPrice = FoodItem.getPriceByFoodItemAndType("Samosa","Non Veg");
		System.out.println("Price:"+nonVegSamosaPrice);
	}
}