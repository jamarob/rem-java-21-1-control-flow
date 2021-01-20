import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppMainTest {

    @Test
    public void getHelloWorldReturnsHelloWorldString(){
        assertEquals("hello world", AppMain.getHelloWorld());
    }

}
