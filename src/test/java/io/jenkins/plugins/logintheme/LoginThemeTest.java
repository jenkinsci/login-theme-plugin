package io.jenkins.plugins.logintheme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.jvnet.hudson.test.junit.jupiter.WithJenkins;
import org.kohsuke.stapler.StaplerRequest;

@WithJenkins
public class LoginThemeTest {

    @Test
    public void getHeadAndSetHead(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setHead("Head");
        assertEquals("Head", plugin.getHead());
    }

    @Test
    public void getHeaderAndSetHeader(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setHeader("Header");
        assertEquals("Header", plugin.getHeader());
    }

    @Test
    public void getFooterAndSetFooter(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setFooter("Footer");
        assertEquals("Footer", plugin.getFooter());
    }

    @Test
    public void getBrandingAndSetBranding(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setBranding("Branding");
        assertEquals("Branding", plugin.getBranding());
    }

    @Test
    public void getCustomCSSAndSetCustomCSS(JenkinsRule jenkinsRule) {
        LoginTheme plugin = new LoginTheme();
        plugin.setCustomCSS("Custom CSS");
        assertEquals("Custom CSS", plugin.getCustomCSS());
    }

    @Test
    public void testConfigure(JenkinsRule jenkinsRule) throws Exception {
        LoginTheme plugin = new LoginTheme();

        StaplerRequest staplerRequest = mock(StaplerRequest.class);

        JSONObject jsonObject = new JSONObject();

        boolean result = plugin.configure(staplerRequest, jsonObject);
        verify(staplerRequest).bindJSON(eq(plugin), eq(jsonObject));
        assertEquals(true, result);
    }
}
