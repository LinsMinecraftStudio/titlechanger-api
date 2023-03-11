package salt.mmmjjkx.tcapi.test;

import salt.mmmjjkx.titlechanger.api.TCTitleReplacer;

import java.util.List;

public class Example implements TCTitleReplacer {
    /*
     * This is an example of TCTitleReplacer.
     * You should register at "entrypoints" in fabric.
     * In Forge, use 'TitleChangerForge.register(replacer)' to register the replacer.
     */
    @Override
    public String replacerName() {
        return "test";
    }

    @Override
    public String replace(String title) {
        title = title.replaceAll("%example%","example");
        return title;
    }

    @Override
    public String ifPlayerNull(String title) {
        title = title.replaceAll("%example%","example when player is null");
        return title;
    }

    @Override
    public List<String> variables() {
        return List.of("example");
    }
}
