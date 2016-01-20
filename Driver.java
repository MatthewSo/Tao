import java.util.*;
import java.io.*;
public class Driver{
    private ArrayList<Double> list1 = new ArrayList<Double>();
    list1.add(10);
    list1.add(20);
    list1.add(15);
    list1.add(12);
    private Stock stock1 = new Stock(Goog,20,1.2,1,list1,1);
    stocks.add(stock1);
    private ArrayList<Double> list2 = new ArrayList<Double>();
    list1.add(70);
    list1.add(80);
    list1.add(75);
    list1.add(72);
    private Stock stock1 = new Stock(AAPL,70,0.8,1,list2,1);
    stocks.add(stock1);
    
    private int difficulty = 0;
    private ArrayList<Stock> stocks = new ArrayList<Stock>();
    
    public void chooseDifficulty(int i){
	difficulty = i;
    }
    public static void view(ArrayList<Stock> st){
	for(Stock a:st){
	    System.out.println(st.name + "|" + st.curVal);
	}
    }
	
    public void buy(){
	ArrayList<Double> new = this.stocks;
	view(new);
	int option = 0;
	System.out.println("select an option\n [1]Sort by price\n [2]Sort by name \n [3] buy a specific stock");
	if (Integer.parseInt( in.readLine() ) < 4 && Integer.parseInt( in.readLine() ) > 0){
	    option= Integer.parseInt( in.readLine() );
	}
	if (option == 3){
	    System.out.println("Which stock would you like to buy?");
	    view(new);
	    if (Integer.parseInt( in.readLine() ) < new.size() && Integer.parseInt( in.readLine() ) > -1){
		option= Integer.parseInt( in.readLine() );
	    }
	    for (int i = 0; i < new.size()-1; i++){
		if (option == i +1 ){
		    new.get(i).setAmtOwned(new.get(i).getAmtOwned() + 1);
		}
	    }
	    
	    
	    
	    

