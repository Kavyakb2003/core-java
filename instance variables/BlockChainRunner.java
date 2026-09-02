class BlockChainRunner {

	public static void main(String[] args)
	{

		BlockChain blockChain;
		blockChain = new BlockChain();

			System.out.println(blockChain.type);
			System.out.println(blockChain.price);
			System.out.println(blockChain.brand);
			System.out.println(blockChain.code);
			System.out.println(blockChain.value);
			System.out.println(blockChain.secure);
			System.out.println(blockChain.size);
			System.out.println(blockChain.rating);
			System.out.println(blockChain.blocks);
			System.out.println(blockChain.id);

		BlockChain blockChain2 = new BlockChain();

		blockChain.brand = "Bitcoin";
		blockChain.type = "Cryptocurrency";

			System.out.println(blockChain.brand);
			System.out.println(blockChain.price);
			System.out.println(blockChain.type);

}
}