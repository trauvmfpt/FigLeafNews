package util;

import java.io.File;
import java.security.SecureRandom;
import java.text.Normalizer;
import java.util.Locale;
import java.util.Random;
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

    public  String toSlug(String str) {
        String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll(" ", "-").replaceAll("đ", "d");
    }

    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public  String generateRandom(int length) {
        Random random = new SecureRandom();
        if (length <= 0) {
            throw new IllegalArgumentException("String length must be a positive integer");
        }

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }
    public   String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
