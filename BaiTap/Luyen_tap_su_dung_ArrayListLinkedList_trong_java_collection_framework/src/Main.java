public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product listofPro= new Product(1,"table",10);
        ProductManager manager= new ProductManager();
        manager.addProduct(1,"table",10);
        manager.addProduct(2,"chair",6);
        manager.addProduct(3,"fan",14);
        manager.addProduct(4,"book",20);

        manager.searchByName("fan");
        manager.updateProduct(2,"Big chair",99);
        manager.displayProduct();
    }
}