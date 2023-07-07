package salt.mmmjjkx.titlechanger.api;

import java.util.List;

public interface TCTitleReplacer {
    /**
     * The replacer name.
     * @return the name of the replacer
     */
    String replacerName();
    /**
     * If the player is not null, this method will be invoked.
     * @param title the original title
     * @return processed title
     */
    String replace(String title);

    /**
     * The variables that it will be replaced.
     * Don't include the variable char '%'.
     * @return variables
     */
    List<String> variables();
}
