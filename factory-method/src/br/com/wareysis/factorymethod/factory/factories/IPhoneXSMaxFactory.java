package br.com.wareysis.factorymethod.factory.factories;

import br.com.wareysis.factorymethod.domain.IPhone;
import br.com.wareysis.factorymethod.domain.IPhoneXSMax;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class IPhoneXSMaxFactory extends IPhoneFactory{
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
