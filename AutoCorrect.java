import java.util.Scanner;
public class AutoCorrect
{
 public static void main(String[] args)
  {
   TextLoader text = new TextLoader("top500words.txt");
   String test = text.getFile();
   Scanner dictionary = new Scanner(test);
   Scanner user = new Scanner(System.in);
   String phrase = "";
   String userIn = "";
   String aBet = "abcdefghijklmnopqrstuvwxyz";
   int STOP = 0;
   System.out.println("Hallo fellow aminalz");
   System.out.println("If the helping is what you needz then a big helping of help you shall get type help for your options");
   userIn = user.nextLine();
   String p1UserIn = "";
   String p2UserIn = "";



   while(dictionary.hasNext()== true && STOP == 0)
    {
     phrase = dictionary.next();
     if(userIn.equalsIgnoreCase(phrase))
     {
       System.out.println("That word is in the dictionary");
       STOP++;
     }

    if(userIn.equalsIgnoreCase("kappa"))
     {
       System.out.println("Raise your kappas in glory to the mighty twitch chat");
     }
    }

	if(dictionary.hasNext()== false && !userIn.equalsIgnoreCase(phrase))
	  	{
				for(int x = 0; x<=phrase.length();)
					  		{
								char dLetter = phrase.charAt(x);
								char uLetter = userIn.charAt(x);
								if(dLetter == uLetter)
									{
										x++;
									}
								while(dLetter != uLetter)
									{
										uLetter = dLetter;
										 p1UserIn = userIn.substring(0,x);
										 p2UserIn = userIn.substring(x);
										System.out.println(p1UserIn);
										//System.out.println(p2UserIn);
										STOP = 1;
										dictionary = new Scanner(test);
									}
							System.out.println("Did you mean " + p1UserIn + dLetter + p2UserIn + "?");
							}

	  	}
	 else System.out.println("That word is not in the dictionary sorry");
		{
   dictionary.close();
   user.close();
		}
}

}