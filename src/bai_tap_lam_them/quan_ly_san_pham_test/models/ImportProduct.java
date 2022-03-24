package bai_tap_lam_them.quan_ly_san_pham_test.models;

public class ImportProduct extends Product {
    private String importPrice;
    private String importProvince;
    private String importTax;

    public ImportProduct() {
    }

    public ImportProduct(String importPrice, String importProvince, String importTax) {
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public ImportProduct(int id, String code, String name, String price, String quantity, String manufacturer, String importPrice, String importProvince, String importTax) {
        super(id, code, name, price, quantity, manufacturer);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public String getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(String importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public String getImportTax() {
        return importTax;
    }

    public void setImportTax(String importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", importPrice=" + importPrice +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }

    @Override
    public String getInfoToCSV(){
        return this.id+","+this.code+","+this.name+","+this.price+","+this.quantity+","+this.manufacturer+","+
                this.importPrice+","+this.importProvince+","+this.importTax;
    }
}
