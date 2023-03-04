package br.com.dio.orientacao_objetos;

public class Principal {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Java";
        livro.descricao = "Livro sobre Java! ";
        livro.edicao = "11";
        livro.preco = 42.50;
        livro.autor = "Luiz Moura";
        livro.dataPublicacao = "03/03/2022";


        System.out.printf("A data de pulicacao do livro %s e %s", Livro.nome, Livro.dataPublicacao);
    }
}
