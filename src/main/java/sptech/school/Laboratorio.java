package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    String nome;
    List<school.sptech.Vacina> vacinas = new ArrayList<>();

    public Laboratorio() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarVacina (school.sptech.Vacina vacina){
        if (vacina ==null){
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.codigo == null) {
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.nome ==null) {
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.tipo == null) {
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.preco == null || vacina.preco<= 0) {
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.eficacia== null|| vacina.eficacia <0 && vacina.eficacia>5) {
            school.sptech.exception.VacinaInvalidaException;
        } else if (vacina.dataLancamento== null) {
            school.sptech.exception.VacinaInvalidaException;
        }else {
            vacinas.add(vacina);
        }
    }

    public school.sptech.Vacina buscarVacinaPorCodigo(String codigo){
        if (codigo== null){
            school.sptech.exception.ArgumentoInvalidoException;
        }
        while (vacinas : school.sptech.Vacina vacina){
            if (codigo == vacina.codigo){
                System.out.println(vacina);
            }else {
                school.sptech.exception.VacinaNaoEncontradaException;
            }
        }
    }

    public void removerVacinaPorCodigo(String codigo){
        if (codigo== null){
            school.sptech.exception.ArgumentoInvalidoException;
        }
        while (vacinas : school.sptech.Vacina vacina){
            if (codigo == vacina.codigo){
               vacinas.remove(vacina);
            }else {
                school.sptech.exception.VacinaNaoEncontradaException;
            }
        }
    }

    public school.sptech.Vacina buscarVacinaComMelhorEficacia(){
        if (vacinas == null){
            school.sptech.exception.VacinaNaoEncontradaException;
        }
        double eficaciaAtual = 0;
        double maiorEficacia = 0;
        String codigoMaiorEficacia = null;
        while (vacinas : school.sptech.Vacina vacina){
            eficaciaAtual = vacina.eficacia;
            if (eficaciaAtual>= maiorEficacia){
                maiorEficacia = eficaciaAtual;
                codigoMaiorEficacia = vacina.codigo;
            }
        }
    }

    public List<school.sptech.Vacina> buscarVacinaPorPeriodo(LocalDate dataInicio, LocalDate dataFim){
        if (dataInicio== null|| dataFim== null|| dataInicio.isAfter(dataFim)){
            school.sptech.exception.ArgumentoInvalidoException;
        }
        List<school.sptech.Vacina> vacinaData = new ArrayList<>();

        while (vacinas : school.sptech.Vacina vacina){
            if (vacina.dataLancamento.isAfter(dataInicio) && vacina.dataLancamento.isBefore(dataFim)){
                vacinaData.add(vacina);
            }
        }
    }
}
// Não consegui entender o erro do ":" nos whiles