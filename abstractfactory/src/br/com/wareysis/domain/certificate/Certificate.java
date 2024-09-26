package br.com.wareysis.domain.certificate;


/**
 * The Certificate interface defines a method for applying specific certification standards
 * tied to different regional regulations. Implementations of this interface provide
 * localized certification processes.
 *
 * @author gilberto.junior
 */
public interface Certificate {
    String applyCertification();
}
