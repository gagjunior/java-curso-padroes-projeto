package br.com.wareysis.factorymethod.factory;

import br.com.wareysis.factorymethod.factory.factories.IPhoneFactory;
import br.com.wareysis.factorymethod.factory.factories.IPhoneXFactory;
import br.com.wareysis.factorymethod.factory.factories.IPhoneXSMaxFactory;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
class Client {

    public static void main(String[] args) {

        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhoneXSFactory = new IPhoneXSMaxFactory();

        iPhoneXFactory.orderIPhone();
        iPhoneXSFactory.orderIPhone();
    }

}
