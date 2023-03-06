
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.021.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "misMtchAccptncNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.021.001.03")
public class MxTsmt02100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MisMtchAccptncNtfctn", required = true)
    protected MisMatchAcceptanceNotificationV03 misMtchAccptncNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MisMatchAcceptanceNotificationV03 .class, MxTsmt02100103 .class, PendingActivity2 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.021.001.03";

    public MxTsmt02100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02100103(final String xml) {
        this();
        MxTsmt02100103 tmp = parse(xml);
        misMtchAccptncNtfctn = tmp.getMisMtchAccptncNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the misMtchAccptncNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MisMatchAcceptanceNotificationV03 }
     *     
     */
    public MisMatchAcceptanceNotificationV03 getMisMtchAccptncNtfctn() {
        return misMtchAccptncNtfctn;
    }

    /**
     * Sets the value of the misMtchAccptncNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MisMatchAcceptanceNotificationV03 }
     *     
     */
    public MxTsmt02100103 setMisMtchAccptncNtfctn(MisMatchAcceptanceNotificationV03 value) {
        this.misMtchAccptncNtfctn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxTsmt02100103 parse(String xml) {
        return ((MxTsmt02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt02100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02100103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02100103) parserImpl.read(MxTsmt02100103 .class, xml, _classes));
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
     * Creates an MxTsmt02100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02100103 message
     * @return
     *     a new instance of MxTsmt02100103
     */
    public final static MxTsmt02100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt02100103 .class);
    }

}
