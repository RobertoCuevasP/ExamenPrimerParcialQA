package ejercicio2Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class CalcularNotasTest {

    private int nota;
    private String expectedResult;
    public CalcularNotasTest(int nota, String expectedResult){
        this.nota = nota;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        objects.add(new Object[]{-1,"VALOR INCORRECTO"});
        objects.add(new Object[]{0,"REGULAR"});
        objects.add(new Object[]{1,"REGULAR"});
        objects.add(new Object[]{34,"REGULAR"});
        objects.add(new Object[]{35,"REGULAR"});
        objects.add(new Object[]{36,"REGULAR"});
        objects.add(new Object[]{69,"REGULAR"});
        objects.add(new Object[]{70,"REGULAR"});
        objects.add(new Object[]{71,"BUENO"});
        objects.add(new Object[]{74,"BUENO"});
        objects.add(new Object[]{75,"BUENO"});
        objects.add(new Object[]{76,"BUENO"});
        objects.add(new Object[]{79,"BUENO"});
        objects.add(new Object[]{80,"BUENO"});
        objects.add(new Object[]{81,"MUY BUENO"});
        objects.add(new Object[]{84,"MUY BUENO"});
        objects.add(new Object[]{85,"MUY BUENO"});
        objects.add(new Object[]{86,"MUY BUENO"});
        objects.add(new Object[]{89,"MUY BUENO"});
        objects.add(new Object[]{90,"MUY BUENO"});
        objects.add(new Object[]{91,"EXCELENTE"});
        objects.add(new Object[]{94,"EXCELENTE"});
        objects.add(new Object[]{95,"EXCELENTE"});
        objects.add(new Object[]{96,"EXCELENTE"});
        objects.add(new Object[]{99,"EXCELENTE"});
        objects.add(new Object[]{100,"EXCELENTE"});
        objects.add(new Object[]{101,"VALOR INCORRECTO"});

        return objects;
    }

    @Test
    public void verify_nota(){

        Ej2Notas ej2 = new Ej2Notas();
        String actualResult= ej2.notasCualitativas(this.nota);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);

    }
}
