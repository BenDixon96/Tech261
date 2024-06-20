package com.sparta.bd;

class CheckForNeighboursKata{

    public static boolean checkForThreeInNeighbours(int[] numberList){
        boolean result = false;
        if (numberList.length < 3){
            return result;
        }
        else {
            for (int index=1; index < numberList.length - 1; index++){
                if(numberList[index] == numberList[index + 1] && numberList[index] == numberList[index -1]){
                    result = true;
                    return  result;
                }
            }
        }
        return result;



    }
}