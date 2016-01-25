public class Goal{
    
    double reach;
    boolean given;
    double value;
    public Goal(double v,double r){
	value = v ;
	given = false;
	reach =r;
    }
    public String toString()
    {
	if (given == false){
	    return "$" + reach + " has not been reached.";
	}
	else{
	    return "$" + reach + " has not been reached.";
	}
    }
    public String reward(Player p){
	if (p.getDol() > reach){
	    p.newWorth(p.getDol() + value);
	    	    given = true;
	    return "You have just won $" + value + "for reaching $" + reach +".";

	}
	else{
	    return "You have not reached $" + reach + ".";}
    }
}
