class StadiumRunner{
	public static void main(String[] args){
		
		Stadium stadium1 = new Stadium();
		stadium1.name = "ChinnaSwamy Stadium";
		stadium1.location = "Bengalore";
		stadium1.capacity = 40000;
		stadium1.sport = "Cricket";
		
		System.out.println(stadium1.name);
		System.out.println(stadium1.location);
		System.out.println(stadium1.capacity);
		System.out.println(stadium1.sport);
		
		Stadium stadium2 = new Stadium();
		stadium2.name = "Wankhede Stadium";
		stadium2.location = "Mumbai";
		stadium2.capacity = 33000;
		stadium2.sport = "Cricket";
		
		System.out.println(stadium2.name);
		System.out.println(stadium2.location);
		System.out.println(stadium2.capacity);
		System.out.println(stadium2.sport);
		
	}
}