public class Nike extends Shoes{
	
	private double rate;
	
	public Nike(int q, double p, double r) {
		super(q,p);
		rate = r;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double getAmountDiscounted() {
		return super.getTotalPrice() * (rate/100);
	}
	
	public double getDiscountedPrice() {
		return super.getTotalPrice() - getAmountDiscounted();
	}
	
    public String toString() {
        return super.toString() + "\nDiscount rate\t\t\t: " + rate +"%";
    }
}
