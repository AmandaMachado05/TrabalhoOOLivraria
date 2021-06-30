import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsadoTest {

    @Test
    public void testConservacaoNula() {
        try {
             new Usado ("Ilha Perdida",35.00f,"2547845215",
                    " Maria José Dupré","Ática","aventura","2","PT",
                    "dura","reciclado",125,
                    "");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Estado de Conservação Inválido", e.getMessage());
        }
    }

    @Test
    public void testConservacaoBoa() {
        Usado  livroUsado1= new Usado ("Ilha Perdida",35.00f,"2547845215",
                " Maria José Dupré","Ática","aventura","2","PT",
                "dura","reciclado",125,
                "boa");
        assertEquals(21.0f, livroUsado1.calculaPreco(30.0f));
    }

    @Test
    public void testConservacaoMedia() {
        Usado  livroUsado1= new Usado ("Ilha Perdida",35.00f,"2547845215",
                " Maria José Dupré","Ática","aventura","2","PT",
                "dura","reciclado",125,
                "pequenos defeitos");
        assertEquals(15.0f, livroUsado1.calculaPreco(30.0f));
    }

    @Test
    public void testConservacaoRuim() {
        Usado  livroUsado1= new Usado ("Ilha Perdida",35.00f,"2547845215",
                " Maria José Dupré","Ática","aventura","2","PT",
                "dura","reciclado",125,
                "bastante desgastada");
        assertEquals(9.0f, livroUsado1.calculaPreco(30.0f));
    }
}