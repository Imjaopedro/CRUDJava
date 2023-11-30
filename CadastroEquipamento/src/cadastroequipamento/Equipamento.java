/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroequipamento;

import java.util.ArrayList;

/**
 *
 * @author João Pedro
 */
public class Equipamento {
    private String nome;
    private int quantidade;
    private String sku;
    private Equipamento eqpmt;
    ArrayList<Equipamento> ListFunc;

    public Equipamento(String nome, int quantidade, String sku) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.sku = sku;
        ListFunc = new ArrayList();
    }
    
    public Equipamento(){
        ListFunc = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Equipamento getEqpmt() {
        return eqpmt;
    }

    public void setEqpmt(Equipamento eqpmt) {
        this.eqpmt = eqpmt;
    }

    public ArrayList<Equipamento> getListFunc() {
        return ListFunc;
    }

    public void setListFunc(ArrayList<Equipamento> ListFunc) {
        this.ListFunc = ListFunc;
    }
    
    public void addEquipamento (Equipamento e){
    ListFunc.add(e);
    }
    
    
    
}
