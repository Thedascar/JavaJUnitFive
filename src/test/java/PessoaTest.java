import org.DesafioControleFluxo2.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Lucas", LocalDate.of(1995,1,11));
        Assertions.assertEquals(28,pessoa.getIdade());

    }
    @Test
    void deveCalcularIdadeCorretamento(){
        Pessoa pessoa2 = new Pessoa("Aline",LocalDate.of(2000,1,1));
        Assertions.assertEquals(23,pessoa2.getIdade());
    }

    @Test
    void deveRetornarMaiorDeIdade(){
        Pessoa pessoa3 = new Pessoa("Liz",LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa3.ehMaiorDeIdade());

    }
}
