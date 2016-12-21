/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.atmosphere.websocket.springboot;

import org.apache.camel.component.servlet.HttpRegistry;
import org.apache.camel.http.common.HttpBinding;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * To exchange data with external Websocket clients using Atmosphere.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.atmosphere-websocket")
public class WebsocketComponentConfiguration {

    /**
     * Default name of servlet to use. The default name is CamelServlet.
     */
    private String servletName;
    /**
     * To use a custom org.apache.camel.component.servlet.HttpRegistry.
     */
    @NestedConfigurationProperty
    private HttpRegistry httpRegistry;
    /**
     * Whether to automatic bind multipart/form-data as attachments on the Camel
     * Exchange. The options attachmentMultipartBinding=true and
     * disableStreamCache=false cannot work together. Remove disableStreamCache
     * to use AttachmentMultipartBinding. This is turn off by default as this
     * may require servlet specific configuration to enable this when using
     * Servlet's.
     */
    private Boolean attachmentMultipartBinding;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient.
     */
    @NestedConfigurationProperty
    private HttpBinding httpBinding;
    /**
     * To use the shared HttpConfiguration as base configuration.
     */
    @NestedConfigurationProperty
    private HttpConfiguration httpConfiguration;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message.
     */
    @NestedConfigurationProperty
    private HeaderFilterStrategy headerFilterStrategy;

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public HttpRegistry getHttpRegistry() {
        return httpRegistry;
    }

    public void setHttpRegistry(HttpRegistry httpRegistry) {
        this.httpRegistry = httpRegistry;
    }

    public Boolean getAttachmentMultipartBinding() {
        return attachmentMultipartBinding;
    }

    public void setAttachmentMultipartBinding(Boolean attachmentMultipartBinding) {
        this.attachmentMultipartBinding = attachmentMultipartBinding;
    }

    public HttpBinding getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(HttpBinding httpBinding) {
        this.httpBinding = httpBinding;
    }

    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}