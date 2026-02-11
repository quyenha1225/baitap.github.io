/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bai_1;


public class Main {

    public static void main(String[] args) {
       WorkerThread wkt = new WorkerThread();
       wkt.start();
       
       WorkerRunnabl wrble = new WorkerRunnabl();
       Thread ThredRunable = new Thread(wrble);
       ThredRunable.start();
       
    }
}
