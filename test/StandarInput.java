import java.io.*;

public class StandarInput {

    public static void main (String args[]){

	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = br.readLine()) != null)
		System.out.println(s);
	    
	} catch (IOException ioe){}
    }

}
