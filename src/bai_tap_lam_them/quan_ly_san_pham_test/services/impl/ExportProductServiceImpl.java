package bai_tap_lam_them.quan_ly_san_pham_test.services.impl;

import bai_tap_lam_them.quan_ly_san_pham_test.models.ExportProduct;
import bai_tap_lam_them.quan_ly_san_pham_test.models.Product;
import bai_tap_lam_them.quan_ly_san_pham_test.services.ExportProductService;
import bai_tap_lam_them.quan_ly_san_pham_test.services.ProductService;
import bai_tap_lam_them.quan_ly_san_pham_test.utils.ReadAndWrite;
import case_study_furama.services.impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//làm theo cách tối ưu thêm mới, extends model
public class ExportProductServiceImpl extends ExportProduct implements ExportProductService {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
//        super.setSharedInfo();
        setSharedInfo();
//        int id = generateId();
//        System.out.println("input code");
//        String code = scanner.nextLine();
//        System.out.println("input name");
//        String name = scanner.nextLine();
//        String price = inputFloat("input price");
//        String quantity = inputInt("input quantity");
//        System.out.println("input manufacturer");
//        String manufacturer = scanner.nextLine();
        String exportPrice = ProductServiceImpl.inputFloat("input export price");
        System.out.println("input import country");
        String importCountry = scanner.nextLine();
        Product exportProduct = new ExportProduct(id, code, name, price, quantity, manufacturer, exportPrice, importCountry);
        List<Product> productList = new ArrayList<>();
        productList.add(exportProduct);
        ReadAndWrite.writeProductListToCSV(productList, true);
        System.out.println("Add product successfully");
    }
}
