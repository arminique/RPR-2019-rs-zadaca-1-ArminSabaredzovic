package ba.unsa.etf.rs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite string sa gradovima (prazan red za kraj): ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(line.length() > 0){
            String drzava, grad;
            int brojPopulacije;
            String line2[] = line.split(",");
            drzava = line2[0];
            grad = line2[1];
            brojPopulacije = Integer.parseInt(line2[2]);
            Zadaca1.najveciGrad(drzava,grad,brojPopulacije);
            line = sc.nextLine();
        }
        System.out.println(Zadaca1.izracunaj());

        System.out.println("Unesite članove niza cijelih brojeva (0 za kraj):");

        int line2 = sc.nextInt();
        ArrayList <Integer> lista = new ArrayList<>();
        while(line2 != 0){
            lista.add(line2);
            line2 = sc.nextInt();
        }
        int lista_brojeva[] = new int[lista.size()];
        for(int i = 0; i < lista.size(); i++){
            lista_brojeva[i] = lista.get(i);
        }
        Zadaca1.najvecaSuma(lista_brojeva);

        ArrayList <String> matrica = new ArrayList<>();

        System.out.print("\nUnesite broj redova matrice: ");
        int line3 = sc.nextInt();
        int red = 1;
        while(line3 != 0){
            System.out.print("Unesite broj elemenata u " + red + ". redu: ");
            int broj_elemenata;
            broj_elemenata = sc.nextInt();
            System.out.print("Unesite elemente: ");
            while(broj_elemenata != 0){
                double element = sc.nextDouble();
                matrica.add(String.valueOf(element));
                broj_elemenata--;
            }
            matrica.add("#");
            line3--;
            red++;
        }


        Zadaca1.najmanjaSrednjaVrijednost(matrica);
    }
}
