import java.util.*;


 
public class Competitor extends Stock{
    //new constructor
    public Competitor(String nm, double cV, double vol, double mom, ArrayList p, double mV){	
	super(nm,cV,vol,mon,p, mV);}
    //updated StartUp progress
        public ArrayList<Double> progress( Stock other){
	double oldPrice = curVal;
	double  newPrice =curVal;
	ArrayList<Double> weekly = new ArrayList<Double>();
	for(int i = 0; i < 1; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();

	    double changePercent = volatility * rnd;
	    double newrand = (Math.random() * 10) -5;
	    double changeAmount;
	    //Set the other momentum to a new value based on the change in the current this val
	    if ( newrand >= momentum){
		changeAmount = oldPrice * (-1 * changePercent/100);
		momentum += (-1 * momVol * changePercent/1000);
		other.setMomentum(other.getMomentum() + other.getMomVol() * 1  * changePercent/1000);
	    }
	    else{
		changeAmount = oldPrice * (1 * changePercent/100) ;
		momentum += (1 * momVol  * changePercent/1000);
		other.setMomentum(other.getMomentum() + other.getMomVol() * -1  * changePercent/1000);
	    }
	    newPrice = oldPrice + changeAmount ;
	    prices.add(newPrice);
	    weekly.add(newPrice);
	    curVal = newPrice;
	}
	return weekly;
	}}
