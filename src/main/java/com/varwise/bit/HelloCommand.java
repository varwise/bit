package com.varwise.bit;

import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "hello", mixinStandardHelpOptions = true, version = "bit 1.0",
        description = "Hello World!")

public class HelloCommand implements Callable<Integer> {
    @CommandLine.Option(names = {"-n", "--name"}, description = "Your name", defaultValue = "World")
    private String name;

    public static void main(String... args) {
        int exitCode = new CommandLine(new HelloCommand()).execute(args);
        System.exit(exitCode);
    }

    @Override public Integer call() {
        System.out.printf("Hello %s!%n", name);
        return 0;
    }
}
