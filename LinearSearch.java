//linear search is searching algorithm
// arr=[12,14,43,15,36,65,32] and search 65 in given arr
// indexing start from 0 itself so 65 found at 5th index else return -1
import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        int arr[]={12,14,43,15,36,65,32};
        int x=65;
        int ans=linearsearch(arr,x);
        System.out.println(ans);
    }
    static int linearsearch(int arr[],int x){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}


// alternate without using any function
class LinearSearch{
    public static void main(String[] args){
        int arr[]={12,23,24,34,35,46,57};
        int x=24;
        boolean found =false;
        if(arr.length==0){
            System.out.println(-1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                found=true;
                System.out.println(i);
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}




// Using string data typeee

class LinearSearch{
    static int  linearisstring(String name , char x){
        if(name.length()==0){
            return -1;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String name="UdayKumar";
        char x='y';
        int ans = linearisstring(name,x);
        System.out.println(ans);
    }
}

//search in range

class LinearSearch{
    static int searchinrange(int arr[],int x,int start,int end ){
        //in range [1,4]
        for(int i=start;i<=end;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={12,23,24,25,26,37,68,59};
        int x=68; //in range [1,4]
        // 68 is in arr but doesnot lies in range[1,4]
        System.out.println(searchinrange(arr,x,1,3));
    }
}

//Searching in 2D array

class LinearSearch {

    static int[] search2D(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 80;

        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}



//leetcode problemmm
//1295 questionn

class LinearSearch{
    public static int findNumbers(int nums[]){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            String s = Integer.toString(nums[i]);
            if(s.length()%2==0){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int nums[]={12,345,4321,45,6,7,908765};
        System.out.println(findNumbers(nums));
    }
}


