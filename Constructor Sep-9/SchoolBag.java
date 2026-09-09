class SchoolBag {
	
   public String brand;
   public String color;
   public int pockets;
   public double price;
   public double capacity;

   public SchoolBag() 
   {
	   System.out.println("SchoolBag Details:");
    }

    SchoolBag(String brand, String color, int pockets, double price, double capacity) 
	{
        this.brand = brand;
        this.color = color;
        this.pockets = pockets;
        this.price = price;
        this.capacity = capacity;
    }
}