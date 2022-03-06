import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
      
        input = input.replace(" ", "");

        List<String> subs = new ArrayList<>();

        String finalStr = "";

        int raizInput = (int) Math.ceil(Math.sqrt(input.length())); 
        
        for (int start = 0; start <= input.length(); start += raizInput) {
            if(start+raizInput > input.length()){
                subs.add(input.substring(start, start+(input.length()) - start));
            }
            else 
                subs.add(input.substring(start, start+raizInput));
        }

        for (int i = 0; i < subs.size(); i++) {
            for (int j = 0; j < raizInput; j++) {
                
                if(subs.get(j).length() > i){
                    finalStr += subs.get(j).toCharArray()[i];
                }
            }
            finalStr += " ";
        }

        System.out.println(finalStr);
    }

}

