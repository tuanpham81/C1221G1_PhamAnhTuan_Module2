package bai_tap_lam_them.quan_ly_san_pham_test.services;

import bai_tap_lam_them.quan_ly_san_pham_test.utils.NotFoundProductException;

public interface ProductService {
    void display();
    void delete() throws NotFoundProductException;
    void searchByName(String searchName);
    void searchByCode(String searchCode);
}
