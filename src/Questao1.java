import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] arrayInput = null;
        
        try {
            System.out.println("Digite os números do array separados por espaço [Quantidade ímpar de números]: ");
            String input = scanner.nextLine();    
            scanner.close();         
            
            arrayInput = input.split(" ");
            
            if (arrayInput.length % 2 == 0) throw new Exception(); 

            int[] arr = new int[arrayInput.length];
    
            for (int i = 0; i < arrayInput.length; i++) {

                arr[i] = Integer.parseInt(arrayInput[i]);
            }
            
            Arrays.sort(arr); 

            System.out.println("Saída: " + arr[(arr.length -1) / 2]); 

        } catch (Exception e) {
            
            System.out.println("Erro: A quatidade de números precisa ser ímpar");
        }  
    }
}
