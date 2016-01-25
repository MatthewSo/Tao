import java.util.*;
import java.io.*;
public class Market{

    private Player pl;
    private ArrayList<Stock> stocks;
    private InputStreamReader isr;
    private BufferedReader in;
    private int counter= 0;//for days of the week
    
    public static  double rounder(double u){// Static method to make our code look pretty
	int temp = (int)(u *100);
	double ret = temp/100.0;
	return ret;
    }
    //initzlize a new market, along with input methods
    public Market(){
	pl = new Player("Max","Easy",1000.0);
	stocks = new ArrayList<Stock>();
		isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }
    
    public Market(Player pl, ArrayList<Stock> st){// constructor that we actually use
	this.pl =pl;
	stocks = st;
        isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }
    
    public static void view(ArrayList<Stock> st){// To print out stock names, prices and changes
	for(int i = 0; i < st.size(); i++){
	    Stock a = st.get(i);
	    System.out.println("[" + i + "]" + a.getName() + "|" + rounder(a.getCurVal()) +"|" +  rounder(a.getChangeAmount()) + "\n");
	}
    }
    public static void viewXTRA(ArrayList<Stock> st){// prints out stock graphs
	for(int i = 0; i < st.size(); i++){
	    Stock a = st.get(i);
	    System.out.println("[" + i + "]" + a.getName() + "|" + rounder(a.getCurVal()) + "\n" +a);
	}
    }

    public void run10(){// runs 10 times for the purpose of having a simulation set up at the start
	for (int x = 0; x < 10; x++){
		for (int i =0; i < stocks.size(); i++){
		stocks.get(i).progress();
		}
	    }
    }
		
	     
	
    public void buy(){// Buys stocks
	ArrayList<Stock> newe = this.stocks;// easily maniuplatable
	view(newe);
	int option = 0;
	int num =0;
	int temp = 0;
	System.out.println("Select an option\n \n [0] View graphs\n [1] Sort by price\n [2] Sort by change percent \n [3] Buy/Sell a specific stock \n [4] Back \n [5] View your balance and stocks owned");// options
	String fa = "0";//this stuff is all over and its just to snatitize inputs
	try{
	    fa = in.readLine();
	}
	catch ( Exception e ) { }
	try{
	    temp =  Integer.parseInt(fa);
	}
	catch (Exception e ) { }
	if (temp > -1){
	    option=temp;
	}
	/////////////////////////
	while (option != 4){// run until they press back
	    if (option == 1){
		newe = viewByPrice(newe);//sort
	    //view(newe);
		//break;
	    }
	     else if (option == 2){
		 newe = viewByChange(newe);//sort
		//view(newe);
		//break;
	    }
	     else if (option == 0){
		 viewXTRA(newe);
	     }
	    else if (option == 3){
		int sto = 0;
		System.out.println("Which stock would you like to buy/sell?(your balance is $" + rounder(pl.getDol()) + ")");
		view(newe);
		String foooo = "0";
		try{
		    foooo = in.readLine();
		}
		catch ( Exception e ) { }
		try{
		    temp =  Integer.parseInt(foooo);
		}
		catch (Exception e ) { }
		if (temp < newe.size() && temp  > -1){
		    sto = temp;
		}
		System.out.println("You have Chosen " + newe.get(sto).getName());
		System.out.println("[1]Buy or [2]Sell?");
		int b = 0;
		String fooo = "0";
		try{
		    fooo = in.readLine();
		}
		catch ( Exception e ) { }
		try{
		    b =  Integer.parseInt(fooo);
		}
		catch (Exception e ) { }
		if ( b == 1){
		    
		    System.out.println("How much? You have " + rounder( pl.getDol()) + " dollars and its price per stock is $" + rounder(newe.get(sto).getCurVal()));
		    String foo = "0";
		    try{
			foo = in.readLine();
		    }
		    catch ( Exception e ) { }
		    try{
			temp =  Integer.parseInt(foo);
		    }
		    catch (Exception e ) { }
		    num = temp;
		    int i;
		    i = sto;
	      
		    if (pl.getDol() > newe.get(i).getCurVal() * num){// check to see if they have enough money
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() + num);
			pl.newWorth(pl.getDol() - (newe.get(i).getCurVal() * num));
			System.out.println("You bought " + num + " of " + newe.get(i).getName() + ". Your new balance is " + rounder(pl.getDol()) + "!");
		    }else{
			System.out.println("Not enough money.");
		    }
		}else if (b == 2){
		    		    
		    System.out.println("How much? You own " + newe.get(sto).getAmtOwned() + " and its price per stock is $" + rounder(newe.get(sto).getCurVal()));
		    String bar = "0";
		    try{
			bar = in.readLine();
		    }
		    catch ( Exception e ) { }
		    try{
			temp =  Integer.parseInt(bar);
		    }
		    catch (Exception e ) { }
		    num = temp;
		    int i;
		    i = sto;
		    if (newe.get(i).getAmtOwned() >= num){ //check to see they have enough stock
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() - num);
			pl.newWorth(pl.getDol() + (newe.get(i).getCurVal() * num));
			System.out.println("You sold " + num + " of " + newe.get(i).getName() + ". Your new balance is " + rounder(pl.getDol()) + "!");

		    }else{
			System.out.println("Not enough stock to sell.");
		    }
		}
	    }
	    else if (option == 5){// just print some stats
		System.out.println("Your Balance is: " +rounder( pl.getDol()));
		System.out.println(pl);
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("You own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		}
	    }		    
	     view(newe);
	     System.out.println("Select an option\n [0] View Graphs \n [1] Sort by price\n [2] Sort by percent change \n [3] Buy/Sell a specific stock \n [4] Back \n [5] View your balance/stocks owned");// this happens so it can keep looping and choosing options
	    String fooi = "0";
	    try{
		fooi = in.readLine();
	    }
	    catch ( Exception e ) { }
	    try{
		temp =  Integer.parseInt(fooi);
	    }
	    catch (Exception e ) { }
	    if ( temp > -1){
		option= temp;
	    }
	}
    }
	
    public void run(){// The main method
	while(true){//always run until they quit
	
	    System.out.println(" Select an option\n [1] Buy and Sell and view stocks \n [2] View your balance/stocks owned \n [3] Progress \n [4] Retire \n [5] View goals");//options
	int temp = 0;
	String foog = "0";
	try{
	    foog = in.readLine();
	}
	catch ( Exception e ) { }
	try{
	    temp =  Integer.parseInt(foog);
	}
	catch (Exception e ) { }
	//////////
	int option = 0;
	if ( temp > 0){
	    option= temp;
	}
	ArrayList<Stock> newe = this.stocks;
	while (option != 3){
	    if (option == 1){
		buy();
	    }else if (option == 2){// same as above
		System.out.println("Your Balance is: " + rounder(pl.getDol()));
		System.out.println(pl);
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("You own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		
		}
	    }
	    else if (option == 5){//prints out all the goals with numbers in order 
		int num =1;
		for (Goal g: pl.g){
		    System.out.println("[" + num + "]" + g);
		    num ++;
		}
		System.out.println("Cash in a goal? [1]Yes [2] No");
		int temper = 0;
		String fool = "0";
		try{
		    fool = in.readLine();
		}
		catch ( Exception e ) { }
		try{
		    temper =  Integer.parseInt(fool);
		}
		catch (Exception e ) { }

		if (temper == 1){
		    System.out.println("Which goal?");
		    num =1;
		    for (Goal g: pl.g){
			System.out.println("[" + num + "]" + g);
			num ++;
		    }
		    int temperal = 1;
		    String foom = "0";
		    try{
			foom = in.readLine();
		    }
		    catch ( Exception e ) { }
		    try{
			temperal =  Integer.parseInt(foom);
		    }
		    catch (Exception e ) { }
		    pl.g.get(temperal -1 ).reward(pl);
		}
		else if (temper == 2){
		    System.out.println("Ok come back soon!");//i had to put something here
		}
	    }
		    
	   
	    
	    if (option == 4){
		return;}
	    System.out.println(" Select an option\n [1] Buy and Sell and View stocks \n [2] View your balance/stocks owned \n [3] Progress \n [4] Retire \n [5] View Goals");//for looping sake
	    String fooy = "0";
	    try{
		fooy = in.readLine();
	    }
	    catch ( Exception e ) { }
	    try{
		temp =  Integer.parseInt(fooy);
	    }
	    catch (Exception e ) { }
	    //////////
	    if ( temp > 0){
		option= temp;
	    }
	    if (option == 4){
		return;}
	}
    
	int rando= (int)(Math.random() * newe.size());//generate next weeks headline
	Headline header = newe.get(rando).getRandoHead();
	Stock headerstock = newe.get(rando);

	if (header.changesMomentum){//start its effects (it only changes momementum so we have to start it in advance
	    headerstock.setMomentum(headerstock.getMomentum() + (header.worth/100.0)*(headerstock.getCurVal()));
	}else{
	    headerstock.setCurVal(headerstock.getCurVal() + (header.worth/100 * headerstock.getMomentum()));
	}

	System.out.println("Day " + counter);
	System.out.println(header); //print the headline

				    
	for (int i =0; i < newe.size(); i++){
	    //if (newe.get(i) instanceof Competitor){
		    
	    // 	if (newe.get(i).getName() == "bp"|| newe.get(i).getName() == "Apple"){
	    // 	    Competitor x = (Competitor)newe.get(i);
	    // 	     x.progress(newe.get(i+1));
	    // 	     newe.set(i,x);
	    // 	}
	    // 	else if (newe.get(i).getName() == "shell"|| newe.get(i).getName() == "Google"){
	    // 	    Competitor x = (Competitor)newe.get(i);
	    // 	    x.progress(newe.get(i-1));
	    // 	    newe.set(i,x);
	    // 	}
	    // }
	    // 	    else{
		newe.get(i).progress();
	}
	counter += 7;
	
	
    }
}
  
   

    public static ArrayList<Stock> viewByPrice( ArrayList<Stock> st ) {// sorts using bubble sort
	Stock first;
	Stock second;
	for(int x = 0; x < st.size() - 1; x ++){
	for (int i = (st.size() - 1); i > 0 ; i--){
	    first = st.get(i - 1);
	    second = st.get(i);
	    if (first.getCurVal() > (second.getCurVal())){
		st.set(i, first);
		st.set((i - 1),second);}
	}}
	return st;}
    public static ArrayList<Stock> viewByChange( ArrayList<Stock> st ) {// sorts using bubble sort
	Stock first;
	Stock second;
	for(int x = 0; x < st.size() - 1; x ++){
	for (int i = (st.size() - 1); i > 0 ; i--){
	    first = st.get(i - 1);
	    second = st.get(i);
	    if (first.getChangeAmount() > (second.getChangeAmount())){
		st.set(i, first);
		st.set((i - 1),second);}
	}}
        return st;}
	


}// end class market
	    


	    
	    
	    

