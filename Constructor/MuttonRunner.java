class MuttonRunner{
	
	public static void main(String[] args){
		
		Mutton mutton1 = new Mutton();
		mutton1.type = "Goat Mutton";
        mutton1.weight = 1.0;
        mutton1.price = 800;
        mutton1.quality = "Fresh";


        System.out.println(mutton1.type);
        System.out.println(mutton1.weight);
        System.out.println(mutton1.price);
        System.out.println(mutton1.quality);
		
		Mutton mutton2 = new Mutton();
		mutton2.type = "Lamb Mutton";
        mutton2.weight = 2.0;
        mutton2.price = 1000;
        mutton2.quality = "Premium";

        System.out.println(mutton2.type);
        System.out.println(mutton2.weight);
        System.out.println(mutton2.price);
        System.out.println(mutton2.quality);

	}


}