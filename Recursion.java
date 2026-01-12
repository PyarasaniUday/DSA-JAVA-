package recursion;
/*public class Recursion {
    public static void main(String[] args){
       //single funtion need to get all output.
        mes();
    }
    static void mes(){
        System.out.println("UDAY");
        mes();
    }
    static void mes1(){
        System.out.println("UDAY");
        mes2();
    }
    static void mes2(){
        System.out.println("UDAY");
        mes3();
    }
    static void mes3(){
        System.out.println("UDAY");
        mes4();
    }
    static void mes4(){
        System.out.println("UDAY");
    }
}
*/
 
//number using recursion
/* 
class Recursion {
    public void main(String[] args){
        print(10);
    }
    static void print(int n){
        if(n==100){
            return;
        }
        System.out.println(n);
        print(n+1);
        
    }
    
}
*/

//fibonaccis number 
//0 1 1 2 3 5 8 13 21 soooo.....
/* 
class Recursion{
    public static void main(String[] args){
        fib(8);
        System.out.println(fib(8));
    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }
}

*/

//sum of digits
/* 
class Recursion {
    static int sumDigits(int n) {
        if (n == 0){
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
}
*/
//Binary search 
/* 
class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, 0, nums.length-1, target);
    }

    int bs(int[] a, int l, int r, int t) {
        if (l > r) return -1;
        int mid = l + (r-l)/2;
        if (a[mid] == t) return mid;
        if (t < a[mid]) return bs(a, l, mid-1, t);
        return bs(a, mid+1, r, t);
    }
}
*/

// n to 1 numbers 
/* 
class Recursion{
    public static void main(String[] args){
        num(10);
       // System.out.print(num(10));
    }
    static void num(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
}
*/
// factorial 
/*  
class Recursion{
    public static void main(String[] args){
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
} 
*/

//product of digits 
/* 
class Recursion{
    public static void main(String[] args){
        System.out.println(num(12345));
    }
    static int num(int n){
        if(n==1){
            return 1;
        }
        return n%10 * num(n/10);
    }
}   
*/

//reverese a number 
/* 
class Recursion{
    public static void main(String[] args){
        num(12345);
        System.out.print(sum);
        
    }
    static int sum=0;
    static void  num(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum=sum*10+rem;
        num(n/10);
    }
}   
*/
//palindrome 
/*
class Recursion{
    public static void main(String[] args){
        num(121);
        System.out.print(sum);
        
    }
    static int sum=0;
    static void  num(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum=sum*10+rem;
        num(n/10);
        if(sum==n){
            System.out.println("palindrome");
        }
    }
}   
*/

//count Zeros 

class Recursion{
    public static void main(String[] args){
        int res=count(20102);
        System.out.println(res );
    }
    static int count (int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}   