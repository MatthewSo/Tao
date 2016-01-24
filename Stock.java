
import java.util.*;

public class Stock{
    protected double volatility; //about  0-5
    protected double  curVal;//depends
    protected double  momentum; //about -2 - 2
    protected double  momVol; // about 0- 1
    protected  String name; 
    protected int amtOwned;
    protected ArrayList<Double> prices;
    // protected ArrayList<Headline> heads;
    protected ArrayList<String> nouns;
    protected ArrayList<String> verbs;
    private double changeAmount;
    

    public Stock(String nm, double cV, double vol, double mom, ArrayList<Double> p, double mV){// ArrayList<String> n, ArrayList<String v){
	name = nm;
	curVal = cV;
	volatility = vol;
	momentum = mom;
	prices = p;
	momVol = mV;
	amtOwned = 0;
    }
    public double getChangeAmount(){
	return changeAmount;}
    public int getAmtOwned(){
 return amtOwned;}
    public int setAmtOwned(int u){
        int temp1 = amtOwned;
	amtOwned = u;
	return temp1;}
    public double getMomVol(){
	return momVol;
    }
    public double getVolatility(){
	return volatility;
    }
    public double getCurVal(){
	return curVal;
    }
    public String  getName(){
	return name;
    }
    public ArrayList<Double> getPrices(){
	return prices;
    }
    public double getMomentum(){
	return momentum;
    }
    //######################################################
      public double setVolatility(double u){
	  double temp1 = volatility;
	  volatility = u;
	return temp1;
    }
    public double setCurVal(double u){
	double temp1 = curVal;
	curVal = u;
	return temp1;
    }
    public String  setName(String u){
	String temp1 = name;
	name = u;
	return temp1;
    }
    public ArrayList<Double> setPrices(ArrayList<Double> u){
	ArrayList<Double> temp1 = prices;
	prices = u;
	return temp1;
    }
    public double setMomentum(double u){
	double temp1 = momentum;
	momentum = u;
	return temp1;
	
    }
    public void addPrice(double d){
	prices.add(d);}
    public ArrayList<Double> progress(){
	double oldPrice = curVal;
	double  newPrice =curVal;
	ArrayList<Double> weekly = new ArrayList<Double>();
	for(int i = 0; i < 1; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();

	    double changePercent = volatility * rnd;
	    double newrand = (Math.random() * 10) -5;
	    if ( newrand >= momentum){
		changeAmount = oldPrice * (-1 * changePercent/100);
		momentum += (-1 * momVol * changePercent/1000);
	    }
	    else{
		changeAmount = oldPrice * (1 * changePercent/100) ;
		momentum += (1 * momVol  * changePercent/1000);
	    }
	    newPrice = oldPrice + changeAmount ;
	    prices.add(newPrice);
	    weekly.add(newPrice);
	    curVal = newPrice;
	}
	return weekly;
    }
    
    public String toString(){
	String retstr = "Current value : " + curVal; //" %change : " + ((curVal - prices.get(prices.size()))/100) + "\n";
	Graph g = new Graph(this);
	retstr += g.printGraph();
	return retstr;
    }
}
