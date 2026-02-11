package Bai_3;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
public class Bai_3{
    public static void main(String []args){
           CompletableFuture 
                   .supplyAsync(()->{
                       int[] arr = {1,2,5,3,100};
                       return arr;
                   })
                   // lọc số lẻ
                   .thenApply(arr->{
                     int count = 0 ; 
                     for(int i = 0 ; i < arr.length;i++){
                        if(arr[i]%2!=0){
                            count++;
                        }
                     }
                     int[] oddArr = new int[count];
                     int index = 0 ;
                     for(int i = 0 ; i < arr.length;i++){
                         if(arr[i]%2 != 0 ){
                             oddArr[index++] = arr[i];
                         }
                     }
                     // sap xep tang dan
                     for(int i = 0 ; i < oddArr.length-1;i++){
                         for(int j = i+1 ; j < oddArr.length;j++){
                             if(oddArr[j]>oddArr[j+1]){
                                 int tp = oddArr[j];
                                 oddArr[j] =oddArr[j+1];
                                 oddArr[j+1] = tp;
                             
                             }
                         }
                     }
                     return oddArr;
                   });
        
    }
}