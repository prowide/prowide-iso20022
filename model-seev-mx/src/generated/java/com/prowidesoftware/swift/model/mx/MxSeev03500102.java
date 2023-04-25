
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
 * Class for seev.035.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.02")
public class MxSeev03500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceV02 corpActnMvmntPrlimryAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 35;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance9 .class, AccountIdentification10 .class, AccountIdentification12Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess2Code.class, AdditionalBusinessProcessFormat2Choice.class, AddressType2Code.class, AmountAndQuantityRatio2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BeneficiaryCertificationType1Choice.class, BeneficiaryCertificationType2Code.class, CashAccountIdentification5Choice.class, CashOption11 .class, ClassificationType2Choice.class, CorporateActionAmounts9 .class, CorporateActionBalanceDetails1 .class, CorporateActionDate15 .class, CorporateActionDate17 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingTypeChoice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation23 .class, CorporateActionMandatoryVoluntary1Choice.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMovementPreliminaryAdviceV02 .class, CorporateActionNarrative5 .class, CorporateActionNarrative6 .class, CorporateActionOption20 .class, CorporateActionOption2Choice.class, CorporateActionOption2Code.class, CorporateActionPeriod7 .class, CorporateActionPreliminaryAdviceType1 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPrice16 .class, CorporateActionPrice18 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionRate15 .class, CorporateActionRate17 .class, CorporateActionReversalReason1 .class, CorporateActionReversalReason1Choice.class, CorporateActionReversalReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode11Choice.class, DateCode3Choice.class, DateCode4Choice.class, DateCodeAndTimeFormat1 .class, DateFormat11Choice.class, DateFormat18Choice.class, DateFormat19Choice.class, DateFormat20Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DividendRateType1Code.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes16 .class, FinancialInstrumentAttributes19 .class, FinancialInstrumentQuantity16Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms13 .class, FractionDispositionType1Choice.class, FractionDispositionType4Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat5Choice.class, GrossDividendRateType1Code.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InterestRateUsedForPaymentFormat5Choice.class, IntermediateSecuritiesDistributionTypeFormat6Choice.class, IntermediateSecurityDistributionType4Code.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03500102 .class, NameAndAddress5 .class, NetDividendRateFormat5Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Choice.class, NonEligibleProceedsIndicator1Code.class, OfferType1Code.class, OfferTypeFormat1Choice.class, OptionAvailabilityStatus1Choice.class, OptionAvailabilityStatus1Code.class, OptionFeatures3Code.class, OptionFeaturesFormat6Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification46Choice.class, Payment1Code.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PostalAddress1 .class, PriceDetails3 .class, PriceFormat19Choice.class, PriceFormat20Choice.class, PriceFormat22Choice.class, PriceFormat23Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity3Code.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat14Choice.class, RateAndAmountFormat15Choice.class, RateDetails3 .class, RateFormat3Choice.class, RateFormat6Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType13Choice.class, RateType13Code.class, RateType17Choice.class, RateType3Code.class, RateType5Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus11 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RateValueType7Code.class, RatioFormat11Choice.class, RatioFormat12Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption13 .class, SecuritiesOption15 .class, SecurityDate5 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SolicitationFeeRateFormat3Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat5Choice.class, TaxType4Code.class, TemporaryFinancialInstrumentIndicator1Choice.class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.02";

    public MxSeev03500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500102(final String xml) {
        this();
        MxSeev03500102 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceV02 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV02 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceV02 }
     *     
     */
    public MxSeev03500102 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdviceV02 value) {
        this.corpActnMvmntPrlimryAdvc = value;
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
    public static MxSeev03500102 parse(String xml) {
        return ((MxSeev03500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500102) parserImpl.read(MxSeev03500102 .class, xml, _classes));
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
     * Creates an MxSeev03500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500102 message
     * @return
     *     a new instance of MxSeev03500102
     */
    public static final MxSeev03500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500102 .class);
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
