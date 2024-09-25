package br.com.wareysis.factory.factories;

import br.com.wareysis.factory.domain.IPhone;

/**
 * Classe IPhoneFactory
 *
 * @author gilberto.junior
 * @version 1.0
 */
public abstract class IPhoneFactory {

    protected abstract IPhone createIPhone();

    public IPhone orderIPhone() {
        IPhone device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

}
