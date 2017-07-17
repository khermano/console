/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.core.subsystem;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

import org.jboss.hal.meta.token.NameTokens;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.resources.Names;
import org.jboss.hal.resources.Resources;

import static org.jboss.hal.dmr.ModelDescriptionConstants.*;

/**
 * Subsystem registry. Lives in core so that extensions can use this class to register their subsystems.
 *
 * @author Harald Pehl
 */
public class Subsystems {

    private final Map<String, SubsystemMetadata> subsystems;

    @Inject
    @SuppressWarnings({"HardCodedStringLiteral", "DuplicateStringLiteralInspection"})
    public Subsystems(Resources resources) {
        subsystems = new HashMap<>();

        add(new SubsystemMetadata.Builder(BATCH_JBERET, Names.BATCH)
                .subtitle("JBeret")
                .token(NameTokens.BATCH_CONFIGURATION)
                .preview(resources.previews().configurationBatch())
                .build());
        add(new SubsystemMetadata.Builder(BEAN_VALIDATION, "Bean Validation")
                .preview(resources.previews().configurationBeanValidation())
                .build());
        add(new SubsystemMetadata.Builder(DATASOURCES, Names.DATASOURCES_DRIVERS)
                .nextColumn(Ids.DATA_SOURCE_DRIVER)
                .preview(resources.previews().configurationDatasourcesDrivers())
                .build());
        add(new SubsystemMetadata.Builder(DEPLOYMENT_SCANNER, "Deployment Scanners")
                .token(NameTokens.DEPLOYMENT_SCANNERS)
                .preview(resources.previews().configurationDeploymentScanner())
                .build());
        add(new SubsystemMetadata.Builder(EE, "EE")
                .token(NameTokens.EE)
                .preview(resources.previews().configurationEe())
                .build());
        add(new SubsystemMetadata.Builder(EJB3, "EJB3")
                .token(NameTokens.EJB3)
                .preview(resources.previews().configurationEjb3())
                .build());
        add(new SubsystemMetadata.Builder(ELYTRON, "Security")
                .subtitle("Elytron")
                .nextColumn(Ids.ELYTRON)
                .preview(resources.previews().configurationSecurityElytron())
                .build());
        add(new SubsystemMetadata.Builder(IIOP_OPENJDK, "IIOP")
                .subtitle("OpenJDK")
                .token(NameTokens.IIOP)
                .preview(resources.previews().configurationIiop())
                .build());
        add(new SubsystemMetadata.Builder(INFINISPAN, "Infinispan")
                .nextColumn(Ids.CACHE_CONTAINER)
                .preview(resources.previews().configurationInfinispan())
                .build());
        add(new SubsystemMetadata.Builder(IO, "IO")
                .token(NameTokens.IO)
                .preview(resources.previews().configurationIo())
                .build());
        add(new SubsystemMetadata.Builder(JAX_RS, "JAX-RS")
                .preview(resources.previews().configurationJaxRs())
                .build());
        add(new SubsystemMetadata.Builder(JCA, "JCA")
                .token(NameTokens.JCA)
                .preview(resources.previews().configurationJca())
                .build());
        add(new SubsystemMetadata.Builder(JDR, "JDR")
                .preview(resources.previews().configurationJdr())
                .build());
        add(new SubsystemMetadata.Builder(JGROUPS, "JGroups")
                .token(NameTokens.JGROUPS)
                .preview(resources.previews().configurationJgroups())
                .build());
        add(new SubsystemMetadata.Builder(JMX, "JMX")
                .token(NameTokens.JMX)
                .preview(resources.previews().configurationJmx())
                .build());
        add(new SubsystemMetadata.Builder(JPA, "JPA")
                .token(NameTokens.JPA_CONFIGURATION)
                .preview(resources.previews().configurationJpa())
                .build());
        add(new SubsystemMetadata.Builder(JSF, "JSF")
                .preview(resources.previews().configurationJsf())
                .build());
        add(new SubsystemMetadata.Builder(JSR77, "JSR77")
                .preview(resources.previews().configurationJsr77())
                .build());
        add(new SubsystemMetadata.Builder(LOGGING, Names.LOGGING)
                .nextColumn(Ids.LOGGING)
                .preview(resources.previews().configurationLogging())
                .build());
        add(new SubsystemMetadata.Builder(MAIL, "Mail")
                .nextColumn(Ids.MAIL_SESSION)
                .preview(resources.previews().configurationMail())
                .build());
        add(new SubsystemMetadata.Builder(MESSAGING_ACTIVEMQ, "Messaging")
                .subtitle("ActiveMQ")
                .nextColumn(Ids.MESSAGING_CATEGORY)
                .preview(resources.previews().configurationMessaging())
                .build());
        add(new SubsystemMetadata.Builder(MODCLUSTER, "Modcluster")
                .token(NameTokens.MODCLUSTER)
                .preview(resources.previews().configurationModcluster())
                .build());
        add(new SubsystemMetadata.Builder(NAMING, "Naming")
                .preview(resources.previews().configurationNaming())
                .build());
        add(new SubsystemMetadata.Builder(POJO, "Pojo")
                .preview(resources.previews().configurationPojo())
                .build());
        add(new SubsystemMetadata.Builder(REMOTING, "Remoting")
                .token(NameTokens.REMOTING)
                .preview(resources.previews().configurationRemoting())
                .build());
        add(new SubsystemMetadata.Builder(REQUEST_CONTROLLER, "Request Controller")
                .token(NameTokens.REQUEST_CONTROLLER)
                .preview(resources.previews().configurationRequestController())
                .build());
        add(new SubsystemMetadata.Builder(RESOURCE_ADAPTERS, "Resource Adapters")
                .nextColumn(Ids.RESOURCE_ADAPTER)
                .preview(resources.previews().configurationResourceAdapters())
                .build());
        add(new SubsystemMetadata.Builder(SAR, "SAR")
                .preview(resources.previews().configurationSar())
                .build());
        add(new SubsystemMetadata.Builder(SECURITY, "Security")
                .subtitle("Legacy")
                .nextColumn(Ids.SECURITY_DOMAIN)
                .token(NameTokens.SECURITY_CONFIGURATION)
                .preview(resources.previews().configurationSecurityDomains())
                .build());
        add(new SubsystemMetadata.Builder(SECURITY_MANAGER, "Security Manager")
                .preview(resources.previews().configurationSecurityManager())
                .build());
        add(new SubsystemMetadata.Builder(SINGLETON, "Singleton")
                .preview(resources.previews().configurationSingleton())
                .build());
        add(new SubsystemMetadata.Builder(TRANSACTIONS, "Transactions")
                .token(NameTokens.TRANSACTIONS)
                .preview(resources.previews().configurationTransactions())
                .build());
        add(new SubsystemMetadata.Builder(UNDERTOW, "Web")
                .subtitle("Undertow")
                .nextColumn(Ids.UNDERTOW_SETTINGS)
                .preview(resources.previews().configurationUndertow())
                .build());
        add(new SubsystemMetadata.Builder(WEBSERVICES, "Web Services")
                .token(NameTokens.WEBSERVICES)
                .preview(resources.previews().configurationWebservices())
                .build());
        add(new SubsystemMetadata.Builder(WELD, "Weld")
                .preview(resources.previews().configurationWeld())
                .build());
    }

    private void add(SubsystemMetadata subsystem) {
        subsystems.put(subsystem.getName(), subsystem);
    }

    public boolean contains(String name) {
        return subsystems.containsKey(name);
    }

    public SubsystemMetadata get(String name) {
        return subsystems.get(name);
    }
}