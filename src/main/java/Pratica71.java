
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lvale
 */
public class Pratica71 {
    public static void main( String[] args ){
        //Time alemanha;
        //Set<String> posicoes;

        //alemanha = new Time();
 
        /*alemanha.addJogador("Goleiro", new Jogador(28, "Manuel Neuer"));
        alemanha.addJogador("Zagueiro", new Jogador(4, "Benedikt Höwedes"));
        alemanha.addJogador("Atacante", new Jogador(25, "Thomas Müller"));
        alemanha.addJogador("Bicho", new Jogador(25, "Luiz"));
        */
        //Criando uma lista
        ArrayList<Jogador> lista = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int numeroJogadores = 0;
        boolean valido = true;
        
        while(valido)
        {
            System.out.print("Digite o numero de jogadores: ");
            if (scanner.hasNextInt()) {
                numeroJogadores = scanner.nextInt();
                valido = false;
            } else {
                System.out.println("Digite um número!");
                Object lixo = scanner.next();
            }
        }
        int numero = 0;
        String nome;
        valido = true;
        
        while(numeroJogadores >0)
        {
            System.out.print("Digite o numero do jogador: ");

            if (scanner.hasNextInt()) 
            {
                numero = scanner.nextInt();
            } 
            else 
            {
                System.out.println("Digite um número!");
                valido = false;
                Object lixo = scanner.next();
                        
            }
           
            if(valido)
            {
                System.out.print("Digite o nome do jogador: ");
                nome = scanner.next();

                lista.add(new Jogador(numero, nome));
                numeroJogadores--;
            }
            valido = true;
                    
        }
        
        
        Collections.sort(lista, new JogadorComparator(true, true, true));
        
        for (Jogador j: lista) 
        {
            System.out.println(j);
        }
        
        numero = 1;
        while(numero != 0)
        {
            System.out.print("Digite o numero do jogador: ");

            if (scanner.hasNextInt()) 
            {
                numero = scanner.nextInt();
            } 
            else 
            {
                System.out.println("Digite um número!");
                valido = false;
                Object lixo = scanner.next();
                        
            }
            if(numero == 0)
            {
                break;
            }
            if(valido)
            {
                boolean jaExiste = false;
                System.out.print("Digite o nome do jogador: ");
                nome = scanner.next();
                Jogador jogador = new Jogador(numero, nome);
                for(Jogador j: lista)
                {
                    if(jogador.getNumero() == j.getNumero())
                    {
                        lista.set(lista.indexOf(j), jogador);
                        jaExiste = true;
                    }
                }
                if(!jaExiste)
                    lista.add(jogador);
                          
                
                Collections.sort(lista, new JogadorComparator(true, true, true));
        
                for (Jogador j: lista) 
                {
                    System.out.println(j);
                }
            }
            valido = true;
        }
        /*for(Jogador j: alemanha.ordena(new JogadorComparator(false, true, true))){
            System.out.println(j);
        }*/
    }

}
