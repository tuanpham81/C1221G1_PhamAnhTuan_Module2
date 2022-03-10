package ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.view;

import ss17_binary_file_vs_serialization.bai_tap.quan_ly_san_pham_nhi_phan.controller.ProductManager;

public class View {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.displayMenu();
    }
}
