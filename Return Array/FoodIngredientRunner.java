class FoodIngredientRunner{
	public static void main(String[] args)
	{
		String[] numberOfIngredientsToMakeBiryani = FoodIngredient.findIngredientsByFood("Biryani");
		System.out.println("Number of Ingredients are:"+numberOfIngredientsToMakeBiryani.length);
		
		String[] numberOfIngredientsToMakeJammun = FoodIngredient.findIngredientsByFood("Jammun");
		System.out.println("Number of Ingredients are:"+numberOfIngredientsToMakeJammun.length);
		
		String[] numberOfIngredientsToMakeGobi = FoodIngredient.findIngredientsByFood("Gobi");
		System.out.println("Number of Ingredients are:"+numberOfIngredientsToMakeGobi.length);
		
		String[] numberOfIngredientsToMakeFriedRice = FoodIngredient.findIngredientsByFood("FriedRice");
		System.out.println("Number of Ingredients are:"+numberOfIngredientsToMakeFriedRice.length);
	}
}