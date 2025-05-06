
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
 * Class for fxtr.015.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradInstrAmdmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.06")
public class MxFxtr01500106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradInstrAmdmnt", required = true)
    protected ForeignExchangeTradeInstructionAmendmentV06 fxTradInstrAmdmnt;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AgreementConditions1 .class, AllocationIndicator1Code.class, AmountOrRate4Choice.class, AmountsAndValueDate8 .class, CalculationAgent1Choice.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, ContactInformation1 .class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting3 .class, CurrencyOrDigitalTokenAmount2Choice.class, DateAndDateTime2Choice.class, DigitalTokenAmount3 .class, FXAmountType1Choice.class, FXAmountType1Code.class, FXCommissionOrFee1 .class, ForeignExchangeTradeInstructionAmendmentV06 .class, FundIdentification5 .class, GeneralInformation9 .class, IdentificationSource3Choice.class, MatchingSystemReference1Choice.class, MxFxtr01500106 .class, NDFOpeningFixing1Choice.class, NameAndAddress8 .class, NonDeliverableForwardConditions1 .class, OpeningConditions1 .class, OtherIdentification1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PartyIdentification60 .class, PostTradeEvent1 .class, PostTradeEventType2Choice.class, PostalAddress1 .class, ProductIdentifier3Choice.class, ProfitAndLossAmount2 .class, RegulatoryReporting8 .class, SecurityIdentification19 .class, SettlementParties120 .class, SettlementRateSource1 .class, SideIndicator1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAgreement15 .class, TradePartyIdentification8 .class, Trading1MethodCode.class, TradingSideTransactionReporting3 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.06";

    public MxFxtr01500106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01500106(final String xml) {
        this();
        MxFxtr01500106 tmp = parse(xml);
        fxTradInstrAmdmnt = tmp.getFXTradInstrAmdmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01500106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradInstrAmdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeInstructionAmendmentV06 }
     *     
     */
    public ForeignExchangeTradeInstructionAmendmentV06 getFXTradInstrAmdmnt() {
        return fxTradInstrAmdmnt;
    }

    /**
     * Sets the value of the fxTradInstrAmdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeInstructionAmendmentV06 }
     *     
     */
    public MxFxtr01500106 setFXTradInstrAmdmnt(ForeignExchangeTradeInstructionAmendmentV06 value) {
        this.fxTradInstrAmdmnt = value;
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
    public static MxFxtr01500106 parse(String xml) {
        return ((MxFxtr01500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01500106 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01500106 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01500106) parserImpl.read(MxFxtr01500106 .class, xml, _classes));
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
     * Creates an MxFxtr01500106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01500106 message
     * @return
     *     a new instance of MxFxtr01500106
     */
    public static final MxFxtr01500106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01500106 .class);
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
