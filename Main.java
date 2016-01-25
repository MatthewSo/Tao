import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
    ArrayList<Stock> stocks = new ArrayList<Stock>();
    

    //create Goals
    Player pl = new Player("Max","Easy",1000.0);
    Goal one = new Goal(100,10);
    Goal two = new Goal(200,1100);
    Goal three = new Goal(300,1750);
    Goal four = new Goal(400,2500);
    Goal five = new Goal(500,5000);
    pl.g.add(one);pl.g.add(two);pl.g.add(three);pl.g.add(four);pl.g.add(five);
    
    //create Google
    ArrayList<Double> list1 = new ArrayList<Double>();//list for prices
     ArrayList<String> gverbs = new ArrayList<String>();
     gverbs.add("die");
     gverbs.add("Do extremely Well");
     gverbs.add("Shut Down unexpecdelty");
     ArrayList<String> gnouns = new ArrayList<String>();
     gnouns.add("android");
     gnouns.add("Nexus");
     gnouns.add("Gmail");
     ArrayList<Double> gw = new ArrayList<Double>();
     gw.add(-5.0);
     gw.add(4.50);
     gw.add(-2.50);
     ArrayList<Boolean> gcm = new ArrayList<Boolean>();
     gcm.add(true);
     gcm.add(true);
     gcm.add(true);
    list1.add(700.0);
    list1.add(800.0);
    list1.add(750.0);
    list1.add(720.0);
    Competitor goog = new Competitor("Google",702.0,3.75,.2,list1,.8,gnouns,gverbs,gw,gcm);//construct
    stocks.add(goog);//add to main list



    
    //create apple
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<String> averbs = new ArrayList<String>();
    averbs.add("crash");
    averbs.add("sell a trillion units");
    averbs.add("release without a 3.5mm port");
    ArrayList<String> anouns = new ArrayList<String>();
    anouns.add("Iwatch");
    anouns.add("Mac");
    anouns.add("iPhone");
    ArrayList<Double> aw = new ArrayList<Double>();
    aw.add(-6.00);
    aw.add(15.0);
    aw.add(-10.00);
    ArrayList<Boolean> acm = new ArrayList<Boolean>();
    acm.add(true);
    acm.add(true);
    acm.add(true);
    list2.add(90.0);
    list2.add(97.0);
    list2.add(102.0);
    list2.add(101.0);
    Competitor aapl = new Competitor("Apple",103.0,6.5,.85,list2,1.0,anouns,averbs,aw,acm);
    stocks.add(aapl);



        //create BP
    ArrayList<Double> list4 = new ArrayList<Double>();//list for prices
     ArrayList<String> bpverbs = new ArrayList<String>();
     bpverbs.add("spill into the gulf.");
     bpverbs.add("explode");
     bpverbs.add("be up.");
     ArrayList<String> bpnouns = new ArrayList<String>();
     bpnouns.add("BP oil");
     bpnouns.add("BP tanker");
     bpnouns.add("BP sales");
     ArrayList<Double> bpw = new ArrayList<Double>();
     bpw.add(-5.5);
     bpw.add(-4.50);
     bpw.add(10.000);
     ArrayList<Boolean> bpcm = new ArrayList<Boolean>();
     bpcm.add(true);
     bpcm.add(true);
     bpcm.add(true);
     list4.add(28.0);
     list4.add(29.0);
     list4.add(34.0);
     list4.add(31.0);
     Competitor bp = new Competitor("BP",30.35,6.5,-0.2,list4,1.1,bpnouns,bpverbs,bpw,bpcm);//construct
     stocks.add(bp);//add to main list
    


    
    //create Shell
    ArrayList<Double> list5 = new ArrayList<Double>();
    ArrayList<String> shverbs = new ArrayList<String>();
    shverbs.add("create green oil.");
    shverbs.add("cause caner");
    shverbs.add("donate to poor countries");
    ArrayList<String> shnouns = new ArrayList<String>();
    shnouns.add("Shell");
    shnouns.add("Shell oil");
    shnouns.add("Shell");
    ArrayList<Double> shw = new ArrayList<Double>();
    shw.add(3.0);
    shw.add(-3.0);
    shw.add(6.00);
    ArrayList<Boolean> shcm = new ArrayList<Boolean>();
    shcm.add(true);
    shcm.add(true);
    shcm.add(true);
    list5.add(40.0);
    list5.add(43.0);
    list5.add(42.0);
    list5.add(39.1);
    Competitor shell = new Competitor("Shell",39.12,8.75,-.5,list5,1.0,shnouns,shverbs,shw,shcm);
    stocks.add(shell);


    
    //create Twitter
    ArrayList<Double> list3 = new ArrayList<Double>();//list for prices
    ArrayList<String> tverbs = new ArrayList<String>();
    tverbs.add("crash");
    tverbs.add("be endorsed by Obama");
    tverbs.add("tweet, 'this is a great website #twitter #is #great'");
    ArrayList<String> tnouns = new ArrayList<String>();
    tnouns.add("Twitter servers");
    tnouns.add("Twitter");
    tnouns.add("Bono");
    ArrayList<Double> tw = new ArrayList<Double>();
    tw.add(-5.0);
    tw.add(2.50);
    tw.add(2.70);
    ArrayList<Boolean> tcm = new ArrayList<Boolean>();
    tcm.add(true);
    tcm.add(true);
    tcm.add(true);
    list3.add(15.5);
    list3.add(14.3);
    list3.add(16.2);
    list3.add(17.5);
    Independent twtr = new Independent("Twitter",17.5,5.75,.5,list3,1.0,tnouns,tverbs,tw,tcm);//construct
    stocks.add(twtr);//add to main list




	 
   //create Netflix
    ArrayList<Double> list6 = new ArrayList<Double>();//list for prices
    ArrayList<String> netverbs = new ArrayList<String>();
    netverbs.add("be cancelled");
    netverbs.add("sign new contract");
    netverbs.add("greenlight more superhero TV shows");
    ArrayList<String> netnouns = new ArrayList<String>();
    netnouns.add("Netflix shows");
    netnouns.add("HBO and Netflix");
    netnouns.add("Netflix");
    ArrayList<Double> netw = new ArrayList<Double>();
    netw.add(-4.0);
    netw.add(2.50);
    netw.add(3.0);
    ArrayList<Boolean> netcm = new ArrayList<Boolean>();
    netcm.add(true);
    netcm.add(true);
    netcm.add(true);
    list6.add(100.54);
    list6.add(103.21);
    list6.add(99.53);
    list6.add(97.54);
    Independent net = new Independent("Netflix",100.72,7.5,-.3,list6,2.0,netnouns,netverbs,netw,netcm);//construct
    stocks.add(net);//add to main list

    

       //create Pied Piper
    ArrayList<Double> list7 = new ArrayList<Double>();//list for prices
    ArrayList<String> piverbs = new ArrayList<String>();
    piverbs.add("be broken");
    piverbs.add("be hacked");
    piverbs.add("unveil a new algorithm");
    ArrayList<String> pinouns = new ArrayList<String>();
    pinouns.add("Pied Piper's compression algorithm");
    pinouns.add("Pied Piper's servers");
    pinouns.add("Pied Piper");
    ArrayList<Double> piw = new ArrayList<Double>();
    piw.add(-5.0);
    piw.add(-5.0);
    piw.add(10.0);
    ArrayList<Boolean> picm = new ArrayList<Boolean>();
    picm.add(true);
    picm.add(true);
    picm.add(true);
    list7.add(30.2);
    list7.add(31.3);
    list7.add(34.5);
    list7.add(31.2);
    StartUp pied = new StartUp("Pied Piper",31.3,15,.2,list7,2.5,pinouns,piverbs,piw,picm);//construct
    stocks.add(pied);//add to main list



    //create NYC SNOW DAY
    ArrayList<Double> list8 = new ArrayList<Double>();//list for prices
    ArrayList<String> snowverbs = new ArrayList<String>();
    snowverbs.add("convince his dad to shut schools");
    snowverbs.add("become fashionable");
    snowverbs.add("come");
    ArrayList<String> snownouns = new ArrayList<String>();
    snownouns.add("Dante DeBlasio");
    snownouns.add("Bikinis");
    snownouns.add("Winter");
    ArrayList<Double> snoww = new ArrayList<Double>();
    snoww.add(-1.0);
    snoww.add(-1.0);
    snoww.add(2.0);
    ArrayList<Boolean> snowcm = new ArrayList<Boolean>();
    snowcm.add(true);
    snowcm.add(true);
    snowcm.add(true);
    list8.add(51.2);
    list8.add(53.3);
    list8.add(54.5);
    list8.add(52.2);
    StartUp snow = new StartUp("NYCSnowDay",52.4,12.5,0.1,list8,1.3,snownouns,snowverbs,snoww, snowcm);//construct
    stocks.add(snow);//add to main list

    //

    System.out.println("HOW TO PLAY THIS SIMULATION\n You have many options, view sell and buy stocks, view goals, and progress. Progress will progress the game by one week, changing all the stocks values. Goals can be met by having a certain amount of money in your inventory. To get more money, buy stocks and sell them for a profit. Make sure to sell at the right time so you can stay Rich! \nAccomplish all the goals to win!\n");
    Market m = new Market (pl, stocks);
    m.run10();
    m.run();
    }
}
