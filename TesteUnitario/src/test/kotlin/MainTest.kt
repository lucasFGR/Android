import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {
    @Test
    @DisplayName("Teste medoto xxoo")
    fun testCountXO(){
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo"))},
            { Assertions.assertEquals(countXO("xxoooo"),true)}
        )
    }

    @Test
    @Disabled
    fun textOutro(){

    }

    @Test
    @Disabled
    fun vaiFalhar(){
        fail("N finalizar sem implementar esse teste")
    }

    /*
    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertTrue(funcao())
    }

     */

    @Test
    fun exception(){
        assertThrows<NullPointerException> { funcao() }
    }


}

