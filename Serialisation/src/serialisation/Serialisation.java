/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j378491
 */
public class Serialisation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c = new Course();
        c.name = "java Progamming";
        c.type = "Programming";
        c.code = "JPL2";
        c.score = 60;
        SerialData(c);
        displayData(c);
    }
    
    public static void SerialData(Course c){
        try{
            try (FileOutputStream fileout = new FileOutputStream("C:/Users/j378491/Documents/NetBeansProjects/Serialisation/Save Files/Hello World.txt"); 
                ObjectOutputStream out = new ObjectOutputStream(fileout)) 
            {
                out.writeObject(c.type + c.name + c.code + c.score);
                out.close();
            }
        System.out.printf("Saved");
        }
        catch(IOException i){
        }
        }
    
    public static Course deSerialzeData(Course c){
    try{
        FileInputStream fileIn = new FileInputStream("C:/Users/j378491/Documents/NetBeansProjects/Serialisation/Save Files/Hello World.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        c = (Course) in.readObject();
        in.close();
        fileIn.close();
        displayData(c);
    }
    catch(IOException i){
        
    }   
    catch (ClassNotFoundException ex) {
            Logger.getLogger(Serialisation.class.getName()).log(Level.SEVERE, null, ex);
        }
    return c;
    }
    
    public static void displayData(Course c){
    System.out.printf("DeSerialized course Details....");
    System.out.print("Name: " + c.name);
    System.out.print("Type: " + c.type);
    System.out.print("Code: " + c.code);
    System.out.print("Score: " + c.score);
    }
    }
