public class Testnum2{
    public static void  creatnum(double init, double volatility, double momentum){
	double oldPrice = init;
	double  newPrice =init;
	for(int i = 0; i < 365; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();

	    double changePercent = volatility * rnd;
	    double newrand = (Math.random() * 10) -5;
	    double changeAmount;
	    if ( newrand >= momentum){
		changeAmount = oldPrice * (-1 * changePercent/100);
		//momentum += (-1 * changePercent/1000);
	    }
	    else{
		changeAmount = oldPrice * (1 * changePercent/100) ;
		//momentum += (1 * changePercent/1000);
	    }
	    newPrice = oldPrice + changeAmount ;
	    
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
	creatnum(900,3.0,-0.0);
    }
}
