package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private String dificuldade; // básico, intermediário, avançado

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria, String dificuldade) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
        this.dificuldade = dificuldade;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", dificuldade='" + dificuldade + '\'' +
                '}';
    }
}
