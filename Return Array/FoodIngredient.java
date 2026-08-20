class FoodIngredient{
	public static String[] findIngredientsByFood(String foodName)
	{
		System.out.println("Running findIngredientsByFood in FoodIngredient");
		System.out.println("Food Name:"+foodName);
		
		if(foodName == "Biryani")
		{
			System.out.println("Biryani making Ingredients");
			String[] biryaniIngredients = {"Oil","Rice","Chicken","Onion","Spices","Curd"};
			return biryaniIngredients;
			
		}else if(foodName == "Jammun")
		{
			System.out.println("Jammun making Ingredients");
			String[] jammunIngredients = {"Milk Powder", "Maida", "Sugar", "Ghee", "Cardamom"};
			return jammunIngredients;
			
		}else if(foodName == "Gobi")
		{
			System.out.println("Gobi making Ingredients");
			String[] gobiIngredients = {"Cauliflower", "Onion", "Tomato", "Oil", "Spices"};
			return gobiIngredients;
			
		}else if(foodName == "FriedRice")
		{
			System.out.println("Fried Rice making Ingredients");
			String[] friedRiceIngredients = { "Rice", "Vegetables", "Oil", "Soy Sauce", "Pepper"};
			return friedRiceIngredients;
			
		}
		
		String[] empty={};
		return empty;
	}
}