package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int contity;
	String name;
	Double price;
	 public Product(int contity, String name, Float price) {
	}
}
 

public class Program5 {

 public static void main(String[] args) {

	 List<Product> productsList = new ArrayList<Product>();  

     //Adding Products  

     productsList.add(new Product(1,"HP Laptop",25000f));  

     productsList.add(new Product(2,"Dell Laptop",30000f));  

     productsList.add(new Product(3,"Lenevo Laptop",28000f));  

     productsList.add(new Product(4,"Sony Laptop",28000f));  

     productsList.add(new Product(5,"Apple Laptop",90000f));  

     List<Float> productPriceList2 =productsList.stream().filter(p -> p.price > 30000).map(p->p.name).collect(Collectors.toList()); 

     System.out.println(productPriceList2);    
   
 }
 }