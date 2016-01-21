public class Player{
    String name;
    String difficulty;
    double money;
    ArrayList<double> pastMoney = new ArrayList<double>();
    public Player(String n, String d){
	name = n;
	difficulty = d;}
    
    public double getMoney(){
	return money;}
    public double setMoney(double m){
	double temp1 = money;
	money = m;
	return temp1;}
}
