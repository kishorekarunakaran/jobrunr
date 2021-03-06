package org.jobrunr.tests.e2e;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jobrunr.utils.reflection.ReflectionUtils.classExists;

public abstract class AbstractE2EGsonSqlTest extends AbstractE2ESqlTest {

    @Test
    public void onlyGsonIsOnClasspath() {
        assertThat(classExists("com.google.gson.Gson")).isTrue();
        assertThat(classExists("com.fasterxml.jackson.databind.ObjectMapper")).isFalse();
    }

}
