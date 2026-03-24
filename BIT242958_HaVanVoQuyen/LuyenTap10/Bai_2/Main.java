
package Bai_2;
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter("vlc");
        player.play("vlc", "top1.vlc");
    }
}