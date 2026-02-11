package Bai_2;
public class Main {
     public static void main(String []args){
         for(int i = 0 ; i < 5 ; i++){
             Thread thr = new Thread(new CountTask());
             thr.setName("Luồng  "+i);
             thr.start();
         }
     }
}
