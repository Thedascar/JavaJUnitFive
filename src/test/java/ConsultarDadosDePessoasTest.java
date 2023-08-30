import org.DesafioControleFluxo2.GerenciadorDeConexaoBd;
import org.DesafioControleFluxo2.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.DesafioControleFluxo2.GerenciadorDeConexaoBd.LOGGER;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoBd.iniciarConexao();
        LOGGER.info("Iniciou");
    }

    @BeforeEach
    void inserirDaodsParaTeste(){
        GerenciadorDeConexaoBd.insereDados(new Pessoa("Lucas"));
    }

    @AfterEach
    void removerDadosDoTeste(){
        GerenciadorDeConexaoBd.insereDados(new Pessoa("Lucas"));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        GerenciadorDeConexaoBd.finalizarConexao();
        LOGGER.info("Terminou");
    }




}
