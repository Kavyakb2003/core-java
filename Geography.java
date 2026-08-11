class Geography{
	public static String getCapitalCitybyCountryName(String countryName)
	{
		System.out.println("Running getCapitalCitybyCountryName in Geography");
		System.out.println("Country Name:"+countryName);
		return "Dehli";
	}
	public static int getCountryCodebyCountryName(String countryName)
	{
		System.out.println("Running getCountryCodebyCountryName in Geography");
		System.out.println("Country Name:"+countryName);
		return +91;
	}
	public static long getPopulationbyCountryName(String countryName)
	{
		System.out.println("Running getPopulationbyCountryName in Geography");
		System.out.println("Country Name:"+countryName);
		return 123000000L;
	}
}