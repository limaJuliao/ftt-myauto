/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myauto.dominio.modelo.veiculo;

/**
 *
 * @author julio
 */
public class Veiculo {
    
    public long id;
    public long usuarioId;
//    public enum TipoDeCombustivel;
    public String tipo;
    public String marca;
    public String modelo;
    public int ano;
    public String apelido;
    public String volumeDoTanque;
    public boolean doisTanques;
    public String placa;
    public String chassi;
    public String renavan;
    public String comentario;
    
    public Veiculo(long id,
            long usuarioId,
            /*tipoDeCombustivel,*/
            String tipo,
            String marca,
            String modelo,
            String volumeDoTanque,
            boolean doisTanques){
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.volumeDoTanque = volumeDoTanque;
        this.doisTanques = doisTanques;        
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
