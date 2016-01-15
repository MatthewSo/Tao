public class Graph{
    double scale;
    
    public Graph(Stock input){
    }
    
    public String createGraph(Stock input){
    }
   
    public makeScaleHorz(Stock input){
	ArrayList prices = input.getPrices();
	scale = prices.size() / 30;}
    public makeScaleVert(Stock input){
	ArrayList prices = input.getPrices();
	double min = -1;
	
	for (int i = 0; i < prices.size(); i++){
	    prices.get(i);
