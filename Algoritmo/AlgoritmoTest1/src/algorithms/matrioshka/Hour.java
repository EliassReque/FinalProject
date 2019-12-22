package algorithms.matrioshka;

import users.data.Message;

public class Hour{
    //Variables para almacenar los conteos
    private int messageCount;
    private int wordCount;
    private int charCount;
    
    public Hour(){
        messageCount = 0;
        wordCount = 0;
        charCount = 0;
    }
    
    public void addCount(Message mess, int wordValue, int charValue){
        messageCount++;
        addWordCount(wordValue);
        addCharCount(charValue);
        //minute[mess.getMinuto()].addCount(mess, charValue, wordValue);
    }
    //Metodos para la propia clase Hora (Hour[] hours)
    public int getMessageCount(){
        return messageCount;
    }
    public int getWordCount(){
        return wordCount;
    }
    private void addWordCount(int wordCount){
        this.wordCount += wordCount;
    }
    public int getCharCount(){
        return charCount;
    }
    private void addCharCount(int charCount){
        this.charCount += charCount;
    }
}
