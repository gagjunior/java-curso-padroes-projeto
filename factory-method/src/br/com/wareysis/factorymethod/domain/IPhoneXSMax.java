package br.com.wareysis.factorymethod.domain;

/**
 * User: Leandro Antonelli Date: 25/09/2024
 */
public class IPhoneXSMax extends IPhone{

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A12 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
