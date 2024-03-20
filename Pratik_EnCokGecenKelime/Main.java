/**
 * @author Nida Başer
 * March 2024
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan metni al
        System.out.print("Lütfen bir metin giriniz: ");
        String text = scanner.nextLine();

        // Metni kelimelere ayır
        String[] words = text.split("\\s+");

        // Kelimeleri saymak için HashMap oluştur
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Kelimeleri döngüyle tek tek kontrol et
        for (String word : words) {
            // Kelimeyi HashMap'te ara, eğer yoksa ekleyip sayacı 1 yap
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // En çok geçen kelimeyi bul
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("En çok geçen kelime: " + mostFrequentWord + ", Sayısı: " + maxCount);
    }
}
