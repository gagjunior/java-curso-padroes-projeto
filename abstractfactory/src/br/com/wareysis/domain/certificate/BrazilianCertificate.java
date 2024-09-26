package br.com.wareysis.domain.certificate;


/**
 * BrazilianCertificate is a concrete implementation of the Certificate interface.
 * It represents a certification process that adheres to Brazilian regulations and standards.
 *
 * @author gilberto.junior
 */
public class BrazilianCertificate implements Certificate {

    @Override
    public String applyCertification() {

        return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
    }
}
