import br.com.wareysis.domain.iphone.IPhone;
import br.com.wareysis.factory.IPhone11Factory;
import br.com.wareysis.factory.IPhoneFactory;
import br.com.wareysis.factory.IPhoneXFactory;
import br.com.wareysis.rules.BrazilianRulesAbstractFactory;
import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * The Client class demonstrates the creation and ordering of different iPhone models
 * using factory classes tailored for Brazilian market regulations.
 *
 * This class uses the BrazilianRulesAbstractFactory to obtain Brazilian-specific
 * certificates and packing for the iPhone models. It then orders multiple types
 * of iPhones (standard and high-end versions of iPhone X and iPhone 11) and
 * prints their details.
 */
public class Client {

    public static void main(String[] args) {

        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        //CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();

        IPhoneFactory iPhoneXFactory = new IPhoneXFactory(rules);
        IPhoneFactory iPhone11Factory = new IPhone11Factory(rules);

        IPhone iphoneX = iPhoneXFactory.orderIPhone("standard").get();
        IPhone iphoneXS = iPhoneXFactory.orderIPhone("highEnd").get();
        IPhone iphone11 = iPhone11Factory.orderIPhone("standard").get();
        IPhone iphone11Pro = iPhone11Factory.orderIPhone("highEnd").get();

        System.out.println(iphoneX);
        System.out.println(iphoneXS);
        System.out.println(iphone11);
        System.out.println(iphone11Pro);
    }
}