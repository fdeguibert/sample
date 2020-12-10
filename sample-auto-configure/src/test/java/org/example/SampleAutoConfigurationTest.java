package org.example;

import org.autoconfigure.SampleAutoConfiguration;
import org.autoconfigure.TriggerBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class SampleAutoConfigurationTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(SampleAutoConfiguration.class));

    @Test
    void autoConfiguredWithTriggerBeanContextShouldContainsSomeBean() {
        this.contextRunner
                .withBean(TriggerBean.class)
                .run((context) -> {
                    assertThat(context).hasSingleBean(SomeBean.class);
                });
    }

    @Test
    void autoConfiguredWithNoTriggerBeanContextShouldNotContainsSomeBean() {
        this.contextRunner
                .run((context) -> {
                    assertThat(context).doesNotHaveBean(SomeBean.class);
                });
    }
}