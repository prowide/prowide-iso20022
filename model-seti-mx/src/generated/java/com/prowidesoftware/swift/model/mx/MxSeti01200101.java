
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
 * Class for seti.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nonDscldBidReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seti.012.001.01")
public class MxSeti01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NonDscldBidReq", required = true)
    protected NonDisclosedBidRequest nonDscldBidReq;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, BasisPriceType1Choice.class, BasisPriceType1Code.class, Bid1 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, ExchangeForPhysicalTradeParameters1 .class, GenericIdentification13 .class, Liquidity1 .class, LiquidityAndStatistics1 .class, LiquidityIndicatorType1Code.class, MxSeti01200101 .class, NonDisclosedBid1 .class, NonDisclosedBidRequest.class, TradeType2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seti.012.001.01";

    public MxSeti01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti01200101(final String xml) {
        this();
        MxSeti01200101 tmp = parse(xml);
        nonDscldBidReq = tmp.getNonDscldBidReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the nonDscldBidReq property.
     * 
     * @return
     *     possible object is
     *     {@link NonDisclosedBidRequest }
     *     
     */
    public NonDisclosedBidRequest getNonDscldBidReq() {
        return nonDscldBidReq;
    }

    /**
     * Sets the value of the nonDscldBidReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDisclosedBidRequest }
     *     
     */
    public MxSeti01200101 setNonDscldBidReq(NonDisclosedBidRequest value) {
        this.nonDscldBidReq = value;
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
    public static MxSeti01200101 parse(String xml) {
        return ((MxSeti01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeti01200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeti01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti01200101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti01200101) parserImpl.read(MxSeti01200101 .class, xml, _classes));
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
     * Creates an MxSeti01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti01200101 message
     * @return
     *     a new instance of MxSeti01200101
     */
    public final static MxSeti01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeti01200101 .class);
    }

}
