package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private int cargaHorariaTotal;
    private int limiteDeVagas;

    // Construtor com limite de vagas
    public Bootcamp(String nome, String descricao, int limiteDeVagas) {
        this.nome = nome;
        this.descricao = descricao;
        this.limiteDeVagas = limiteDeVagas;
    }

    // Métodos
    public boolean verificarVagas() {
        return devsInscritos.size() < limiteDeVagas;
    }

    public int calcularCargaHorariaTotal() {
        return conteudos.stream()
                .filter(c -> c instanceof Curso)
                .mapToInt(c -> ((Curso) c).getCargaHoraria())
                .sum();
    }

    // Getters e Setters adicionais
    public int getLimiteDeVagas() {
        return limiteDeVagas;
    }

    public void setLimiteDeVagas(int limiteDeVagas) {
        this.limiteDeVagas = limiteDeVagas;
    }

    public int getCargaHorariaTotal() {
        return calcularCargaHorariaTotal();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}

