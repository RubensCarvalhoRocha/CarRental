/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.LimitarCaracteres;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author ruben
 */
public class LimitaCaracteres extends PlainDocument{
    
            public enum TipoEntrada{
           NUMEROINTEIRO, NUMERODECIMAL, NOME, EMAIL,DATA; 
        };
            private int qtdCaracteres;
            private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + string.length();
        //FILTRO DE CARACTERES
        String regex = "";
        switch(tpEntrada){
            case NUMEROINTEIRO: regex = "^[0-9]"; break;
            case NUMERODECIMAL: regex = "[^0-9,.]"; break;
            case NOME: regex = "[^\\p{IsLatin} ] "; break;
            case EMAIL: regex = "[^\\p{IsLatin}@.\\-_ ] "; break;
            case DATA: regex = "[^0-9/]" ; break;
                    }
        //FAZENDO A SUBSTITUIÇÃO
        string = string.replaceAll(regex, "");
        
        if (totalCarac <= qtdCaracteres){
          super.insertString(i, string, as); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody  
        }else{
            String nova = string.substring(0, qtdCaracteres);            
            super.insertString(i, nova, as);
        }
    }
            
    
    
    
}
