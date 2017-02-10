package IB.Ex57;
import java.util.Scanner;

public class Quiz {
	
	public static IntQuestion[] questions;
	public static int[] result;
	public static int repbonnes;
	
	/*public static void CreateQuiz(){	
		
		questions=new IntQuestion[10];
		
		for(int i=0;i<10;i++){
			
			if(Math.random()<0.5){
				questions[i]=new AdditionQuestion();
				System.out.println(questions[i]);
			}
			else {
				questions[i]=new SubtractionQuestion();
				System.out.println(questions[i]);

			}
			
		} 			
	} */
	
	
	 
	    private static void createQuiz() {
	        questions = new IntQuestion[10];
	        for ( int i = 0; i < 10; i++ ) {
	            if (Math.random() > 0.5)
		            questions[i] = new AdditionQuestion();
		        else
		            questions[i] = new SubtractionQuestion();
	        }
	      
	   }        
	
	
	public static void AdministerQuiz(){
		result=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10 ;i++){
			System.out.println("Question "+i+" :"+questions[i].getQuestion());
			int reponse=sc.nextInt();
			result[i]=reponse;
		
		}	
			
	}
	

	public static void GradeQuiz(){		
		for(int i=0; i<10 ;i++){
			if(result[i]==questions[i].getCorrectAnswer()){
				System.out.println("Bonne r�ponse � la question"+i);
				repbonnes+=1;
			}
			else {
				System.out.println(" R�ponse fausse � la question"+i+" La bonne r�ponse �tait :"+(questions[i].getCorrectAnswer()));
			}
			
		}
		
		System.out.println("Vous avez eu "+repbonnes+" bonnes r�ponses");
		System.out.println("Vous avez eu "+(10-repbonnes)+"mauvaises r�ponses");


		
	}
		
	

	public static void main(String[] args) {
		System.out.println("Quiz");
		System.out.println("Répondez aux questions suivantes: ");
		createQuiz();
		AdministerQuiz();
		GradeQuiz();
		
		
	}
	
	


}
