
import java.util.Arrays;
import java.util.Scanner;

public class BinaryCode{

	public static void main(String[] args )
	{
		Scanner input = null;
				
		try{
		input = new Scanner(System.in);
		
		System.out.println("Please enter a encrypted string for the binomial string ");
		
		String encryptedString = input.nextLine();
		String decryptedString1 = null;
		String decryptedString2 = null;
		
		//String[] encArray = new String[] {encryptedString};
		int[] encArray = new int[encryptedString.length()];
		int[] decArray = new int[encryptedString.length()];
		//int temp = 0;
		for(int i=0;i<encArray.length;i++){
			encArray[i] = Character.digit(encryptedString.charAt(i), 10);
		}
		
			
		for(int i=0;i<encArray.length;i++){
			
			if(encArray.length == 1 && encArray[i] > 1){
				System.out.println("here1");
				decryptedString1 = "NONE";
				//decryptedString2 = "NONE";
				break;
			}
			
			if(encArray.length == 1 && encArray[i] == 1){
				System.out.println("here2");
				decryptedString1 = "1";
				//decryptedString2 = "1";
				break;
			}
			decArray[0]=0;
			
			//System.out.println("the read string is "+encArray[i]);
			/*if(i == 0){
				decArray[1] = encArray[0];
				
				if (decArray[1]>1 || decArray[1]<0) {
					System.out.println("here3");
					decryptedString1 = "NONE";
					break;
				}
			}*/
			if(i>0){
				if (i ==1)
					decArray[1] = encArray[0]-decArray[0];
					
					if(i < decArray.length-1){
						System.out.println("The value of enc i is "+encArray[i]);
						System.out.println("The value of dec i is "+decArray[i]);
						System.out.println("The value of dec i-1 is "+decArray[i-1]);
					decArray[i+1] = encArray[i]- decArray[i] - decArray[i-1];
					System.out.println("The value of dec i+1 is now "+decArray[i+1]);
					if (decArray[i+1] > 1 || decArray[1]<0){
						//System.out.println("The value of enc i is "+encArray[i]);
						//System.out.println("The value of dec i is "+decArray[i]);
						//System.out.println("The value of dec i-1 is "+decArray[i-1]);
						System.out.println("here4");
						decryptedString1 = "NONE";
						break;
					}
					}
			}
			
			decryptedString1 = Arrays.toString(decArray);
			
			
		}
		//System.out.println("The value of decrypted string is "+decryptedString1);
		for(int i=0 ;i < encArray.length && i < decArray.length;i++){
			if(encArray.length == 1 && encArray[i] > 1){
				//decryptedString1 = "NONE";
				System.out.println("here5");
				decryptedString2 = "NONE";
				break;
			}
			
			if(encArray.length == 1 && encArray[i] == 1){
				//decryptedString1 = "1";
				decryptedString2 = "1";
				break;
			}
			System.out.println("the read string is "+encArray[i]);
			decArray[0]=1;
			
			//System.out.println("the read string is "+encArray[i]);
			/*if(i == 0){
				decArray[1] = encArray[0];
				
				if (decArray[1]>1 || decArray[1]<0) {
					System.out.println("here1");
					decryptedString2 = "NONE";
					break;
				}
			}*/
			if(i>0){
					if (i ==1)
						decArray[1] = encArray[0]-decArray[0];
						
					System.out.println("The value of enc i is "+encArray[i]);
					System.out.println("The value of dec i is "+decArray[i]);
					System.out.println("The value of dec i-1 is "+decArray[i-1]);
					
					if(i < decArray.length-1){
						decArray[i+1] = encArray[i]- decArray[i] - decArray[i-1];
						System.out.println("The value of dec i+1 is "+decArray[i+1]);
						if (decArray[i+1] > 1|| decArray[i+1]<0){
							decryptedString2 = "NONE";
							break;
						}
						}
			}
			
			decryptedString2 = Arrays.toString(decArray);
			
		}
		
		System.out.println("The possible values of original string are"+decryptedString1+" and " +decryptedString2);
		
		}
		
		finally {
			if(input!=null)
			input.close();
			}
		
	}
}
