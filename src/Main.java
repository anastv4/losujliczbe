import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //wylosuj 10 liczb z zakresu od 1 do 20
        //tablica musi miec rozmiar, ktory nie moze byc ponizej zmieniony
        //moze zawierac typu proste i zlozone


        int[] tablicaLiczbLosowych = new int[10];
        Random random =new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length ; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(20)+1;
        }
        //wypisz wylosowane liczba na ekranie
        System.out.println("Wypisywanie tablicy");
        for (int elementTablicy:tablicaLiczbLosowych){
            System.out.println(elementTablicy+" ,");
        }
    }
}