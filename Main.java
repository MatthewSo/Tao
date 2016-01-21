import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();
     ArrayList<Double> list1 = new ArrayList<Double>();
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Stock stock1 = new Stock("Goog",700.0,0.8,0.2,list1,1.0);
    stocks.add(stock1);
    ArrayList<Double> list2 = new ArrayList<Double>();
    list2.add(70.0);
    list2.add(80.0);
    list2.add(75.0);
    list2.add(72.0);
    Stock stock2 = new Stock("AAPL",70.0,0.8,0.2,list2,1.0);
    stocks.add(stock2);
    Player pl = new Player("Max","Easy",1000.0);
    Market m = new Market (pl, stocks);
    m.buy();
    }
}
