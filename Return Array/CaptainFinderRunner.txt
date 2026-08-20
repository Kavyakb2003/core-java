class CaptainFinderRunner{
	public static void main(String[] args){
		
		String[] captainAndViceCaptainOfIndia=CaptainFinder.getCaptainAndViceCaptain("India");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfIndia.length);
		
		
		String[] captainAndViceCaptainOfAustrelia=CaptainFinder.getCaptainAndViceCaptain("Austrelia");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfAustrelia.length);
		
		String[] captainAndViceCaptainOfEngland=CaptainFinder.getCaptainAndViceCaptain("England");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfEngland.length);
		
		String[] captainAndViceCaptainOfBangladesh=CaptainFinder.getCaptainAndViceCaptain("Bangladesh");
		System.out.println("The length of the array is:"+captainAndViceCaptainOfBangladesh.length);
	}
}
		