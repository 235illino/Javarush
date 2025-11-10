package ua.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE;

    static {
        var init = System.getenv("APP_LANG");
        if(init != null)
            APPLICATION_DEFAULT_LANGUAGE = init;
        else APPLICATION_DEFAULT_LANGUAGE = "en";
    }

}
