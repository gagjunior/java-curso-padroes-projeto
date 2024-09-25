package br.com.wareysis.domain.iphone;

import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * Represents the iPhone XS Max model.
 *
 * This class is a concrete implementation of the IPhone abstract class,
 * specifically providing the hardware specifications for the iPhone XS Max.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class IPhoneXSMax extends IPhone {

    public IPhoneXSMax(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A12 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }

}
