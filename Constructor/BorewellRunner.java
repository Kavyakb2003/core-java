class BorewellRunner{
	
	public static void main(String[] args){
		
		Borewell borewell1 = new Borewell();
		borewell1.location = "Village";
        borewell1.depth = 500.0;
        borewell1.diameter = 6.0;
        borewell1.purpose = "Agriculture";

        System.out.println(borewell1.location);
        System.out.println(borewell1.depth);
        System.out.println(borewell1.diameter);
        System.out.println(borewell1.purpose);
		
		Borewell borewell2 = new Borewell();
		borewell2.location = "Farm";
        borewell2.depth = 700.0;
        borewell2.diameter = 8.0;
        borewell2.purpose = "Drinking Water";

        System.out.println(borewell2.location);
        System.out.println(borewell2.depth);
        System.out.println(borewell2.diameter);
        System.out.println(borewell2.purpose);
	}

}