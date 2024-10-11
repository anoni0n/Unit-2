
package word_games;

/**
 * Name: Brandon Smith (put your name here)
 * Date: 10-10-24 (put date of last revision here)
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordGames
{
    public String word;

    public WordGames(String text)
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
       int index = (int)((this.word.length()/2.0+Math.random()));
       //finds the index of the middle of the word
        String newStart = this.word.substring(index);
        String newEnding = this.word.substring(0,index);
        return newStart+newEnding;

    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        String wordStart = this.word.substring(0,insertIdx);
        String wordEnd = this.word.substring(insertIdx);
        // Insert insertText at the position
        // insertIdx
        return wordStart+insertText+wordEnd;

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int insertIdx = this.word.indexOf(insertChar);
        String wordStart = this.word.substring(0,insertIdx);
        String wordEnd = this.word.substring(insertIdx);
        // Insert insertText at the position
        // insertIdx
        return wordStart+insertText+wordEnd;

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "["+this.word+"]";

    }

}
