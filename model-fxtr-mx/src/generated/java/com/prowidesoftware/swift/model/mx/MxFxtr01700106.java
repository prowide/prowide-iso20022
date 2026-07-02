
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
 * Class for fxtr.017.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradStsAndDtlsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.06")
public class MxFxtr01700106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
    protected ForeignExchangeTradeStatusAndDetailsNotificationV06 fxTradStsAndDtlsNtfctn;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AgreementConditions1 .class, AllocationIndicator1Code.class, AmountOrRate4Choice.class, AmountsAndValueDate8 .class, CalculationAgent1Choice.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, ContactInformation1 .class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting3 .class, CurrencyOrDigitalTokenAmount2Choice.class, DateAndDateTime2Choice.class, DigitalTokenAmount3 .class, FXAmountType1Choice.class, FXAmountType1Code.class, FXCommissionOrFee1 .class, FixingConditions1 .class, ForeignExchangeTradeStatusAndDetailsNotificationV06 .class, FundIdentification5 .class, GeneralInformation9 .class, IdentificationSource3Choice.class, MxFxtr01700106 .class, NameAndAddress8 .class, NonDeliverableForwardConditions2 .class, OpeningConditions1 .class, OtherIdentification1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PartyIdentification60 .class, PostTradeEvent1 .class, PostTradeEventType2Choice.class, PostalAddress1 .class, ProductIdentifier3Choice.class, ProfitAndLossAmount2 .class, RegulatoryReporting8 .class, SecurityIdentification19 .class, SettlementParties120 .class, SettlementRateSource1 .class, SideIndicator1Code.class, SplitTradeDetails5 .class, Status27Choice.class, Status28Choice.class, StatusAndSubStatus2 .class, StatusSubType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAgreement12 .class, TradeData14 .class, TradeData16 .class, TradePartyIdentification8 .class, TradeStatus6Code.class, TradeStatus7Code.class, Trading1MethodCode.class, TradingSideTransactionReporting3 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.06";

    public MxFxtr01700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01700106(final String xml) {
        this();
        MxFxtr01700106 tmp = parse(xml);
        fxTradStsAndDtlsNtfctn = tmp.getFXTradStsAndDtlsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV06 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV06 getFXTradStsAndDtlsNtfctn() {
        return fxTradStsAndDtlsNtfctn;
    }

    /**
     * Sets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV06 }
     *     
     */
    public MxFxtr01700106 setFXTradStsAndDtlsNtfctn(ForeignExchangeTradeStatusAndDetailsNotificationV06 value) {
        this.fxTradStsAndDtlsNtfctn = value;
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
    public static MxFxtr01700106 parse(String xml) {
        return ((MxFxtr01700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01700106 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01700106 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01700106) parserImpl.read(MxFxtr01700106 .class, xml, _classes));
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
     * Creates an MxFxtr01700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01700106 message
     * @return
     *     a new instance of MxFxtr01700106
     */
    public final static MxFxtr01700106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01700106 .class);
    }

}
