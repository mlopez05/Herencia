/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Student student = new Student("Roberto","4ta. Calle 6-32 Zona 1","Java",2022,200.00);
        
        System.out.println(student.toString());
        
        Staff staff = new Staff("Julio","San Lucas","Technology", 225.00);
        
        System.out.println(staff.toString());
    }
    
}
