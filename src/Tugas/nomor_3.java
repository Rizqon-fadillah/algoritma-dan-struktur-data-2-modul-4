package Tugas;
public class nomor_3 {
    public static void Selection(int A[]){
        int smallIndeks;
        int pass, j, n = A.length;
        int temp;
        
        
        for(pass = 0; pass < n - 1; pass++){
            smallIndeks = pass;
            for(j = pass + 1; j < n; j++){
                if(A[j] < A[smallIndeks]){
                    smallIndeks = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallIndeks];
            A[smallIndeks] = temp;
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
        nomor_3.tampil(A);
        nomor_3.Selection(A);
        nomor_3.tampil(A);
    }
}
