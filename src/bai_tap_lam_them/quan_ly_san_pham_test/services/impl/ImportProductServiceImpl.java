package bai_tap_lam_them.quan_ly_san_pham_test.services.impl;

import bai_tap_lam_them.quan_ly_san_pham_test.models.ImportProduct;
import bai_tap_lam_them.quan_ly_san_pham_test.models.Product;
import bai_tap_lam_them.quan_ly_san_pham_test.services.ImportProductService;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// làm theo cách thêm mới trùng lặp, extend service cha
public class ImportProductServiceImpl extends ProductServiceImpl implements ImportProductService {
    static Scanner scanner =new Scanner(System.in);

    @Override
    public void addNew() {
        //      setSharedInfo();
        int id = generateId();
        System.out.println("input code");
        String code = scanner.nextLine();
        System.out.println("input name");
        String name = scanner.nextLine();
        String price = inputFloat("input price");
        String quantity = inputInt("input quantity");
        System.out.println("input manufacturer");
        String manufacturer = scanner.nextLine();
        String importPrice = inputFloat("input import price");
        System.out.println("input import province");
        String importProvince = scanner.nextLine();
        String importTax = inputFloat("input import tax");
        Product importProduct = new ImportProduct(id,code,name,price,quantity,manufacturer,importPrice,importProvince,importTax);
        List<Product> productList = new ArrayList<>();
        productList.add(importProduct);
        ReadAndWrite.writeProductListToCSV(productList, true);
        System.out.println("Add product successfully");

    }
}
