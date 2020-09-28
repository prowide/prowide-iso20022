
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
 * Class for secl.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradLegStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:secl.003.001.01")
public class MxSecl00300101
    extends AbstractMX
{

    @XmlElement(name = "TradLegStmt", required = true)
    protected TradeLegStatementV01 tradLegStmt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AmountAndDirection20 .class, AmountAndDirection21 .class, Clearing1 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode3Choice.class, DateFormat15Choice.class, DateType1Code.class, DeliveringPartiesAndAccount5 .class, DocumentIdentification11 .class, EventFrequency6Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification20 .class, MarketIdentification21 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00300101 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, NettingEligible1Code.class, NonGuaranteedTrade1 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyIdentificationAndAccount32 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ReceivingPartiesAndAccount6 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification14 .class, SettlementDetails21 .class, Side1Code.class, SimpleIdentificationInformation.class, Statement31 .class, StatementUpdateType1Code.class, SubAccount1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg3 .class, TradeLegStatement1 .class, TradeLegStatementV01 .class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:secl.003.001.01";

    public MxSecl00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00300101(final String xml) {
        this();
        MxSecl00300101 tmp = parse(xml);
        tradLegStmt = tmp.getTradLegStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradLegStmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLegStatementV01 }
     *     
     */
    public TradeLegStatementV01 getTradLegStmt() {
        return tradLegStmt;
    }

    /**
     * Sets the value of the tradLegStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLegStatementV01 }
     *     
     */
    public MxSecl00300101 setTradLegStmt(TradeLegStatementV01 value) {
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
    public static MxSecl00300101 parse(String xml) {
        return ((MxSecl00300101) MxReadImpl.parse(MxSecl00300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00300101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00300101) parserImpl.read(MxSecl00300101 .class, xml, _classes));
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
     * Creates an MxSecl00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00300101 message
     * @return
     *     a new instance of MxSecl00300101
     */
    public final static MxSecl00300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSecl00300101 .class);
    }

}
