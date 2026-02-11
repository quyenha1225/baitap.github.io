package Bai_2;

public class CountTask implements Runnable {
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ;i++){
            System.out.print(Thread.currentThread().getName()+ "STT"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
