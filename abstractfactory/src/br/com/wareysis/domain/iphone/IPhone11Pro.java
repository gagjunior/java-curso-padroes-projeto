package br.com.wareysis.domain.iphone;

import br.com.wareysis.rules.CountryRulesAbstractFactory;

/**
 * Represents the iPhone 11 Pro model, a specific type of iPhone. This class extends the IPhone
 * abstract class and provides specific hardware details for the
 * iPhone 11 Pro.
 *
 * @author gilberto.junior
 * @version 1.0
 * @since 1.0
 */
public class IPhone11Pro extends IPhone {

    public IPhone11Pro(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
