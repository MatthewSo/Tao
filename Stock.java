public class Stock{
    protected double  marVariable;
    protected double volatility;
    protected double  curVal;
    protected double  momentum;
    protected  String name;
    protected ArrayList<double> prices;
    public double getVolatility(){
	return volatility;
    }
    public double getCurVal(){
	return curVal;
    }
    public String  getName(){
	return name;
    }
    public ArrayList<double> getPrices(){
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
	return temp;
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
    public ArrayList<double> setPrices(ArrayList<double> u){
	ArrayList<double> temp1 = prices;
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

    
