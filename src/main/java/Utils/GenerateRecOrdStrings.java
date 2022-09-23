package Utils;

import java.util.Random;

public class GenerateRecOrdStrings {
        public static String GenerateReciptNum() {
            String accountNum = "";
            Random rand = new Random();
            String card = "RECNO";
            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(9) + 0;
                card += Integer.toString(n);
            }
            for (int i = 0; i < 12; i++) {
                if (i % 4 == 0)
                    accountNum = accountNum;
                accountNum = accountNum + card.charAt(i);
            }

            return accountNum.trim();
        }

    public static String GenerateOrderNum() {
        String accountNum = "";
        Random rand = new Random();
        String card = "ORDER";
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(9) + 0;
            card += Integer.toString(n);
        }
        for (int i = 0; i < 12; i++) {
            if (i % 4 == 0)
                accountNum = accountNum;
            accountNum = accountNum + card.charAt(i);
        }

        return accountNum.trim();
    }
    }
