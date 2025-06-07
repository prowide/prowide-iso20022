/*
 * Copyright 2006-2023 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import java.util.concurrent.ExecutionException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Cache for {@link javax.xml.bind.JAXBContext} instances per message type.
 *
 * <p>It is used to achieve better performance when marshalling or unmarshalling MX messages.
 *
 * @since 9.0
 */
public interface JaxbContextCache {

    /**
     * Returns the cached context to marshall or unmarshall a message.
     *
     * <p>Cache implementations should be per message type, so the actual message class name could be used as key.
     *
     * <p>Regarding the JAXBContext creation, notice the namespace or package cannot be used because all dictionary
     * classes in the model share the same "dic" package.
     *
     * <p>The classes parameter is used to avoid reflection and improve performance. Can be used when the set of
     * jaxb generated classes for a specific model is known. This is the case for MX messages, where the set of classes
     * is available in the AbstractMX subclass. Thus, when the classes array is received, the context can be created
     * directly with: <code>JAXBContext.newInstance(classes)</code>. And the messageClass can be used as key.
     *
     * <p>When the classes parameter is not available, the context can be created with:
     * <code>JAXBContext.newInstance(messageClass)</code>.
     *
     * @param messageClass class of the message to be read or written, cannot be null
     * @param classes      comprehensive list of classes for the context, null or empty to create a context with the messageClass
     * @return cached context for the message type
     * @throws JAXBException
     * @throws ExecutionException
     */
    JAXBContext get(final Class messageClass, final Class<?>[] classes) throws JAXBException, ExecutionException;
}
