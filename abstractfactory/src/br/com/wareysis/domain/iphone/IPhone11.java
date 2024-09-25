package br.com.wareysis.domain.iphone;

import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * Concrete class representing an iPhone 11.
 *
 * The IPhone11 class specifies the hardware components unique to the iPhone 11
 * model. It extends the abstract IPhone class and provides its own implementation
 * of the getHardware method, detailing the specific hardware configurations.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class IPhone11 extends IPhone {

    public IPhone11(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
