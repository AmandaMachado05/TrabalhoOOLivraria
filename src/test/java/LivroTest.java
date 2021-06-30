import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    public void testNomeNulo() {
        try {
            new Livro("",20.00f,"54645485",
                                    "Maria José Dupré","Ática","aventura","2","PT");
            fail();
        }
            catch(IllegalArgumentException e) {
                assertEquals("Nome Inválido", e.getMessage());
        }
    }

    @Test
    public void testPrecoAbaixoMinimo() {
        try {
            new Livro("Ilha Perdida",-20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","2","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("O preço está muito baixo", e.getMessage());
        }
    }

    @Test
    public void testCodigoNulo() {
        try {
            new Livro("Ilha Perdida",20.00f,"",
                    "Maria José Dupré","Ática","aventura","2","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Código Inválido", e.getMessage());
        }
    }

    @Test
    public void testAutorNulo() {
        try {
            new Livro("Ilha Perdida",20.00f,"54645485",
                    "","Ática","aventura","2","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Autor Inválido", e.getMessage());
        }
    }

    @Test
    public void testEditoraNula() {
        try {
            new Livro("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","","aventura","2","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Editora Inválida", e.getMessage());
        }
    }

    @Test
    public void testGeneroNulo() {
        try {
            new Livro("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","","2","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Gênero Inválido", e.getMessage());
        }
    }

    @Test
    public void testNumeroEdicaoNulo() {
        try {
            new Livro("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","","PT");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Número de Edição Inválido", e.getMessage());
        }
    }

    @Test
    public void testIdiomaNulo() {
        try {
            new Livro("Ilha Perdida",20.00f,"54645485",
                    "Maria José Dupré","Ática","aventura","2","");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Idioma Inválido", e.getMessage());
        }
    }


}