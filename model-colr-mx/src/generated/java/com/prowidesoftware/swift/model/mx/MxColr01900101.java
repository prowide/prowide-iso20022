
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
 * Class for colr.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollTxInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.019.001.01")
public class MxColr01900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollTxInstr", required = true)
    protected TripartyCollateralTransactionInstructionV01 trptyCollTxInstr;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation24 .class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection49 .class, BasketIdentificationAndEligibilitySetProfile1 .class, BenchmarkCurveName13Choice.class, BenchmarkCurveName7Code.class, BlockChainAddressWallet3 .class, CalculationMethod1Code.class, CashAccountIdentification5Choice.class, CashMovement8 .class, ClosingDate4Choice.class, CollateralAmount18 .class, CollateralDate2 .class, CollateralEntryType1Code.class, CollateralParameters10 .class, CollateralParties10 .class, CollateralRole1Code.class, CollateralTransactionAmountBreakdown2 .class, CollateralTransactionType1Choice.class, CollateralTransactionType1Code.class, CreditDebitCode.class, CrystallisationDay1 .class, Date3Choice.class, DateAndDateTime2Choice.class, DateType2Code.class, DealTransactionDetails5 .class, DeliveryReceiptType2Code.class, DocumentNumber5Choice.class, EventFrequency12Code.class, ExposureType14Code.class, ExposureType23Choice.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, Frequency38Choice.class, FrequencyRateFixing1Choice.class, FrequencyRateFixing1Code.class, GenericIdentification1 .class, GenericIdentification178 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateIndexTenor2Code.class, Linkages58 .class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxColr01900101 .class, NameAndAddress5 .class, OptionType1Code.class, OptionType6Choice.class, OtherIdentification1 .class, OtherParties38 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification134Choice.class, PartyIdentification136 .class, PartyIdentification149 .class, PartyIdentificationAndAccount202 .class, PartyIdentificationAndAccount203 .class, Period2 .class, Period4Choice.class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, RateOrName4Choice.class, RateOrType1Choice.class, RateTypeAndLookback2 .class, References70Choice.class, RepoTerminationOption1Code.class, ResponseStatus2Code.class, ResponseStatus9Choice.class, SecuritiesAccount19 .class, SecuritiesMovement9 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity7Code.class, TradingPartyCapacity5Choice.class, TransactionIdentifications45 .class, TripartyCollateralTransactionInstructionV01 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.019.001.01";

    public MxColr01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01900101(final String xml) {
        this();
        MxColr01900101 tmp = parse(xml);
        trptyCollTxInstr = tmp.getTrptyCollTxInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollTxInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralTransactionInstructionV01 }
     *     
     */
    public TripartyCollateralTransactionInstructionV01 getTrptyCollTxInstr() {
        return trptyCollTxInstr;
    }

    /**
     * Sets the value of the trptyCollTxInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralTransactionInstructionV01 }
     *     
     */
    public MxColr01900101 setTrptyCollTxInstr(TripartyCollateralTransactionInstructionV01 value) {
        this.trptyCollTxInstr = value;
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
    public static MxColr01900101 parse(String xml) {
        return ((MxColr01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01900101 parse(String xml, MxRead parserImpl) {
        return ((MxColr01900101) parserImpl.read(MxColr01900101 .class, xml, _classes));
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
     * Creates an MxColr01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01900101 message
     * @return
     *     a new instance of MxColr01900101
     */
    public final static MxColr01900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01900101 .class);
    }

}
