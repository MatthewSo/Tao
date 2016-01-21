import java.util.*;
import java.io.*;
public class Market{

    private Player pl;
    private ArrayList<Stock> stocks;
    private InputStreamReader isr;
    private BufferedReader in;

    public Market(){
	pl = new Player("Max","Easy",1000.0);
	stocks = new ArrayList<Stock>();
		isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }
    public Market(Player pl, ArrayList<Stock> st){
	this.pl =pl;
	stocks = st;
		isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }
    
    public static void view(ArrayList<Stock> st){
	for(int i = 0; i < st.size(); i++){
	    Stock a = st.get(i);
	    System.out.println("[" + i + "]" + a.getName() + "|" + a.getCurVal() + "\n" + a);
	}
    }
	
    public void buy(){
	ArrayList<Stock> newe = this.stocks;
	view(newe);
	int option = 0;
	int num =0;
	int temp = 0;
	System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy/sell a specific stock \n [4] Back \n [5] view your balance and stocks owned");
	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	if (temp < 6 && temp > 0){
	    option=temp;
	}
	/////////////////////////
	while (option != 4){
	    if (option == 3){
		int sto = 0;
		System.out.println("Which stock would you like to buy/sell? ");
		view(newe);
	    	try{
		    temp =  Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		if (temp < newe.size() && temp  > -1){
		    sto = temp;
		}
		System.out.println("You have Chosen " + newe.get(sto).getName());
		System.out.println("how much? (negative for selling)");
		try{
		    temp =  Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		num = temp;
		int i;
		i = sto;
		if (num > 0){
	      
		    if (pl.getDol() > newe.get(i).getCurVal() * num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() + num);
			pl.setDol(pl.getDol() - (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough $");
		    }
		}else{
		    if (newe.get(i).getAmtOwned() > num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() - num);
			pl.setDol(pl.getDol() + (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough stock to sell");
		    }
		}
	    }
	    if (option == 5){
		System.out.println("Your Balance is: " + pl.getDol());
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("you own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		}
	    }
	
	    System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy a specific stock \n [4] Back \n [5] view your balance/stocks owned");
	    try{
		temp =  Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) { }
	    if (temp < 6 && temp > 0){
		option= temp;
	}
	}
    }
}	
	    
	    
	    
	    
	    

