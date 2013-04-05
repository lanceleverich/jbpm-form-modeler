/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.formModeler.core.wrappers;

/**
 * Wrapper for HTML field types.
 */
public class HTMLString {
    private static transient org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(HTMLString.class.getName());

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HTMLString(String value) {
        this.value = value;
    }

    public String toString() {
        return getValue();
    }
}