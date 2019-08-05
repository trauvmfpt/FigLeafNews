package util;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class MyUtil {
    private static MyUtil SINGLE_INSTANCE = null;
    private MyUtil() {}
    public static MyUtil getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (MyUtil.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new MyUtil();
                }
            }
        }
        return SINGLE_INSTANCE;
    }

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public  String toSlug(String input) {
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }
}
