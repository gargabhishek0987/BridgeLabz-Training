public class LegacyApiDeprecated {
    @Deprecated
    public static void oldFeature(){
        System.out.println("This is a deprecated feature.");

    }
    public static void newFeature(){
        System.out.println("This is the new feature.");
    }
    public static void main(String[] args) {
           LegacyApiDeprecated.oldFeature();
           LegacyApiDeprecated.newFeature();
    }    
}
