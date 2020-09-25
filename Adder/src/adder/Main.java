package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
          } catch (ArrayIndexOutOfBoundsException e) {
	            System.err.println("need Arguments");
	  } catch(NumberFormatException e) {
	            System.err.println("need integers or - at beggining");
	  }
    

    private static int addArguments(String[] args) {

	int result = 0;
	
	for(int i = 0; i < args.length; i++){
		result = result + Integer.valueOf(args[i]);
	}

	return result;


    	}
   }
}
