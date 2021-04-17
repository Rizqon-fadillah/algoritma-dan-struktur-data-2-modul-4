package Tugas;
public class nomor_1 {
    public static void Insertionsort(int[] A){
        for(int i = 1; i < A.length; i++){
            int key = A[i];
            int j = i-1;
            while((j >=0 && (A[j] > key))){
                
            
            
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        } 
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Nama : Rizqon Fadillah");
        System.out.println("NIM : 20090140");
        System.out.println("Kelas : 2B");
        System.out.println();
        int A[] = {25, 7, 9, 13, 3};
        nomor_1.tampil(A);
        nomor_1.Insertionsort(A);
        nomor_1.tampil(A);
         
    }  
}
