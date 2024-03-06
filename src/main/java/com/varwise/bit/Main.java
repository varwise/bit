package com.varwise.bit;

import picocli.CommandLine;

@CommandLine.Command(name = "bit", mixinStandardHelpOptions = true, subcommands = {
        HelloCommand.class, ValidateEnvironmentCommand.class })
public class Main {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}