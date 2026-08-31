class MicroScopeRunner{
	public static void main(String[] args){
		
		MicroScope microscope1 = new MicroScope();
		microscope1.brand = "Olympus";
		microscope1.price = 15000;
		microscope1.type = "Compound";
		microscope1.magnification = 1000;
		
		System.out.println(microscope1.brand);
		System.out.println(microscope1.price);
		System.out.println(microscope1.type);
		System.out.println(microscope1.magnification);
		
		MicroScope microscope2 = new MicroScope();
		microscope2.brand = "Nikon";
		microscope2.price = 20000;
		microscope2.type = "Digital";
		microscope2.magnification = 1500;
		
		System.out.println(microscope2.brand);
		System.out.println(microscope2.price);
		System.out.println(microscope2.type);
		System.out.println(microscope2.magnification);
		
	}
}