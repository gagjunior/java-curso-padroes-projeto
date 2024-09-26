package br.com.wareysis.rules;

import br.com.wareysis.domain.certificate.Certificate;
import br.com.wareysis.domain.pack.Packing;

/**
 * The CountryRulesAbstractFactory interface defines a contract for creating regional-specific
 * certificates and packing objects. Implementations of this interface are responsible for
 * providing the necessary country-specific rules and standards for certification and packing.
 */
public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
