package io.jenkins.plugins.logintheme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import jenkins.model.Jenkins;
import org.junit.jupiter.api.Test;

@WithJenkinsConfiguredWithCode
class ConfigurationAsCodeTest {

    @Test
    @ConfiguredWithCode("configuration-as-code.yml")
    void should_support_configuration_as_code(JenkinsConfiguredWithCodeRule r) {
        LoginTheme plugin = Jenkins.get().getExtensionList(LoginTheme.class).get(0);
        assertTrue(plugin.isUseDefaultTheme());
        assertEquals("The footer", plugin.getFooter());
        assertEquals("The head", plugin.getHead());
        assertEquals("The header", plugin.getHeader());
        assertEquals("The branding", plugin.getBranding());
        assertEquals("The custom css", plugin.getCustomCSS());
    }
}
