
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
 * Class for tsmt.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "amdmntAccptncNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.006.001.03")
public class MxTsmt00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AmdmntAccptncNtfctn", required = true)
    protected AmendmentAcceptanceNotificationV03 amdmntAccptncNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, AmendmentAcceptanceNotificationV03 .class, BICIdentification1 .class, BaselineStatus3Code.class, Count1 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt00600103 .class, PendingActivity2 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.006.001.03";

    public MxTsmt00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00600103(final String xml) {
        this();
        MxTsmt00600103 tmp = parse(xml);
        amdmntAccptncNtfctn = tmp.getAmdmntAccptncNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the amdmntAccptncNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentAcceptanceNotificationV03 }
     *     
     */
    public AmendmentAcceptanceNotificationV03 getAmdmntAccptncNtfctn() {
        return amdmntAccptncNtfctn;
    }

    /**
     * Sets the value of the amdmntAccptncNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentAcceptanceNotificationV03 }
     *     
     */
    public MxTsmt00600103 setAmdmntAccptncNtfctn(AmendmentAcceptanceNotificationV03 value) {
        this.amdmntAccptncNtfctn = value;
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
    public static MxTsmt00600103 parse(String xml) {
        return ((MxTsmt00600103) MxReadImpl.parse(MxTsmt00600103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00600103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00600103) parserImpl.read(MxTsmt00600103 .class, xml, _classes));
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
     * Creates an MxTsmt00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00600103 message
     * @return
     *     a new instance of MxTsmt00600103
     */
    public final static MxTsmt00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt00600103 .class);
    }

}
