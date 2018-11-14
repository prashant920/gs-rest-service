package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/words")
public class WordController {
    // TODO Implement the /words/{word} endpoint
    @RequestMapping(value = "/{word}")
    public Word getWordAnalysis(@PathVariable(value = "word") String input){
        Word word = new Word();
        WordUtils utils = new WordUtils();
        word.setWord(input);
        word.setAnagramOfPalindrome(utils.isAngram(input));
        word.setPalindrome(utils.isPaliondrome(input));
        return word;
    }
}
