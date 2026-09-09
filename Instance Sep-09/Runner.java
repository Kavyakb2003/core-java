class Runner{

	public static void main(String[] args){
		
		Tape tape ;
		tape = new Tape("Cello","Black",20.5,50);
		tape.TapeInfo();
		
		Tape tape2 = new Tape("3G","White",10.5,30);
		tape2.TapeInfo();
		
		Clinic clinic;
		clinic = new Clinic("Apollo Clinic","BTM",10,500);
		clinic.ClinicInfo();
		
		Clinic clinic1 = new Clinic("Sparsh Clinic","RR Nagar",15,600);
		clinic1.ClinicInfo();
		
		Factory factory;
		factory = new Factory("Car Factory","Bangalore",300,5000);
		factory.FactoryInfo();
		
		Factory factory1 = new Factory("Bike Factory","Delhi",500,10000);
		factory1.FactoryInfo();
		
		Nest nest;
		nest = new Nest("Sparrow","Tree",4,"Grass");
		nest.NestInfo();
		
		Nest nest1 = new Nest("Crow","Building",3,"Sticks");
		nest1.NestInfo();
		
		Zip zip;
		zip = new Zip("Asha Zip","Black",10,25);
		zip.ZipInfo();
		
		Zip zip1 = new Zip("Sagar Zip","White",20,55);
		zip1.ZipInfo();
		
		Curtain curtain;
		curtain = new Curtain("Blue","Cotton",7.5,1200);
		curtain.CurtainInfo();
		
		Curtain curtain1 = new Curtain("White","Silk",8.5,1700);
		curtain1.CurtainInfo();
		
		RailwayTrack railwaytrack;
		railwaytrack = new RailwayTrack("Steel","Bengalore",100,1.5);
		railwaytrack.RailwayTrackInfo();
		
		RailwayTrack railwaytrack1 = new RailwayTrack("Iron","Mysore",150,1.8);
		railwaytrack1.RailwayTrackInfo();
		
		SwimmingPool swimmingPool;
		swimmingPool = new SwimmingPool("Hotel",50,20,6);
		swimmingPool.SwimmingPoolInfo();
		
		SwimmingPool swimmingPool1 = new SwimmingPool("Club",40,10,5);
		swimmingPool1.SwimmingPoolInfo();
		
		WeldingMachine weldingMachine;
		weldingMachine = new WeldingMachine("Bosch", "WM100", 2000, 15000);
		weldingMachine.WeldingMachineInfo();
		
		WeldingMachine weldingMachine1 = new WeldingMachine("Lincoln", "WM200", 2500, 20000);
		weldingMachine1.WeldingMachineInfo();
		
		Anklet anklet;
		anklet = new Anklet("Silver", "Silver", 25.5, 3000);
		anklet.AnkletInfo();
		
		Anklet anklet1 = new Anklet("Gold", "Golden", 30.0, 50000);
		anklet1.AnkletInfo();
		
	}	
}	
	
	