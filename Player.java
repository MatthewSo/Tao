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
}
