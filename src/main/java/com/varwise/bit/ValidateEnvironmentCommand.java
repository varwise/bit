package com.varwise.bit;

import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "validate-environment", mixinStandardHelpOptions = true, version = "bit 1.0",
        description = "Runs checks to make sure your local environment has all the necessary tools installed.")
public class ValidateEnvironmentCommand implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.printf("validate-environment command called...%n");
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new ValidateEnvironmentCommand()).execute(args);
        System.exit(exitCode);
    }
}
