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
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxWrite;
import com.prowidesoftware.swift.model.mx.MxWriteImpl;

/**
 * Helper class to find implementation of interfaces
 *
 * @since 7.6
 * @deprecated the MX read/write implementation injection is no longer used since the ISO20022 open source extension for Prowide Core
 */
@ProwideDeprecated(phase3 = TargetYear.SRU2021)
public class Resolver {

    private Resolver() {
    }

    /**
     * @return an instance of MxWriteImpl
     */
    public static MxWrite mxWrite() {
        return new MxWriteImpl();
    }

    /**
     * @return returns an instance of MxReadImpl
     */
    public static MxRead mxRead() {
        return new MxReadImpl();
    }

}