package br.com.wareysis.rules;

import br.com.wareysis.domain.certificate.Certificate;
import br.com.wareysis.domain.certificate.USCertificate;
import br.com.wareysis.domain.pack.Packing;
import br.com.wareysis.domain.pack.USPacking;


/**
 * Concrete factory implementation for creating US-specific rules and standards.
 * Implements the {@link CountryRulesAbstractFactory} interface to provide US-specific
 * certificate and packing objects.
 *
 * This factory encapsulates the creation of:
 * - US-styled certificates, which are instances of {@link USCertificate}.
 * - US-styled packaging, which are instances of {@link USPacking}.
 *
 * Use this factory when you need to ensure that created objects adhere to US regulations and standards.
 *
 * @see {@link CountryRulesAbstractFactory}
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class USRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificates() {

        return new USCertificate();
    }

    @Override
    public Packing getPacking() {

        return new USPacking();
    }
}
