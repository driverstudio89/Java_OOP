package barracksWars.core.commands;

import barracksWars.core.Command;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Add extends Command {
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        Unit unitToAdd = null;

        try {
            unitToAdd = this.getUnitFactory().createUnit(unitType);
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }

        this.getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;

    }
}
