
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
 * Class for sese.042.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "buyInRgltryAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.042.001.01")
public class MxSese04200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BuyInRgltryAdvcRspn", required = true)
    protected BuyInRegulatoryAdviceResponseV01 buyInRgltryAdvcRspn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus33Choice.class, AcknowledgementReason10Code.class, AcknowledgementReason21 .class, AcknowledgementReason24Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AmountAndDirection102 .class, BuyInAdviceDetails1 .class, BuyInDeferral1Code.class, BuyInRegulatoryAdviceResponseV01 .class, BuyInState1Code.class, DateAndDateTime2Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification14 .class, IdentificationSource3Choice.class, MxSese04200101 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification127Choice.class, PartyIdentification144 .class, ProcessingStatus79Choice.class, RateAndAmountFormat39Choice.class, References23 .class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus31Choice.class, RejectionReason27Code.class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.042.001.01";

    public MxSese04200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese04200101(final String xml) {
        this();
        MxSese04200101 tmp = parse(xml);
        buyInRgltryAdvcRspn = tmp.getBuyInRgltryAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese04200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the buyInRgltryAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInRegulatoryAdviceResponseV01 }
     *     
     */
    public BuyInRegulatoryAdviceResponseV01 getBuyInRgltryAdvcRspn() {
        return buyInRgltryAdvcRspn;
    }

    /**
     * Sets the value of the buyInRgltryAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInRegulatoryAdviceResponseV01 }
     *     
     */
    public MxSese04200101 setBuyInRgltryAdvcRspn(BuyInRegulatoryAdviceResponseV01 value) {
        this.buyInRgltryAdvcRspn = value;
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
    public static MxSese04200101 parse(String xml) {
        return ((MxSese04200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese04200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese04200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese04200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese04200101 parse(String xml, MxRead parserImpl) {
        return ((MxSese04200101) parserImpl.read(MxSese04200101 .class, xml, _classes));
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
     * Creates an MxSese04200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese04200101 message
     * @return
     *     a new instance of MxSese04200101
     */
    public final static MxSese04200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese04200101 .class);
    }

}
