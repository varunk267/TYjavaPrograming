package String_prog;

/**
 * 
 * @author NITHIN
 *
 */
public class FindTheLeastLengthInString {
	public static void main(String[] args) {
		String s="welcome to india a ";
		//Split the string into string array
		String[] sp = s.split(" ");
		//store the first value in to variable
		String var = sp[0];
		//start the loop from 1st index and compare with other array value
		for(int i=1; i<sp.length; i++){
			//compare the 1st index value with 0th index value 
			if(sp[i].length() < var.length()){
				//if the value is lesser then store it in variable 'var' 
				var=sp[i];
			}
		}
		//print var
		System.out.println(var);
		
	
	}
}
