public class Livro extends Produto{

    protected String autor;
    protected String editora;
    protected String genero;
    protected String numEdicao;
    protected String idioma;


    public Livro(String nome, float preco, String codigo,
                 String autor, String editora, String genero, String numEdicao, String idioma) {
        super(nome,preco,codigo);
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.numEdicao = numEdicao;
        this.idioma = idioma;
        validarDados();
    }

    public String descricao() {
        return  super.descricao()+"O livro foi escrito pelo(a) "+ autor +" e pertence ao genero "  + genero + ".O livro foi produzido pela editora  " + editora + " " + ",se encontra no idioma  " + idioma + " " + "e seu numero de edição é " + numEdicao+".\n";
    }

    private void validarDados() {
        if (autor == null|| autor.isEmpty()) {
            throw new IllegalArgumentException("Autor Inválido");
        }
        if (editora == null|| editora.isEmpty()) {
            throw new IllegalArgumentException("Editora Inválida");
        }
        if (genero == null|| genero.isEmpty()) {
            throw new IllegalArgumentException("Gênero Inválido");
        }
        if (numEdicao == null|| numEdicao.isEmpty()) {
            throw new IllegalArgumentException("Número de Edição Inválido");
        }
        if (idioma == null|| idioma.isEmpty()) {
            throw new IllegalArgumentException("Idioma Inválido");
        }
    }
}
