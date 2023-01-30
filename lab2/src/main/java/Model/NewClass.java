/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author haohe
 */
public class NewClass {
    public static void main(String[] args) {
        // Creating and initializing the ArrayList
        // Declaring object of integer type
       int[] arr=new int[]{1,2,3,4,5,7,8,9,10};

        // Iterating using for loop
        for (int i = 0; i < arr.length; i++){
            if (i%2 ==0){
                System.out.println(arr[i]*=2);
            }else{
                System.out.println(arr[i]*=3);
            }

        }
    }
}




