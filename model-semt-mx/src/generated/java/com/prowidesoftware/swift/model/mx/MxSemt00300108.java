
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
 * Class for semt.003.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.08")
public class MxSemt00300108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReportV08 sctiesBalAcctgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account13 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation6 .class, AddressType2Code.class, AggregateBalanceInformation26 .class, AggregateBalancePerSafekeepingPlace25 .class, AmountAndDirection6 .class, Balance1 .class, Balance4 .class, BalanceAmounts1 .class, BalanceAmounts2 .class, BalanceQuantity4Choice.class, ClassificationType2Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DerivativeBasicAttributes1 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType12Choice.class, ExposureType4Code.class, FinancialInstrument21 .class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms14 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, Frequency4Choice.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification22 .class, GenericIdentification37 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, Intermediary23 .class, InvestmentFundRole2Code.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification6 .class, MarketType4Choice.class, MarketType4Code.class, MxSemt00300108 .class, NameAndAddress5 .class, Number2Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification36Choice.class, PartyIdentification49Choice.class, PledgeeFormat1Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier1 .class, PledgeeTypeAndText1 .class, PostalAddress1 .class, Price2 .class, PriceInformation5 .class, PriceRateOrAmountChoice.class, PriceRateOrAmountOrUnknownChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PurposeCode1Choice.class, PurposeCode2Choice.class, Quantity6Choice.class, QuantityAndAvailability1 .class, QuantityBreakdown24 .class, Role2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount11 .class, SecuritiesAccount14 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReportV08 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification14 .class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement20 .class, StatementBasis1Code.class, StatementBasis3Choice.class, StatementUpdateType1Code.class, SubAccountIdentification38 .class, SubBalanceInformation6 .class, SubBalanceQuantity3Choice.class, SubBalanceType5Choice.class, SubBalanceType6Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement2 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, TypeOfPrice4Choice.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.08";

    public MxSemt00300108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300108(final String xml) {
        this();
        MxSemt00300108 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReportV08 }
     *     
     */
    public SecuritiesBalanceAccountingReportV08 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReportV08 }
     *     
     */
    public MxSemt00300108 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReportV08 value) {
        this.sctiesBalAcctgRpt = value;
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
    public static MxSemt00300108 parse(String xml) {
        return ((MxSemt00300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00300108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300108 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300108) parserImpl.read(MxSemt00300108 .class, xml, _classes));
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
     * Creates an MxSemt00300108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300108 message
     * @return
     *     a new instance of MxSemt00300108
     */
    public static final MxSemt00300108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00300108 .class);
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
