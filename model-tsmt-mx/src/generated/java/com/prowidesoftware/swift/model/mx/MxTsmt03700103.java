
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
 * Class for tsmt.037.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.037.001.03")
public class MxTsmt03700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsRpt", required = true)
    protected StatusReportV03Tsmt03700103 stsRpt;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {BICIdentification1 .class, BaselineStatus3Code.class, MessageIdentification1 .class, MxTsmt03700103 .class, StatusReportItems2 .class, StatusReportV03Tsmt03700103 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.037.001.03";

    public MxTsmt03700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt03700103(final String xml) {
        this();
        MxTsmt03700103 tmp = parse(xml);
        stsRpt = tmp.getStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt03700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportV03Tsmt03700103 }
     *     
     */
    public StatusReportV03Tsmt03700103 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportV03Tsmt03700103 }
     *     
     */
    public MxTsmt03700103 setStsRpt(StatusReportV03Tsmt03700103 value) {
        this.stsRpt = value;
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
    public static MxTsmt03700103 parse(String xml) {
        return ((MxTsmt03700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt03700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt03700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt03700103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt03700103) parserImpl.read(MxTsmt03700103 .class, xml, _classes));
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
     * Creates an MxTsmt03700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt03700103 message
     * @return
     *     a new instance of MxTsmt03700103
     */
    public static final MxTsmt03700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt03700103 .class);
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
