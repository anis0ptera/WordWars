package wordwars;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;


public class Word {
	public static void main (String[] args) {
		String nm = new String("default");
		System.out.println(nm);
	}

	String name = new String();
	int length = name.length();
	int syllable_count = 0;

	public Word(){
		name = "default";
		length = name.length();
		syllable_count = syllableCount(name);
	}

	public Word(String iname){
		name = iname;
		length = name.length();
		syllable_count = syllableCount(name);
	}

	public void update(String upname){
		name = upname;
		length = name.length();
	}

	private boolean isVowell(String word, int position, boolean isLast){

		String letter = new String(word.substring(position, position+1));
		String pattern = new String();

		if (isLast)
		{	pattern = "[aiouyAIOUY]";}
		else
		{	pattern = "[aeiouAEIOU]";}

		Pattern rep = Pattern.compile(pattern);
		Matcher mtch = rep.matcher(letter);

		if (mtch.find( ))
		{
			//System.out.println("Found value: " + mtch.group(0) );
			return true;
		}
		else
		{	return false;	}
	}

	public int syllableException(String word){

		//String[] suffix = {"ism", "able"};
		String[] suffix = {"ism"};
		String[] pairing = {"ae","ia","io" };
		int retval = 0;

		for (int six = 0; six<suffix.length; six++)
		{
			if (word.endsWith(suffix[six]))
			{retval++; break;}
		}

		for (int pix = 0; pix<pairing.length; pix++)
		{
			if (word.contains(pairing[pix]))
			{retval++;}
		}

		if (word.charAt(word.length()-1)=='e' &&
			!this.isVowell(word,word.length()-2,false) &&
			//!this.isVowell(word,word.length()-3,false) &&
			!this.isVowell(word,word.length()-3,false))
				{retval++;}

		if (word.endsWith("tion"))
		{retval--;}

		return retval;
	}

	public int syllableCount(String word){

		int sylcount = 0;

		for (int position = 0; position<word.length()-1; position++)
		{
			//System.out.println(this.isVowell(word,position,false));
			//System.out.println(this.isVowell(word,position+1,false));
			if (this.isVowell(word,position,false) && !this.isVowell(word,position+1,false))
			{
				//System.out.println("target");
				sylcount++;
			}
		}
		if (this.isVowell(word,word.length()-1,true))
		{
			//System.out.println("ltarget");
			sylcount++;
		}
		return sylcount + this.syllableException(word);
	}
}