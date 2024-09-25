package br.com.wareysis.factorymethod.factory.factories;

import br.com.wareysis.factorymethod.domain.IPhone;

/**
 * Classe IPhoneFactory.
 *
 * @author gilberto.junior
 * @version 1.0
 * @since 1.0
 */
public abstract class IPhoneFactory {

    /**
     * Creates and returns an instance of IPhone.
     *
     * @return an instance of IPhone
     */
    protected abstract IPhone createIPhone();

    /**
     * Orders an iPhone by creating the device, getting its hardware,
     * assembling it,
     * obtaining necessary certificates, and packing it.
     *
     * @return the newly created and prepared IPhone instance
     */
    public IPhone orderIPhone() {
        IPhone device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

}
