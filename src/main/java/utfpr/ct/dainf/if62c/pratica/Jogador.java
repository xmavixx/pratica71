/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Victor Tholken
 */

 public class Jogador implements Comparable<Jogador> {
    int num;
    String jogadornome;
    public Jogador(int numero, String nome) {
        this.num = numero;
        this.jogadornome = nome;
    }

    @Override
    public String toString() {
        return num + " - " + jogadornome;
    }

    public int compareTo(Jogador jogador) {
        return num - jogador.num;
    }
    
    public void setNome(String nome)
    {
        this.jogadornome = nome;
    }
    public void setNumero(int numero)
    {
        this.num = numero;
    }
    public int getNumero()
    {
        return num;
    }
}
