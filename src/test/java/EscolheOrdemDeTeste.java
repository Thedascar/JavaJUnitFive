import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolheOrdemDeTeste {

    @Order(4)
    @Test
    void validaFluxoA(){

    }
    @Order(2)
    @Test
    void validaFluxoB(){

    }
    @Order(3)
    @Test
    void validaFluxoC(){

    }
    @Order(1)
    @Test
    void validaFluxoD(){

    }
}
