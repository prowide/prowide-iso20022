
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.036.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsXtnsnReqNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.036.001.03")
public class MxTsmt03600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsXtnsnReqNtfctn", required = true)
    protected StatusExtensionRequestNotificationV03 stsXtnsnReqNtfctn;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt03600103 .class, PendingActivity2 .class, SimpleIdentificationInformation.class, StatusExtensionRequestNotificationV03 .class, TransactionStatus5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.036.001.03";

    public MxTsmt03600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt03600103(final String xml) {
        this();
        MxTsmt03600103 tmp = parse(xml);
        stsXtnsnReqNtfctn = tmp.getStsXtnsnReqNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt03600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsXtnsnReqNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusExtensionRequestNotificationV03 }
     *     
     */
    public StatusExtensionRequestNotificationV03 getStsXtnsnReqNtfctn() {
        return stsXtnsnReqNtfctn;
    }

    /**
     * Sets the value of the stsXtnsnReqNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusExtensionRequestNotificationV03 }
     *     
     */
    public MxTsmt03600103 setStsXtnsnReqNtfctn(StatusExtensionRequestNotificationV03 value) {
        this.stsXtnsnReqNtfctn = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxTsmt03600103 parse(String xml) {
        return ((MxTsmt03600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt03600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt03600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt03600103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt03600103) parserImpl.read(MxTsmt03600103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsmt03600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt03600103 message
     * @return
     *     a new instance of MxTsmt03600103
     */
    public static final MxTsmt03600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt03600103 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
