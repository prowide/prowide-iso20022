
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for secl.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradLegNtfctnCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.002.001.02")
public class MxSecl00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TradLegNtfctnCxl", required = true)
    protected TradeLegNotificationCancellationV02 tradLegNtfctnCxl;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AmountAndDirection21 .class, AmountAndDirection27 .class, Clearing2 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat15Choice.class, DateType1Code.class, DeliveringPartiesAndAccount7 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification20 .class, MarketIdentification21 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00200102 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, NettingEligible1Code.class, NonGuaranteedTrade2 .class, OtherIdentification1 .class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyIdentificationAndAccount32 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceivingPartiesAndAccount7 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, Settlement1 .class, Side1Code.class, SimpleIdentificationInformation.class, Status5Code.class, SubAccount1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg5 .class, TradeLegNotificationCancellationV02 .class, TradePosting1Code.class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.002.001.02";

    public MxSecl00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00200102(final String xml) {
        this();
        MxSecl00200102 tmp = parse(xml);
        tradLegNtfctnCxl = tmp.getTradLegNtfctnCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradLegNtfctnCxl property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLegNotificationCancellationV02 }
     *     
     */
    public TradeLegNotificationCancellationV02 getTradLegNtfctnCxl() {
        return tradLegNtfctnCxl;
    }

    /**
     * Sets the value of the tradLegNtfctnCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLegNotificationCancellationV02 }
     *     
     */
    public MxSecl00200102 setTradLegNtfctnCxl(TradeLegNotificationCancellationV02 value) {
        this.tradLegNtfctnCxl = value;
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
    public static MxSecl00200102 parse(String xml) {
        return ((MxSecl00200102) MxReadImpl.parse(MxSecl00200102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00200102 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00200102) parserImpl.read(MxSecl00200102 .class, xml, _classes));
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
     * Creates an MxSecl00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00200102 message
     * @return
     *     a new instance of MxSecl00200102
     */
    public final static MxSecl00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00200102 .class);
    }

}
