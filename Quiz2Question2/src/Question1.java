import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tuition: ");
		double Tuition = input.nextDouble();
		System.out.print("Percentage of Variable Increase: ");
		double Variable_Increase = input.nextDouble();
		input.close();
		
		
		double sum=12342;
		for (int i=0;i<=2;i++){			
			Tuition= Tuition+ (Tuition* (Variable_Increase/100));
			sum+=Tuition;  
		
		}
		System.out.printf("$"+"%.2f", sum);

	}

}
