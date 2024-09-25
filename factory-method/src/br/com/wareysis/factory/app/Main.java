package br.com.wareysis.factory.app;

import br.com.wareysis.factory.factories.IPhoneFactory;
import br.com.wareysis.factory.factories.IPhoneXFactory;

public class Main {

    public static void main(String[] args) {

        IPhoneFactory factory = new IPhoneXFactory();
        factory.orderIPhone();
    }
}
