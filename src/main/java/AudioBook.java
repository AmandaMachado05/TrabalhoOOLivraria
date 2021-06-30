import com.sun.source.tree.ReturnTree;

public class AudioBook extends Livro{

    private String narrador;
    private String duracao;
    private String produtora;

    public AudioBook(String nome, float preco, String codigo,
                     String autor, String editora, String genero, String numEdicao, String idioma,
                     String narrador, String duracao, String produtora) {
        super(nome,preco,codigo,autor,editora,genero,numEdicao,idioma);
        this.narrador = narrador;
        this.duracao = duracao;
        this.produtora = produtora;
        validarDados();
    }

    public String descricao() {
        return super.descricao() + "O narrador da versão em audioBook é "+narrador+" "+ ",que fez a narração do titulo em "+duracao+" "+"e teve essa versão produzida por "+produtora +".\n";
    }

    private void validarDados() {
        if (narrador == null|| narrador.isEmpty()) {
            throw new IllegalArgumentException("Narrador Inválido");
        }
        if (duracao == null|| duracao.isEmpty()) {
            throw new IllegalArgumentException("Duração Inválida");
        }
        if (produtora == null|| produtora.isEmpty()) {
            throw new IllegalArgumentException("Produtora Inválida");
        }
    }
}
