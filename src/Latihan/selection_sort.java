package Latihan;
public class selection_sort {
    public static void selection_sort(int[] A){
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        for(pass = 0; pass < n - 1; pass++){
            smallindex = pass;
            for(j = pass + 1; j < n; j++){
                if(A[j] < A[smallindex]){
                    smallindex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {100,299,999,1,4,2,8,128,200000};
        selection_sort.tampil(A);
        selection_sort.selection_sort(A);
        selection_sort.tampil(A);
    }
    
}
