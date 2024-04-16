import java.util.HashMap;
import java.util.Scanner;

public class JavaApp {
    public static void main(String[] args) {
        HashMap<String, String> zoznam = new HashMap<>();
        Scanner vstup = new Scanner(System.in);
        String sk = vstup.nextLine();
        while (!sk.equals("0")){
            String en = vstup.nextLine();
            zoznam.put(sk, en);
            sk = vstup.nextLine();
        }
        String slovo = vstup.nextLine();
        while (!slovo.equals("0")) {
            if (zoznam.containsKey(slovo))
                System.out.println(zoznam.get(slovo));
            else
                System.out.println("x");
            slovo = vstup.nextLine();
        }
        }

}