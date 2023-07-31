import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer (100, 50);
    }

    @Test
    public void canPrintIfEnoughPaper(){
        printer.print(3, 2);
        assertEquals(94, printer.getPaperLeft());
        assertEquals(44, printer.getTonerLeft());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper(){
        printer.print(100, 20);
        assertEquals(100, printer.getPaperLeft());
        assertEquals(50, printer.getTonerLeft());
    }

}
