import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compra {
    private int numItens;
    private float valorTotal;
    private final List<Produto> itensCompra;
    private static final int COMPRA_MINIMA = 1;
    private static final float VALOR_MINIMO = 0.1f;

    public Compra (List<Produto> itensCompra){
        System.out.println("Compras");
        this.itensCompra = Collections.unmodifiableList(itensCompra);
        this.numItens=itensCompra.size();
        validarCompra(itensCompra);
        this.valorTotal=calcularValorTotal(itensCompra);
    }

    private void validarCompra(List<Produto> itensCompra) {
        if (itensCompra.size() < COMPRA_MINIMA) {
            throw new IllegalArgumentException("Compra abaixo da mínima");
        }
        for (Produto itemCompra : itensCompra) {
            if(itemCompra == null){
                throw new IllegalArgumentException("Item da Compra Inválido");
            }
        }

    }

    private static float calcularValorTotal(List<Produto> itensCompra) {
        float valorTotal = 0.0f;
        for (Produto itemCompra : itensCompra) {
            valorTotal += itemCompra.preco;
        }
        if(valorTotal< VALOR_MINIMO){
            throw new IllegalArgumentException("Valor Total de Compra Abaixo da Mínimo");
        }
        return valorTotal;
    }

    public void informacoesCompra(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Itens da Compra ("+ this.numItens+")");
        for (Produto itemCompra : itensCompra) {
            System.out.println(itemCompra.nome +"("+itemCompra.codigo+")\t"+itemCompra.preco);
        }
        System.out.println("Valor Total da Compra \t" + this.valorTotal);
        System.out.println("-------------------------------------------------------");
    }
}
