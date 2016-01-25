public class Headline{
    //takes components of headline
    Headline(String n, String v, double w, boolean cM, String nm){
	noun = n;
	verb = v;
	worth = w;
	changesMomentum = cM;
	genBeginning();
	genSentence();
	name = nm;
    }
    //instance variables
    String noun;
    String verb;
    String name;
    double worth;
    boolean changesMomentum;
    String beginning;
    String sentence;
    //randomly creates opening
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
    //puts components together
    private void genSentence(){
	sentence = beginning + " " + noun + " about to " + verb + ".";}
    // returns sentence
    public String toString(){
	return sentence;}
    
}
