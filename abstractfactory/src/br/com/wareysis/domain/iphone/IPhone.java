package br.com.wareysis.domain.iphone;

import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * Abstract class representing an iPhone.
 *
 * This class provides a template for creating different models of iPhones, including methods
 * for assembling hardware, testing certificates, and packing the device. The actual hardware
 * specifications must be provided by concrete subclasses.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public abstract class IPhone {

    CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {

        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {

        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {

        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {

        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}
