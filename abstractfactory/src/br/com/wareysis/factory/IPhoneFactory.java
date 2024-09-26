package br.com.wareysis.factory;

import java.util.Optional;

import br.com.wareysis.domain.iphone.IPhone;
import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * Abstract factory class for creating different models of iPhone.
 *
 * IPhoneFactory provides a template for producing iPhones with a specific set of country rules.
 * Subclasses of this factory must implement the createIPhone method to specify the iPhone variant based on the given configuration level.
 *
 * @author gilberto.junior
 */
public abstract class IPhoneFactory {

    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {

        this.rules = rules;
    }

    protected abstract Optional<IPhone> createIPhone(String level);

    public Optional<IPhone> orderIPhone(String level) {

        Optional<IPhone> device = Optional.empty();

        device = Optional.of(createIPhone(level).get());

        if (device.isPresent()) {
            device.get().getHardware();
            device.get().assemble();
            device.get().certificates();
            device.get().pack();
        }

        return device;
    }

}
