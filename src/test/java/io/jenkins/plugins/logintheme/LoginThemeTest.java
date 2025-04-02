package io.jenkins.plugins.logintheme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;
import org.kohsuke.stapler.StaplerRequest2;

@WithJenkins
class LoginThemeTest {

    @Test
    void getHeadAndSetHead(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setHead("Head");
        assertEquals("Head", plugin.getHead());
    }

    @Test
    void getHeaderAndSetHeader(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setHeader("Header");
        assertEquals("Header", plugin.getHeader());
    }

    @Test
    void getFooterAndSetFooter(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setFooter("Footer");
        assertEquals("Footer", plugin.getFooter());
    }

    @Test
    void getBrandingAndSetBranding(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setBranding("Branding");
        assertEquals("Branding", plugin.getBranding());
    }

    @Test
    void getCustomCSSAndSetCustomCSS(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setCustomCSS("Custom CSS");
        assertEquals("Custom CSS", plugin.getCustomCSS());
    }

    @Test
    void testConfigure(JenkinsRule jenkinsRule) throws Exception {
        LoginTheme plugin = new LoginTheme();

        StaplerRequest2 staplerRequest = mock(StaplerRequest2.class);

        JSONObject jsonObject = new JSONObject();

        boolean result = plugin.configure(staplerRequest, jsonObject);
        verify(staplerRequest).bindJSON(eq(plugin), eq(jsonObject));
        assertTrue(result);
    }
}
