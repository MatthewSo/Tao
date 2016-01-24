public class Headline{
    Headline(String n, String v, double w, boolean cM){
	noun = n;
	verb = v;
	worth = w;
	changesMomentum = cM;
	genBeginning();
	genSentence();
    }
    String noun;
    String verb;
    double worth;
    boolean changesMomentum;
    String beginning;
    String sentence;
    private void genBeginning(){
	int rnd = (int)( Math.random() * 10);
	if (rnd == 0){
	    beginning = "THIS JUST IN:";
		}
	if (rnd == 1){
	    beginning = "NEW NEWS:";}
	if (rnd == 2){
	    beginning = "BREAKING NEWS:";}
	if (rnd == 3){
	    beginning = "EXCITING DEVELOPMENT:";}
	if (rnd == 4){
	    beginning = "IMPORTANT!:";}
	if (rnd == 5){
	    beginning = "CAN YOU BELIEVE IT?:";}
	if (rnd == 6){
	    beginning = "AMAZING:";}
	if (rnd == 7){
	    beginning = "NEWS UPDATE:";}
	if (rnd == 8){
	    beginning = "HAPPENING NOW:";}
	if (rnd == 9){
	    beginning = "EXCITING NEWS:";}}
    private void genSentence(){
	sentence = beginning + " " + noun + " " + verb + ".";}
    public String toString(){
	return sentence;}
    
    public static void main(String args[]){
	Headline it = new Headline ("Iphone", "released", 0.1, false);
	System.out.println(it.toString());}
    
}
