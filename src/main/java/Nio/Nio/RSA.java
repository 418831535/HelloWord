package Nio.Nio;

public class RSA {
	public static void main(String args[]){  
	   int a[]={1,12,3};  
	    int temp=0;  
	    for(int i=1;i<a.length;i++){  
	       int j=i-1;  
	       temp=a[i];   
	       for(;j>=0&&temp<a[j];j--){  
	       a[j+1]=a[j];                       //将大于temp的值整体后移一个单位  
	       }  
	       a[j+1]=temp;  
	    }  
	    for(int i=0;i<a.length;i++)  
	       System.out.println(a[i]);  
	}  
}
