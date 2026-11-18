package service;

public enum Themes {
    CLASSIC("🌙 Классика", "/theme-classic.css"),
    NATURE("🌿 Природа", "/theme-nature.css"),
    CYBERPUNK("🌆 Киберпанк", "/theme-cyberpunk.css"),
    BUSINESS("💼 Деловой", "/theme-business.css"),
    YOUTH("🎨 Молодёжный", "/theme-youth.css");

private final String displayName;
private final String cssPath;

Themes(String displayName, String cssPath) {
    this.displayName = displayName;
    this.cssPath = cssPath;
}

public String getDisplayName() {return displayName;}

public String getCssPath() {return cssPath;}

public static Themes fromName(String name) {
    if (name == null)
        return CLASSIC;
    try {
        return Themes.valueOf(name);
    }
    catch (IllegalArgumentException e) {
        return CLASSIC;
    }
}

@Override
public String toString() {return displayName;}
}
