package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        boolean resultado = biblioteca.adicionarLivro(livro);
        // Falha ao adicionar um livro duplicado
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954); // Mesmo título
        boolean resultado = biblioteca.adicionarLivro(livro2);
        // Remover livro
        boolean resultado = biblioteca.removerLivro("O Senhor dos Anéis");
        // Remover livro inexistente
        boolean resultado = biblioteca.removerLivro("Duna");
    }
}
