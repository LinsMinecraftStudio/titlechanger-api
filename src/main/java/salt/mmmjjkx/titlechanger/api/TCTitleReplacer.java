package salt.mmmjjkx.titlechanger.api;

import java.util.List;

public interface TCTitleReplacer {
    /*
     * Replacer name.
     */
    String replacerName();
    /*
     * If the player is not null, this method will be executed.
     * @param title
     */
    String replace(String title);

    /*
     * If the player is null, this method will be executed.
     * @param title
     */
    String ifPlayerNull(String title);

    /*
     * Variables
     */
    List<String> variables();
}
