package org.generatingtests;

import java.io.IOException;

public class RunCodegen {
    static void main() throws IOException, InterruptedException {
        com.microsoft.playwright.CLI.main(new String[]{"codegen", "playwright.dev"});
    }
}
