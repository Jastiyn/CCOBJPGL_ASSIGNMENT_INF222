package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Venus;
import Planets.Uranus;
import Planets.Neptune;
import Planets.Pluto;
import Planets.Earth;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Venus venus);

    void visit(Uranus uranus);

    void visit(Neptune neptune);

    void visit(Pluto pluto);

    void visit(Earth earth);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
