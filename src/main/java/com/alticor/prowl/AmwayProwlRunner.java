package com.alticor.prowl;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Created by harolddost on 4/4/16.
 */
public class AmwayProwlRunner extends BlockJUnit4ClassRunner {
    public AmwayProwlRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override public void run(RunNotifier notifier) {
        // Setup Report

        notifier.addListener(new AfterFailureScreenshotHook());
        System.out.println(" The Pattern is:" + System.getenv("windir"));
        super.run(notifier);
    }
}
