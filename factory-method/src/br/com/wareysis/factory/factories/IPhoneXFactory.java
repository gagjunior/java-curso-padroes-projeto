package br.com.wareysis.factory.factories;

import br.com.wareysis.factory.domain.IPhone;
import br.com.wareysis.factory.domain.IPhoneX;

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
