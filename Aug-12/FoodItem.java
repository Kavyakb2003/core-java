class FoodItem{
	public static int getPriceByFoodItemAndType(String name,String type){
		System.out.println("Running getPriceByFoodItemAndType in Food Item ");
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
		
		int vegBiryaniPrice = 150;
		int nonVegBiryaniPrice = 200;
		
		if(name == "Biryani"){
			if(type == "Veg"){
				System.out.println("You have selected the Veg Biryani");
				return vegBiryaniPrice;
			}else if(type == "Non Veg"){
				System.out.println("You have selected the Non Veg Biryani");
				return nonVegBiryaniPrice;
			}
		}
		
		int vegFriedRiceprice = 120;
		int nonVegFriedRicePrice = 150;
		
		if(name == "Fried Rice"){
			if(type == "Veg"){
				System.out.println("You have selected the Veg Fried Rice");
				return vegFriedRiceprice;
			}else if(type == "Non Veg"){
				System.out.println("You have Selected the Non Veg Fired Rice");
				return nonVegBiryaniPrice;
			}
		}
		
		int vegSamosaPrice = 20;
		int nonVegSamosaPrice = 40;
		
		if(name == "Samosa"){
			if(type == "Veg"){
				System.out.println("You have selected the Veg Samosa");
				return vegSamosaPrice;
			}else if(type == "Non Veg"){
				System.out.println("You have selected the Non Veg Samosa");
				return nonVegSamosaPrice;
			}
		}
		
		return 0;
	}

}