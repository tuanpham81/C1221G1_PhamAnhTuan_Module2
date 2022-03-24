package bai_tap_lam_them.quan_ly_san_pham_test.Views;

import bai_tap_lam_them.quan_ly_san_pham_test.controllers.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayMainMenu();
    }
}
