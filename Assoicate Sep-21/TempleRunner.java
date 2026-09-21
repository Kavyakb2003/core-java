class TempleRunner{

	public static void main(String[] args)
	{
		Temple temple = new Temple();
		temple.name = "Omkareshwara temple";
		temple.location = "RR Nagar";
		temple.god = new God();
		temple.god.name = "Shiva";
		temple.god.gender = 'M';
		
		temple.info();
		temple.god.info();
	}



}