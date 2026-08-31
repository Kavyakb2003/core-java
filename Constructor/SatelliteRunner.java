class SatelliteRunner{
	
	public static void main(String[] args){
		
		Satellite satellite1 =  new Satellite();
		satellite1.name = "Chandrayaan";
        satellite1.country = "India";
        satellite1.weight = 3900.0;
        satellite1.purpose = "Moon Research";
		
		System.out.println(satellite1.name);
		System.out.println(satellite1.country);
		System.out.println(satellite1.weight);
		System.out.println(satellite1.purpose);
		
		Satellite satellite2 = new Satellite();
		satellite2.name = "Mangalyaan";
        satellite2.country = "India";
        satellite2.weight = 1350.0;
        satellite2.purpose = "Mars Research";
		
		System.out.println(satellite2.name);
		System.out.println(satellite2.country);
		System.out.println(satellite2.weight);
		System.out.println(satellite2.purpose);
	}




}