package Utils;

import java.util.Random;

public class GenerateRecOrdStrings {
        public static String GenerateReciptNum() {
            StringBuilder accountNum = new StringBuilder();
            Random rand = new Random();
            StringBuilder card = new StringBuilder("RECNO");
            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(9);
                card.append(n);
            }
            for (int i = 0; i < 12; i++) {
                accountNum.append(card.charAt(i));
            }

            return accountNum.toString().trim();
        }

    public static String GenerateOrderNum() {
        StringBuilder accountNum = new StringBuilder();
        Random rand = new Random();
        StringBuilder card = new StringBuilder("ORDER");
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(9);
            card.append(n);
        }
        for (int i = 0; i < 12; i++) {
            accountNum.append(card.charAt(i));
        }

        return accountNum.toString().trim();
    }
    }
