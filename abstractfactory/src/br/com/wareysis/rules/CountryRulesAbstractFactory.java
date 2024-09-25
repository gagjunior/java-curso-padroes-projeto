package br.com.wareysis.rules;

import br.com.wareysis.domain.certificate.Certificate;
import br.com.wareysis.domain.pack.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
