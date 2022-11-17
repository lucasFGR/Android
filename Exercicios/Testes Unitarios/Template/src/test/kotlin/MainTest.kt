import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria(){
        Assertions.assertEquals(portaria(15,"",""),"Negado.")
        Assertions.assertEquals(portaria(20,"",""),"Negado.")

        Assertions.assertEquals(portaria(25,"VIP",""),"Negado.")

        Assertions.assertEquals(portaria(24,"comum","xt4443"),"Welcome.")
        Assertions.assertEquals(portaria(24,"comum","xxxx"),"Negado.")

        Assertions.assertEquals(portaria(25,"premium","xt2333"),"Negado.")
        Assertions.assertEquals(portaria(23,"premium","23333"),"Negado.")
        Assertions.assertEquals(portaria(23,"premium","xl222"),"Welcome.")
    }
}