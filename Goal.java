public class Goal{

    //instance variables
    double reach;
    boolean given;
    double value;
    //constructor assigns reach and value
    public Goal(double v,double r){
	value = v ;
	given = false;
	reach =r;
    }
    //new toString based on its deliverance
    public String toString()
    {
	if (given == false){
	    return "$" + reach + " has not been activated :(";
	}
	else{
	    return "$" + reach + " has been acheived!";
	}
    }
    //give player the money
    public void reward(Player p){
	//if player reached goal and it hasnt been given
	if (p.getDol() > reach && given == false){
	    //give new worth to player
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
    //test
    // public static void main(String[] args){
    // 	Player me = new Player("me","hello",23.3);
    // 	Goal test = new Goal(10.2,5);
    // 	System.out.println(me);
    // 	test.reward(me);
    // 	System.out.println(me);}
    
    
}
