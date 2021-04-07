package com.github.rafaelwaterkemper.aes;

import com.github.rafaelwaterkemper.aes.decrypt.DecryptAES256;
import com.github.rafaelwaterkemper.aes.encrypt.EncryptAES256;

public class EncryptDecrypt {

    public static final String CONTENT_TO_TEST = "rafaelwaterkemper";

    public static void main(String[] args) {
        String encrypted = EncryptAES256.encrypt(CONTENT_TO_TEST);
        System.out.printf("""
                    Encrypted value -> %s
                %n""", encrypted);

        var decrypted = DecryptAES256.decrypt(encrypted);

        System.out.printf("""
                    Decrypted value -> %s
                %n""", decrypted);

        if (decrypted.equals(CONTENT_TO_TEST)) {
            System.out.println("Symetric ecryption/decryption is working");
            return;
        }
        ;
    }
}
