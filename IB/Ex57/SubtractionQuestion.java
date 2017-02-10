package IB.Ex57;

public class SubtractionQuestion implements IntQuestion{

	private int nbr1,nbr2;

	
	public SubtractionQuestion() {
		nbr1 =(int)(Math.random()*100+1);
		nbr2 =(int)(Math.random()*100+1);
	}

	
	public String getQuestion() {
		return ""+nbr1+"-"+nbr2+" ?";

	}

	
	public int getCorrectAnswer() {
		return nbr1-nbr2;

	}
	

}
