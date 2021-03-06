package sortalgos;

import mainsort.Sort;

public class Merge extends Sort
{
    int a[],h[],l=0;
    public Merge()
    {
        this.a=super.a;
        l=a.length;
        h=new int[l];
    }

    public void sort()
    {
        mergesort(0,l-1);
    }
    void mergesort(int low, int high)
    {
        if(low < high)
        {
            int middle = (low+high)/2;
            mergesort(low,middle);
            mergesort(middle+1,high);
            merge(low,middle,high);
        }
    }
    void merge(int low, int middle, int high)
    {
        for(int i=low;i<=high;i++)
            h[i]=a[i];
        int i=low,j=middle+1,k=low;
        while(i<=middle && j<=high)
        {
            if(h[i]<=h[j])
                a[k++]=h[i++];
            else
                a[k++]=h[j++];
        }
        while(i<=middle)
            a[k++]=h[i++];
    }
}
