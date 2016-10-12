import java.util.Scanner;

//Запуск калькулятора. Ввод пользователем

public class InteractRunner {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "No";
            while (!exit.equals("Yes")) {
                System.out.println( "Enter first arg: " );
                String first = reader.next();
                System.out.println( "Enter second arg: " );
                String second = reader.next();
                calc.add(Integer.valueOf(first) , Integer.valueOf(second));
                System.out.println( "Result : " + calc.getResult() );
                calc.cleanResult();
                System.out.println( "Exit: Yes/No " );
                exit = reader.next();
                     
            }
        }
        finally {
            reader.close();
        }
    }
}