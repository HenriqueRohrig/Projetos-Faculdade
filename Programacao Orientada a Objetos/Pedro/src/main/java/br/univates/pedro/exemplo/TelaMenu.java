/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.exemplo;

import br.univates.pedro.menu2.Menu;
import br.univates.pedro.menu2.MenuItem;
import br.univates.pedro.menu2.MenuProcesso;

/**
 *
 * @author mouri
 */
public class TelaMenu
{

    public void exibir()
    {
        Menu m = new Menu();
        
        m.addItem(new MenuItem('a', "Abrir a porta do cofre", new MenuProcesso()
        {
            @Override
            public void executar()
            {
                System.out.println("ação do primeiro item");
            }

        }));
        
        m.addItem(new MenuItem('b', "Segunda opção", new MenuProcesso()
        {
            @Override
            public void executar()
            {
                System.out.println("flasdjflkçjd");
                System.out.println("fsdlksadjflkj");
            }

        }));

        m.addItem(new MenuItem('c', "Terceiro item do menu", new MenuProcesso()
        {
            @Override
            public void executar()
            {
                System.out.println("lfsakdjsldj 333333333333");
            }

        }));

        m.gerar();

    }

}
