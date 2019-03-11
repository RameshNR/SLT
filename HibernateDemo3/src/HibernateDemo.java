
import java.util.Date;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	/**
	 * @param arg
	 */
	public static void main(String arg[])	{
	
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	
	com.Product product=new com.Product();
	
	Scanner scanner=new Scanner(System.in);
	

	System.out.println("Do You Want To Perchase: ");
	System.out.println("=========   Just Press \"YES\" for Purchase   ========== " + "\n");
	String f=scanner.next();	// purchase or not  CONDITION  Input 
	
	String h="yes";		// Pre-Defined User Input
	
	int p;		// Declare the no.of Item's
	
	int i;		// Product ID
	String j; 	// Product NAME
	String k; 	// Product Model
	int l; 		// Product Price

	
if (f.equalsIgnoreCase(h))	{			// Compare Pre-defined Input and USER Input
	
	 System.out.println("\n" + "Enter The No.of Item's ");
	 p=scanner.nextInt();   // no.of Item
	 
	for(int m = 1; m <= p; m++) {
		
		try {
			
			System.out.println("\n" + "Enter The Product ID: ");
			i=scanner.nextInt();
			product.setProductId(i);
	
			System.out.println("Enter The Product Name: ");
			j=scanner.next();
			product.setProductName(j);
	
			System.out.println("Enter The Product Model: ");
			k=scanner.next();
			product.setModel(k);
	
	
			System.out.println("Enter The Product Price: ");
			l=scanner.nextInt();
			product.setPrice(l);		
	
			product.setBirthDate(new Date());
			session.save(product);
			transaction.commit();
			session.close();
			}
	
	
		catch(Exception e) {
					System.out.println("=============    The Given Input Is WRONG    =============");
			}
		
		
		}
		
	
	System.out.println("\n" + "==========    THANK YOU for Your Purchase     ===========");
	
}
	
		else {
		
			System.out.println("\n");
			System.out.println("...........................Thank You............................");
			System.out.println("................We will meet on your next Shopping..............");	
			System.out.println("..................We are Really Waiting for You.................");	
		}
	
	
	}
}
