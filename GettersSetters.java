// Activity 27 - TUMULAK, IVAN STEIVEN A.
import java.util.Scanner;

public class GettersSetters{
    private String name;
    private int idNum;

    public static Scanner sc = new Scanner(System.in);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getIdNum(){
        return idNum;
    }

    public void setIdNum(int id){
        this.idNum = id;
    }

    public static void nameInput(GettersSetters p){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        p.setName(name);
        System.out.print("Enter ID number: ");
        int id = sc.nextInt();
        p.setIdNum(id);
    }

    public static void displayName(GettersSetters p){
        System.out.println(p.getName());
        System.out.println(p.getIdNum());
    }

    public static void main(String[] args){
        GettersSetters p = new GettersSetters();
        nameInput(p);
        displayName(p);
    }
}