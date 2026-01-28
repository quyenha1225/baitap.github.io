/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2;
;

/**
 *
 * @author Asus
 */
public class Facade {

    public static void run() {
        System.out.println("Dang chay bai Facade");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.WatchMovie();
    }
}
