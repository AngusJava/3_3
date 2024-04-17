import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    lustro.main(args);
    while (true) {
      System.out.print(
          "(Co chcesz zrobić: /n");

      int zadanie = scanner.nextInt();
      if (zadanie == 0) {
        System.out.println("Koniec programu.");
        break;
      } else if (zadanie > 6) {
        System.out.println("Nie ma takiej opcji, spróbuj ponownie.");
        continue;
      }

      switch (zadanie) {
        case 1:
          lustro.main(args);
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
      }
    }
  }
}