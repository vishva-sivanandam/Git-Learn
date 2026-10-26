package org.computer;

public class Desktop implements HardWare, Software {
        @Override
        public void hardwareResources() {
            System.out.println("Hardware: RAM, CPU, Hard Disk");
        }
        @Override
        public void softwareResources() {
            System.out.println("Software: Windows, MS Office");
        }
        public void desktopModel() {
            System.out.println("Desktop Model: Dell");
        }
        public static void main(String[] args) {
            Desktop desktop = new Desktop();
            desktop.hardwareResources();
            desktop.softwareResources();
            desktop.desktopModel();
        }
    }
