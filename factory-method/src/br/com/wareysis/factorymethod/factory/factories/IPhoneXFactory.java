package br.com.wareysis.factorymethod.factory.factories;

import br.com.wareysis.factorymethod.domain.IPhone;
import br.com.wareysis.factorymethod.domain.IPhoneX;

/**
 * Classe IPhoneXFactory
 *
 * @author gilberto.junior
 * @version 1.0
 */
public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {

        return new IPhoneX();
    }
}
