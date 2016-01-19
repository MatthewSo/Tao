import java.util.*;


 
public class Competitor extends Stock{
    private Stock competitor;
    public Competitor(String nm, double cV, double vol, double mom, ArrayList p,Stock competitor){	
	super(nm,cV,vol,mon,p);
	competitor = comp;}

        public ArrayList<Double> progress(){
	double oldPrice = curVal;
	double  newPrice =curVal;
	ArrayList<Double> weekly;
	for(int i = 0; i < 7; i++){
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
	    prices.add(newPrice);
	    weekly.add(newPrice);
	    curVal = newPrice;
	}
	return weekly;
	}}
