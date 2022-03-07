
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
 * Class for seti.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dscldBidReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seti.014.001.01")
public class MxSeti01400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DscldBidReq", required = true)
    protected DisclosedBidRequest dscldBidReq;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, BasisPriceType1Choice.class, BasisPriceType1Code.class, Bid1 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DateType1Choice.class, DisclosedBid1 .class, DisclosedBidRequest.class, DocumentIdentification11 .class, GenericIdentification1 .class, GenericIdentification13 .class, LiquidityAndStatistics1 .class, LiquidityIndicatorType1Code.class, MxSeti01400101 .class, NameAndAddress5 .class, PartyIdentification23 .class, PostalAddress1 .class, PurposeCode1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesSettlement2 .class, SettlementDate2Code.class, Side1Code.class, TradeType2Code.class, TradingSession1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seti.014.001.01";

    public MxSeti01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti01400101(final String xml) {
        this();
        MxSeti01400101 tmp = parse(xml);
        dscldBidReq = tmp.getDscldBidReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dscldBidReq property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosedBidRequest }
     *     
     */
    public DisclosedBidRequest getDscldBidReq() {
        return dscldBidReq;
    }

    /**
     * Sets the value of the dscldBidReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosedBidRequest }
     *     
     */
    public MxSeti01400101 setDscldBidReq(DisclosedBidRequest value) {
        this.dscldBidReq = value;
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
    public static MxSeti01400101 parse(String xml) {
        return ((MxSeti01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeti01400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeti01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti01400101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti01400101) parserImpl.read(MxSeti01400101 .class, xml, _classes));
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
     * Creates an MxSeti01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti01400101 message
     * @return
     *     a new instance of MxSeti01400101
     */
    public final static MxSeti01400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeti01400101 .class);
    }

}
