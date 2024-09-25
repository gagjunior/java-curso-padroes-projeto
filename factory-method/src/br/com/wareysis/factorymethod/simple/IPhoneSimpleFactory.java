package br.com.wareysis.factorymethod.simple;

import java.util.Optional;

import br.com.wareysis.factorymethod.domain.IPhone;
import br.com.wareysis.factorymethod.domain.IPhoneX;
import br.com.wareysis.factorymethod.domain.IPhoneXSMax;

/**
 * IPhoneSimpleFactory is a factory class used to create instances of different IPhone models based on the specified generation and level. The factory method
 * getDevice returns an Optional containing the created IPhone object if the parameters match the criteria; otherwise, it returns an empty Optional.
 *
 * @author gilberto.junior
 * @version 1.0
 * @since 1.0
 */
class IPhoneSimpleFactory {

    static Optional<IPhone> getDevice(String generetion, String level) {

        Optional<IPhone> device = Optional.empty();

        if ("X".equalsIgnoreCase(generetion)) {
            if ("standard".equalsIgnoreCase(level)) {
                device = Optional.of(new IPhoneX());
            } else if ("highEnd".equalsIgnoreCase(level)) {
                device = Optional.of(new IPhoneXSMax());
            }
        }

        if (device.isPresent()) {
            device.get().getHardware();
            device.get().assemble();
            device.get().certificates();
            device.get().pack();
        }

        return device;
    }

}
