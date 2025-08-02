package TiposDeDados;

import java.util.Locale;
import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Setar localização do java
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do usuário");
        String username = sc.nextLine();

        System.out.println("Insira a idade do usuário");
        int userAge = sc.nextInt();

        System.out.println("Name = " + username);
        System.out.printf("Age = %d\n", userAge);

        if (userAge > 18) {
            System.out.println("Usuário maior de idade");
        } else {
            System.out.println("Usuário menor de idade");
        }

        sc.close();
    }
}
