import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao cac phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int array[] = new int[n];
     do {
         System.out.println("1. Nhập giá trị các phần tử mảng");
         System.out.println("2.hiển thị các giá trị phần tử mảng");
         System.out.println("3.in ra gía trị các phần tử là số nguyên tố trong 1 mảng");
         System.out.println("4.in gía trị max các phần tử trong mảng");
         System.out.println("5.in gía trị min các phần tử trong mảng");
         System.out.println("6.sắp xếp mảng giảm dần");
         System.out.println("7.thoát");
         int choice = Integer.parseInt(scanner.nextLine());
         switch (choice){
             case 1:
                 for (int i = 0; i < array.length; i++) {
                     System.out.printf("Gia tri cua phan tu %d la: ",i);
                     array[i] = Integer.parseInt(scanner.nextLine());
                 }
                 break;
             case 2:
                 System.out.println("Mang vua khoi tao: ");
                 for (int i = 0; i < array.length; i++) {
                     System.out.printf("%d\t",array[i]);
                 }
                 System.out.println();
                 break;
             case 3:
             boolean check = false;
             for (int i = 0; i < array.length; i++) {
                 if (array[i]>=2) {
                     for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                         if (array[i] % j == 0) {
                             check = true;
                             break;
                         }
                     }
                     if (!check) {
                         System.out.printf("%d la so nguyen to\n", array[i]);
                     }
                 }
                 continue;
             }
             case 4:
                 for (int i = 0; i < array.length; i++) {
                     System.out.printf("%d\n",array[i]);
                 }int max = array[0];
                 for (int i = 0; i < array.length; i++) {
                     if (max<array[i]){
                         max = array[i];
                     }
                 }System.out.printf("gia tri lon nhat cua mang la \n",max);
                 break;
             case 5:
                 for (int i = 0; i < array.length; i++) {
                     System.out.printf("%d\n",array[i]);
                 }int min = array[0];
                 for (int i = 0; i < array.length; i++) {
                     if (min>array[i]){
                         min= array[i];
                     }
                 }System.out.printf("gia tri nho nhat la :",min);
                 break;
             case 6:
                 for (int i = 0; i < array.length-1; i++) {
                     for (int j = i+1; j <array.length ; j++) {
                         if (array[i]<array[j]){
                             int x = array[i];
                             array[i] = array[j];
                             array[j] = x;
                         }
                     }
                 }
                 System.out.println("Mang sau khi sap xep giam dan la: ");
                 for (int i = 0; i < array.length; i++) {
                     System.out.printf("%d\t",array[i]);
                 }
                 System.out.println();
                 break;
             case 7:
                 System.exit(0);
         }
     }while (true);
    }
}