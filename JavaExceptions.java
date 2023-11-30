// TUMULAK - ACTIVITY 37

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaExceptions {
    public static void main(String[] args) {
        ArithmeticExceptionHandler ae = new ArithmeticExceptionHandler();
        NullPointerExceptionHandler npe = new NullPointerExceptionHandler();
        StringIndexOutOfBoundsExceptionHandler siobe = new StringIndexOutOfBoundsExceptionHandler();
        FileNotFoundExceptionHandler fnfe = new FileNotFoundExceptionHandler();
        NumberFormatExceptionHandler nfe = new NumberFormatExceptionHandler();
        ArrayIndexOutOfBoundsExceptionHandler aiobe = new ArrayIndexOutOfBoundsExceptionHandler();

        ae.handleArithmeticException();
        npe.handleNullPointerException();
        siobe.handleStringIndexOutOfBoundsException();
        fnfe.handleFileNotFoundException();
        nfe.handleNumberFormatException();
        aiobe.handleArrayIndexOutOfBoundsException();
    }
}

class ArithmeticExceptionHandler {
    public void handleArithmeticException() {
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
    }
}

class NullPointerExceptionHandler {
    public void handleNullPointerException() {
        try {
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException...");
        }
    }
}

class StringIndexOutOfBoundsExceptionHandler {
    public void handleStringIndexOutOfBoundsException() {
        try {
            String a = "This is like chipping ";
            char c = a.charAt(24);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}

class FileNotFoundExceptionHandler {
    public void handleFileNotFoundException() {
        try {
            File file = new File("Z:/L15Y13W03/lairacts/src/test.txt");

            FileReader fr = new FileReader(file);
            System.out.println("File exists");
        }
        catch(FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}

class NumberFormatExceptionHandler {
    public void handleNumberFormatException() {
        try {
            int num = Integer.parseInt("Khai");
            System.out.println(num);
        }
        catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}

class ArrayIndexOutOfBoundsExceptionHandler {
    public void handleArrayIndexOutOfBoundsException() {
        try {
            int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out of Bounds");
        }
    }
}