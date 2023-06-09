package salt.mmmjjkx.tcapi.test;

import salt.mmmjjkx.titlechanger.api.TCTitleReplacer;

import java.util.Collections;
import java.util.List;

public class Example implements TCTitleReplacer {
    /*
     * This is an example of TCTitleReplacer.
     * You should register at "entrypoints" in fabric.
     * In Forge, use 'TCTitleForgeReplacerManager.register' to register the replacer.
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
    public List<String> variables() {
        return Collections.singletonList("example");
    }
}
