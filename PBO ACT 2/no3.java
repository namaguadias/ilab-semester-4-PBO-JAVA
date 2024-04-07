public static int alternatingSum(int[] arr) {

    int sum = 0;

    int sign = 1;

 

    for (int i = 0; i < arr.length; i++) {

        sum += sign * arr[i];

        sign = -sign;

    }

    return sum;

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */