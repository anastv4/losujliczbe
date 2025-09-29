import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //wylosuj 10 liczb z zakresu od 1 do 20
        //tablica musi miec rozmiar, ktory nie moze byc ponizej zmieniony
        //moze zawierac typu proste i zlozone

        //SIE PODKRESLA NA CZERWONE
        // int [] tablicaLosowych1 = losujLiczbyDoTablicy(10);
        //wypisz(tablicaLosowych1);


        //wypisz wylosowane liczba na ekranie

        //losowanie 10 liczb bez powtorzen
        ArrayList<Integer> wylosowane = wylosujLiczbyDoListy(10);
        wypisz(wylosowane);

        HashSet<Integer> wylosowanyzbior = wylosujLizbyDoZbioru(10);
        wypisz(wylosowanyzbior);
    }
    private static HashSet<Integer> wylosujLizbyDoZbioru(int ileLiczb){
        HashSet<Integer> zbiorLosowych =new HashSet<>();
        //elementy w zbiorze sa unikatowe nieindeksowane
        Random random =new Random();
        while(zbiorLosowych.size()<ileLiczb) {
            zbiorLosowych.add(random.nextInt(20)+1);
        }
        return zbiorLosowych;
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
            //listaLiczbLosowych.add(random.nextInt(20)+1);
            int liczba = random.nextInt(20)+1;
            while (listaLiczbLosowych.contains(liczba)){
                liczba = random.nextInt(20)+1;
            }
            listaLiczbLosowych.add(liczba);

        }
        return listaLiczbLosowych;
    }
    private static void wypisz(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+", ");
        }
    }
    private static void wypisz(HashSet<Integer> zbior){
        System.out.println();
        System.out.println("Wypisywanie zbioru");
        for (int elementTablicy:zbior){
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