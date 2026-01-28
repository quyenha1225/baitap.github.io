/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2;

/**
 *
 * @author Asus
 */
public class DatabaseConnection {
    private static DatabaseConnection instance; 
    private DatabaseConnection(){
        System.out.println("KẾT NỐI DATABASE ĐƯỢC TẠO");
    }
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Connection suscess");
    }
}
