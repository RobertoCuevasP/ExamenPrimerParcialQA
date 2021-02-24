package ejercicio5Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import p5.Login;
import p5.Util2Static;
import p5.UtilStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UtilStatic.class, Util2Static.class})
public class LoginTest {

    @Test
    public void verify_login_test_mock(){

        PowerMockito.mockStatic(UtilStatic.class);
        PowerMockito.mockStatic(Util2Static.class);
        Mockito.when(Util2Static.isUserValid("Roberto", "CRUD")).thenReturn(true);
        Mockito.when(UtilStatic.getPermision("Roberto", "CRUD")).thenReturn("CRUD");

        Login login = new Login();

        String expectedResult= "PERMISSION ROLE CRUD";
        String actualResult= login.roleUser("Roberto", "CRUD");
        Assert.assertEquals("ERROR en Login!",expectedResult,actualResult);
    }
}
