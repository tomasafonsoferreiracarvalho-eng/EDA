package ficha1;

import java.math.BigInteger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class Math {
    // 5N + 4 Complexidade Temporal O(N) Linear
    // num, f, i return 4 vars Complixade Espacial S(1) Constante
    public static long factorialI(int num) {
    int f = 1;                          // 1
    for (int i  = 1; i <= num; i++)     // 1+N+1+N+N 
        f *= i;                         // (1+1)*N = 2N
       return f;                        // 1
    };
    // 5N + 2 Complexidade Temporal o(N) Linear
    //  num, return 2 vars
    // 2 * (N+1) = 2N + 2 vars Complexidade Espacial S(N) Linear
    public static long factorialR(int num) {
    if (num == 0)                       // 1 *(n+1) = (N+1)
        return 1;                       // 1
    else 
        return (num*factorialR(num-1)); // (1+1+1+1) * N = 4N
    };
    
    public static BigInteger factorialBigI(int num) {
        BigInteger f = BigInteger.ONE;
        for(int i = 1; i <= num; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
    
    public static BigInteger factorialBigR (int num) {
        if (num == 0)
            return BigInteger.ONE;
        else 
            return factorialBigR(num-1).multiply(BigInteger.valueOf(num));
    }
    
}
