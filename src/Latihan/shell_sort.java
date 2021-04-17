package Latihan;
public class shell_sort {
    public static void shell_sort(int[] arr){
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while(jarak >= 1){
            jarak = jarak / 2;
            sudah = true;
            while (sudah) {
                sudah = false;
                for(j = 0; j < n - jarak; j++){
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        sudah = true;
                }
            }
        }
    }
    }
    
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {12,35,9,11,3,17,23,15,31,20};
        shell_sort.tampil(A);
        shell_sort.shell_sort(A);
        shell_sort.tampil(A);
    }
}