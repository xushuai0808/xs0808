package com.xs.test.method;

public class QuickSortPer {
	public static int partition(int []array,int lo,int hi){
        //三数取中
        int mid=lo+(hi-lo)/2;
        if(array[mid]>array[hi]){
            swap(array[mid],array[hi]);
        }
        if(array[lo]>array[hi]){
            swap(array[lo],array[hi]);
        }
        if(array[mid]>array[lo]){
            swap(array[mid],array[lo]);
        }
        int key=array[lo];
        
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
    
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
}
