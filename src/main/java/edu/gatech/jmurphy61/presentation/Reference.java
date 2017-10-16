package edu.gatech.jmurphy61.presentation;

public class Reference {

    public static final String MOD_ID = "gjpm";
    public static final String NAME = "Presentation Mod";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";

    // Proxies
    public static final String CLIENT_PROXY_CLASS = "edu.gatech.jmurphy61.presentation.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "edu.gatech.jmurphy61.presentation.proxy.ServerProxy";

    //Items
    public enum PresentationItems {
        SCREEN("screen", "ItemScreen");

        private String unlocalizedName;
        private String registryName;

        PresentationItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

}
