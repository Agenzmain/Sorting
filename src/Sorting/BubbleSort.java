package Sorting;
public class BubbleSort {
	static void BubbleSort(int[] X) {  
        int n = X.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(X[j-1] > X[j]){  
                                 //swap elements  
                                 temp = X[j-1];  
                                 X[j-1] = X[j];  
                                 X[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X[] ={10,29,74,56,96,4};  
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < X.length; i++){  
                System.out.print(X[i] + " ");  
        }  
        System.out.println();  
          
        BubbleSort(X);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < X.length; i++){  
                System.out.print(X[i] + " ");  
        }  

}  

	}