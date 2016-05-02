/********************************************************************************************************************************
Zac Hollingsworth
4/20/2016

Interview Cake
https://www.interviewcake.com/question/java/reverse-words

Problem:
You're working on a secret team solving coded transmissions.
Your team is scrambling to decipher a recent message, worried it's a plot to break into a major European National Cake Vault. The message has been mostly deciphered, but all the words are backwards! Your colleagues have handed off the last step to you.

Write a function reverseWords() that takes a string message and reverses the order of the words in-place.

When writing your function, assume the message contains only letters and spaces, and all words are separated by one space.
********************************************************************************************************************************/
public class Decipher {

	public static String reverseWords(String received)
	{
		char[] transcribed = received.toCharArray();
		int rev = transcribed.length-1;
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < transcribed.length/2; i++)
		{
			char temp = transcribed[i];
			transcribed[i] = transcribed[rev];
			transcribed[rev] = temp;
			rev--;
		}
		
		for(int k = 0; k < transcribed.length; k++)
		{
			if(transcribed[k] == ' ')
			{
				end = k-1;
				for(int l = start; l < k/2; l++)
				{
					char temp = transcribed[l];
					transcribed[l] = transcribed[end];
					transcribed[end] = temp;
					end--;
				}
				start = k+1;
			}
		}
		
		
		for(int j = 0; j<transcribed.length; j++)
		{
			System.out.print(transcribed[j]);
		}
		
		return received;
	}
	
	public static void main(String[] args)
	{
		String message = "find you will pain only go you recordings security the into if";
		reverseWords(message);
		
	}
}
