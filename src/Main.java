import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //wylosuj 10 liczb z zakresu od 1 do 20
        //tablica musi miec rozmiar, ktory nie moze byc ponizej zmieniony
        //moze zawierac typu proste i zlozone

        int [] tablicaLosowych1 = losujLiczbyDoTablicy(10);
                //dry
        wypisz(tablicaLosowych1);


        //wypisz wylosowane liczba na ekranie

        //losowanie 10 liczb bez powtorzen
        ArrayList<Integer> wylosowane = wylosujLiczbyDoListy(10);
        wypisz(wylosowane);
    }
    private static ArrayList<Integer> wylosujLiczbyDoListy(int ileLiczb)   {
        //kolekcje -> Listy Zbiory Map
        //List -> ArrayList
        //w kazdej kolekcji nie musimy deklarowac rozmiaru na poczatku pracy z kolekcja
        //rozmiar moze byc zmieniany  -> dodawania i usuwania elementow
        //w kolekcji ty;lko typy zlozone
        int liczba1 = 0;//typ prosty z malej litery nie ma metod
        Integer liczba2 = 0;// typ zlozony na metody pisane z wielkiej litery
        Random random = new Random();
        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        for (int i = 0; i < ileLiczb; i++) {
            listaLiczbLosowych.add(random.nextInt(20)+1);
        }
        return listaLiczbLosowych;
    }
    private static void wypisz(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+", ");
        }
    }
    private static void wypisz(int[] tablica){
        System.out.println("Wypisywanie tablicy");
        for (int elementTablicy:tablica){
            System.out.print(elementTablicy+" ,");
        }
    }

    private static int[] losujLiczbyDoTablicy(int ileLiczb){
        int[] tablicaLiczbLosowych = new int[ileLiczb];
        Random random =new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length ; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(20)+1;
        }
        return tablicaLiczbLosowych;
    }
}