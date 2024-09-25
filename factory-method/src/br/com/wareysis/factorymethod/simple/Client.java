package br.com.wareysis.factorymethod.simple;

import br.com.wareysis.factorymethod.domain.IPhone;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
class Client {

    public static void main(String[] args) {
        IPhone iPhoneX = IPhoneSimpleFactory.getDevice("X", "standard").get();
        System.out.println(iPhoneX);

        IPhone iPhoneXS = IPhoneSimpleFactory.getDevice("X", "highEnd").get();
        System.out.println(iPhoneXS);
    }
}
