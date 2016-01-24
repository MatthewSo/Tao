import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();
     ArrayList<Double> list1 = new ArrayList<Double>();
     ArrayList<String> gverbs = new ArrayList<String>(); gverbs.add("dies"); gverbs.add("Does extremely Well"); gverbs.add("Shuts Down unexpecdelty");
     ArrayList<String> gnouns = new ArrayList<String>(); gnouns.add("android"); gnouns.add("Nexus"); gnouns.add("Gmail");
     ArrayList<Double> gw = new ArrayList<Double>(); gw.add(-12); gw.add(15); gw.add(-20);
     ArrayList<Boolean> gcm = new ArrayList<Boolean>(); gcm.add(false); gcm.add(false); gcm.add(true);
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Stock goog = new Stock("Google",700.0,0.8,2,list1,1.0,gnouns,gverbs,gw,gcm);
    stocks.add(stock1);
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<String> averbs = new ArrayList<String>(); averbs.add("crashes"); averbs.add("sells a trillion units"); averbs.add("releases without a 3.5mm port");
    ArrayList<String> anouns = new ArrayList<String>(); anouns.add("Iwatch"); anouns.add("Mac"); anouns.add("iPhone");
    ArrayList<Double> aw = new ArrayList<Double>(); aw.add(-12); aw.add(35); aw.add(-20);
    ArrayList<Boolean> acm = new ArrayList<Boolean>(); acm.add(false); acm.add(true); acm.add(false);
    list2.add(70.0);
    list2.add(80.0);
    list2.add(75.0);
    list2.add(72.0);
    Stock aapl = new Stock("Apple",70.0,0.8,2,list2,1.0,anouns,averbs,aw,acm);
    stocks.add(aapl);
    Player pl = new Player("Max","Easy",1000.0);
    Market m = new Market (pl, stocks);
    m.buy();
    }
}
