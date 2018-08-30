package br.curso.poo.springBoot.dto;

public final class CalculatorResponseDTO {

    public CalculatorResponseDTO(
        String n1,
        String n2,
        String operation,
        String result
    ) {
        this.n1 = n1;
        this.n2 = n2;
        this.operation = operation;
        this.result = result;
    }

    private String n1;

    private String n2;

    private String operation;

    private String result;

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
