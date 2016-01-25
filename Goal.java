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
	    return "$" + reach + " has not been activated :(";
	}
	else{
	    return "$" + reach + " has been acheived!";
	}
    }
    public void reward(Player p){
	if (p.getDol() > reach && given == false){
	    p.newWorth(p.getDol() + value);
	    given = true;
	    System.out.println("You have just won $" + value + "for reaching $" + reach +".");
	    

	}
	else{
	    if (given == true){
		System.out.println("Cheater, you already achieved this goal");
	    }else{
	  
	    System.out.println("You have not reached $" + reach + ".");}
	}
    
    }
    public static void main(String[] args){
	Player me = new Player("me","hello",23.3);
	Goal test = new Goal(10.2,5);
	System.out.println(me);
	test.reward(me);
	System.out.println(me);}
    
    
}
