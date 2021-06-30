public abstract class Produto{

    protected String nome;
    protected float preco;
    protected String codigo;
    private static final float PRECO_MINIM0 = 0.01f;

    public Produto(String nome, float preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        validarDados();
    }

    public String descricao(){
        return  nome + "(" + codigo + ")" + " custa " + preco +".\n";
    }

    public void imprimirInfo(String tipoProduto){
        System.out.println(tipoProduto);
        System.out.println(descricao());
    }

    private void validarDados(){
        if(nome == null|| nome.isEmpty()){
            throw new IllegalArgumentException("Nome Inválido");
        }
        if (preco < PRECO_MINIM0) {
            throw new IllegalArgumentException("O preço está muito baixo");
        }
        if(codigo == null|| codigo.isEmpty()){
            throw new IllegalArgumentException("Código Inválido");
        }
    }
}
