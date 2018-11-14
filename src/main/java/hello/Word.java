/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author pbabar
 */
public class Word {
    private String word;
    private Boolean palindrome;
    private Boolean anagramOfPalindrome;
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Boolean getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(Boolean palindrome) {
        this.palindrome = palindrome;
    }

    public Boolean getAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

    public void setAnagramOfPalindrome(Boolean anagramOfPalindrome) {
        this.anagramOfPalindrome = anagramOfPalindrome;
    }

    
}
