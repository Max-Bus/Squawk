import java.util.Scanner;

public class babylab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String whattosay="";
        int numtimes=0;
        System.out.println("What should I say ");
        whattosay= input.nextLine();
        System.out.println("How many time should I say it");
        numtimes=input.nextInt();
         if(numtimes<8) {
            for (int i = 0; i < numtimes; i++) {
                System.out.println(whattosay);
            }
        }
    }
}
