# Kriptografi dengan Java

Kriptografi adalah ilmu yang berkaitan dengan mengamankan informasi dengan mengubahnya menjadi bentuk yang tidak dapat dibaca tanpa memiliki kunci rahasia untuk mendekripsinya. Dalam pembelajaran ini, kita akan mempelajari bagaimana menggunakan Java untuk melakukan enkripsi dan dekripsi teks sederhana.

## Enkripsi Caesar Cipher

Caesar Cipher adalah salah satu teknik kriptografi paling sederhana yang menggeser setiap huruf dalam teks sejumlah tertentu dalam alfabet. Berikut adalah contoh implementasi dalam Java:

```java
public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (ch + shift);
                if ((Character.isLowerCase(ch) && encryptedChar > 'z') || (Character.isUpperCase(ch) && encryptedChar > 'Z')) {
                    encryptedChar = (char) (ch - (26 - shift));
                }
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "Hello, World!";
        int shift = 3;

        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Encrypted Text: " + ciphertext);

        String decryptedText = decrypt(ciphertext, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}