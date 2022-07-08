package calc;
import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
	int vCount = 0;
	int cCount = 0;
	
Scanner input = new Scanner(System.in);
System.out.println("Please enter a sentence.");
String sentence = input.nextLine();

for (int i = 0; i < sentence.length(); i++) {
	char ch = sentence.charAt(i);
    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
    	vCount ++;
    } else {
    	cCount ++;
    }
}
System.out.println("Number of vowels in the given sentence is "+vCount);
System.out.println("Number of const in the given sentence is "+cCount);
int total = vCount + cCount;
System.out.println("Total letters is "+total);

	}

}
