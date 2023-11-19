import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int counter = 0;
            boolean pin_code_coincided = false;
            while (true){
                String correct = sc.nextLine();
                String vasya = sc.nextLine();
                counter++;

                if(correct.equals(vasya)){
                    System.out.println("СORRECT");
                    pin_code_coincided = true;
                    break;
                }
                System.out.println("INCORRECT" + counter);
            }
            if (!pin_code_coincided){
                System.out.println("Error");
            }else{
                System.out.println("CORRECT");
            }
        }

    }

