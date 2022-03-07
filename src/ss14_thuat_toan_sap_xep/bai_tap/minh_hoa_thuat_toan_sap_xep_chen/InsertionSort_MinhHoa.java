package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSort_MinhHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        boolean needNextPass = false;
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i]; // lấy ra phần tử thứ i
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Move " + list[pos-1] + " forward");
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--; //tiếp tục duyệt các phần tử phía trước

                needNextPass = true;
            }
            list[pos] = x; //gán biến temp

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
