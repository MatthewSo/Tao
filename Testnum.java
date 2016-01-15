public class Testnum{
    public static void  creatnum(double init, double volatility, double momentum){
	double oldPrice = init;
	double  newPrice =init;
	for(int i = 0; i < 365; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();

	    double changePercent = 2 * volatility * rnd;

	    if (changePercent > volatility) {
		changePercent -= (2 * volatility);
	    }
	    double  changeAmount = oldPrice * changePercent/100  + momentum;
	    newPrice = oldPrice + changeAmount;
	    momentum = (changeAmount/10);
	    /*if (newPrice < MIN_PRICE) {
		newPrice += Math.abs(changeAmount) * 2;
	    } else if (newPrice > MAX_PRICE) {
		newPrice -= Math.abs(changeAmount) * 2;
	    }
	    */
	    System.out.println(newPrice);

	}
    }

	
    public static void main(String[] args){
	creatnum(900,2.3,10);
    }
}
	
