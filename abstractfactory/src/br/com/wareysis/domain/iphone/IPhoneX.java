package br.com.wareysis.domain.iphone;

import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * Concrete class representing the iPhone X model.
 *
 * This class extends the abstract IPhone class and provides specific hardware details
 * for the iPhone X model. It leverages a CountryRulesAbstractFactory to determine the
 * country-specific rules for certificates and packing.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class IPhoneX extends IPhone {

    public IPhoneX(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
