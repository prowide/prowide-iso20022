
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
 * Class for camt.016.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getCcyXchgRate"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.016.001.04")
public class MxCamt01600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetCcyXchgRate", required = true)
    protected GetCurrencyExchangeRateV04 getCcyXchgRate;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CurrencyCriteriaDefinition1Choice.class, CurrencyExchangeCriteria2 .class, CurrencyExchangeSearchCriteria1 .class, CurrencyQueryDefinition3 .class, GetCurrencyExchangeRateV04 .class, MessageHeader1 .class, MxCamt01600104 .class, QueryType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.016.001.04";

    public MxCamt01600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01600104(final String xml) {
        this();
        MxCamt01600104 tmp = parse(xml);
        getCcyXchgRate = tmp.getGetCcyXchgRate();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getCcyXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link GetCurrencyExchangeRateV04 }
     *     
     */
    public GetCurrencyExchangeRateV04 getGetCcyXchgRate() {
        return getCcyXchgRate;
    }

    /**
     * Sets the value of the getCcyXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCurrencyExchangeRateV04 }
     *     
     */
    public MxCamt01600104 setGetCcyXchgRate(GetCurrencyExchangeRateV04 value) {
        this.getCcyXchgRate = value;
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
    public static MxCamt01600104 parse(String xml) {
        return ((MxCamt01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01600104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01600104) parserImpl.read(MxCamt01600104 .class, xml, _classes));
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
     * Creates an MxCamt01600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01600104 message
     * @return
     *     a new instance of MxCamt01600104
     */
    public static final MxCamt01600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01600104 .class);
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
