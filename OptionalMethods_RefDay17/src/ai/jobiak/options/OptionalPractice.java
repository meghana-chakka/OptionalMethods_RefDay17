package ai.jobiak.options;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class OptionalPractice {
	public static void main(String[] args) {
		String s1=null;
		String str = new String("Hello");
		
		Optional check= Optional.ofNullable(str);  
		 System.out.println("---------isPresent()----------");
	     if(check.isPresent()){  // It Checks, value is present or not  
	         String uppercase = str.toUpperCase();
	         System.out.println(uppercase);  
	     }else  
	         System.out.println("String value is not present");  
	     
	     System.out.println("----------filter()---------------");
	   
	     Optional<String> optional = Optional.of("Hello World");
	     
	     Predicate<String> test = optional1 ->optional1.contains("World");
	     System.out.println(optional.filter(test));
	     System.out.println();
	     
	     Predicate<String> test2 = optional1 ->optional1.contains("Bye");
	     System.out.println(optional.filter(test2));
	     System.out.println();
	     
	     System.out.println(optional.filter(optional1 -> optional1.startsWith("P")));
	    
	     System.out.println("----------map()------------");
	     System.out.println(optional.map(String::toLowerCase));
	    System.out.println();
	    
	     Function<String, String> function =  optional1 ->optional1.substring(0, 4).length() == 0? "length is null" : optional1;
	     System.out.println(optional.map(function));
	     
	     System.out.println("-------isEmpty()--------");
	     System.out.println(optional.isEmpty());
	     System.out.println("-After OfNullable-");
	     
	     optional = Optional.ofNullable(null);
	     System.out.println(optional.isEmpty());

	     System.out.println("------orElse------");
	     String s=null;
	     String opt= Optional.ofNullable(s).orElse("exit");
	     System.out.println(opt);
	 
	}
}
