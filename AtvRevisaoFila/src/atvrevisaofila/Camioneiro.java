/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvrevisaofila;

/**
 *
 * @author Quiqu
 */
public class Camioneiro {
    String nome;
    int idade;
    int CPF;
    String placa;
    String horaChegada;
    
    public Camioneiro(String nome, int idade, int CPF, String placa, String horaChegada){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.placa = placa;
        this.horaChegada = horaChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Camioneiro: " + "nome=" + nome + ", \nidade=" + idade + ", \nCPF=" + CPF + ", \nPlaca do veículo: "+placa;
    }
    
}
