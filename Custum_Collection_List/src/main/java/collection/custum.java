package collection;

public class custum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 list<Integer> List = new list<Integer>();
		 
	        //Add elements
	        List.addele(1);
	        List.addele(2);
	        List.addele(3);
	        List.addele(4);
	        List.addele(5);
	        List.addele(6);
	        List.addele(7);
	        List.addele(8);
	        List.addele(9);
	        List.addele(10);
	        List.addele(11);
	        List.addele(12);
	        
	        System.out.println(List);
	         
	        //Remove elements from index
	        List.removeele(6);
	        System.out.println(List);
	         
	        //Get element with index
	        System.out.println( List.getele(0) );
	        System.out.println( List.getele(1) );
	 
	        //List Size
	        System.out.println(List.size());

	}

}
