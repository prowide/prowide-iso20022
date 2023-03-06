
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.021.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.021.001.01")
public class MxColr02100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollAllgmtNtfctn", required = true)
    protected TripartyCollateralAllegementNotificationV01 trptyCollAllgmtNtfctn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection49 .class, BenchmarkCurveName13Choice.class, BenchmarkCurveName7Code.class, BlockChainAddressWallet3 .class, CalculationMethod1Code.class, CashMovement5 .class, ClosingDate4Choice.class, CollateralAmount12 .class, CollateralDate2 .class, CollateralEntryType1Code.class, CollateralParameters11 .class, CollateralParties8 .class, CollateralRole1Code.class, CollateralTransactionType1Choice.class, CollateralTransactionType1Code.class, CreditDebitCode.class, CrystallisationDay1 .class, Date3Choice.class, DateAndDateTime2Choice.class, DateType2Code.class, DealTransactionDetails6 .class, DeliveryReceiptType2Code.class, EventFrequency12Code.class, ExposureType14Code.class, ExposureType23Choice.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, Frequency38Choice.class, FrequencyRateFixing1Choice.class, FrequencyRateFixing1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateIndexTenor2Code.class, MxColr02100101 .class, NameAndAddress5 .class, OptionType1Code.class, OptionType6Choice.class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentificationAndAccount193 .class, PartyIdentificationAndAccount202 .class, PartyIdentificationAndAccount203 .class, PostalAddress1 .class, RateOrName4Choice.class, RateOrType1Choice.class, RateTypeAndLookback2 .class, RepoTerminationOption1Code.class, SecuritiesAccount19 .class, SecuritiesMovement7 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity7Code.class, TradingPartyCapacity5Choice.class, TransactionIdentifications44 .class, TripartyCollateralAllegementNotificationV01 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.021.001.01";

    public MxColr02100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr02100101(final String xml) {
        this();
        MxColr02100101 tmp = parse(xml);
        trptyCollAllgmtNtfctn = tmp.getTrptyCollAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr02100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralAllegementNotificationV01 }
     *     
     */
    public TripartyCollateralAllegementNotificationV01 getTrptyCollAllgmtNtfctn() {
        return trptyCollAllgmtNtfctn;
    }

    /**
     * Sets the value of the trptyCollAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralAllegementNotificationV01 }
     *     
     */
    public MxColr02100101 setTrptyCollAllgmtNtfctn(TripartyCollateralAllegementNotificationV01 value) {
        this.trptyCollAllgmtNtfctn = value;
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
    public static MxColr02100101 parse(String xml) {
        return ((MxColr02100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr02100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr02100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr02100101 parse(String xml, MxRead parserImpl) {
        return ((MxColr02100101) parserImpl.read(MxColr02100101 .class, xml, _classes));
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
     * Creates an MxColr02100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr02100101 message
     * @return
     *     a new instance of MxColr02100101
     */
    public final static MxColr02100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr02100101 .class);
    }

}
