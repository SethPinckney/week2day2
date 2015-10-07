public class BonusCalculation {
	
	private int unitsSold;
	private float averageUnitPrice;
	private float commissionRate;
	
	public BonusCalculation(int unitsSoldArg, float averageUnitPriceArg) {
		this.unitsSold = unitsSoldArg;
		this.averageUnitPrice = averageUnitPriceArg;
		this.commissionRate = .03f;
	}
	
	public float getBonusAmount() {
		return totalDollarsSold() * commissionRate;
	}
	
	private float totalDollarsSold() {
		return unitsSold * averageUnitPrice;
	}
}