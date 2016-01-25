import java.util.*;

public class Graph{
    //two get two floating points
    public static  double rounder(double u){
	int temp = (int)(u *100);
	double ret = temp/100.0;
	return ret;
    }
    //instance variables
    private Stock stock;
    private ArrayList<Double> prices;	
    private double[][] matrix;
    private boolean less15 = false;
    private double bucket;
    private int pointVal;
    private int extra;
    private double[] values;
    private double min;
    private double max;

    //constructor takes a stock and extracts values
    public Graph(Stock stock){
	this.stock = stock;
	this.prices = stock.getPrices();
	if (prices.size() >=50){
	    this.matrix = new double[50][15];
	} else{
	    this.matrix = new double[prices.size()][15];
	}
	values = new double[matrix.length];
	pointVal = prices.size()/values.length;
	extra = prices.size() % values.length;
	findValues();
	scale();
	bucketUp();
    }

    public void findValues(){
	double sum;
	int count =0;
	for (int i =0; i<extra;i++){
	    sum = 0;
	    for (int j=0;j<pointVal+1;j++){
		count++;
		sum = sum + prices.get(i*(pointVal+1)+j);
	    }
	    values[i] = sum/(pointVal+1);
	}
	for (int i = extra; i<matrix.length;i++){
	    sum = 0;
	    for (int j=0;j<pointVal;j++){
		sum = sum + prices.get(count);
		count++;
	    }
	    values[i] = sum/pointVal;
	}
    }



    //Used to create correct scale + placement
    public void bucketUp(){
	double curr;
	for (int i=0;i< matrix.length;i++){
	    curr = values[i] - min;
	    double mod = curr % bucket;
	    int placement = (int)((curr-mod)/bucket);
	    matrix[i][placement] = 1;	
	}
    }

    public void scale(){
	findMinMax(prices);
	bucket = (max-min)/14;
    }
    //find top and bottom values
    public void findMinMax(ArrayList<Double> al){
	max = al.get(0);
	min = al.get(0);
	for (int i =0; i<al.size();i++){
	    if (al.get(i) > max){
		max = al.get(i);
	    }
	    if (al.get(i) < min){
		min = al.get(i);
	    }
	}
    }
    //print Graph
    public String printGraph(){
	String ret = "\n";
	//step through matrix and print right positions
	for (int i=matrix[0].length-1; i>0;i--){
	    for (int j=0;j<matrix.length;j++){
		if (matrix[j][i] == 1){
		    ret += ("|");
		} else {
		    ret += (" ");
		}
	    }
	    ret += ("") + "\n";
	}
	ret += ("Max Value: " + rounder(max)+" Min Value: " +rounder(min)) +"\n";
	return ret;
    }

    //test functionality
    public static void main(String[] args){
	ArrayList<Double> aList = new ArrayList<Double>();
	for (int i = 0; i < 100; i++){
	    aList.add(100.0 * Math.random() + i);}
	Stock i = new Stock("g",1.1,1.1,1.1,aList,1.1);
	i.setPrices(aList);
	Graph testi = new Graph(i);
	System.out.println(testi.printGraph());}
    
}
