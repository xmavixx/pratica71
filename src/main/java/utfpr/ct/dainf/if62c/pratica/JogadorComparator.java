/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Victor Tholken
 */
public class JogadorComparator implements Comparator<Jogador>{
    private boolean numero, nome, geral;
    
    public JogadorComparator()
    {
        geral = true;
        numero = true;
        nome = true;
    }
    
    public JogadorComparator(boolean comparacaoGeral, boolean comparacaoNumero, boolean comparacaoNome)
    {
        this.geral = comparacaoGeral;
        this.nome = comparacaoNome;
        this.numero = comparacaoNumero;
    }
    
    @Override
    public int compare(Jogador jogador1, Jogador jogador2)
    {
        //Verificando se é para ordenar em função do nome ou numero
        if(geral)
        {
            
            //Verificando se os numeros são iguais
            if(comparaNumero(jogador1.num, jogador2.num) == 0)
            {
                //comparando pelo nome
                return comparaNome(jogador1.jogadornome, jogador2.jogadornome);
            }
            return comparaNumero(jogador1.num, jogador2.num);
        }
        else
        {
            
            //Verificando se os nomes são equivalentes
            if(comparaNome(jogador1.jogadornome, jogador2.jogadornome) == 0)
            {
                //Comparando pelo numero
                return comparaNumero(jogador1.num, jogador2.num);
            }
            return comparaNome(jogador1.jogadornome, jogador2.jogadornome);
        }
    }
    public int comparaNome(String n1, String n2)
    {
        //Comparando o tamanho dos nomes
        if(n1.length() < n2.length())
        {
            //Comparando letra por letra
            for(int i = 0; i <= n1.length(); i++)
            {
                if(n1.charAt(i) < n2.charAt(i))
                {
                    //Verificando se é acendente
                    if(nome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i))
                {
                    //Verificando se é acendente
                    if(nome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        else
        {
            //Comparando letra por letra
            for(int i = 0; i < n2.length(); i++)
            {
                if(n1.charAt(i) < n2.charAt(i))
                {
                    //Verificando se é acendente
                    if(nome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i))
                {
                    //Verificando se é acendente
                    if(nome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        
        return 0;
    }
    
    public int comparaNumero(int n1, int n2)
    {
        //Verificando se é crescente ou decrescente
        if(numero)
            return n1 - n2;
        else
            return (n1 - n2)*-1;
    }
    
    
    
}
