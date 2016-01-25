import java.util.*;


 
public class StartUp extends Stock{
    //Constructor uses superclass's constructor
    StartUp(String nm, double cV, double vol, double mom, ArrayList<Double> p, double mV, ArrayList<String> n, ArrayList<String> v, ArrayList<Double> w, ArrayList<Boolean> cm){
	super( nm, cV, vol, mom, p,mV,n,v,w,cm);}
    //progress gives favor to upward momentum
     public ArrayList<Double> progress(){
	double oldPrice = curVal;
	double  newPrice =curVal;
	ArrayList<Double> weekly = new ArrayList<Double>();
	for(int i = 0; i < 1; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();

	    double changePercent = volatility * rnd;
	    double newrand = (Math.random() * 11) -5;
	    double changeAmount;
	    //the momentum change is greater in Startups when it is positive
	    if ( newrand >= momentum){
		changeAmount = oldPrice * (-1 * changePercent/100);
		momentum += (-1 * momVol * changePercent/1000);
	    }
	    else{
		changeAmount = oldPrice * (1 * changePercent/100) ;
		momentum += (1 * momVol  * changePercent/850);
	    }
	    newPrice = oldPrice + changeAmount ;
	    prices.add(newPrice);
	    weekly.add(newPrice);
	    curVal = newPrice;
	}
	return weekly;
     }}
