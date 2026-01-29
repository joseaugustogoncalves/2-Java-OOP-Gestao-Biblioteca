package  com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if (livros.size() >= MAX_LIVROS) {
            System.out.println("A biblioteca atingiu o limite máximo de livros!");
            return false;
        }
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(livro.getTitulo())) {
                System.out.println("Já existe um livro com este título na biblioteca!");
                return false;
            }
        }
        livros.add(livro);
        return true;
    }

    public boolean removerLivro(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(l);
                return true;
            }
        }
        System.out.println("O livro não foi encontrado na biblioteca.");
        return false;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAno());
            }
        }
    }
}