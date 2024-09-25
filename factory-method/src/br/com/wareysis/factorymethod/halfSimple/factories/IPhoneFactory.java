package br.com.wareysis.factorymethod.halfSimple.factories;

import br.com.wareysis.factorymethod.domain.IPhone;


/**
 * Abstract factorymethod class responsible for creating instances of IPhone.
 * Implementations of this class should provide concrete implementations
 * of the createIPhone method to return specific IPhone models depending on the level parameter.
 *
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public abstract class IPhoneFactory {

    protected abstract IPhone createIPhone(String level);

    public IPhone orderIPhone(String level) {
        IPhone device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

}
