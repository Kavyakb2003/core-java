class SponsorRunner{
	public static void main(String[] args){
		
		String sponsor1 = Sponsor.getSponsorNameByTotalBill(5500);
		System.out.println("Sponsor name:"+sponsor1);
		
		String sponsor2 = Sponsor.getSponsorNameByTotalBill(4500);
		System.out.println("Sponsor name:"+sponsor2);

		String sponsor3 = Sponsor.getSponsorNameByTotalBill(3500);
		System.out.println("Sponsor name:"+sponsor3);

		String sponsor4 = Sponsor.getSponsorNameByTotalBill(2500);
		System.out.println("Sponsor name:"+sponsor4);

		String sponsor5 = Sponsor.getSponsorNameByTotalBill(1500);
		System.out.println("Sponsor name:"+sponsor5);

		
	}
}