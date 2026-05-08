////////////////////////////////////////////////////////////////////
// [LORENZO] [ARTUSI] [2148622]
// [CLAUDIA] [D'AGATA] [2102259]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AraboRomanoASCIITest {

    // test basilari

    @Test
    void input_1_output_I() {
        assertEquals("I", AraboRomanoASCII.convert(1));
    }

    @Test
    void input_5_output_V() {
        assertEquals("V", AraboRomanoASCII.convert(5));
    }

    @Test
    void input_10_output_X() {
        assertEquals("X", AraboRomanoASCII.convert(10));
    }

    @Test
    void input_50_output_L() {
        assertEquals("L", AraboRomanoASCII.convert(50));
    }

    @Test
    void input_100_output_C() {
        assertEquals("C", AraboRomanoASCII.convert(100));
    }

    @Test
    void input_500_output_D() {
        assertEquals("D", AraboRomanoASCII.convert(500));
    }

    @Test
    void input_1000_output_M() {
        assertEquals("M", AraboRomanoASCII.convert(1000));
    }


    // test dei casi limite

    @Test
    void input_4_output_IV() {
        assertEquals("IV", AraboRomanoASCII.convert(4));
    }

    @Test
    void input_9_output_IX() {
        assertEquals("IX", AraboRomanoASCII.convert(9));
    }

    @Test
    void input_40_output_XL() {
        assertEquals("XL", AraboRomanoASCII.convert(40));
    }

    @Test
    void input_90_output_XC() {
        assertEquals("XC", AraboRomanoASCII.convert(90));
    }

    @Test
    void input_400_output_CD() {
        assertEquals("CD", AraboRomanoASCII.convert(400));
    }

    @Test
    void input_900_output_CM() {
        assertEquals("CM", AraboRomanoASCII.convert(900));
    }


    // test di casi "combinati" (combinazioni di più simboli)

    @Test
    void input_2_output_II() {
        assertEquals("II", AraboRomanoASCII.convert(2));
    }

    @Test
    void input_8_output_VIII() {
        assertEquals("VIII", AraboRomanoASCII.convert(8));
    }

    @Test
    void input_58_output_LVIII() {
        assertEquals("LVIII", AraboRomanoASCII.convert(58));
    }

    @Test
    void input_399_output_CCCXCIX() {
        assertEquals("CCCXCIX", AraboRomanoASCII.convert(399));
    }

    @Test
    void input_944_output_CMXLIV() {
        assertEquals("CMXLIV", AraboRomanoASCII.convert(944));
    }


    // test con più regole di combinazione

    @Test
    void input_49_output_XLIX() {
        assertEquals("XLIX", AraboRomanoASCII.convert(49));
    }

    @Test
    void input_99_output_XCIX() {
        assertEquals("XCIX", AraboRomanoASCII.convert(99));
    }

    @Test
    void input_1994_output_MCMXCIV() {
        assertEquals("MCMXCIV", AraboRomanoASCII.convert(1994));
    }


    //TEST DEL MAIN
    @Test
    public void test_main() {

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));

    AraboRomanoASCII.main(new String[]{});

    String result = output.toString();

    assertTrue(result.contains("1 -> I"));
    assertTrue(result.contains("1000 -> M"));
}
    

}