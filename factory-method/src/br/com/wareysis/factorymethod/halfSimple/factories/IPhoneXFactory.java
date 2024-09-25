package br.com.wareysis.factorymethod.halfSimple.factories;

import br.com.wareysis.factorymethod.domain.IPhone;
import br.com.wareysis.factorymethod.domain.IPhoneX;
import br.com.wareysis.factorymethod.domain.IPhoneXSMax;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equalsIgnoreCase("standard")) {
            return new IPhoneX();
        } else if (level.equalsIgnoreCase("highEnd")) {
            return new IPhoneXSMax();
        } else {

            return null;
        }

    }
}
