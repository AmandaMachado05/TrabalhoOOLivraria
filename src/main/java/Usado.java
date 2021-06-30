public class Usado extends Fisico{

    private String conservacao;
    private float CONSERVACAO_BOA = 0.7f;
    private float CONSERVACAO_MEDIA = 0.5f;
    private float CONSERVACAO_RUIM = 0.3f;


    public Usado(String nome, float preco, String codigo,
                 String autor, String editora, String genero, String numEdicao, String idioma,
                 String tipoCapa, String tipoPapel, int numPaginas,
                 String conservacao) {
        super(nome, preco, codigo, autor, editora, genero, numEdicao, idioma, tipoCapa, tipoPapel, numPaginas);
        this.conservacao = conservacao;
        this.preco=calculaPreco( preco);
        validarDados();
    }

    private void validarDados(){
        if (conservacao == null|| conservacao.isEmpty()) {
            throw new IllegalArgumentException("Estado de Conservação Inválido");
        }
    }
    public String descricao() {
        return super.descricao()+"O livro se encontra em uma conservação  "+ conservacao+".\n";
    }

    public float calculaPreco(float preco){
        if(conservacao== "boa"){
            this.preco =  preco * CONSERVACAO_BOA;
        }if(conservacao== "pequenos defeitos"){
            this.preco = preco * CONSERVACAO_MEDIA;
        }if(conservacao=="bastante desgastada"){
            this.preco= preco * CONSERVACAO_RUIM;
        }
        return this.preco;
    }
}
