import java.util.*;

public class Player{
    String name;
    String difficulty;
    double money;
    ArrayList<Double> pastMoney = new ArrayList<Double>();
    public Player(String n, String d, double m){
	name = n;
	difficulty = d;
	money = m;}
    
    public double getDol(){
	return money;}
    public double setDol(double m){
	double temp1 = money;
	money = m;
	return temp1;}
    ArrayList<Double> none = new ArrayList<Double>();
    Stock history = new Stock("Personal Wealth",money,0.0,0.0,none, 0.0);
    public void newWorth(Double d){
	money = d;
	history.addPrice( d);}
    public String toString(){
	String retstr = "Current value : " + money; //" %change : " + ((curVal - prices.get(prices.size()))/100) + "\n";
	Graph g = new Graph(history);
	retstr += g.printGraph();
	
	return retstr;}

    public static void main(String args[]){
	Player me = new Player("Matthew So", "Hard", 100);
	for (double i = 100.00; i < 200; i++){
	    me.newWorth(i);}
	System.out.println( me.toString());}
}
