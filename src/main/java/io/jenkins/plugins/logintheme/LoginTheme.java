/*
 * The MIT License
 *
 * Copyright (c) 2018, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.jenkins.plugins.logintheme;

import hudson.Extension;
import jenkins.model.SimplePageDecorator;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

import javax.annotation.Nonnull;

@Extension
public class LoginTheme extends SimplePageDecorator {

    private String head;

    private String header;

    private String footer;

    private boolean useDefaultTheme = true;

    public boolean isUseDefaultTheme() {
        return useDefaultTheme;
    }

    public void setUseDefaultTheme(boolean useDefaultTheme) {
        this.useDefaultTheme = useDefaultTheme;
    }

    @Nonnull
    @Override
    public String getDisplayName() {
        return "Login Theme";
    }

    public String getHead() {
        return head;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public LoginTheme() {
        load();
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        req.bindJSON(this, json);
        this.save();
        return true;
    }
}
