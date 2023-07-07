package salt.mmmjjkx.titlechanger.api;

import java.util.ArrayList;
import java.util.List;

public class TCTitleForgeReplacerManager {
    private static final List<TCTitleReplacer> replacers = new ArrayList<>();
    private static final List<TCTitleRealTimeReplacer> realTimeReplacers = new ArrayList<>();
    private static final List<String> replacersNames = new ArrayList<>();
    private static final List<String> realTimeReplacersNames = new ArrayList<>();
    private static final List<String> variables = new ArrayList<>();

    public static void register(TCTitleReplacer replacer){
        if (replacer instanceof TCTitleRealTimeReplacer r) {
            realTimeReplacers.add(r);
            realTimeReplacersNames.add(r.replacerName());
        }
        replacers.add(replacer);
        replacersNames.add(replacer.replacerName());
        variables.addAll(replacer.variables());
    }

    public static List<TCTitleReplacer> getReplacers() {
        return replacers;
    }
    public static List<TCTitleRealTimeReplacer> getRealTimeReplacers() {
        return realTimeReplacers;
    }
    public static List<String> getReplacerNames() {return replacersNames;}
    public static List<String> getRealTimeReplacersNames() {return realTimeReplacersNames;}
    public static List<String> getAllVariables() {return variables;}
}
