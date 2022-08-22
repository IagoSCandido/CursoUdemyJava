package exerciciosarrays.desafiopensionato;

import exerciciosarrays.desafiopensionato.entities.RentRegister;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RentRegister[] rentRegister = new RentRegister[10];


        String name;
        String email;
        int room;
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.println("Name:");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Email:");
            email = sc.next();
            System.out.println("Room:");
            room = sc.nextInt();
            rentRegister[room] = new RentRegister(name, email, room);
        }
        System.out.println();
        System.out.println("busy rooms: ");
        for (int i = 0; i < rentRegister.length; i++) {
            if (rentRegister[i] != null)
                System.out.println(rentRegister[i]);


        }

        sc.close();
    }
}
