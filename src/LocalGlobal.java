/**
 * Created by puranisu on 6/21/2018.
 */
public class LocalGlobal {

    public static void main(String[] args) {

        System.out.println("Before you have tea, have this!");

        initFederatedSearchConfiguration("singleton");

        System.out.println(FederatedSearchConfig.getInstance().getFederatedSearchUrl());

        initFederatedSearchConfiguration("doubleton");

        System.out.println(FederatedSearchConfig.getInstance().getFederatedSearchUrl());



    }

    private static void initFederatedSearchConfiguration(String url)  {
        FederatedSearchConfig federatedSearchConfiguration = FederatedSearchConfig.getInstance();
        federatedSearchConfiguration.setFederatedSearchUrl(url);

        System.out.println("federatedSearchConfiguration dies here right?");
    }


}

class FederatedSearchConfig {
    private static FederatedSearchConfig instance = null;

    private String federatedSearchUrl;

    public static FederatedSearchConfig getInstance(){
        if(instance == null){
            instance = new FederatedSearchConfig();
        }
        return instance;
    }

    public String getFederatedSearchUrl() {
        return federatedSearchUrl;
    }

    public void setFederatedSearchUrl(String federatedSearchUrl) {
        this.federatedSearchUrl = federatedSearchUrl;
    }
}
