package ejercicio3Test;

import org.junit.Assert;
import org.junit.Test;
import p3.Ej3Utils;

public class VerificarTest {
    Ej3Utils ej3 = new Ej3Utils();

/*    @Test
    public void verify_1(){
        String ci = "";
        boolean actualResult = ej3.isCorrectCI(ci);
        Assert.assertEquals("Error", actualResult, false);
    }

    @Test
    public void verify_2(){
        String ci = "123456";
        ej3.isCorrectCI(ci);
    }
*/
    @Test (timeout = 2000)
    public void verify_Tiempo(){
        System.out.println("LOGICA DE MI TEST 5");
    }
}
