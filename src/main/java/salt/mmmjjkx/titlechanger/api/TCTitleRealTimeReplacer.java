package salt.mmmjjkx.titlechanger.api;

public interface TCTitleRealTimeReplacer extends TCTitleReplacer{
    /**
     * If the player is null, this method will be invoked.
     * @param title the original title
     * @return processed title
     */
    String ifPlayerNull(String title);
}
