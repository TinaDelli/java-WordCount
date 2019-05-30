package wordCount;

public class Words
{
    private String words;

    public Words(String words)
    {
        this.words= words;
    }
    
    public String getWords()
    {
        return words;
    }
    public void setWords(String words)
    {
        this.words= words;
    }

    @Override
    public String toString()
    {
        return "Common Words: " +
                 words + '\'';
    }
}