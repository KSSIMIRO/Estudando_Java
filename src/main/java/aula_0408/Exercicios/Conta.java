package aula_0408.Exercicios_0408;

public class Conta {
    private String nuConta;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(String nuConta, Double saldo, Cliente cliente) {
        this.nuConta = nuConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(String nuConta, Cliente cliente) {
        this.nuConta = nuConta;
        this.cliente = cliente;
    }

    public String getNuConta() {
        return nuConta;
    }

    public void setNuConta(String nuConta) {
        this.nuConta = nuConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
