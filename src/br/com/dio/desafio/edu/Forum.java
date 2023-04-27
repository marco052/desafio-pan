package br.com.dio.desafio.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Forum {
    private String nome;
    private Set<Dev> matriculados = new HashSet<>();
    private List<Pergunta> perguntas = new ArrayList<>();

    public Forum(String nome) {
        this.nome = nome;
    }

    public Set<Dev> getMatriculados() {
        return matriculados;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    @Override
    public String toString() {
        String retorno = "";
        for(Pergunta p : perguntas){
            retorno += p.toString() + "\n----------------------------------------------------------\n";
        }
        return retorno;
    }

    public String getNome() {
        return this.nome;
    }
}
