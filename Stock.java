import java.util.*;

public class Stock{
    protected double  marVariable;
    protected double volatility;
    protected double  curVal;
    protected double  momentum;
    protected  String name;
    protected double marVal;
    protected ArrayList<Double> prices;

    public Stock(){
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
    public double getMarVal(){
	return marVal;
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
    public double setMarVal(double u){
	double temp1 = marVal;
	marVal = u;
	return temp1;
    }
    public double setMomentum(double u){
	double temp1 = momentum;
	momentum = u;
	return temp1;
    }
    public ArratList<Double>  progress(){
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
	    Prices.add(newPrice);
	    weekly.add(newPrice);
	    curVal = newPrice;
	}
	return weekly;
    }
    
    public String toString(){
	String retstr = "Current value : " + curVal + " %change : " + ((curVal - Prices.get(Prices.size() -1))/100) + "\n";
	Graph g = new Graph(this);
	retstr += g.printGraph();
	return retstr;
    }
}
