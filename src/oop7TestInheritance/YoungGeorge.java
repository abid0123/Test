package oop7TestInheritance;
class YoungGeorge extends OldGeorge {//s/o, d/o, bin, binte
	private int score;
        public YoungGeorge(){
            score=90;
            givenName="Little George";
           // salary=0;
        }
	public YoungGeorge(String name) {//constructor  
	 	score=80;
		givenName=name/*"Little George"*/;
	}
	public int getScore() {// accessor for score
		return score;
	}
}
