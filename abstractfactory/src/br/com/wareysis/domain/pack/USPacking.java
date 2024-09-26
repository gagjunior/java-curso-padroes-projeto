package br.com.wareysis.domain.pack;


/**
 * Represents a US-specific implementation of the Packing interface.
 * This class provides a localized packing message adhering to US standards.
 *
 * @author gilberto.junior
 */
public class USPacking implements Packing {

    @Override
    public String pack() {

        return "\t- Packing in English";
    }
}
