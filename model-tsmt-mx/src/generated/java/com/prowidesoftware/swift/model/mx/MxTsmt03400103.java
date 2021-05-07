
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.034.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsXtnsnRjctnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.034.001.03")
public class MxTsmt03400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsXtnsnRjctnNtfctn", required = true)
    protected StatusExtensionRejectionNotificationV03 stsXtnsnRjctnNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt03400103 .class, PendingActivity2 .class, Reason2 .class, SimpleIdentificationInformation.class, StatusExtensionRejectionNotificationV03 .class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.034.001.03";

    public MxTsmt03400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt03400103(final String xml) {
        this();
        MxTsmt03400103 tmp = parse(xml);
        stsXtnsnRjctnNtfctn = tmp.getStsXtnsnRjctnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt03400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsXtnsnRjctnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusExtensionRejectionNotificationV03 }
     *     
     */
    public StatusExtensionRejectionNotificationV03 getStsXtnsnRjctnNtfctn() {
        return stsXtnsnRjctnNtfctn;
    }

    /**
     * Sets the value of the stsXtnsnRjctnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusExtensionRejectionNotificationV03 }
     *     
     */
    public MxTsmt03400103 setStsXtnsnRjctnNtfctn(StatusExtensionRejectionNotificationV03 value) {
        this.stsXtnsnRjctnNtfctn = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsmt03400103 parse(String xml) {
        return ((MxTsmt03400103) MxReadImpl.parse(MxTsmt03400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt03400103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt03400103) parserImpl.read(MxTsmt03400103 .class, xml, _classes));
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
     * Creates an MxTsmt03400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt03400103 message
     * @return
     *     a new instance of MxTsmt03400103
     */
    public final static MxTsmt03400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt03400103 .class);
    }

}
