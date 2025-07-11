/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Administrator
 */
public class Validar {
    public static int intParse(String dato){
        try {
            return Integer.parseInt(dato);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static float floatParse(String dato){
        try {
            return Float.parseFloat(dato);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static boolean validarString(String dato){
        boolean flag = false;
        try {
            if(dato.isEmpty() || dato.isBlank()){
                flag = true;
            }
        } catch (Exception e) {
            flag = true;
        }
        return flag;
    }
}
