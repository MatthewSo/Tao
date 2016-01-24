import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();



    
    //create Google
    ArrayList<Double> list1 = new ArrayList<Double>();//list for prices
     ArrayList<String> gverbs = new ArrayList<String>();
     gverbs.add("dies");
     gverbs.add("Does extremely Well");
     gverbs.add("Shuts Down unexpecdelty");
     ArrayList<String> gnouns = new ArrayList<String>();
     gnouns.add("android");
     gnouns.add("Nexus");
     gnouns.add("Gmail");
     ArrayList<Double> gw = new ArrayList<Double>();
     gw.add(-1.0);
     gw.add(0.50);
     gw.add(-2.00);
     ArrayList<Boolean> gcm = new ArrayList<Boolean>();
     gcm.add(false);
     gcm.add(false);
     gcm.add(false);
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Competitor goog = new Competitor("Google",702.0,.75,.8,list1,.8,gnouns,gverbs,gw,gcm);//construct
    stocks.add(goog);//add to main list



    
    //create apple
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<String> averbs = new ArrayList<String>();
    averbs.add("crashes");
    averbs.add("sells a trillion units");
    averbs.add("releases without a 3.5mm port");
    ArrayList<String> anouns = new ArrayList<String>();
    anouns.add("Iwatch");
    anouns.add("Mac");
    anouns.add("iPhone");
    ArrayList<Double> aw = new ArrayList<Double>();
    aw.add(-1.20);
    aw.add(5.0);
    aw.add(-2.00);
    ArrayList<Boolean> acm = new ArrayList<Boolean>();
    acm.add(false);
    acm.add(false);
    acm.add(false);
    list2.add(90.0);
    list2.add(97.0);
    list2.add(102.0);
    list2.add(101.0);
    Competitor aapl = new Competitor("Apple",103.0,1.3,.85,list2,1.0,anouns,averbs,aw,acm);
    stocks.add(aapl);



        //create BP
    ArrayList<Double> list4 = new ArrayList<Double>();//list for prices
     ArrayList<String> bpverbs = new ArrayList<String>();
     bpverbs.add("spills into the gulf.");
     bpverbs.add("explodes");
     bpverbs.add("are up.");
     ArrayList<String> bpnouns = new ArrayList<String>();
     bpnouns.add("BP oil");
     bpnouns.add("BP tanker");
     bpnouns.add("BP sales");
     ArrayList<Double> bpw = new ArrayList<Double>();
     bpw.add(-3.0);
     bpw.add(-1.50);
     bpw.add(2.250);
     ArrayList<Boolean> bpcm = new ArrayList<Boolean>();
     bpcm.add(true);
     bpcm.add(false);
     bpcm.add(true);
     list4.add(28.0);
     list4.add(29.0);
     list4.add(34.0);
     list4.add(31.0);
     Competitor bp = new Competitor("BP",30.35,1.3,-0.2,list4,1.1,bpnouns,bpverbs,bpw,bpcm);//construct
     stocks.add(bp);//add to main list
    


    
    //create Shell
    ArrayList<Double> list5 = new ArrayList<Double>();
    ArrayList<String> shverbs = new ArrayList<String>();
    shverbs.add("creates green oil.");
    shverbs.add("causes caner");
    shverbs.add("donates to poor countries");
    ArrayList<String> shnouns = new ArrayList<String>();
    shnouns.add("Shell");
    shnouns.add("Shell oil");
    shnouns.add("Shell");
    ArrayList<Double> shw = new ArrayList<Double>();
    shw.add(1.20);
    shw.add(-1.0);
    shw.add(1.00);
    ArrayList<Boolean> shcm = new ArrayList<Boolean>();
    shcm.add(true);
    shcm.add(true);
    shcm.add(false);
    list5.add(40.0);
    list5.add(43.0);
    list5.add(42.0);
    list5.add(39.1);
    Competitor shell = new Competitor("Shell",39.12,1.75,-.5,list5,1.0,shnouns,shverbs,shw,shcm);
    stocks.add(shell);


    
    //create Twitter
    ArrayList<Double> list3 = new ArrayList<Double>();//list for prices
    ArrayList<String> tverbs = new ArrayList<String>();
    tverbs.add("crash");
    tverbs.add("is endorsed by Obama");
    tverbs.add("tweets, 'this is a bad website #twitter #is #bad'");
    ArrayList<String> tnouns = new ArrayList<String>();
    tnouns.add("Twitter servers");
    tnouns.add("Twitter");
    tnouns.add("Bono");
    ArrayList<Double> tw = new ArrayList<Double>();
    tw.add(-1.0);
    tw.add(0.50);
    tw.add(-0.70);
    ArrayList<Boolean> tcm = new ArrayList<Boolean>();
    tcm.add(false);
    tcm.add(false);
    tcm.add(true);
    list3.add(15.5);
    list3.add(14.3);
    list3.add(16.2);
    list3.add(17.5);
    Independent twtr = new Independent("Twitter",17.5,1.75,.5,list3,1.0,tnouns,tverbs,tw,tcm);//construct
    stocks.add(twtr);//add to main list




	 
   //create Netflix
    ArrayList<Double> list6 = new ArrayList<Double>();//list for prices
    ArrayList<String> netverbs = new ArrayList<String>();
    netverbs.add("are cancelled");
    netverbs.add("sign new contract");
    netverbs.add("greenlights more superhero TV shows");
    ArrayList<String> netnouns = new ArrayList<String>();
    netnouns.add("Netflix shows");
    netnouns.add("HBO and Netflix");
    netnouns.add("Netflix");
    ArrayList<Double> netw = new ArrayList<Double>();
    netw.add(-4.0);
    netw.add(0.50);
    netw.add(3.0);
    ArrayList<Boolean> netcm = new ArrayList<Boolean>();
    netcm.add(false);
    netcm.add(true);
    netcm.add(false);
    list6.add(100.54);
    list6.add(103.21);
    list6.add(99.53);
    list6.add(97.54);
    Independent net = new Independent("Netflix",100.72,3,.0,list6,2.0,netnouns,netverbs,netw,netcm);//construct
    stocks.add(net);//add to main list

    

       //create Pied Piper
    ArrayList<Double> list7 = new ArrayList<Double>();//list for prices
    ArrayList<String> piverbs = new ArrayList<String>();
    piverbs.add("is broken");
    piverbs.add("are hacked");
    piverbs.add("has a new algorithm");
    ArrayList<String> pinouns = new ArrayList<String>();
    pinouns.add("Pied Piper's compression algorithm");
    pinouns.add("Pied Piper's servers");
    pinouns.add("Pied Piper");
    ArrayList<Double> piw = new ArrayList<Double>();
    piw.add(-2.0);
    piw.add(-1.0);
    piw.add(2.0);
    ArrayList<Boolean> picm = new ArrayList<Boolean>();
    picm.add(false);
    picm.add(false);
    picm.add(false);
    list7.add(30.2);
    list7.add(31.3);
    list7.add(34.5);
    list7.add(31.2);
    StartUp pied = new StartUp("Pied Piper",31.3,3,.2,list7,2.5,pinouns,piverbs,piw,picm);//construct
    stocks.add(pied);//add to main list



    //create NYC SNOW DAY
    ArrayList<Double> list8 = new ArrayList<Double>();//list for prices
    ArrayList<String> snowverbs = new ArrayList<String>();
    snowverbs.add("convinced his dad to shut schools");
    snowverbs.add("are fashionable");
    snowverbs.add("is comming");
    ArrayList<String> snownouns = new ArrayList<String>();
    snownouns.add("Dante DeBlasio");
    snownouns.add("Bikinis");
    snownouns.add("Winter");
    ArrayList<Double> snoww = new ArrayList<Double>();
    snoww.add(-2.0);
    snoww.add(-1.0);
    snoww.add(4.0);
    ArrayList<Boolean> snowcm = new ArrayList<Boolean>();
    snowcm.add(false);
    snowcm.add(false);
    snowcm.add(false);
    list8.add(51.2);
    list8.add(53.3);
    list8.add(54.5);
    list8.add(52.2);
    StartUp snow = new StartUp("NYCSnowDay",52.4,2.5,0.1,list8,1.3,snownouns,snowverbs,snoww, snowcm);//construct
    stocks.add(snow);//add to main list

    //
    
    Player pl = new Player("Max","Easy",1000.0);
    Market m = new Market (pl, stocks);
    m.run();
    }
}
