
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
 * Class for tsmt.048.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "spclNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.048.001.01")
public class MxTsmt04800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SpclNtfctn", required = true)
    protected SpecialNotificationV01 spclNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 48;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt04800101 .class, Notification1 .class, NotificationType1Code.class, PendingActivity2 .class, SimpleIdentificationInformation.class, SpecialNotificationV01 .class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.048.001.01";

    public MxTsmt04800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt04800101(final String xml) {
        this();
        MxTsmt04800101 tmp = parse(xml);
        spclNtfctn = tmp.getSpclNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt04800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the spclNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNotificationV01 }
     *     
     */
    public SpecialNotificationV01 getSpclNtfctn() {
        return spclNtfctn;
    }

    /**
     * Sets the value of the spclNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNotificationV01 }
     *     
     */
    public MxTsmt04800101 setSpclNtfctn(SpecialNotificationV01 value) {
        this.spclNtfctn = value;
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
    public static MxTsmt04800101 parse(String xml) {
        return ((MxTsmt04800101) MxReadImpl.parse(MxTsmt04800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt04800101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt04800101) parserImpl.read(MxTsmt04800101 .class, xml, _classes));
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
     * Creates an MxTsmt04800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt04800101 message
     * @return
     *     a new instance of MxTsmt04800101
     */
    public final static MxTsmt04800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt04800101 .class);
    }

}
