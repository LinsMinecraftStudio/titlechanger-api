package salt.mmmjjkx.tcapi.test;

import salt.mmmjjkx.titlechanger.api.TCTitleRealTimeReplacer;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Example2 implements TCTitleRealTimeReplacer {
    /*
     * This is an example of TCTitleReplacer.
     * You should register at "entrypoints" in fabric.
     * In Forge, use 'TCTitleForgeReplacerManager.register' to register the replacer.
     */
    @Override
    public String replacerName() {
        return "example2";
    }

    @Override
    public String replace(String title) {
        title = title.replaceAll("%example%", String.valueOf(new Random().nextInt(200)));
        return title;
    }

    @Override
    public String ifPlayerNull(String title) {
        title = title.replaceAll("%example%", "example when player is null");
        return title;
    }

    @Override
    public List<String> variables() {
        return Collections.singletonList("example");
    }
}
