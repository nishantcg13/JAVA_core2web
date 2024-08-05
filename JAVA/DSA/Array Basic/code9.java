/*
    9] Remove an Element at Specific Index from an Array
Given an array of a fixed length. The task is to remove an element at a specific
index from the array.
Examples 1:
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }
Examples 2:
Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }
 */
import java.util.*;
 class remove{
    static void rmv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the index from which you want to remove the element: ");
        int index =sc.nextInt();
        for(int i=0;i<size-1;i++){
            if(i<index){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i+1]);
            }
        }
    }
    public static void main(String[] args) {
        rmv();
    }
 }