package school.sptech;

import java.time.LocalDate;

public class Vacina {
    String codigo;
    String nome;
    String tipo;
    Double preco;
    Double eficacia;
    LocalDate dataLancamento;

    public Vacina(String codigo, String nome,String tipo, Double preco, Double eficacia, LocalDate dataLancamento){
        this.codigo= codigo;
        this.nome= nome;
        this.tipo= tipo;
        this.preco= preco;
        this.eficacia= eficacia;
        this.dataLancamento= dataLancamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getEficacia() {
        return eficacia;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public String getEficaciaDescricao(){
        if (eficacia>= 90.5){
            System.out.println("EXCELENTE");
        } else if (eficacia>=75.5) {
            System.out.println("BOM");
        } else if (eficacia>=50.5) {
            System.out.println("REGULAR");
        }else {
            System.out.println("RUIM");
        }
        return "Descricao da Eficacia";
    }
}
