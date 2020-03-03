package service;

// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType

public class PersonalityCalculator{
	public int[] findAnswers(String options) {
		String[] optionsAsStringArray = options.split(",");
		int[] optionsAsIntArray = new int[optionsAsStringArray.length];
		for(int i=0;i<optionsAsStringArray.length;i++) {
			optionsAsIntArray[i]=Integer.parseInt(optionsAsStringArray[i]);
		}
		return optionsAsIntArray;
	}
	
public String findYourBrainType(String options) {
	int[] option = findAnswers(options);
	int x = option[0]+option[1]+option[2]+option[4]+option[7]+option[9]+option[10]+option[11]+option[13]+option[17]+option[19];
	int y = option[3]+option[5]+option[6]+option[12]+option[14]+option[15]+option[16]+option[18];
	int z = 66 - x + y;
	System.out.println("Yor total score "+z);
	if((z>=22)&&(z<=55))
		return "Left-brained ";
	if((z>=56)&&(z<=64))
		return "No clear preference ";
	if((z>=65)&&(z<=100))
         return "Right-brained";
	return "false";	
}
}
