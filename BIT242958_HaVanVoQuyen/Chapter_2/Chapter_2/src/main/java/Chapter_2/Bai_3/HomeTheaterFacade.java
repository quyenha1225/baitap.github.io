/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2;


/**
 *
 * @author Asus
 */
public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    public HomeTheaterFacade(){
        tv =new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
    }
    public void WatchMovie(){
        tv.on();
        sound.on();
        dvd.on();
                System.out.println("Sẵn sàng xem phim tại gia");

    }
}
