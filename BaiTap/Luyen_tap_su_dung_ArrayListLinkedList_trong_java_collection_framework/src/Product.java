import java.util.ArrayList;

public class Product {
    public int id;
    String name;
    protected double price;
    public Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "ID: "+id+", name: "+name+", price: "+price;
    }
}
class ProductManager {
    private ArrayList<Product> productlist = new ArrayList<>();
    public void addProduct(int id, String name, double price){
        Product newproduct= new Product(id, name, price);
        productlist.add(newproduct);
    }
    public void updateProduct(int targetId, String newName, double newPrice){
        for (Product list: productlist) {
            if (list.id==targetId){
                list.name=newName;
                list.price=newPrice;
            }
//            else {
//                System.out.println("cannot found to update");
//            }
        }
    }
    public void deleteProduct(int targetId){
        for (Product list: productlist) {
            if (list.id==targetId){
                productlist.remove(list);
            }
//            else {
//                System.out.println("cannot found to delete");
//            }
        }
    }
    public void displayProduct(){
        for (Product list:productlist) {
            System.out.println(list);
        }
    }
    public void searchByName(String targetName){
        for (Product list:productlist){
            if (list.name.equals(targetName)){
                System.out.println("Price: "+list.price);
//            } else {
//                System.out.println("cannot found name");
            }
        }
    }

}
