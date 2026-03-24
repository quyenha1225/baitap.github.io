
package Bai_2;
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Đang phát file VLC: " + fileName);
    }
}