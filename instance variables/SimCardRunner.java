class SimCardRunner {

	public static void main(String[] args)
	{

		SimCard simCard;
		simCard = new SimCard();

			System.out.println(simCard.type);
			System.out.println(simCard.price);
			System.out.println(simCard.brand);
			System.out.println(simCard.code);
			System.out.println(simCard.balance);
			System.out.println(simCard.active);
			System.out.println(simCard.size);
			System.out.println(simCard.rating);
			System.out.println(simCard.quantity);
			System.out.println(simCard.number);

		SimCard simCard2 = new SimCard();

		simCard.brand = "Airtel";
		simCard.type = "5G";

			System.out.println(simCard.brand);
			System.out.println(simCard.price);
			System.out.println(simCard.type);

}
}