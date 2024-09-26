package br.com.wareysis.domain.certificate;


/**
 * Represents a US-specific implementation of the {@link Certificate} interface.
 * This class provides a localized certification process adhering to US regulations.
 * The applyCertification method in this implementation will return a message
 * indicating the calibration of US-specific rules.
 *
 * @author gilberto.junior
 */
public class USCertificate implements Certificate {

    @Override
    public String applyCertification() {

        return "\t- Calibrating US rules";
    }
}
