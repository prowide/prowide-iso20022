
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.016.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getCcyXchgRate"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.016.001.03")
public class MxCamt01600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetCcyXchgRate", required = true)
    protected GetCurrencyExchangeRateV03 getCcyXchgRate;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CurrencyCriteriaDefinition1Choice.class, CurrencyExchangeCriteria2 .class, CurrencyExchangeSearchCriteria1 .class, CurrencyQueryDefinition3 .class, GetCurrencyExchangeRateV03 .class, MessageHeader1 .class, MxCamt01600103 .class, QueryType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.016.001.03";

    public MxCamt01600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01600103(final String xml) {
        this();
        MxCamt01600103 tmp = parse(xml);
        getCcyXchgRate = tmp.getGetCcyXchgRate();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getCcyXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link GetCurrencyExchangeRateV03 }
     *     
     */
    public GetCurrencyExchangeRateV03 getGetCcyXchgRate() {
        return getCcyXchgRate;
    }

    /**
     * Sets the value of the getCcyXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCurrencyExchangeRateV03 }
     *     
     */
    public MxCamt01600103 setGetCcyXchgRate(GetCurrencyExchangeRateV03 value) {
        this.getCcyXchgRate = value;
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
    public static MxCamt01600103 parse(String xml) {
        return ((MxCamt01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01600103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01600103) parserImpl.read(MxCamt01600103 .class, xml, _classes));
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
     * Creates an MxCamt01600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01600103 message
     * @return
     *     a new instance of MxCamt01600103
     */
    public final static MxCamt01600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01600103 .class);
    }

}
