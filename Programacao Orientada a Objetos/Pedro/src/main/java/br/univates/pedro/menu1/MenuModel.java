
package br.univates.pedro.menu1;

import java.util.ArrayList;

public interface MenuModel
{
    public int getNumOpcoes();
    public char getAtalho( int index );
    public String getOpcao( int index );
    public void executarOpcao( char atalho );
}
