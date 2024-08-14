
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
 * Class for fxtr.017.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradStsAndDtlsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.04")
public class MxFxtr01700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
    protected ForeignExchangeTradeStatusAndDetailsNotificationV04 fxTradStsAndDtlsNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate3 .class, AgreementConditions1 .class, AllocationIndicator1Code.class, AmountsAndValueDate1 .class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, ContactInformation1 .class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting1 .class, DateAndDateTimeChoice.class, FixingConditions1 .class, ForeignExchangeTradeStatusAndDetailsNotificationV04 .class, FundIdentification4 .class, GeneralInformation5 .class, IdentificationSource3Choice.class, MxFxtr01700104 .class, NameAndAddress8 .class, NonDeliverableForwardConditions2 .class, OpeningConditions1 .class, OtherIdentification1 .class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification60 .class, PartyIdentification73Choice.class, PostalAddress1 .class, RegulatoryReporting6 .class, SecurityIdentification19 .class, SettlementParties29 .class, SettlementRateSource1 .class, SideIndicator1Code.class, SplitTradeDetails3 .class, Status27Choice.class, Status28Choice.class, StatusAndSubStatus2 .class, StatusSubType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAgreement12 .class, TradeData14 .class, TradeData16 .class, TradePartyIdentification6 .class, TradeStatus6Code.class, TradeStatus7Code.class, Trading1MethodCode.class, TradingSideTransactionReporting1 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.04";

    public MxFxtr01700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01700104(final String xml) {
        this();
        MxFxtr01700104 tmp = parse(xml);
        fxTradStsAndDtlsNtfctn = tmp.getFXTradStsAndDtlsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV04 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV04 getFXTradStsAndDtlsNtfctn() {
        return fxTradStsAndDtlsNtfctn;
    }

    /**
     * Sets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV04 }
     *     
     */
    public MxFxtr01700104 setFXTradStsAndDtlsNtfctn(ForeignExchangeTradeStatusAndDetailsNotificationV04 value) {
        this.fxTradStsAndDtlsNtfctn = value;
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
    public static MxFxtr01700104 parse(String xml) {
        return ((MxFxtr01700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01700104 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01700104) parserImpl.read(MxFxtr01700104 .class, xml, _classes));
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
     * Creates an MxFxtr01700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01700104 message
     * @return
     *     a new instance of MxFxtr01700104
     */
    public static final MxFxtr01700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01700104 .class);
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
