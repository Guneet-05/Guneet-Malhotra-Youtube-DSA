import java.io.*;
import java.util.*;

public class Main{

public static void solve(int[] arr,int target) {
    
    int ceil = Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;
    
    int lo = 0;
    int hi = arr.length-1;
    
    while(lo <= hi) {
        int mid = lo + (hi-lo)/2;
        
        if(arr[mid] == target) {
            System.out.println(arr[mid]);
            return;
        } else if(arr[mid] < target) {
            if(arr[mid] > floor) {
                floor = mid;
            }
            lo = mid + 1;
        } else {
            if(arr[mid] < ceil) {
                ceil = mid;
            }
            hi = mid -1;
        }
    }
    
    //ceil
    System.out.println(arr[lo]);
    //floor
    System.out.println(arr[hi]);
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt(); 
    }
    
    int target = scn.nextInt();
    
    solve(arr,target);
 }

}
