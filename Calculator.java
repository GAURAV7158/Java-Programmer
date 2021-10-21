import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // ask users - function
        System.out.println("Choose an function: +, -, *, or /");
        char fun = s.next().charAt(0);

        // ask users - first num.
        System.out.println("Enter first number: ");
        Double A = s.nextDouble();
        // ask users - sec num.
        System.out.println("Enter Second number: ");
        Double B = s.nextDouble();

        Double ans ;

        switch (fun){
            case '+' : ans = A+B;
                System.out.println(A+"+"+B+"="+ ans);
                break;
            case '-' : ans = A-B;
                System.out.println(A+"-"+B+"="+ ans);
                break;
            case '*' : ans = A*B;
                System.out.println(A+"*"+B+"="+ ans);
                break;
            case '/' : ans = A/B;
                System.out.println(A+"/"+B+"="+ ans);
                break;
            default:
                System.out.println("Invalid !");
        }
        s.close();
    }
}
