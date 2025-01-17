package com.ECOM.POC.Model;

public class Product {

     Long productId;
    String Name;
    String Description;

    String Image;

    String  product_Gallery;

    String Group;

    String Category;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getProduct_Gallery() {
        return product_Gallery;
    }

    public void setProduct_Gallery(String product_Gallery) {
        this.product_Gallery = product_Gallery;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getProduct_type() {
        return Product_type;
    }

    public void setProduct_type(String product_type) {
        Product_type = product_type;
    }

    public Double getSelling_price() {
        return Selling_price;
    }

    public void setSelling_price(Double selling_price) {
        Selling_price = selling_price;
    }

    public int getWarranty_duration() {
        return Warranty_duration;
    }

    public void setWarranty_duration(int warranty_duration) {
        Warranty_duration = warranty_duration;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Product(Long productId, String name, String description, String image, String product_Gallery, String group, String category, String brand, String unit, String product_type, Double selling_price, int warranty_duration, double tax, String note) {
        this.productId = productId;
        Name = name;
        Description = description;
        Image = image;
        this.product_Gallery = product_Gallery;
        Group = group;
        Category = category;
        Brand = brand;
        Unit = unit;
        Product_type = product_type;
        Selling_price = selling_price;
        Warranty_duration = warranty_duration;
        Tax = tax;
        Note = note;
    }

    String Brand;

    String  Unit;

    String Product_type;

    Double Selling_price;

    int Warranty_duration;

    double Tax;

    String Note;




}