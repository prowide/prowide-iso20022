/*
 * Copyright 2006-2021 Prowide
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
package com.prowidesoftware.swift;

import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;

/**
 * @deprecated the MX read/write implementation injection is no longer used since the ISO20022 open source extension for Prowide Core
 */
@ProwideDeprecated(phase3 = TargetYear.SRU2021)
public class MxReadCoreV1 implements MxRead {

    /**
     * For the moment this is only available in the Prowide Integrator version
     */
    public AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class<? extends Object>[] classes) {
        throw new UnsupportedOperationException("For the moment this is only available in the integrator version");
    }

    /**
     * For the moment this is only available in the Prowide Integrator version
     */
    public AbstractMX read(String xml, MxId id) {
        throw new UnsupportedOperationException("For the moment this is only available in the integrator version");
    }

}
