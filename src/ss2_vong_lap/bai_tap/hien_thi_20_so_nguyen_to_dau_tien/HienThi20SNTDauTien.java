package ss2_vong_lap.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        while (count < 20){
            boolean flag = true;
            if (number < 2){
                flag = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if(number % i == 0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                count++;
                System.out.println(number + "\n");
            }
            number++;
        }
    }
}
