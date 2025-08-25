package Test;

public class example_On_split_text_and_get_part_of_text {

	public static void main(String[] args) {
		

		
		
		
		String t = "(PROV671)\n"
				+ "Ref. customer  :\n"
				+ "Third-party : test jp (Other invoices)\n"
				+ "Project  : PJ2208-0012 - test projet";
		
		
		String prj = t.split("\n") [0];
		
		
		System.out.println(prj);
		

	}

}
