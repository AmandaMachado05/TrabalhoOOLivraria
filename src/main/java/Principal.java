import java.util.ArrayList;
import java.util.List;

//Amanda Lopes Machado (201935002)
//João Pedro Carvalho Ragazzi (201935011)

public class Principal {
    public static void main(String[] args) {
        System.out.println("LIVRARIA");

        Livro livro1 = new Livro("Ilha Perdida",20.00f,"54645485",
                                 "Maria José Dupré","Ática","aventura","2","PT");

        livro1.imprimirInfo("Livro");

        AudioBook audioBook1 = new AudioBook("Ilha Perdida",20.00f,"8752400",
                                            "Maria José Dupré","Ática","aventura","2","PT",
                                            "Paulo", "8:00h","audiomusic");

        audioBook1.imprimirInfo("AudioBook");

        EBook eBook1 = new EBook("Ilha Perdida",15.00f,"44347787",
                                 " Maria José Dupré","Ática","aventura","2","PT",
                                 "ePub");
       eBook1.imprimirInfo("EBook");

        Fisico livroFisico1 = new Fisico("Ilha Perdida",35.00f,"77665543",
                                         " Maria José Dupré","Ática","aventura","2","PT",
                                         "dura","reciclado",125);

        livroFisico1.imprimirInfo("Livro Fisico");

        Usado  livroUsado1= new Usado ("Ilha Perdida",35.00f,"255215",
                                        " Maria José Dupré","Ática","aventura","2","PT",
                                        "dura","reciclado",125,
                                        "boa");

        livroUsado1.imprimirInfo("Livro Usado");

        List<Produto> itensLivraria = new ArrayList<>();
        itensLivraria.add(audioBook1);
        itensLivraria.add(eBook1);
        itensLivraria.add(livroFisico1);
        itensLivraria.add(livroUsado1);

        Compra compra = new Compra(itensLivraria);
        compra.informacoesCompra();
    }
}

