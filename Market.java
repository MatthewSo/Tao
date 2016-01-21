import java.util.*;
import java.io.*;
public class Market{

    private Player pl;
    private int difficulty;
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
    
    public void chooseDifficulty(int i, Player pl){
	difficulty = i;
	
    }
    public static void view(ArrayList<Stock> st){
	for(Stock a:st){
	    System.out.println(a.getName() + "|" + a.getCurVal() + "\n" + a);
	}
    }
	
    public void buy(){
	ArrayList<Stock> newe = this.stocks;
	view(newe);
	int option = 0;
	int num =0;
	int temp = 0;
	System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy/sell a specific stock \n [4] Back");
	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	if (temp < 5 && temp > 0){
	    option=temp;
	}
	while (option != 4){
	if (option == 3){
	    System.out.println("Which stock would you like to buy/sell? ");
	    view(newe);
	    	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
		if (temp < newe.size() && temp  > -1){
		option= temp;
	    }
	    System.out.println("how much? (negative for selling)");
	    	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
		num = temp;
	    if (num > 0){
		for (int i = 0; i < newe.size()-1; i++){
		    if (option == (i +1 )){
			if (pl.getDol() > newe.get(i).getCurVal() * num){
			    newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() + num);
			    pl.setDol(pl.getDol() - (newe.get(i).getCurVal() * num));
			}else{
				System.out.println("not enough $");
			}
		    }
		}
	    }else{
		for (int i = 0; i < newe.size()-1; i++){
		    if (option == (i +1 )){
			if (newe.get(i).getAmtOwned() > num){
			    newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() - num);
			    pl.setDol(pl.getDol() + (newe.get(i).getCurVal() * num));
			}else{
			    System.out.println("not enough stock to sell");
			}
		    }
		}
	    }
	}
	
      
		System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy a specific stock \n [4] Back");
			try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	if (temp < 5 && temp > 0){
	    option= temp;
	}
}
    }
}
	
	    
	    
	    
	    
	    

