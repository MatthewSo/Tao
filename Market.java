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
	    System.out.println("[" + i + "]" + a.getName() + "|" + a.getCurVal() + "\n");
	}
    }
        public static void viewXTRA(ArrayList<Stock> st){
	for(int i = 0; i < st.size(); i++){
	    Stock a = st.get(i);
	    System.out.println("[" + i + "]" + a.getName() + "|" + a.getCurVal() + "\n" +a);
	}
    }
	
    public void buy(){
	ArrayList<Stock> newe = this.stocks;
	view(newe);
	int option = 0;
	int num =0;
	int temp = 0;

	System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy/sell a specific stock \n [4] Back \n [5] view your balance and stocks owned \n [6] progress \n [7]Change momentum test ");
	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	if (temp > 0){
	    option=temp;
	}
	/////////////////////////
	while (option != 4){
	    System.out.println(pl);
	    int rando= (int)(Math.random() * newe.size());
	    Headline header = newe.get(rando).getRandoHead();
	    Stock headerstock = newe.get(rando);
	    System.out.println(header);
	    if (option == 3){
		int sto = 0;
		System.out.println("Which stock would you like to buy/sell? ");
		viewXTRA(newe);
	    	try{
		    temp =  Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		if (temp < newe.size() && temp  > -1){
		    sto = temp;
		}
		System.out.println("You have Chosen " + newe.get(sto).getName());
		System.out.println("how much? (negative for selling)");
		String foo = "0";
		try{
		    foo = in.readLine();
		}
		catch ( Exception e ) { }
		try{
		    temp =  Integer.parseInt( foo );
		}
		catch (Exception e ) { }
		num = temp;
		int i;
		i = sto;
		if (num > 0){
	      
		    if (pl.getDol() > newe.get(i).getCurVal() * num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() + num);
			pl.newWorth(pl.getDol() - (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough $");
		    }
		}else{
		    if (newe.get(i).getAmtOwned() > num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() - num);
			pl.newWorth(pl.getDol() + (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough stock to sell");
		    }
		}
	    }
	    else if (option == 5){
		System.out.println("Your Balance is: " + pl.getDol());
		System.out.println(pl);
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("you own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		}
	    }
	    else if (option == 6){
		if (header.changesMomentum){
		    headerstock.setMomentum(headerstock.getMomentum() + (header.worth/100.0)*(headerstock.getCurVal()));
			}else{
		    headerstock.setCurVal(headerstock.getCurVal() + (header.worth/100 * headerstock.getMomentum()));
		}
				    
		for (int i =0; i < newe.size(); i++){
		    newe.get(i).progress();
		}

		    
		
	    }
	    else if (option == 7){
		double numb = 0;
		for (int  i =0; i < newe.size(); i++){
		    System.out.println("set momentum for " + newe.get(i).getName() +" ");
		    try{
			numb =  Double.parseDouble( in.readLine() );
		    }
		    catch ( IOException e ) { }
		    newe.get(i).setMomentum(numb);
		}
	    }
	
	    System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy a specific stock \n [4] Back \n [5] view your balance/stocks owned \n [6] progress \n [7]Change momentum test ");
	    try{
		temp =  Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) { }
	    if ( temp > 0){
		option= temp;
	}
	}
    }
}	
	    
	    
	    
	    
	    

