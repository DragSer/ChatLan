package filters;

import java.util.ArrayList;
import java.util.List;

public class ChairOnlyFilter implements ChatFilter {

    @Override
    public String filter(String message) {
        List<String> censoredList = new ArrayList<String>();
        censoredList.add("мазафака");
        censoredList.add("факеншит");
        censoredList.add("редиска");

        for (String word: censoredList) {
            message = message.replaceAll(word, "плохой");
        }

        return message;
    }


}
