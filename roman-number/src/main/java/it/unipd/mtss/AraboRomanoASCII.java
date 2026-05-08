////////////////////////////////////////////////////////////////////
// [LORENZO] [ARTUSI] [2148622]
// [CLAUDIA] [D'AGATA] [2102259]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class AraboRomanoASCII {

    // Codice di conversione da numero arabo a romano
    public static String convert(int num) {
        int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40,
                        10, 9, 5, 4, 1};
        String[] simboli = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                            "X", "IX", "V", "IV", "I"};

        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < valori.length; i++) {
            while (num >= valori[i]) {
                risultato.append(simboli[i]);
                num -= valori[i];
            }
        }
        return risultato.toString();
    }

    // Mappa per stampare i numerali romani
    static final Map<Character, String[]> asciiMap = new HashMap<>();

    static {
        asciiMap.put('I', new String[]{
                "  _____ ",
                " |_   _| ",
                "   | |   ",
                "   | |   ",
                "  _| |_  ",
                " |_____| " 

        });
        asciiMap.put('V', new String[]{
                " __      __ ",
                " \\ \\    / / ",
                "  \\ \\  / /  ",
                "   \\ \\/ /   ",
                "    \\  /    ",
                "     \\/     "
        });
        asciiMap.put('X', new String[]{
                " __   __ ",
                " \\ \\ / / ",
                "  \\ V /  ",
                "   > <   ",
                "  / ^ \\  ",
                " /_/ \\_\\ "
        });
        asciiMap.put('L', new String[]{
                "  _       ",
                " | |      ",
                " | |      ",
                " | |      ",
                " | |____  ",
                " |______| "
        });
        asciiMap.put('C', new String[]{
                "   _____  ",
                "  / ____| ",
                " | |     ",
                " | |     ",
                " | |____ ",
                "  \\_____| "
        });
        asciiMap.put('D', new String[]{
                "  _____ ",
                " |  __ \\ ",
                " | |  | | ",
                " | |  | | ",
                " | |__| | ",
                " |_____/ "
        });
        asciiMap.put('M', new String[]{
                "  __  __ ",
                " |  \\/  | ",
                " | \\  / | ",
                " | |\\/| | ",
                " | |  | | ",
                " |_|  |_| "
        });
    }

    // Stampa ASCII art
    public static void stampaAscii(String romano) {
    StringBuilder[] righe = new StringBuilder[6];

    for (int i = 0; i < 6; i++) {
        righe[i] = new StringBuilder();
    }

    for (char c : romano.toCharArray()) {
        String[] pattern = asciiMap.get(c);

        if (pattern != null) {
            for (int i = 0; i < 6; i++) {
                righe[i]
                    .append(String.format("%-10s", pattern[i])); // 👈 FIX
            }
        }
    }

    for (StringBuilder riga : righe) {
        System.out.println(riga);
    }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            String romano = AraboRomanoASCII.convert(i);
            System.out.println("\n" + i + " -> " + romano);
            AraboRomanoASCII.stampaAscii(romano);
        }
    }
}