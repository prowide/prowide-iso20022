
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seti.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dscldBidRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seti.015.001.01")
public class MxSeti01500101
    extends AbstractMX
{

    @XmlElement(name = "DscldBidRspn", required = true)
    protected DisclosedBidResponse dscldBidRspn;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AmountOrRate1Choice.class, Bid2 .class, BidResponsePrice1 .class, Commission2 .class, CommissionType1Choice.class, CommissionValueType1Code.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DateType1Choice.class, DisclosedBidResponse.class, DocumentIdentification11 .class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeti01500101 .class, NameAndAddress5 .class, PartyIdentification23 .class, PostalAddress1 .class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, SecuritiesSettlement2 .class, SettlementDate2Code.class, Side1Code.class, TradingSession1 .class, TypeOfPrice1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seti.015.001.01";

    public MxSeti01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti01500101(final String xml) {
        this();
        MxSeti01500101 tmp = parse(xml);
        dscldBidRspn = tmp.getDscldBidRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dscldBidRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosedBidResponse }
     *     
     */
    public DisclosedBidResponse getDscldBidRspn() {
        return dscldBidRspn;
    }

    /**
     * Sets the value of the dscldBidRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosedBidResponse }
     *     
     */
    public MxSeti01500101 setDscldBidRspn(DisclosedBidResponse value) {
        this.dscldBidRspn = value;
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
    public static MxSeti01500101 parse(String xml) {
        return ((MxSeti01500101) MxReadImpl.parse(MxSeti01500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti01500101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti01500101) parserImpl.read(MxSeti01500101 .class, xml, _classes));
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
     * Creates an MxSeti01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti01500101 message
     * @return
     *     a new instance of MxSeti01500101
     */
    public final static MxSeti01500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeti01500101 .class);
    }

}
