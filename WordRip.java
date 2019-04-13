package wordwars;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;


public class WordRip {
	public static void main (String[] args) {
		//String nm = new String("default");
		//System.out.println(nm);
		String thisLine = null;

		Pattern wordnameRE = Pattern.compile("<P><B>(.*)<.B>");
		Pattern posRE = Pattern.compile("\\(<I>(.*)<.I>\\)");
		Pattern defRE = Pattern.compile("\\) (.+)</P>");

      try{
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader("F:/Programs/James/WordWars/wb1913_a_PC.html"));
         while ((thisLine = br.readLine()) != null) {
            //System.out.print(thisLine);
            //System.out.println(wo.syllableCount(thisLine));

            Matcher wordnameMat = wordnameRE.matcher(thisLine);
            Matcher partOfSpeechMat = posRE.matcher(thisLine);
            Matcher definitionMat = defRE.matcher(thisLine);

            if (wordnameMat.find()) {
				String wordname = wordnameMat.group(1);
            	System.out.println(wordname);

			}

            if (partOfSpeechMat.find()) {
	            String partOfSpeech = partOfSpeechMat.group(1);
     	       	System.out.println(partOfSpeech);
			}

            if (definitionMat.find()) {
	            String definition = definitionMat.group(1);
     	       	System.out.println(definition);
			}


         }
      }catch(Exception e){
         e.printStackTrace();
      }

	}
}