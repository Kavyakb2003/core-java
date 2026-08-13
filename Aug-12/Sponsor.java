class Sponsor{
	public static  String getSponsorNameByTotalBill(double bill){
		
		System.out.println("Ruuning the getSponsorNameByTotalBill in Sponsor");
		System.out.println("Bill Amount:"+bill);
		
		String sponsor1 = "Varun";
		String sponsor2 = "Rachana";
		String sponsor3 = "Suhas";
		String sponsor4 = "Kavana";
		String sponsor5 = "Sachin";
		
		if(bill >=5000){
			System.out.println("Varun is Bill Sponsor");
			return sponsor1;
		}else if(bill >= 4000){
			System.out.println("Rachana is Bill Sponsor");
			return sponsor2;
			
		}else if(bill >= 3000){
			System.out.println("Suhas is Bill Sponsor");
			return sponsor3;
		}else if(bill >= 2000){
			System.out.println("Kavana is Bill Sponsor");
			return sponsor4;
		}else if(bill >= 1000){
			System.out.println("Sachin is Bill Sponsor");
			return sponsor5;
		}
		
		return "No Sponsor";
	}
}