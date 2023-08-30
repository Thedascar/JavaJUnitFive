import org.DesafioControleFluxo2.Conta;
import org.DesafioControleFluxo2.TrasnferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {


    @Test
    void validaTrasnferencia(){
        Conta origem = new Conta("123132",0.0);
        Conta destino = new Conta("456489",100.00);

        TrasnferenciaEntreContas trasnferenciaEntreContas = new TrasnferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,() -> trasnferenciaEntreContas.trasnfere(origem,destino,-1));


    }


}
