
import java.util.*;

public class Stock{
    //all the instance variables needed for this class
    protected double volatility; //about  0-5
    protected double  curVal;//depends
    protected double  momentum; //about -2 - 2
    protected double  momVol; // about 0- 1
    protected  String name; 
    protected int amtOwned;
    protected ArrayList<Double> prices;
    protected ArrayList<Headline> heads= new ArrayList<Headline>();
    protected ArrayList<String> nouns= new ArrayList<String>();
    protected ArrayList<String> verbs= new ArrayList<String>();
    protected ArrayList<Double> ws= new ArrayList<Double>();
    protected ArrayList<Boolean> cms = new ArrayList<Boolean>();
    private double changeAmount;
    

    public Stock(String nm, double cV, double vol, double mom, ArrayList<Double> p, double mV){
	name = nm;
	curVal = cV;
	volatility = vol;
	momentum = mom;
	prices = p;
	momVol = mV;
	amtOwned = 0;
    }
    // Precond Nouns,Verbs,ws,cms, are all the same length
    //postcond; a stock with headlines
    public Stock(String nm, double cV, double vol, double mom, ArrayList<Double> p, double mV, ArrayList<String> n, ArrayList<String> v, ArrayList<Double> w, ArrayList<Boolean> cm){
	name = nm;
	curVal = cV;
	volatility = vol;
	momentum = mom;
	prices = p;
	momVol = mV;
	amtOwned = 0;
	nouns = n;
	verbs =v;
	ws = w;
	cms = cm;
	GenerateHeadlines();
    }
    //rounder for 2 floating points
    public static  double rounder(double u){
	int temp = (int)(u *100);
	double ret = temp/100.0;
	return ret;
    }
    //returning headline method
    public Headline  GenerateHeadline(String n,String v,double w, boolean cm){
	Headline h = new Headline(n,v,w,cm,name);
	return h;
    }
    //headline is changed in method
    public void  GenerateHeadlines(){
	for(int i =0; i < verbs.size(); i++){
	    Headline a = GenerateHeadline(nouns.get(i),verbs.get(i),ws.get(i),cms.get(i));
	    heads.add(a);
	}
    }
    //give random header
    public Headline getRandoHead(){
	int random =(int)( Math.random()*(heads.size()));
	return heads.get(random);
    }
    //get methods
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
    //set methods
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
    //adds price to end of ArrayList
    public void addPrice(double d){
	prices.add(d);}
    //progress finds next weeks value
    public ArrayList<Double> progress(){
	double oldPrice = curVal;
	double  newPrice =curVal;
	ArrayList<Double> weekly = new ArrayList<Double>();
	for(int i = 0; i < 1; i++){
	    oldPrice= newPrice;
	    double rnd = Math.random();
	    //gen random num
	    double changePercent = volatility * rnd;
	    double newrand = (Math.random() * 11) -5;
	    double changeAmount;
	    //if random num in range is greater than momentum
	    if ( newrand >= momentum){
		//take away some
		changeAmount = oldPrice * (-1 * changePercent/100);
		momentum += (-1 * momVol * changePercent/1000);
	    }
	    else{
		//add some
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
    //uses graph to return a graph of entire history
    public String toString(){
	String retstr = "Current value : " +rounder( curVal); //" %change : " + ((curVal - prices.get(prices.size()))/100) + "\n";
	Graph g = new Graph(this);
	retstr += g.printGraph();
	return retstr;
    }
}

