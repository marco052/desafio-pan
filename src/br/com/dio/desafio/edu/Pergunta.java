package br.com.dio.desafio.edu;

public class Pergunta {
    private String titulo;
    private String texto;
    private Dev autor;

    public Pergunta(String titulo, String texto, Dev autor) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\t" + this.titulo + "\n"
                + "\tAutor: " + this.autor.getNome() + "\n"
                + this.texto + "\n";
    }
}
