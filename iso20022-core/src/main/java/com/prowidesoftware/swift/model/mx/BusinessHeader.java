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
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeader;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV01;
import org.w3c.dom.Element;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This header model was original implemented as a holder for the two available headers:
 * <ul>
 * <li>The ISO 20022 business application header: {@link ApplicationHeader}</li>
 * <li>The application header originally defined by swift: {@link BusinessApplicationHeaderV01}</li>
 * </ul>
 * <p>
 * A more flexible and scalable solution is done is provided now by the {@link AppHdr} interface and its implementing
 * classes. Usage of this BusinessHeader is discourage in favor of AppHdr implementations such as
 * {@link BusinessAppHdrV01} or {@link LegacyAppHdr}
 *
 * @since 7.7
 * @deprecated use specific implementation of {@link AppHdr} instead, such as {@link BusinessAppHdrV01}
 */
@Deprecated
@ProwideDeprecated(phase3 = TargetYear.SRU2022)
public class BusinessHeader implements AppHdr {

    /**
     * @deprecated use {@link LegacyAppHdr#NAMESPACE} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public static final transient String NAMESPACE_AH = "urn:swift:xsd:$ahV10";

    /**
     * @deprecated use {@link BusinessAppHdrV01#NAMESPACE} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public static final transient String NAMESPACE_BAH = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01";

    private ApplicationHeader applicationHeader;
    private BusinessApplicationHeaderV01 businessApplicationHeader;

    /**
     * @deprecated use a specific implementation of {@link AppHdr} instead, such as {@link BusinessAppHdrV01}
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public BusinessHeader() {
        super();
        DeprecationUtils.phase2(BusinessHeader.class, "BusinessHeader()", "Use a specific implementation of AppHdr instead, such as BusinessAppHdrV01");
    }

    /**
     * @deprecated use specific implementation of {@link AppHdr} instead, such as {@link LegacyAppHdr}
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public BusinessHeader(final ApplicationHeader applicationHeader) {
        this();
        this.applicationHeader = applicationHeader;
        DeprecationUtils.phase2(BusinessHeader.class, "BusinessHeader(ApplicationHeader)", "Use a specific implementation of AppHdr instead, such as LegacyAppHdr");
    }

    /**
     * @deprecated use specific implementation of {@link AppHdr} instead, such as {@link LegacyAppHdr}
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public BusinessHeader(final LegacyAppHdr legacyAppHdr) {
        this();
        this.applicationHeader = new ApplicationHeader();
        this.applicationHeader.setFrom(legacyAppHdr.getFrom());
        this.applicationHeader.setTo(legacyAppHdr.getTo());
        this.applicationHeader.setSvcName(legacyAppHdr.getSvcName());
        this.applicationHeader.setMsgName(legacyAppHdr.getMsgName());
        this.applicationHeader.setMsgRef(legacyAppHdr.getMsgRef());
        this.applicationHeader.setCrDate(legacyAppHdr.getCrDate());
        this.applicationHeader.setDup(legacyAppHdr.getDup());
        DeprecationUtils.phase2(BusinessHeader.class, "BusinessHeader(LegacyAppHdr)", "Use a specific implementation of AppHdr instead, such as LegacyAppHdr");
    }

    /**
     * @deprecated use specific implementation of {@link AppHdr} instead, such as {@link BusinessAppHdrV01}
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public BusinessHeader(final BusinessApplicationHeaderV01 businessApplicationHeader) {
        this();
        this.businessApplicationHeader = businessApplicationHeader;
        DeprecationUtils.phase2(BusinessHeader.class, "BusinessHeader(BusinessApplicationHeaderV01)", "Use a specific implementation of AppHdr instead, such as BusinessApplicationHeaderV01");
    }

    /**
     * @deprecated use specific implementation of {@link AppHdr} instead, such as {@link BusinessAppHdrV01}
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public BusinessHeader(final BusinessAppHdrV01 businessAppHdrV01) {
        this();
        this.businessApplicationHeader = new BusinessApplicationHeaderV01();
        this.businessApplicationHeader.setCharSet(businessAppHdrV01.getCharSet());
        this.businessApplicationHeader.setFr(businessAppHdrV01.getFr());
        this.businessApplicationHeader.setTo(businessAppHdrV01.getTo());
        this.businessApplicationHeader.setBizMsgIdr(businessAppHdrV01.getBizMsgIdr());
        this.businessApplicationHeader.setMsgDefIdr(businessAppHdrV01.getMsgDefIdr());
        this.businessApplicationHeader.setBizSvc(businessAppHdrV01.getBizSvc());
        this.businessApplicationHeader.setCreDt(businessAppHdrV01.getCreDt());
        this.businessApplicationHeader.setCpyDplct(businessAppHdrV01.getCpyDplct());
        this.businessApplicationHeader.setPssblDplct(businessAppHdrV01.isPssblDplct());
        this.businessApplicationHeader.setPrty(businessAppHdrV01.getPrty());
        this.businessApplicationHeader.setSgntr(businessAppHdrV01.getSgntr());
        this.businessApplicationHeader.setRltd(businessAppHdrV01.getRltd());
        DeprecationUtils.phase2(BusinessHeader.class, "BusinessHeader(BusinessAppHdrV01)", "Use a specific implementation of AppHdr instead, such as BusinessAppHdrV01");
    }

    /**
     * @deprecated use {@link AppHdrFactory#createBusinessAppHdrV01(String, String, String, MxId)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public static BusinessApplicationHeaderV01 createBusinessApplicationHeaderV01(final String sender, final String receiver, final String reference, final MxId id) {
        DeprecationUtils.phase2(BusinessHeader.class, "createBusinessApplicationHeaderV01(String, String, String, MxId)", "Use AppHdrFactory#createBusinessAppHdrV01(String, String, String, MxId) instead");

        BusinessAppHdrV01 businessAppHdrV01 = AppHdrFactory.createBusinessAppHdrV01(sender, receiver, reference, id);
        BusinessApplicationHeaderV01 result = new BusinessApplicationHeaderV01();
        result.setCharSet(businessAppHdrV01.getCharSet());
        result.setFr(businessAppHdrV01.getFr());
        result.setTo(businessAppHdrV01.getTo());
        result.setBizMsgIdr(businessAppHdrV01.getBizMsgIdr());
        result.setMsgDefIdr(businessAppHdrV01.getMsgDefIdr());
        result.setBizSvc(businessAppHdrV01.getBizSvc());
        result.setCreDt(businessAppHdrV01.getCreDt());
        result.setCpyDplct(businessAppHdrV01.getCpyDplct());
        result.setPssblDplct(businessAppHdrV01.isPssblDplct());
        result.setPrty(businessAppHdrV01.getPrty());
        result.setSgntr(businessAppHdrV01.getSgntr());
        result.setRltd(businessAppHdrV01.getRltd());
        return result;
    }

    /**
     * @deprecated use {@link AppHdrFactory#createBusinessAppHdrV01(String, String, String, MxId)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public static BusinessHeader create(final String sender, final String receiver, final String reference, final MxId id) {
        DeprecationUtils.phase2(BusinessHeader.class, "create(String, String, String, MxId)", "Use AppHdrFactory#createBusinessAppHdrV01(String, String, String, MxId) instead");
        return new BusinessHeader(createBusinessApplicationHeaderV01(sender, receiver, reference, id));
    }

    /**
     * @deprecated use {@link AppHdrFactory#createLegacyAppHdr(String, String, String, MxId)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2022)
    public static ApplicationHeader createApplicationHeader(final String sender, final String receiver, final String reference, final MxId id) {
        DeprecationUtils.phase2(BusinessHeader.class, "createApplicationHeader(String, String, String, MxId)", "Use AppHdrFactory#createLegacyAppHdr(String, String, String, MxId) instead");
        LegacyAppHdr legacyHdr = AppHdrFactory.createLegacyAppHdr(sender, receiver, reference, id);
        ApplicationHeader result = new ApplicationHeader();
        result.setFrom(legacyHdr.getFrom());
        result.setTo(legacyHdr.getTo());
        result.setSvcName(legacyHdr.getSvcName());
        result.setMsgName(legacyHdr.getMsgName());
        result.setMsgRef(legacyHdr.getMsgRef());
        result.setCrDate(legacyHdr.getCrDate());
        result.setDup(legacyHdr.getDup());
        return result;
    }

    public ApplicationHeader getApplicationHeader() {
        return applicationHeader;
    }

    public void setApplicationHeader(final ApplicationHeader applicationHeader) {
        if (this.businessApplicationHeader != null) {
            throw new IllegalStateException("can't set applicationHeader when businessApplicationHeader is not null, set it to null before. These attributes overlap each other");
        }
        this.applicationHeader = applicationHeader;
    }

    public BusinessApplicationHeaderV01 getBusinessApplicationHeader() {
        return businessApplicationHeader;
    }

    public void setBusinessApplicationHeader(final BusinessApplicationHeaderV01 businessApplicationHeader) {
        if (this.applicationHeader != null) {
            throw new IllegalStateException("can't set businessApplicationHeader when applicationHeader is not null, set it to null before. These attributes overlap each other");
        }
        this.businessApplicationHeader = businessApplicationHeader;
    }

    /**
     * Gets the sender BIC code.
     * <br>
     * If the header is a BAH, tries to gets the BIC code from this elements in the following order:
     * <ol>
     * 	<li>BusinessApplicationHeaderV01/Fr/FIId/FinInstnId/BICFI</li>
     *  <li>BusinessApplicationHeaderV01/Fr/OrgId/Id/OrgId/Id/AnyBIC</li>
     * </ol>
     * <br>
     * If the header is an AH, gets the same from ApplicationHeader/From/Type+Id where if Type
     * is BIC the Id is returned as is, otherwise the domain name is parsed to extract the SWIFT BIC
     *
     * @return found BIC or null if not present or cannot be parsed
     */
    public String from() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.from();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.from();
        }
        return null;
    }

    /**
     * Gets the receiver BIC code
     * <br>
     * If the header is a BAH, tries to gets the BIC code from this elements in the following order:
     * <ol>
     * 	<li>BusinessApplicationHeaderV01/To/FIId/FinInstnId/BICFI</li>
     *  <li>BusinessApplicationHeaderV01/To/OrgId/Id/OrgId/Id/AnyBIC</li>
     * </ol>
     * <br>
     * If the header is an AH, gets the same from ApplicationHeader/To/Type+Id where if Type
     * is BIC the Id is returned as is, otherwise the domain name is parsed to extract the SWIFT BIC
     *
     * @return found BIC or null if not present or cannot be parsed
     */
    public String to() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.to();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.to();
        }
        return null;
    }

    /**
     * Get the message reference.
     *
     * @see BusinessAppHdrV01#getBizMsgIdr()
     * @see LegacyAppHdr#getMsgRef()
     * @since 7.8
     */
    public String reference() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.reference();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.reference();
        }
        return null;
    }

    /**
     * @since 9.0.1
     */
    @Override
    public String messageName() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.messageName();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.messageName();
        }
        return null;
    }

    /**
     * @since 9.0.1
     */
    @Override
    public String serviceName() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.serviceName();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.serviceName();
        }
        return null;
    }

    /**
     * @since 9.0.1
     */
    @Override
    public boolean duplicate() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.duplicate();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.duplicate();
        }
        return false;
    }

    /**
     * @since 9.0.1
     */
    @Override
    public XMLGregorianCalendar creationDate() {
        if (this.applicationHeader != null) {
            return this.applicationHeader.creationDate();
        } else if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.creationDate();
        }
        return null;
    }

    /**
     * Get this header as an XML string.
     *
     * @return header serialized into XML string or null if neither header version is present
     * @see #xml(String, boolean)
     * @since 7.8
     */
    public String xml() {
        return xml(null, false);
    }

    /**
     * Get this header as an XML string.
     * Since this class contains a dual model supporting two type of headers (swift and ISO), if both
     * headers are present in the object the BusinessApplicationHeaderV01 will be used.
     *
     * @param prefix                optional prefix for namespace (empty by default)
     * @param includeXMLDeclaration true to include the XML declaration (false by default)
     * @return header serialized into XML string or null if neither header version is present
     * @since 7.8
     */
    public String xml(final String prefix, boolean includeXMLDeclaration) {
        if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.xml(prefix, includeXMLDeclaration);
        } else if (this.applicationHeader != null) {
            return this.applicationHeader.xml(prefix, includeXMLDeclaration);
        }
        return null;
    }

    /**
     * Gets the header as an Element object.
     *
     * @return Element this header parsed into Element or null if header is null
     * @since 7.8
     */
    public Element element() {
        if (this.businessApplicationHeader != null) {
            return this.businessApplicationHeader.element();
        } else if (this.applicationHeader != null) {
            return this.applicationHeader.element();
        }
        return null;
    }

    /**
     * Sets the creation date in the inner header object with current moment in UTC time zone.
     * <br>
     * Either of the inner headers must be not null. If both are null this method does nothing.
     *
     * @param overwrite if true, the creation date will always be set overwriting any previous value; if false it will be set only if it is not already set
     * @since 7.8.5
     */
    public void setCreationDate(boolean overwrite) {
        if (this.businessApplicationHeader != null) {
            this.businessApplicationHeader.setCreationDate(overwrite);
        } else if (this.applicationHeader != null) {
            this.applicationHeader.setCreationDate(overwrite);
        }
    }

}
