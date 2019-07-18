/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rohit_java_lab1;

/**
 *
 * @author Lab01-51
 */
public class Rohit_java_lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        T_point obj1 = new T_point();
    }
    
}

class point
{
    point()
    {
        System.out.println("Parent Class: Point Class");
    }
}

class T_point extends point
{

    public T_point() {
        System.out.println("CHILD CLASS: T_point");
    }
    
}
