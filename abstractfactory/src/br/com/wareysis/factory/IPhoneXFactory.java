package br.com.wareysis.factory;

import java.util.Optional;

import br.com.wareysis.domain.iphone.IPhone;
import br.com.wareysis.domain.iphone.IPhoneX;
import br.com.wareysis.domain.iphone.IPhoneXSMax;
import br.com.wareysis.rules.CountryRulesAbstractFactory;

/**
 * Factory class for creating iPhone X series devices.
 * <p>
 * This class extends the IPhoneFactory and specializes in creating different models of the iPhone X,
 * including the standard iPhone X and the high-end iPhone XS
 * Max, based on the supplied level of configuration.
 *
 * @see IPhoneFactory
 * @author gilberto.junior
 * @version 1.0
 * @since 1.0
 */
public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    protected Optional<IPhone> createIPhone(String level) {

        if (level.equals("standard")) {
            return Optional.ofNullable(new IPhoneX(rules));
        } else if (level.equals("highEnd")) {
            return Optional.of(new IPhoneXSMax(rules));
        } else {
            return Optional.empty();
        }
    }
}
