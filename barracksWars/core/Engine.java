package barracksWars.core;

import barracksWars.interfaces.*;
import barracksWars.interfaces.Runnable;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

    private static final String COMMANDS_PACKAGE_NAME = "barracksWars.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException | ExecutionControl.NotImplementedException e) {
                e.printStackTrace();
            }
        }
    }

    // TODO: refactor for problem 4
    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException {
        String result;

        String className = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1);

        try {
            Class commandClass = Class.forName(COMMANDS_PACKAGE_NAME + className);
            Constructor<Command> constructor = commandClass.getConstructor(String[].class, Repository.class, UnitFactory.class);

            Command commandObject = constructor.newInstance(data, this.repository, this.unitFactory);
            result = commandObject.execute();

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}
