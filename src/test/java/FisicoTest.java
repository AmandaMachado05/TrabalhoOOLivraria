import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FisicoTest{
    @Test
    public void testTipoCapaNulo() {
        try {
             new Fisico("Ilha Perdida",35.00f,"2547845215",
                    " Maria José Dupré","Ática","aventura","2","PT",
                    "","reciclado",125);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Tipo de Capa Inválido", e.getMessage());
        }
    }
    @Test
    public void testTipoPapelNulo() {
        try {
            new Fisico("Ilha Perdida",35.00f,"2547845215",
                    " Maria José Dupré","Ática","aventura","2","PT",
                    "dura","",125);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Tipo de Papel Inválido", e.getMessage());
        }
    }

    @Test
    public void testNumeroPagniasAbaixoMinimo() {
        try {
             new Fisico("Ilha Perdida",35.00f,"2547845215",
                    " Maria José Dupré","Ática","aventura","2","PT",
                    "dura","reciclado",0);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals(" Não possui o número de páginas minímo", e.getMessage());
        }
    }

}