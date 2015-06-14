
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lvale
 */
public class Pratica62 {
    public static void main( String[] args ){
        Time alemanha;
        Set<String> posicoes;

        alemanha = new Time();
 
        alemanha.addJogador("Goleiro", new Jogador(28, "Manuel Neuer"));
        alemanha.addJogador("Zagueiro", new Jogador(4, "Benedikt Höwedes"));
        alemanha.addJogador("Atacante", new Jogador(25, "Thomas Müller"));
        alemanha.addJogador("Bicho", new Jogador(25, "Luiz"));
        
        for(Jogador j: alemanha.ordena(new JogadorComparator(false, true, true))){
            System.out.println(j);
        }
    }

}
