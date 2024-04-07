// [1] Tuliskan definisi method getTotal
public static double getTotal(double[][] arr) {

    double total = 0.0;

    for (int row = 0; row < arr.length; row++) {

        for (int col = 0; col < arr[row].length; col++) {

            total += arr[row][col];

        }

    }

    return total;

}



// [2] Tuliskan definisi method getAverage
public static double getAverage(double[][] arr) {

    double total = getTotal(arr);

    return total / (arr.length * arr[0].length);

}



// [3] Tuliskan definisi method getColumnTotal
public static double getRowTotal(double[][] arr, int row) {

    double total = 0.0;

    for (int col = 0; col < arr[row].length; col++) {

        total += arr[row][col];

    }

    return total;

}


// [4] Tuliskan definisi method getRowTotal
public static double getColumnTotal(double[][] arr, int col) {

    double total = 0.0;

    for (int row = 0; row < arr.length; row++) {

        total += arr[row][col];

    }

    return total;

}

// [5] Tuliskan definisi method getHighestInRow
public static double getHighestInRow(double[][] arr, int row) {

    double highest = arr[row][0];

    for (int col = 1; col < arr[row].length; col++) {

        if (arr[row][col] > highest) {

            highest = arr[row][col];

        }

    }

    return highest;

}


// [6] Tuliskan definisi method getLowestInRow
public static double getLowestInRow(double[][] arr, int row) {

    double lowest = arr[row][0];

    for (int col = 1; col < arr[row].length; col++) {

        if (arr[row][col] < lowest) {

            lowest = arr[row][col];

        }

    }

    return lowest;

}

/* 
    
JOKI BY RINCEMBER 
IG : rincemberr 

:D

 */

