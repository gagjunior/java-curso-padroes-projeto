package br.com.wareysis.domain.pack;


/**
 * BrazilianPacking is a concrete implementation of the Packing interface.
 * It provides the packing details specific to Brazilian standards.
 *
 * @author gilberto.junior
 */
public class BrazilianPacking implements Packing{

    @Override
    public String pack() {

        return "\t- Empacotando em Portugues";
    }
}
