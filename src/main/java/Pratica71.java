
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
 * @author Victor Tholken
 */
public class Pratica71 {
    public static void main( String[] args ){
        
        ArrayList<Jogador> lista = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int numeroJogador = 0;
        boolean valido = true;
        
        while(valido)
        {
            System.out.print("Digite o numero de jogadores: ");
            if (scanner.hasNextInt()) {
                numeroJogador = scanner.nextInt();
                valido = false;
            } else {
                System.out.println("Digite um número!");
                Object lixo = scanner.next();
            }
        }
        int num = 0;
        String nome;
        valido = true;
        
        while(numeroJogador >0)
        {
            System.out.print("Digite o numero do jogador: ");

            if (scanner.hasNextInt()) 
            {
                num = scanner.nextInt();
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

                lista.add(new Jogador(num, nome));
                numeroJogador--;
            }
            valido = true;
                    
        }
        
        
        Collections.sort(lista, new JogadorComparator(true, true, true));
        
        for (Jogador j: lista) 
        {
            System.out.println(j);
        }
        
        num = 1;
        while(num != 0)
        {
            System.out.print("Digite o numero do jogador: ");

            if (scanner.hasNextInt()) 
            {
                num = scanner.nextInt();
            } 
            else 
            {
                System.out.println("Digite um número!");
                valido = false;
                Object lixo = scanner.next();
                        
            }
            if(num == 0)
            {
                break;
            }
            if(valido)
            {
                boolean jaExiste = false;
                System.out.print("Digite o nome do jogador: ");
                nome = scanner.next();
                Jogador jogador = new Jogador(num, nome);
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
