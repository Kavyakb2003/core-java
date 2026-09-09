class WashingMachineRunner {

    public static void main(String[] args)
	{
        WashingMachine w1 = new WashingMachine();
        WashingMachine w2 = new WashingMachine("Samsung", 8, "Front Load", 32000, 12);

        System.out.println(w1.brand);
        System.out.println(w1.capacity);
        System.out.println(w1.type);
        System.out.println(w1.price);
        System.out.println(w1.programs);

        System.out.println(w2.brand);
        System.out.println(w2.capacity);
        System.out.println(w2.type);
        System.out.println(w2.price);
        System.out.println(w2.programs);
    }
}