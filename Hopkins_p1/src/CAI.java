import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SecureRandom rn = new SecureRandom();

        int a = 0;
        int b = 0;
        double input = 0.0;

        int i;

        int rep = 0;

        int correct = 0;

        int diff = 0;

        boolean atDiff = true;

        int session = 0;

        boolean atSession = true;

        while(atDiff){

            System.out.println("Select difficulty");
            System.out.println("1 - Single digit");
            System.out.println("2 - Double digit");
            System.out.println("3 - Triple digit");
            System.out.println("4 - 4 digits");

            diff = sc.nextInt();

            switch (diff){

                case 1:
                    atDiff = false;
                    break;
                case 2:
                    atDiff = false;
                    break;
                case 3:
                    atDiff = false;
                    break;
                case 4:
                    atDiff = false;
                    break;
                default:
                    System.out.println("Input invalid.");
                    break;

            }

        }

        while (atSession){

            System.out.println("Select session type");
            System.out.println("1 - Addition Only");
            System.out.println("2 - Multiplication Only");
            System.out.println("3 - Subtraction Only");
            System.out.println("4 - Division Only");
            System.out.println("5 - All");

            session = sc.nextInt();

            switch (session){

                case 1:
                    atSession = false;
                    break;
                case 2:
                    atSession = false;
                    break;
                case 3:
                    atSession = false;
                    break;
                case 4:
                    atSession = false;
                    break;
                case 5:
                    atSession = false;
                    break;
                default:
                    System.out.println("Input invalid.");
                    break;

            }

        }

        int currentType = 0;

        for (i = 0; i < 10; i++) {

            a = genN(diff);
            b = genN(diff);

            currentType = getSession(session);

            switch(currentType){

                case 1:
                    System.out.println("How much is " + a + " plus " + b + "?");
                    break;
                case 2:
                    System.out.println("How much is " + a + " times " + b + "?");
                    break;
                case 3:
                    System.out.println("How much is " + a + " minus " + b + "?");
                    break;
                case 4:
                    System.out.println("How much is " + a + " divided by " + b + "?");
                    break;
            }

            input = sc.nextDouble();

            if (Math.abs(input - (computeQ(a, b, currentType))) < 0.001) {

                rep = rn.nextInt(4) + 1;

                switch (rep){

                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice Work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;

                }

                correct += 1;

            } else {

                rep = rn.nextInt(4) + 1;

                switch (rep){

                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;

                }

            }

        }

        if(((double) correct / i) >= 0.75){

            System.out.println("Congratulations! You are ready to go to the next level!");

        }else{

            System.out.println("Please ask your teacher for extra help.");

        }

    }

    public static int genN(int d){
        SecureRandom rand = new SecureRandom();

        int n = 0;

        switch (d){

            case 1:
                n = rand.nextInt(10);
                break;
            case 2:
                n = rand.nextInt(100);
                break;
            case 3:
                n = rand.nextInt(1000);
                break;
            case 4:
                n = rand.nextInt(10000);
                break;

        }
        return n;
    }

    public static double computeQ(int a, int b, int s){

        double n = 0;

        if(s == 1) {
            n = a + b;
        }else if(s == 2){
            n = a * b;
        }else if(s == 3){
            n = a - b;
        }else if(s == 4){
            n = (double) a / b;
        }

        return n;

    }

    public static int getSession(int s){

        int n = 0;

        SecureRandom sr = new SecureRandom();

        if(s == 1) {
           n = s;
        }else if(s == 2){
            n = s;
        }else if(s == 3){
            n = s;
        }else if(s == 4) {
            n = s;
        }else if(s == 5){
            n = sr.nextInt(4) + 1;
        }

        return n;

    }

}
