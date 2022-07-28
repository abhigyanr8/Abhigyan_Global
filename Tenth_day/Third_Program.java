/*3)

Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of productsin the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price
 */

package Tenth_day;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;


public class Third_Program{

  public static void main(String[] args) {

    List<Product> list=new ArrayList<Product>();

    list.add(new Product(1,"Samsung A5",17000f));

    list.add(new Product(3,"Iphone 6S",65000f));

    list.add(new Product(2,"Sony Xperia",25000f));

    list.add(new Product(4,"Nokia Lumia",15000f));

    list.add(new Product(5,"Redmi4 ",26000f));

    list.add(new Product(6,"Lenevo Vibe",19000f));

    // using lambda to filter data

    Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

    // using lambda to iterate through collection

    filtered_data.forEach(

        product -> System.out.println(product.id+" "+product.name+": "+product.price)

    );

  }

}







