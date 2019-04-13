package wordwars;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Noun extends Word {

	String plural = new String();

	public Noun(){
		super();
		plural = pluralForm(name);
	}

	public Noun(String iname){
		super(iname);
		plural = pluralForm(name);
	}

	public String pluralForm(String name) {

		String[] suffix = {"s", "z","sh","ch"};

		for (int six = 0; six<suffix.length; six++)
		{
			if (name.endsWith(suffix[six]))
			{plural = name + "es"; break;}
			else
			{plural = name + "s";}
		}

		if (name.endsWith("y"))
		{plural = name.substring(0,name.length()-1) + "ies";}

		return plural;
	}
}
