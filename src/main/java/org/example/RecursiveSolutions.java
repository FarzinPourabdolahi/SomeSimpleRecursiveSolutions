package org.example;

public class RecursiveSolutions {

    public int factorial(int n){
        if(n==0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public int fibonacci(int index){
        if(index==0)
            return 0;
        else if(index==1)
            return 1;
        else
            return fibonacci(index-1)+fibonacci(index-2);
    }

    public boolean isPalindorme(String s){
        if(s.length()<=1)
            return true;
        else if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return isPalindorme(s.substring(1,s.length()-1));
    }

    public void selectionSort(double[] list, int low, int high){
        if(low < high){
            int indexOfMin = low;
            double min = list[low];
            for(int i = low + 1; i<=high; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;

            selectionSort(list, low + 1, high);
        }
    }
}
