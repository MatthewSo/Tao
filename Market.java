import java.util.*;
import java.io.*;
public class Market{

    private Player pl;
    private ArrayList<Stock> stocks;
    private InputStreamReader isr;
    private BufferedReader in;
    
    public static  double rounder(double u){
	int temp = (int)(u *100);
	double ret = temp/100.0;
	return ret;
    }
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
	    System.out.println("[" + i + "]" + a.getName() + "|" + rounder(a.getCurVal()) +"|" +  rounder(a.getChangeAmount()) + "\n");
	}
    }
        public static void viewXTRA(ArrayList<Stock> st){
	for(int i = 0; i < st.size(); i++){
	    Stock a = st.get(i);
	    System.out.println("[" + i + "]" + a.getName() + "|" + rounder(a.getCurVal()) + "\n" +a);
	}
    }

   
    public void buy(){
	ArrayList<Stock> newe = this.stocks;
	view(newe);
	int option = 0;
	int num =0;
	int temp = 0;
	System.out.println("select an option\n [1]Sort by price\n [2]Sort by change percent \n [3] buy/sell a specific stock \n [4] Back \n [5] view your balance and stocks owned");
	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	if (temp > 0){
	    option=temp;
	}
	/////////////////////////
	while (option != 4){

	     if (option == 1){
		newe = viewByPrice(newe);
		viewXTRA(newe);
		break;
	    }
	     else if (option == 2){
		newe = viewByChange(newe);
		viewXTRA(newe);
		break;
	    }
	    else if (option == 3){
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
		System.out.println("[1]buy or [2]sell?");
		int b = 0;
		try{
		    b =  Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		if ( b == 1){
		    
		    System.out.println("how much?");
		    //  String foo = "0";
		    //   try{
			//	foo = in.readLine();
			// }
		    //catch ( Exception e ) { }
		    try{
			temp =  Integer.parseInt(in.readLine() );
		    }
		    catch (IOException e ) { }
		    num = temp;
		    int i;
		    i = sto;
	      
		    if (pl.getDol() > newe.get(i).getCurVal() * num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() + num);
			pl.newWorth(pl.getDol() - (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough $");
		    }
		}else{
		    		    
		    System.out.println("how much?");
		    //  String foo = "0";
		    //   try{
			//	foo = in.readLine();
			// }
		    //catch ( Exception e ) { }
		    try{
			temp =  Integer.parseInt(in.readLine() );
		    }
		    catch (IOException e ) { }
		    num = temp;
		    int i;
		    i = sto;
		    if (newe.get(i).getAmtOwned() > num){
			newe.get(i).setAmtOwned(newe.get(i).getAmtOwned() - num);
			pl.newWorth(pl.getDol() + (newe.get(i).getCurVal() * num));
		    }else{
			System.out.println("not enough stock to sell");
		    }
		}
		break;
	    }
	    else if (option == 5){
		System.out.println("Your Balance is: " + pl.getDol());
		System.out.println(pl);
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("you own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		}
		break;
	    }		    
	     view(newe);
	    System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy a specific stock \n [4] Back \n [5] view your balance/stocks owned \n [6] progress");
	    try{
		temp =  Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) { }
	    if ( temp > 0){
		option= temp;
	    }
	}
    }
	
public void run(){
    while(true){
	System.out.println(" select an option\n [1] Buy and Sell and View stocks \n  [2] view your balance/stocks owned \n [3] progress \n[4] retire");
	int temp = 0;
	try{
	    temp =  Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	//////////
	int option = 0;
	if ( temp > 0){
	    option= temp;
	}
	ArrayList<Stock> newe = this.stocks;
	while (option != 3){
	    if (option == 1){
		buy();
	    }else if (option == 2){
		System.out.println("Your Balance is: " + pl.getDol());
		System.out.println(pl);
		for (Stock a:newe){
		    if( a.getAmtOwned() > 0){
			System.out.println("you own " + a.getAmtOwned() +  " of " + a.getName());
		    }
		
		}
	    }
	    System.out.println(" select an option\n [1] Buy and Sell and View stocks \n  [2] view your balance/stocks owned \n [3] progress \n[4] retire");
	    try{
		temp =  Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) { }
	    //////////
	    if ( temp > 0){
		option= temp;
	    }
	}
    
	int rando= (int)(Math.random() * newe.size());
	Headline header = newe.get(rando).getRandoHead();
	Stock headerstock = newe.get(rando);
	System.out.println(header);

	if (header.changesMomentum){
	    headerstock.setMomentum(headerstock.getMomentum() + (header.worth/100.0)*(headerstock.getCurVal()));
	}else{
	    headerstock.setCurVal(headerstock.getCurVal() + (header.worth/100 * headerstock.getMomentum()));
	}
				    
	for (int i =0; i < newe.size(); i++){
	    //if (newe.get(i) instanceof Competitor){
		    
	    //	if (newe.get(i).getName() == "bp"|| newe.get(i).getName() == "Apple"){
		    //	    newe.get(i).progress(newe.get(i+1));
	    //	}
	    //	else if (newe.get(i).getName() == "shell"|| newe.get(i).getName() == "Google"){
		    //	    newe.get(i).progress(newe.get(i-1));
	    //		}
	    //    }
	//	    else{
		newe.get(i).progress();
	}
	
	
    }
}
  
   

    public static ArrayList<Stock> viewByPrice( ArrayList<Stock> st ) {
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
    public static ArrayList<Stock> viewByChange( ArrayList<Stock> st ) {
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
	


}
	    
	    
	    
	    
	    

