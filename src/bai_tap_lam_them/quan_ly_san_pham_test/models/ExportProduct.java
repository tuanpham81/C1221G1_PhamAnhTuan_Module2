package bai_tap_lam_them.quan_ly_san_pham_test.models;

public class ExportProduct extends Product{
    private String exportPrice;
    private String importCountry;

    public ExportProduct() {
    }

    public ExportProduct(String exportPrice, String importCountry) {
        this.exportPrice = exportPrice;
        this.importCountry = importCountry;
    }

    public ExportProduct(int id, String code, String name, String price, String quantity, String manufacturer, String exportPrice, String importCountry) {
        super(id, code, name, price, quantity, manufacturer);
        this.exportPrice = exportPrice;
        this.importCountry = importCountry;
    }

    public String getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(String exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getImportCountry() {
        return importCountry;
    }

    public void setImportCountry(String importCountry) {
        this.importCountry = importCountry;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", exportPrice=" + exportPrice +
                ", importCountry='" + importCountry + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV(){
        return this.id+","+this.code+","+this.name+","+this.price+","+this.quantity+","+this.manufacturer+","+
                this.exportPrice+","+this.importCountry;
    }
}
