import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest{

    @Test
    public void testFormatoNulo() {
        try {
             new EBook("Ilha Perdida",15.00f,"2547845215",
                    " Maria José Dupré","Ática","aventura","2","PT",
                    "");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Formato de Arquivo Inválido", e.getMessage());
        }
    }
}