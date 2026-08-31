class PhotoRunner{
	
	public static void main(String[] args){
		
		Photo photo1 = new Photo();
		photo1.name = "Nature";
        photo1.format = "JPG";
        photo1.size = 2.5;
        photo1.location = "Gallery";
		
		System.out.println(photo1.name);
		System.out.println(photo1.format);
		System.out.println(photo1.size);
		System.out.println(photo1.location);
		
		Photo photo2 = new Photo();
		photo2.name = "Beach";
        photo2.format = "PNG";
        photo2.size = 4.5;
        photo2.location = "Downloads";
		
		System.out.println(photo2.name);
		System.out.println(photo2.format);
		System.out.println(photo2.size);
		System.out.println(photo2.location);

	}
}