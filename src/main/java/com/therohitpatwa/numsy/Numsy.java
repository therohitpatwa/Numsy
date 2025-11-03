package com.therohitpatwa.numsy;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Numsy {



    public static boolean isEven(int n) {
        return n%2==0;
    }


    public static boolean isOdd(int n) {
        return n%2!=0;
    }

    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }



    public static List<Integer>  primeInRange(int start,int end)
    {
        List<Integer> primes=new ArrayList();
        for(int i=Math.max(2,start);i<=end;i++)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        return primes;
    }




    public static long factorial(int n)
    {
        long result=1;
        int fact=1;
        if(n==0)
            return 1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }



    public static String formatWithCommas(long n)
    {
        return NumberFormat.getNumberInstance(Locale.US).format((n));
    }



    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }


    
    public static int lcm(int a, int b) {
        return Math.abs(a * b)/gcd(a,b);
    }


    public static int noOfDigits(int n)
    {
        int cnt=0;
        while(n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }

}
