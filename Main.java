import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();



    
    //create Google
    ArrayList<Double> list1 = new ArrayList<Double>();//list for prices
     ArrayList<String> gverbs = new ArrayList<String>(); gverbs.add("dies"); gverbs.add("Does extremely Well"); gverbs.add("Shuts Down unexpecdelty");
     ArrayList<String> gnouns = new ArrayList<String>(); gnouns.add("android"); gnouns.add("Nexus"); gnouns.add("Gmail");
     ArrayList<Double> gw = new ArrayList<Double>(); gw.add(-1.0); gw.add(0.50); gw.add(-2.00);
     ArrayList<Boolean> gcm = new ArrayList<Boolean>(); gcm.add(false); gcm.add(false); gcm.add(true);
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Competitor goog = new Competitor("Google",700.0,0.8,2,list1,1.0,gnouns,gverbs,gw,gcm);//construct
    stocks.add(goog);//add to main list



    
    //create apple
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<String> averbs = new ArrayList<String>(); averbs.add("crashes"); averbs.add("sells a trillion units"); averbs.add("releases without a 3.5mm port");
    ArrayList<String> anouns = new ArrayList<String>(); anouns.add("Iwatch"); anouns.add("Mac"); anouns.add("iPhone");
    ArrayList<Double> aw = new ArrayList<Double>(); aw.add(-1.20); aw.add(5.0); aw.add(-2.00);
    ArrayList<Boolean> acm = new ArrayList<Boolean>(); acm.add(false); acm.add(true); acm.add(false);
    list2.add(70.0);
    list2.add(80.0);
    list2.add(75.0);
    list2.add(72.0);
    Competitor aapl = new Competitor("Apple",70.0,0.8,2,list2,1.0,anouns,averbs,aw,acm);
    stocks.add(aapl);



        //create BP
    ArrayList<Double> list4 = new ArrayList<Double>();//list for prices
     ArrayList<String> bpverbs = new ArrayList<String>(); gverbs.add("spills into the gulf."); gverbs.add("explodes"); gverbs.add("are down.");
     ArrayList<String> gnouns = new ArrayList<String>(); gnouns.add("BP oil"); gnouns.add("BP tanker"); gnouns.add("BP sales");
     ArrayList<Double> gw = new ArrayList<Double>(); gw.add(-1.0); gw.add(0.50); gw.add(-2.00);
     ArrayList<Boolean> gcm = new ArrayList<Boolean>(); gcm.add(false); gcm.add(false); gcm.add(true);
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Competitor bp = new Competitor("BP",700.0,0.8,2,list1,1.0,gnouns,gverbs,gw,gcm);//construct
    stocks.add(goog);//add to main list



    
    //create apple
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<String> averbs = new ArrayList<String>(); averbs.add("crashes"); averbs.add("sells a trillion units"); averbs.add("releases without a 3.5mm port");
    ArrayList<String> anouns = new ArrayList<String>(); anouns.add("Iwatch"); anouns.add("Mac"); anouns.add("iPhone");
    ArrayList<Double> aw = new ArrayList<Double>(); aw.add(-1.20); aw.add(5.0); aw.add(-2.00);
    ArrayList<Boolean> acm = new ArrayList<Boolean>(); acm.add(false); acm.add(true); acm.add(false);
    list2.add(70.0);
    list2.add(80.0);
    list2.add(75.0);
    list2.add(72.0);
    Competitor aapl = new Competitor("Apple",70.0,0.8,2,list2,1.0,anouns,averbs,aw,acm);
    stocks.add(aapl);



    
    //create Twitter
    ArrayList<Double> list3 = new ArrayList<Double>();//list for prices
    ArrayList<String> tverbs = new ArrayList<String>(); gverbs.add("crash"); gverbs.add("is endorsed by Obama"); gverbs.add("tweets, 'this is a bad website #twitter #is #bad'");
    ArrayList<String> tnouns = new ArrayList<String>(); gnouns.add("Twitter servers"); gnouns.add("Twitter"); gnouns.add("Bono");
    ArrayList<Double> tw = new ArrayList<Double>(); gw.add(-1.0); gw.add(0.50); gw.add(-2.00);
    ArrayList<Boolean> tcm = new ArrayList<Boolean>(); gcm.add(false); gcm.add(false); gcm.add(true);
    list3.add(15.5);
    list3.add(14.3);
    list3.add(16.2);
    list3.add(17.5);
    Independent twtr = new Independent("Twitter",17.5,1.0,.5,list3,1.0,gnouns,gverbs,gw,gcm);//construct
    stocks.add(twtr);//add to main list
    
    Player pl = new Player("Max","Easy",1000.0);
    Market m = new Market (pl, stocks);
    m.buy();
    }
}
