/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author haohe
 */
public class DeliveryPackage {

    /**
     * @param productList the productList to set
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    private int packageId;
    private double packageWeight;
    
    
    private Customer customer;
    private ArrayList<Product> productList;
    
    
    public DeliveryPackage(){
        this.customer = new Customer();
        this.productList= new ArrayList<Product>();
        
    }

    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * @param packageId the packageId to set
     */
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    /**
     * @return the packageWeight
     */
    public double getPackageWeight() {
        return packageWeight;
    }

    /**
     * @param packageWeight the packageWeight to set
     */
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product>productList) {
        this.setProductList(productList);
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Product createProduct(int productId, String productName,Double price){
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        this.getProductList().add(product);
        
        return product;
    }
    
    public Product findProduct(int pid){
        for(Product prod: this.getProductList()){
            if(prod.getProductId()==pid){
                return prod;
            }
        }
        return null;
    }

}
