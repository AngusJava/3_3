import java.util.Scanner;

//program ktory wygeneruje kwadrat 10x10 z wybranego znaku
public class lustro {
  public static void main(String[] args) {

    System.out.println("Podaj wielkosc: ");
    Scanner wielkosc = new Scanner(System.in);
    int wielkosc_Pobieranie = wielkosc.nextInt();

    System.out.println("Podaj z jakiego znaku ma byc zrobione ");
    Scanner znak = new Scanner(System.in);
    char znak_Pobieranie = znak.next().charAt(0);
    //petla wielkosci
    for (int i = 1; i <= wielkosc_Pobieranie; i++) {
      //petla przerwy miedzy nimi
      for (int j = 1; j <= wielkosc_Pobieranie - i; j++) {
        System.out.print("  ");
      }
      //petla ktora robi to lustro sprawdzajacy warunek
      for (int k = 1; k <= i; k++) {
        if (k < i) {
          System.out.print(znak_Pobieranie + " ");
        } else {
          System.out.print(znak_Pobieranie);
        }
      }
      System.out.println();
    }
  }
}