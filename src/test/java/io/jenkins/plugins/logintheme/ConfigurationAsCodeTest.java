package io.jenkins.plugins.logintheme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import jenkins.model.Jenkins;
import org.junit.Rule;
import org.junit.Test;

public class ConfigurationAsCodeTest {

    @Rule
    public JenkinsConfiguredWithCodeRule r = new JenkinsConfiguredWithCodeRule();

    @Test
    @ConfiguredWithCode("configuration-as-code.yml")
    public void should_support_configuration_as_code() throws Exception {
        LoginTheme plugin = Jenkins.get().getExtensionList(LoginTheme.class).get(0);
        assertEquals(true, plugin.isUseDefaultTheme());
        assertEquals("The footer", plugin.getFooter());
        assertEquals("The head", plugin.getHead());
        assertEquals("The header", plugin.getHeader());
        assertEquals("The branding", plugin.getBranding());
        assertEquals("The custom css", plugin.getCustomCSS());
    }
}
