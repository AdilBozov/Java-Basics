import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class Problem_9_ListOfProducts 
{
	public static void main(String[] args)
	{
		ArrayList<Product> products = new ArrayList<>();
		
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("D:\\Soft\\JAVA\\LoopsMethodsClasses\\src\\ListInput.txt"));;
			File fileProducts = new File("D:\\Soft\\JAVA\\LoopsMethodsClasses\\src\\ListOutput.txt");
			fileProducts.createNewFile();
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("D:\\Soft\\JAVA\\LoopsMethodsClasses\\src\\ListOutput.txt"));
			
			while(true){
				String line = fileReader.readLine();
				if(line == null){
					fileReader.close();
					break;
				}
				
				String[] input = line.split(" ");
				products.add(new Product(input[0], new BigDecimal(input[1])));
			}
			
			Collections.sort(products);
			
			for (Product product : products){
				System.out.println(product.getPrice() + " " + product.getName());
				fileWriter.write(product.getPrice() + " " + product.getName());
				fileWriter.newLine();
			}
			
			fileWriter.close();
		} catch (IOException e){
			System.out.println("Error");
		}
	}
}

class Product implements Comparable<Product>{
	
	private String name;
	private BigDecimal price;
	
	public Product(String name, BigDecimal price){
		this.name  = name;
		this.price = price;
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(){
		this.name = name;
		
	}
	
	public BigDecimal getPrice(){
		return price;
		
	}
	
	public void setPrice(){
		this.price = price;
		
	}
	
	public int compareTo(Product compareProduct){
		BigDecimal copmarePrice = ((Product)compareProduct).getPrice();
		return this.price.compareTo(copmarePrice);
				
	}
	
}