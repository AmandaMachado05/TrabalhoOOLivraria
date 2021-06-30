import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioBookTest {

    @Test
    public void testNarradorNulo() {
        try {
             new AudioBook("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","2","PT",
                    "", "8:00h","audiomusic");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Narrador Inválido", e.getMessage());
        }
    }

    @Test
    public void testDuracaoNula() {
        try {
             new AudioBook("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","2","PT",
                    "Paulo", "","audiomusic");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Duração Inválida", e.getMessage());
        }
    }

    @Test
    public void testProdutoraNula() {
        try {
             new AudioBook("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","2","PT",
                    "Paulo", "8:00h","");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Produtora Inválida", e.getMessage());
        }
    }

}