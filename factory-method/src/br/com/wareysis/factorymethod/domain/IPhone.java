package br.com.wareysis.factorymethod.domain;

/**
 * Classe IPhone
 *
 * @author gilberto.junior
 * @version 1.0
 */
public abstract class IPhone {

    /**
     * Retrieves and initializes the necessary hardware components for the IPhone.
     * This method must be implemented by subclasses to specify the particular
     * hardware configuration required for different models of iPhones.
     */
    public abstract void getHardware();

    /**
     * Assembles all the hardware components of the iPhone.
     * This is a crucial step in the iPhone creation process and must be called
     * after the hardware has been retrieved and initialized.
     *
     * It typically involves piecing together various hardware parts to ensure
     * the device is fully operational.
     */
    public void assemble(){
        System.out.println("Assembling all the hardwares");
    }

    /**
     * Certifies all the hardware components of the iPhone.
     * This step ensures that all the components meet the required standards
     * and regulations before the iPhone is packed and shipped.
     */
    public void certificates(){
        System.out.println("Certificate all the hardwares");
    }

    public void pack(){
        System.out.println("Packing all the hardwares");
    }

}
