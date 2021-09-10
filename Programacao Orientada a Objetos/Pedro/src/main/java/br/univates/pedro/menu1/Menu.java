/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.menu1;

import br.univates.pedro.Entrada;

/**
 *
 * @author mouri
 */
public class Menu
{
    private MenuModel model;

    public Menu(MenuModel parametros)
    {
        this.model = parametros;
    }
    
    public void gerar()
    {
        String aux = "MENU\n\n";
        for (int i = 0; i < model.getNumOpcoes(); i++)
        {
            aux += "["+model.getAtalho(i)+"] "+model.getOpcao(i)+"\n";
        }
        aux += "[x] Sair";
        
        char op = ' ';
        while (op != 'x')
        {
            op = Entrada.leiaChar(aux);
            op = Character.toLowerCase(op);

            model.executarOpcao(op);
        }
                
    }
}
