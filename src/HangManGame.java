import java.util.HashSet;
import java.util.Set;

public class HangManGame {
    private String wordToGuess; //İstifadəçinin təxmin etməyə çalışdığı sözü saxlayır.
    private boolean[] guessedLetters;//Sözün hansı hərflərinin düzgün təxmin edildiyini göstərən massiv.
    private Set<Character> guessedLettersSet;//İstifadəçinin daha əvvəl təxmin etdiyi hərfləri saxlayir.Təkrarlanan təxminlərin qarşısını almaq ucun.
    private int remainingGuess;//Istifadecinin qalan texmin haqqi. baslangicda 6.

    public HangManGame(String word) {
        this.wordToGuess = word;
        this.guessedLetters = new boolean[word.length()];
        this.guessedLettersSet = new HashSet<>();
        this.remainingGuess = 6;
    }

    //Sozun cari vəziyyətini göstermek ucun metod
    public void displayCurrentWord() {
        System.out.println();
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (guessedLetters[i]) {
                System.out.print(wordToGuess.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    //Hərfin sözdə olub-olmadığını yoxlayan metod
    public boolean checkGuess(char guess) {
        if (guessedLettersSet.contains(guess)) {
            System.out.println("Bu hərfi artıq təxmin etmisiniz. Başqa hərf daxil edin.");
            return false; // texmin edilmis herfdirse false qaytarir.
        }
        guessedLettersSet.add(guess);
        boolean isFound = false;

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedLetters[i] = true;
                isFound = true;
            }
        }
        if (!isFound) {
            remainingGuess--;
            System.out.println("Hərf tapılmadı. Yanlış təxmin!");
        } else {
            System.out.println("Hərf doğru təxmin edildi!");
        }
        return isFound;
    }

    //Bütün hərflərin təxmin edilib-edilmədiyini yoxlayan metod.
    public boolean isWordComplete() {
        for (boolean letter : guessedLetters) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
    //qalan texmin haqqi
    public int getRemainingGuess() {
        return remainingGuess;
    }
    //soz
    public String getWordToGuess() {
        return wordToGuess;
    }
}

