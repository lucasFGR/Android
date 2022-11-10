import org.junit.jupiter.api.*

class MainTest {
    @Test
    @DisplayName("Teste medoto xxoo")
    fun testCountXO(){
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertFalse(countXO("xxoooo"))},
            { Assertions.assertEquals(countXO("xxoooo"),true)}
        )
    }

    @Test
    @Disabled
    fun textOutro(){

    }

    @Test
    fun vaiFalhar(){
        fail("N finalizar sem implementar esse teste")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertTrue(funcao())
    }

    
}

