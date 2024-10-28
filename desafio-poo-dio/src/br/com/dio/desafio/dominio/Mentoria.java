package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    private String mentor; // Novo atributo

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, LocalDate data, String mentor) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
        this.mentor = mentor;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}
