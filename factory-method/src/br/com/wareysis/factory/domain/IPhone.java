package br.com.wareysis.factory.domain;

/**
 * Classe IPhone
 *
 * @author gilberto.junior
 * @version 1.0
 */
public abstract class IPhone {

    public abstract void getHardware();

    public void assemble(){
        System.out.println("Assembling all the hardwares");
    }

    public void certificates(){
        System.out.println("Certificate all the hardwares");
    }

    public void pack(){
        System.out.println("Packing all the hardwares");
    }

}
