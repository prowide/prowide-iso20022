
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
 * Class for secl.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradLegNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:secl.001.001.01")
public class MxSecl00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TradLegNtfctn", required = true)
    protected TradeLegNotificationV01 tradLegNtfctn;
    public static final transient String BUSINESS_PROCESS = "secl";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AmountAndDirection20 .class, AmountAndDirection21 .class, Clearing1 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat15Choice.class, DateType1Code.class, DeliveringPartiesAndAccount5 .class, DocumentIdentification11 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification20 .class, MarketIdentification21 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00100101 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, NettingEligible1Code.class, NonGuaranteedTrade1 .class, OtherIdentification1 .class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyIdentificationAndAccount32 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceivingPartiesAndAccount6 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, SettlementDetails21 .class, Side1Code.class, SimpleIdentificationInformation.class, Status5Code.class, SubAccount1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg2 .class, TradeLegNotificationV01 .class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:secl.001.001.01";

    public MxSecl00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00100101(final String xml) {
        this();
        MxSecl00100101 tmp = parse(xml);
        tradLegNtfctn = tmp.getTradLegNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradLegNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLegNotificationV01 }
     *     
     */
    public TradeLegNotificationV01 getTradLegNtfctn() {
        return tradLegNtfctn;
    }

    /**
     * Sets the value of the tradLegNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLegNotificationV01 }
     *     
     */
    public MxSecl00100101 setTradLegNtfctn(TradeLegNotificationV01 value) {
        this.tradLegNtfctn = value;
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
    public static MxSecl00100101 parse(String xml) {
        return ((MxSecl00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00100101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00100101) parserImpl.read(MxSecl00100101 .class, xml, _classes));
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
     * Creates an MxSecl00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00100101 message
     * @return
     *     a new instance of MxSecl00100101
     */
    public static final MxSecl00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00100101 .class);
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
