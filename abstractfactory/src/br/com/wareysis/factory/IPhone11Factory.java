package br.com.wareysis.factory;

import java.util.Optional;

import br.com.wareysis.domain.iphone.IPhone;
import br.com.wareysis.domain.iphone.IPhone11;
import br.com.wareysis.domain.iphone.IPhone11Pro;
import br.com.wareysis.rules.CountryRulesAbstractFactory;


/**
 * IPhone11Factory is a concrete implementation of the IPhoneFactory for creating iPhone 11 models.
 *
 * This factory is responsible for creating instances of iPhone 11 and iPhone 11 Pro based on the
 * specified level: "standard" or "highEnd". It utilizes the given CountryRulesAbstractFactory
 * to apply country-specific rules for certifications and packing.
 *
 * @see IPhoneFactory
 * @author gilberto.junior
 * @version 1.0
 * @since 1.0
 */
public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {

        super(rules);
    }

    @Override
    protected Optional<IPhone> createIPhone(String level) {

        if (level.equals("standard")) {
            return Optional.ofNullable(new IPhone11(rules));
        } else if (level.equals("highEnd")) {
            return Optional.ofNullable(new IPhone11Pro(rules));
        } else {
            return Optional.empty();
        }

    }
}
