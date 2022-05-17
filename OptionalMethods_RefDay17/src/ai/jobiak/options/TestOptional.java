package ai.jobiak.options;
import java.util.Optional;

public class TestOptional {
		static void method(String input) {
			if (input != null)
				System.out.println(input.length());
		}

		public static void main(String[] args) {
			String str = null;
			// System.out.println(str.length());
			String str2 = new String("hello");
			// System.out.println(str2.length());
			// method(str)
			// Optional optional1=Optional.of(str);//throws exceptions
			// Optional optional2=Optional.of(str2);
			// System.out.println(optional2.get());

	//Optional optional3=Optional.ofNullable(str);
	//System.out.println(optional3.get());//throws exceptions-No such ele found
	//Optional optional4=Optional.ofNullable(str);
	//System.out.println(optional4.get());

//					Optional optional3=Optional.ofNullable(str);
//					if(optional3.isPresent())					
//					System.out.println(optional3.get());//no Exception thrown

		Optional optional3=Optional.ofNullable(str);				
		System.out.println(optional3.orElse("Alternate String"));
		Optional optional4=Optional.ofNullable(str2);				
		System.out.println(optional4.orElse("Alternate String"));
			
		
	}
}
