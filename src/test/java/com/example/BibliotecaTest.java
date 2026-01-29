package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void testAdicionarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        
        boolean resultado = biblioteca.adicionarLivro(livro);
        assertTrue(resultado, "O livro deveria ser adicionado corretamente.");
    }

    @Test
    public void testAdicionarLivroDuplicado() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954); // Mesmo título
        
        biblioteca.adicionarLivro(livro1);
        boolean resultado = biblioteca.adicionarLivro(livro2);
        assertFalse(resultado, "Não deve ser possível adicionar dois livros com o mesmo título.");
    }

    @Test
    public void testRemoverLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        
        biblioteca.adicionarLivro(livro);
        boolean resultado = biblioteca.removerLivro("O Senhor dos Anéis");
        assertTrue(resultado, "O livro deve ser removido com sucesso.");
    }

    @Test
    public void testRemoverLivroNaoExistente() {
        Biblioteca biblioteca = new Biblioteca();
        
        boolean resultado = biblioteca.removerLivro("Duna");
        assertFalse(resultado, "Não deve ser possível remover um livro que não existe.");
    }
}