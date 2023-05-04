package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Potchi is now visiting... Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Potchi is now visiting... Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Potchi is now visiting... Saturn");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Potchi is now visiting... Jupiter");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Potchi is now visiting... Venus");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Potchi is now visiting... Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Potchi is now visiting... Pluto");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Potchi is now visiting... Uranus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Potchi is now visiting... Earth");
    }
}