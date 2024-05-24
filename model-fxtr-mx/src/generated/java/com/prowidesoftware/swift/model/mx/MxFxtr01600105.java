
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
 * Class for fxtr.016.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradInstrCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05")
public class MxFxtr01600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradInstrCxl", required = true)
    protected ForeignExchangeTradeInstructionCancellationV05 fxTradInstrCxl;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AgreementConditions1 .class, AllocationIndicator1Code.class, AmountOrRate4Choice.class, AmountsAndValueDate6 .class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, ContactInformation1 .class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting2 .class, CurrencyOrDigitalTokenAmount1Choice.class, DateAndDateTime2Choice.class, DigitalTokenAmount1 .class, FXAmountType1Choice.class, FXAmountType1Code.class, FXCommissionOrFee1 .class, ForeignExchangeTradeInstructionCancellationV05 .class, FundIdentification5 .class, GeneralInformation8 .class, IdentificationSource3Choice.class, MatchingSystemReference1Choice.class, MxFxtr01600105 .class, NDFOpeningFixing1Choice.class, NameAndAddress8 .class, NonDeliverableForwardConditions1 .class, OpeningConditions1 .class, OtherIdentification1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PartyIdentification60 .class, PostalAddress1 .class, RegulatoryReporting7 .class, SecurityIdentification19 .class, SettlementParties120 .class, SettlementRateSource1 .class, SideIndicator1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAgreement15 .class, TradePartyIdentification8 .class, Trading1MethodCode.class, TradingSideTransactionReporting2 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05";

    public MxFxtr01600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01600105(final String xml) {
        this();
        MxFxtr01600105 tmp = parse(xml);
        fxTradInstrCxl = tmp.getFXTradInstrCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradInstrCxl property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeInstructionCancellationV05 }
     *     
     */
    public ForeignExchangeTradeInstructionCancellationV05 getFXTradInstrCxl() {
        return fxTradInstrCxl;
    }

    /**
     * Sets the value of the fxTradInstrCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeInstructionCancellationV05 }
     *     
     */
    public MxFxtr01600105 setFXTradInstrCxl(ForeignExchangeTradeInstructionCancellationV05 value) {
        this.fxTradInstrCxl = value;
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
    public static MxFxtr01600105 parse(String xml) {
        return ((MxFxtr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01600105 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01600105 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01600105) parserImpl.read(MxFxtr01600105 .class, xml, _classes));
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
     * Creates an MxFxtr01600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01600105 message
     * @return
     *     a new instance of MxFxtr01600105
     */
    public static final MxFxtr01600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01600105 .class);
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
