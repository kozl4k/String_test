import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków większy niż 2");
        String znaki = scanner.nextLine();
        while (znaki.length()<=2){
            System.out.println("Podaj ciąg znaków większy niż 2");
            znaki = scanner.nextLine();
        }
        String litery = znaki.substring((znaki.length()/2)-1,(znaki.length()/2)+1);
        String first = znaki.substring(0,(znaki.length()/2)-1);
        String last = znaki.substring((znaki.length()/2)+1);
        String przeksztalcony = litery.concat(first.concat(last));
        System.out.println(przeksztalcony);





    }
}