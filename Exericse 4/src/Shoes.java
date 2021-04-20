import java.util.Scanner;

public class Shoes {
	private int quantity;
	private double price;
	Scanner scan = new Scanner(System.in);
	
	Shoes(){
		System.out.print("Enter quantity\t : ");
		this.quantity = scan.nextInt();
		System.out.print("Enter price\t : ");
		this.price = scan.nextDouble();
	}
	
	Shoes(int q, double p){
		this.quantity = q;
		this.price = p;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getTotalPrice() {
		return this.price * this.quantity;
	}
	
	public String toString() {
		return "Quantity\t\t\t: " + this.quantity +
			   "\nPrice\t\t\t\t: RM" + getPrice();
	}

}
