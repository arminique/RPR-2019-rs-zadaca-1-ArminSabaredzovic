package ba.unsa.etf.rs;

import java.util.ArrayList;

public class Zadaca1 {
    public static ArrayList <String> listaGradova = new ArrayList<>();
    public static ArrayList <String> listaDrzava = new ArrayList<>();
    public static ArrayList <Integer> listaPopulacije = new ArrayList<>();
    static void najveciGrad(String drzava, String grad, int brojPopulacije){
        listaDrzava.add(drzava);
        listaGradova.add(grad);
        listaPopulacije.add(brojPopulacije);

    }
    static String izracunaj(){
        int najveci = 0;
        int brojac = -1;

        for(int i = 0; i < listaPopulacije.size(); i++) {
            if ((int) listaPopulacije.get(i) > najveci) {
                najveci = listaPopulacije.get(i);
                    brojac++;

            }
        }
        System.out.println(listaGradova.get(brojac));
        return listaDrzava.get(brojac);
    }
    static int najvecaSuma(int... brojevi){
        ArrayList <Integer> lista_preuzetih = new ArrayList<>();
        ArrayList <Integer> konacni_broj = new ArrayList<>();
        int najvecaSuma = 0;
        for(int i: brojevi){
            int preuzeti;
            while(i / 10 != 0) {
                preuzeti = i % 10;
                lista_preuzetih.add(preuzeti);
                i = i / 10;

            }
            lista_preuzetih.add(i);
            int suma = 0;
            for(int broj = lista_preuzetih.size(); broj-- > 0;){
                suma += lista_preuzetih.get(broj);

            }
            if(suma > najvecaSuma){
                najvecaSuma = suma;
                konacni_broj = new ArrayList<>();
                for(int broj = lista_preuzetih.size(); broj-- > 0;){
                    konacni_broj.add(lista_preuzetih.get(broj));

                }
            }
            lista_preuzetih = new ArrayList<>();

        }
        System.out.print("Broj sa najvećom sumom cifara je: ");
        for(int i2 = 0; i2 < konacni_broj.size(); i2++){
            System.out.print(konacni_broj.get(i2));
        }
        return najvecaSuma;
    }
    static void najmanjaSrednjaVrijednost(ArrayList <String> matrica){
        ArrayList lista_vrednosti = new ArrayList<>();
        int brojac = 0;
        int pozicija = 0;
        int broj_redova = 0;
        for(int i3 = 0; i3 < matrica.size(); i3++){
            if(matrica.get(i3).equals("#")){
                broj_redova++;
            }
        }
        for(int i2 = 0; i2 < broj_redova; i2++) {
            double suma = 0;
            for (int i = pozicija; i < matrica.size(); i++) {
                if (!matrica.get(i).equals("#")) {
                    String broj = matrica.get(i);
                    double broj2 = Double.parseDouble(broj);
                    suma += broj2;
                    brojac++;
                } else {
                    pozicija = i+1;
                    suma = suma / brojac;
                    lista_vrednosti.add(suma);
                    brojac = 0;
                    break;
                }
            }
        }
        double suma = 0;
        for(int i = 0; i < lista_vrednosti.size(); i++){
            if((double)lista_vrednosti.get(i) > suma){
                suma = (double) lista_vrednosti.get(i);
            }
        }
        int pozicija_elemenata = 0;
        for(int i = 0; i < lista_vrednosti.size(); i++){
            if((double)lista_vrednosti.get(i) < suma){
                suma = (double) lista_vrednosti.get(i);
                pozicija_elemenata = i;
            }
        }
        System.out.println("Red sa najmanjom srednjom vrijednošću glasi:");
        int count = 0;
        for(int i = 0; i < matrica.size(); i++){
            if(count == pozicija_elemenata){
                if(!matrica.get(i).equals("#")) {
                    System.out.print((int)(Double.parseDouble(matrica.get(i))) + " ");
                }
            }
            if(matrica.get(i).equals("#")){
                count++;
            }
        }
        System.out.println();
    }
}
