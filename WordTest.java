package wordwars;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;

public class WordTest {
	public static void main (String[] args) /*throws Exception*/ {

		Word wo = new Word();
		System.out.println(wo.name);
		System.out.println(wo.length);
		System.out.println(wo.syllable_count);

		wo.update("Cherry");
		System.out.println(wo.name);
		System.out.println(wo.length);
		System.out.println(wo.syllable_count);

		Word wrd = new Word("Raspberry");
		System.out.println(wrd.name);
		System.out.println(wrd.length);
		System.out.println(wrd.syllable_count);

		System.out.println("Table");
		System.out.println(wo.syllableCount("Table"));
		//System.out.println(wo.syllableCount("Abominable"));
		//System.out.println(wo.syllableCount("Abbreviation"));
		//System.out.println(wo.syllableException("Abominable"));

		Noun def = new Noun();
		System.out.println(def.name);
		System.out.println(def.length);
		System.out.println(def.syllable_count);
		System.out.println(def.plural);

		Noun thing = new Noun("Cherry");
		System.out.println(thing.name);
		System.out.println(thing.length);
		System.out.println(thing.syllable_count);
		System.out.println(thing.plural);

		Noun fruit = new Noun("Bible");
		System.out.println(fruit.name);
		System.out.println(fruit.length);
		System.out.println(fruit.syllable_count);
		System.out.println(fruit.plural);

		if (1>1){
      String thisLine = null;
      try{
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader("C:/Program Files/Java/jdk1.8.0_73/code/wordwars/wordlist.csv"));
         while ((thisLine = br.readLine()) != null) {
            System.out.print(thisLine);
            System.out.println(wo.syllableCount(thisLine));
         }
      }catch(Exception e){
         e.printStackTrace();
      }
  }
	}
}