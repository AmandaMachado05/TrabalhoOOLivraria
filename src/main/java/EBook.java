public class EBook extends Livro{

    private String formato;

    public EBook(String nome, float preco, String codigo,
                 String autor, String editora, String genero, String numEdicao, String idioma,
                 String formato) {
        super(nome, preco, codigo, autor, editora, genero, numEdicao, idioma);
        this.formato = formato;
        validarDados();
    }

    public String descricao() {
        return super.descricao()+"Esse E-Book recebe como extensão o formato "+ formato +".\n";
    }

    private void validarDados() {
        if (this.formato == null || this.formato.isEmpty()) {
            throw new IllegalArgumentException("Formato de Arquivo Inválido");
        }
    }

}
