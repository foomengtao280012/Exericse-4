public class Main {

	public static void main(String[] args) {
		Shoes Adidas = new Shoes();
		System.out.println("\n===================Adidas===================");
		System.out.println(Adidas);
		System.out.printf("Total price \t\t\t: RM%.2f%n", Adidas.getTotalPrice());
		
		Nike NikeShoes = new Nike(2, 300.0, 20.0);
		System.out.println("\n===================Nike=====================");
		System.out.println(NikeShoes);
		System.out.printf("Total price before discount\t: RM%.2f%n", NikeShoes.getTotalPrice());
		System.out.printf("Amount discounted\t\t:-RM%.2f%n", NikeShoes.getAmountDiscounted());
		System.out.printf("Total price after discount\t: RM%.2f%n", NikeShoes.getDiscountedPrice());
	}
}
