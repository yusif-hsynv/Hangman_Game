import java.util.Random;
import java.util.Scanner;
/**
 * İstifadəçidən hərflər daxil etməklə gizli sözü tapmağa çalışır.
 * İstifadəçi 6 dəfə səhv təxmin edə bilər. Səhv say 6-dan çox olarsa oyun bitir.
 * Oyun, artıq təxmin edilmiş hərfləri yoxlayır və istifadəçiyə cari vəziyyəti göstərir.
 * - Hərfləri təkrar təxmin etməyin qarşısı alınır.
 * - Düzgün və ya səhv təxminə uyğun cavab verilir.
 * - Sözün tam təxmin edilib-edilmədiyi yoxlanılır.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"java", "komputer", "insan", "kitab"};
        String wordToGuess = words[random.nextInt(words.length)];

        HangManGame game = new HangManGame(wordToGuess);

        System.out.println("Hangman oyununa xoş gəldiniz!");
        System.out.println("Sözü təxmin etmək üçün hərf daxil edin.");

        while (game.getRemainingGuess() > 0) {
            game.displayCurrentWord();
            System.out.println("Qalan təxmin haqqınız: " + game.getRemainingGuess());
            System.out.print("Hərf daxil edin: ");
            char guess = sc.next().toLowerCase().charAt(0); // herf alinir.bir herf daxil edilmesse ilk herf gotur

            game.checkGuess(guess);
            if (game.isWordComplete()) {
                System.out.println("Təbrik edirik! Sözü doğru təxmin etdiniz: " + game.getWordToGuess());
                break;
            }
        }

        if (game.getRemainingGuess() == 0) {
            System.out.println("Təxmin haqqınız bitdi.");
            System.out.println("Doğru söz: " + game.getWordToGuess());
        }
        sc.close();
    }
}
