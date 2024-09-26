package br.com.wareysis.rules;

import br.com.wareysis.domain.certificate.BrazilianCertificate;
import br.com.wareysis.domain.certificate.Certificate;
import br.com.wareysis.domain.pack.BrazilianPacking;
import br.com.wareysis.domain.pack.Packing;


/**
 * BrazilianRulesAbstractFactory is a concrete factory class that implements
 * the CountryRulesAbstractFactory interface. This factory is responsible for
 * creating product instances that conform to Brazilian regulations and standards.
 *
 * @see {@link CountryRulesAbstractFactory}
 * @author gilberto.junior
 * @since 1.0
 * @version 1.0
 */
public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificates() {

        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {

        return new BrazilianPacking();
    }
}
