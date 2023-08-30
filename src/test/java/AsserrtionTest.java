import org.DesafioControleFluxo2.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AsserrtionTest {

    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundolancamento = {1,2,3,4,5};


        Assertions.assertArrayEquals(primeiroLancamento,segundolancamento);
    }

    @Test
    void validarSeObjetoNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);


    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.1;
        double valor2 = 5.1;

        Assertions.assertEquals(valor2,valor);

    }
}
