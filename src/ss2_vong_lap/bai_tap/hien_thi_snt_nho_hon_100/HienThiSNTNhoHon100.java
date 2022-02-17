package ss2_vong_lap.bai_tap.hien_thi_snt_nho_hon_100;

public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(num + "\n");
            }
            num++;
        }
    }
}
