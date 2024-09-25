package br.com.wareysis.factorymethod.halfSimple;

import br.com.wareysis.factorymethod.halfSimple.factories.IPhoneFactory;
import br.com.wareysis.factorymethod.halfSimple.factories.IPhoneXFactory;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
class Client {

    public static void main(String[] args) {

        IPhoneFactory halfSimpleFactory = new IPhoneXFactory();

        halfSimpleFactory.orderIPhone("standard");
        halfSimpleFactory.orderIPhone("highEnd");
    }
}
