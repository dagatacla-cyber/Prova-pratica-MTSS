////////////////////////////////////////////////////////////////////
// [LORENZO] [ARTUSI] [2148622]
// [CLAUDIA] [D'AGATA] [2102259]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StampaAsciiTest {

    @Test
    public void stampa_I() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("I");

        String result = output.toString();

        assertTrue(result.contains("_____"));
        assertTrue(result.contains("|_   _|"));
        assertTrue(result.contains("| |"));
        assertTrue(result.contains("|_____|"));
    }

    @Test
    public void stampa_V() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("V");

        String result = output.toString();

        assertTrue(result.contains("__      __"));
        assertTrue(result.contains("\\ \\    / /"));
        assertTrue(result.contains("\\ \\/ /"));
        assertTrue(result.contains("\\/"));
    }

    @Test
    public void stampa_X() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("X");

        String result = output.toString();

        assertTrue(result.contains("__   __"));
        assertTrue(result.contains("\\ \\ / /"));
        assertTrue(result.contains("\\ V /"));
        assertTrue(result.contains("> <"));
        assertTrue(result.contains("/ ^ \\"));
    }

    @Test
    public void stampa_L() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("L");

        String result = output.toString();

        assertTrue(result.contains("| |"));
        assertTrue(result.contains("| |____"));
        assertTrue(result.contains("|______|"));
    }

    @Test
    public void stampa_C() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("C");

        String result = output.toString();

        assertTrue(result.contains("_____"));
        assertTrue(result.contains("/ ____|"));
        assertTrue(result.contains("| |"));
        assertTrue(result.contains("\\_____|"));
    }

    @Test
    public void stampa_D() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("D");

        String result = output.toString();

        assertTrue(result.contains("_____"));
        assertTrue(result.contains("|  __ \\"));
        assertTrue(result.contains("| |  | |"));
        assertTrue(result.contains("|_____/"));
    }

    @Test
    public void stampa_M() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("M");

        String result = output.toString();

        assertTrue(result.contains("__  __"));
        assertTrue(result.contains("|  \\/  |"));
        assertTrue(result.contains("| \\  / |"));
        assertTrue(result.contains("| |\\/| |"));
        assertTrue(result.contains("|_|  |_|"));
    }

    @Test
    public void stampa_IV() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("IV");

        String result = output.toString();

        //I
        assertTrue(result.contains("_____"));
        assertTrue(result.contains("|_   _|"));
        assertTrue(result.contains("| |"));
        assertTrue(result.contains("|_____|"));

        //V
        assertTrue(result.contains("__      __"));
        assertTrue(result.contains("\\ \\    / /"));
        assertTrue(result.contains("\\ \\/ /"));
        assertTrue(result.contains("\\/"));

    }


    // test di stringhe composte da più simboli

    @Test
    public void stampa_XL() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("XL");

        String result = output.toString();

        assertTrue(result.contains("__   __")); // X
        assertTrue(result.contains("| |____")); // L
    }

    @Test
    public void stampa_MCMXCIV() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("MCMXCIV");

        String result = output.toString();

        assertTrue(result.contains("__  __")); // M
        assertTrue(result.contains("_____"));  // C/I
        assertTrue(result.contains("__   __")); // X
    }


    // test input non valido

    @Test
    public void stampa_stringa_vuota() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AraboRomanoASCII.stampaAscii("");

        String result = output.toString();

        assertEquals("", result.trim());
    }

    @Test
    public void stampa_null_lancia_eccezione() {
        assertThrows(NullPointerException.class,
            () -> AraboRomanoASCII.stampaAscii(null));
    }
}