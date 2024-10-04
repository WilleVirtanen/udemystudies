package day7;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementInArray {
    public static void main(String[] args) {
        //Sorting int
        int a[]={100,300,200,700,500};

        System.out.println("before sorting: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting"+Arrays.toString(a));
    
        String b[]={"g","c","b","a"};
        System.out.println("Before sorting "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After sorting: "+Arrays.toString(b));
        //Bubblesort
        int c[]={4,2,1,5,3};
        System.out.println("Before sorting: "+Arrays.toString(c));

        
        for (int i=0; i<c.length-1;i++)
        {
            for (int j=0;j<c.length-1;j++) 
            {
                if(c[j]>c[j+1])
                {
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
            
        }
        System.out.println("After bubblesort: "+Arrays.toString(c));

        //Parallelsort
        int d[]={30,10,45,200,1,87};
        System.out.println(Arrays.toString(d));
        Arrays.parallelSort(d);
        System.out.println(Arrays.toString(d));
    
        //reverse sort
        Integer e[]={34,4,56,70,21,5,6,800,6,12};
        System.out.println(Arrays.toString(e));
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));
        Arrays.sort(e,Collections.reverseOrder());
        System.out.println(Arrays.toString(e));
    
        int f[]={10,20,30,50,40};
        for(int i=f.length-1;i>=0;i--)
        {
            System.out.println(f[i]);
        }
        int i=f.length-1;
        while(i>=0)
        {
            System.out.println(f[i]);
            i--;
        }
    
    
    }

}
