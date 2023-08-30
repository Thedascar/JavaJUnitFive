import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssumptionsTeste {


    @Test
    //@DisabledIfEnvironmentVariable()
    @EnabledIfEnvironmentVariable(named = "Lucas Ramon",matches = "Lucas Ramon")
    void validarAlgoSOmenteDoUsuarioLucas(){
        Assertions.assertEquals(10,5+5);
    }

}
