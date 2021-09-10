/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.menu2;

import br.univates.pedro.Entrada;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mouri
 */
public class Menu
{
    private char opSaida;
    private String titulo;
    private ArrayList<MenuItem> itens;

    public Menu( String titulo, char opSaida)
    {
        this.titulo = titulo;
        this.itens = new ArrayList();
        this.opSaida = opSaida;
    }
    
    public Menu( String titulo )
    {
        this.titulo = titulo;
        this.itens = new ArrayList();
        this.opSaida = 'x';
    }
    
    public Menu()
    {
        this.titulo = "MENU";
        this.itens = new ArrayList();
        this.opSaida = 'x';
    }
    
    public void addItem( MenuItem item )
    {
        this.itens.add(item);
    }
    
    
    public void gerar()
    {
        String m = this.titulo+"\n\n";
        for (MenuItem item: itens)
        {
            m += "["+item.getAtalho()+"] "+item.getDescr()+"\n";
        }
        if (opSaida == 'x')
        {
            m += "[x] Sair\n\n";
        }
        else
        {
            m += "\n";
        }
        
        char op = ' ';
        while (op != opSaida)
        {
            
            System.out.println(m);
            Scanner x = new Scanner(System.in);
            op = x.nextLine().charAt(0);
            op = Character.toLowerCase(op);
            
            for (MenuItem item: itens)
            {
                if (item.getAtalho() == op)
                {
                    //item.executarAcaoItem();
                    item.getRotina().executar();
                }
            }
        }
                
    }
}
