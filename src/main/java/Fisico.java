public class Fisico extends Livro{

    private String tipoCapa;
    private String tipoPapel;
    private int numPaginas;

    private static final int MINIMO_PAGINAS = 1;

    public Fisico(String nome, float preco, String codigo,
                  String autor, String editora, String genero, String numEdicao, String idioma,
                  String tipoCapa, String tipoPapel, int numPaginas) {
        super(nome, preco, codigo, autor, editora, genero, numEdicao, idioma);
        this.tipoCapa = tipoCapa;
        this.tipoPapel = tipoPapel;
        this.numPaginas = numPaginas;
        validarDados();
    }

   public String descricao() {
       return super.descricao()+"Ele possui uma capa de  "+ tipoCapa +" "+",papel do tipo  "+ tipoPapel+" "+"e um numero de paginas igual a " + numPaginas+".\n";
    }

    private void validarDados() {
        if (tipoCapa == null|| tipoCapa.isEmpty()) {
            throw new IllegalArgumentException("Tipo de Capa Inválido");
        }
        if (tipoPapel == null|| tipoPapel.isEmpty()) {
            throw new IllegalArgumentException("Tipo de Papel Inválido");
        }
        if (numPaginas < MINIMO_PAGINAS) {
            throw new IllegalArgumentException(" Não possui o número de páginas minímo");
        }

    }
}
