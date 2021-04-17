package Tugas;
public class nomor_2 {
     public static void Bubblesort(int[] A){
        int i = 1, j, n = A.length;
        int temp;
        while(i < n){
            j = n-1;
            while(j >= 1){
                if(A[j - 1] > A[j]){
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        System.out.println("Nama : Rizqon Fadillah");
        System.out.println("NIM : 20090140");
        System.out.println("Kelas : 2B");
        System.out.println();
        int A[] = {25, 7, 9, 13, 3};
        nomor_2.tampil(A);
        nomor_2.Bubblesort(A);
        nomor_2.tampil(A);    
    }
}
