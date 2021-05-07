
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
 * Class for secl.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradLegStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.003.001.03")
public class MxSecl00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TradLegStmt", required = true)
    protected TradeLegStatementV03 tradLegStmt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AlternatePartyIdentification5 .class, AmountAndDirection21 .class, AmountAndDirection27 .class, Clearing4 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat15Choice.class, DateType1Code.class, DeliveringPartiesAndAccount11 .class, EventFrequency6Code.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, IdentificationType40Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketIdentification85 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00300103 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, NettingEligible1Code.class, NonGuaranteedTrade3 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentification83Choice.class, PartyIdentificationAndAccount100 .class, PartyIdentificationAndAccount102 .class, PartyIdentificationAndAccount31 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceivingPartiesAndAccount11 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat7Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, Settlement1 .class, Side1Code.class, SimpleIdentificationInformation4 .class, Statement31 .class, StatementUpdateType1Code.class, SubAccount4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg9 .class, TradeLegStatement3 .class, TradeLegStatementV03 .class, TradePosting1Code.class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.003.001.03";

    public MxSecl00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00300103(final String xml) {
        this();
        MxSecl00300103 tmp = parse(xml);
        tradLegStmt = tmp.getTradLegStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradLegStmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLegStatementV03 }
     *     
     */
    public TradeLegStatementV03 getTradLegStmt() {
        return tradLegStmt;
    }

    /**
     * Sets the value of the tradLegStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLegStatementV03 }
     *     
     */
    public MxSecl00300103 setTradLegStmt(TradeLegStatementV03 value) {
        this.tradLegStmt = value;
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
    public static MxSecl00300103 parse(String xml) {
        return ((MxSecl00300103) MxReadImpl.parse(MxSecl00300103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00300103 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00300103) parserImpl.read(MxSecl00300103 .class, xml, _classes));
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
     * Creates an MxSecl00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00300103 message
     * @return
     *     a new instance of MxSecl00300103
     */
    public final static MxSecl00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00300103 .class);
    }

}
