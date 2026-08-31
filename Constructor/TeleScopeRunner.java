class TeleScopeRunner{
	
	public static void main(String[] args){
		
		TeleScope telescope1 = new TeleScope();
		telescope1.brand = "Celestron";
        telescope1.lensSize = 80.0;
        telescope1.type = "Refractor";
        telescope1.price = 25000;
		
		System.out.println(telescope1.brand);
		System.out.println(telescope1.lensSize);
		System.out.println(telescope1.type);
		System.out.println(telescope1.price);
		
		TeleScope telescope2 = new TeleScope();
		telescope2.brand = "SkyWatcher";
        telescope2.lensSize = 100.0;
        telescope2.type = "Reflector";
        telescope2.price = 35000;
		
		System.out.println(telescope2.brand);
		System.out.println(telescope2.lensSize);
		System.out.println(telescope2.type);
		System.out.println(telescope2.price);
		

	}
}