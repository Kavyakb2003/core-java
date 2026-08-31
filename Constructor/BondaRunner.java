class BondaRunner{
	public static void main(String[] args){
		
		Bonda bonda1 = new Bonda();
		bonda1.type = "Potato Bonda";
        bonda1.shape = "Round";
        bonda1.price = 20;
        bonda1.taste = "Spicy";
		
		System.out.println(bonda1.type);
        System.out.println(bonda1.shape);
        System.out.println(bonda1.price);
        System.out.println(bonda1.taste);
		
		Bonda bonda2 = new Bonda();
		bonda2.type = "Mangalore Bonda";
        bonda2.shape = "Round";
        bonda2.price = 30;
        bonda2.taste = "Sweet";

        System.out.println(bonda2.type);
        System.out.println(bonda2.shape);
        System.out.println(bonda2.price);
        System.out.println(bonda2.taste);

	}


}