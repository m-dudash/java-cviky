import java.util.HashSet;
import java.util.Scanner;

public class HSET {
    public static void main(String[] args) {
        HashSet<String> zoznam = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        while(!name.equals("0")){
            zoznam.add(name);
            name = input.nextLine();
        }
        System.out.println(zoznam);
    }
}