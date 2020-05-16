/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Acer
 */
public class cambiarColor extends DefaultTableCellRenderer{
    
    	
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //establecemos el fondo blanco o vacío
        setBackground(null);
        //Constructor de la clase DefaultTableCellRenderer
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
 
        //Establecemos las filas que queremos cambiar el color. == 1 para impares
        boolean oddRow = (row % 2 == 1);
 
        //Creamos un color para las filas. El 200, 200, 200 en RGB es un color gris
        Color c = new Color(255, 102, 102);
 
        //Si las filas son pares, se cambia el color a gris
        if (oddRow) {
            setBackground(c);
        }
        return this;
    }

}
