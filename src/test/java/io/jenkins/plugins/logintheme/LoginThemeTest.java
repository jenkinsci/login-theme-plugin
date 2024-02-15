package io.jenkins.plugins.logintheme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.ClassRule;
import org.jvnet.hudson.test.JenkinsRule;
import org.junit.Before;
import java.io.IOException;

import org.kohsuke.stapler.StaplerRequest;
import net.sf.json.JSONObject;

public class LoginThemeTest {

    @ClassRule
    public static JenkinsRule jenkinsRule = new JenkinsRule();

    public LoginThemeTest() {}

    private LoginTheme plugin;

    @Before
    public void setUp() throws IOException {
        plugin = new LoginTheme();
    }

    @Test
    public void getHeadAndSetHead() {
        plugin.setHead("Head");
        assertEquals("Head", plugin.getHead());
    }

    @Test
    public void getHeaderAndSetHeader() {
        plugin.setHeader("Header");
        assertEquals("Header", plugin.getHeader());
    }

    @Test
    public void getFooterAndSetFooter() {
        plugin.setFooter("Footer");
        assertEquals("Footer", plugin.getFooter());
    }

    @Test
    public void getBrandingAndSetBranding() {
        plugin.setBranding("Branding");
        assertEquals("Branding", plugin.getBranding());
    }

    @Test
    public void getCustomCSSAndSetCustomCSS() {
        plugin.setCustomCSS("Custom CSS");
        assertEquals("Custom CSS", plugin.getCustomCSS());
    }

    @Test
    public void testConfigure() throws Exception {

        StaplerRequest staplerRequest = mock(StaplerRequest.class);

        JSONObject jsonObject = new JSONObject();

        boolean result = plugin.configure(staplerRequest, jsonObject);
        verify(staplerRequest).bindJSON(eq(plugin), eq(jsonObject));
        assertEquals(true, result);
    }
}
