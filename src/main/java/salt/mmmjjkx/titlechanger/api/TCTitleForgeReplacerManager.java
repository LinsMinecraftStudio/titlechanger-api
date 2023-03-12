package salt.mmmjjkx.titlechanger.api;

import java.util.ArrayList;
import java.util.List;

public class TCTitleForgeReplacerManager {
    private static final List<TCTitleReplacer> replacers = new ArrayList<>();
    private static final List<TCTitleRealTimeReplacer> realTimeReplacers = new ArrayList<>();
    private static final List<String> names = new ArrayList<>();
    private static final List<String> variables = new ArrayList<>();

    public static void register(TCTitleReplacer replacer){
        replacers.add(replacer);
        names.add(replacer.replacerName());
        variables.addAll(replacer.variables());
    }

    public static void register(TCTitleRealTimeReplacer replacer){
        realTimeReplacers.add(replacer);
        names.add(replacer.replacerName());
        variables.addAll(replacer.variables());
    }

    public static List<TCTitleReplacer> getReplacers() {
        return replacers;
    }
    public static List<TCTitleRealTimeReplacer> getRealTimeReplacers() {
        return realTimeReplacers;
    }
    public static List<String> getReplacerNames() {return names;}
    public static List<String> getReplacersVariables() {return variables;}
}
