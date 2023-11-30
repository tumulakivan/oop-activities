// TUMULAK, IVAN STEIVEN A. - ACTIVITY 36

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int data = 25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}