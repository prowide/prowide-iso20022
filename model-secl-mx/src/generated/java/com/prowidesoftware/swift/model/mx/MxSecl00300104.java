
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
 * Class for secl.003.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradLegStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.003.001.04")
public class MxSecl00300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TradLegStmt", required = true)
    protected TradeLegStatementV04 tradLegStmt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification4 .class, AlternatePartyIdentification8 .class, AmountAndDirection21 .class, AmountAndDirection27 .class, Clearing7 .class, ClearingAccountType1Code.class, ContactIdentification2 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode20Choice.class, DateFormat66Choice.class, DateType1Code.class, DeliveringPartiesAndAccount22 .class, EventFrequency6Code.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms17 .class, GenericIdentification189 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType43Choice.class, IdentificationType6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketIdentification85 .class, MarketType2Code.class, MarketType5Code.class, MarketType8Choice.class, MarketType9Choice.class, MxSecl00300104 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, NettingEligible1Code.class, NonGuaranteedTrade4 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification253Choice.class, PartyIdentification254Choice.class, PartyIdentification255Choice.class, PartyIdentification256Choice.class, PartyIdentificationAndAccount227 .class, PartyIdentificationAndAccount229 .class, PartyIdentificationAndAccount230 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price14 .class, PriceRateOrAmount3Choice.class, PriceValueType7Code.class, ReceivingPartiesAndAccount22 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat43Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier4 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount18 .class, SecuritiesAccount19 .class, SecurityIdentification48 .class, Settlement2 .class, Side1Code.class, SimpleIdentificationInformation4 .class, Statement86 .class, StatementUpdateType1Code.class, SubAccount4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeLeg12 .class, TradeLegStatement4 .class, TradeLegStatementV04 .class, TradePosting1Code.class, TradeType1Code.class, TradingCapacity5Code.class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.003.001.04";

    public MxSecl00300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00300104(final String xml) {
        this();
        MxSecl00300104 tmp = parse(xml);
        tradLegStmt = tmp.getTradLegStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradLegStmt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLegStatementV04 }
     *     
     */
    public TradeLegStatementV04 getTradLegStmt() {
        return tradLegStmt;
    }

    /**
     * Sets the value of the tradLegStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLegStatementV04 }
     *     
     */
    public MxSecl00300104 setTradLegStmt(TradeLegStatementV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSecl00300104 parse(String xml) {
        return ((MxSecl00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00300104 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00300104) parserImpl.read(MxSecl00300104 .class, xml, _classes));
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
     * Creates an MxSecl00300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00300104 message
     * @return
     *     a new instance of MxSecl00300104
     */
    public final static MxSecl00300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00300104 .class);
    }

}
