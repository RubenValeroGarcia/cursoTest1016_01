package main.practica2.test;

/**
 * Created by rvalero on 28/05/15.
 */
import java.security.InvalidParameterException;

public class Encriptor {

  public String cryptWord(String word) {
    if (word.contains(" "))
      throw new InvalidParameterException();

    char[] w = word.toCharArray();
    String s = "";
    for (int i = 0; i < word.length(); i++) {
      int c = w[i];
      s += String.valueOf((char)( c + 2));
    }

    return s;
  }

  public String cryptWordToNumbers(String word) {
    if (word.contains(" "))
      throw new InvalidParameterException();

    char[] w = word.toCharArray();
    String s = "";
    for (int i = 0; i < word.length(); i++)
    {
      int c = w[i];
      s += String.valueOf(c + 2);
    }

    return s;
  }

  public String cryptWord(String word, String charsToReplace) {
    if (word.contains(" "))
      throw new InvalidParameterException();

    char[] w = word.toCharArray();
    char[] c1 = charsToReplace.toCharArray();
    char[] c2 = w.clone();
    for (int i = 0; i < w.length; i++)
    {
      for (int j = 0; j < c1.length; j++)
      {
        if (c1[j] == w[i])
        {
          int charValue = w[i];
          c2[i] = (char)( charValue + 2);
        }
      }
    }
    return String.valueOf(c2);
  }

  public String cryptSentence(String sentence) {
    char[] sentenceArray = sentence.toCharArray();
    String newWord = "";
    for (int i = 0; i < sentence.length(); i++)
    {
      int charValue = sentenceArray[i];
      newWord += String.valueOf((char)( charValue + 2));
    }

    return newWord;
  }

  public String[] getWords(String sentence) {
    return sentence.split(" ");
  }

  public void printWords(String sentence) {
    String[] words = getWords(sentence);
    for (String word : words)
    {
      System.out.print("<" + word + ">");
    }
  }

}