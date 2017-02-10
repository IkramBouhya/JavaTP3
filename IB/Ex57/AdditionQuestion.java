package IB.Ex57;


public class AdditionQuestion implements IntQuestion {

	public int nbr1,nbr2;
	
	
	public AdditionQuestion() {
		nbr1 =(int)(Math.random()*100+1);
		nbr2 =(int)(Math.random()*100+1);
	}


	public String getQuestion() {
		return ""+nbr1+"+"+nbr2+" ?";
	}

	
	public int getCorrectAnswer() {
		return nbr1+nbr2;
	}

	
}
