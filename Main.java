import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();
     ArrayList<Double> list1 = new ArrayList<Double>();
    list1.add(10.0);
    list1.add(20.0);
    list1.add(15.0);
    list1.add(12.0);
    Stock stock1 = new Stock("Goog",20.0,1.2,1.0,list1,1.0);
    stocks.add(stock1);
    ArrayList<Double> list2 = new ArrayList<Double>();
    list2.add(70.0);
    list2.add(80.0);
    list2.add(75.0);
    list2.add(72.0);
    Stock stock2 = new Stock("AAPL",70.0,0.8,1.0,list2,1.0);
    stocks.add(stock2);
    Player pl = new Player("Max","Easy",1000.0);
    Market m = new Market (pl, stocks);
    m.buy();
    }
}
