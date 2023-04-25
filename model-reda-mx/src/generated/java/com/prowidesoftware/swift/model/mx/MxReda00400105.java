
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
 * Class for reda.004.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.05")
public class MxReda00400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndRefDataRpt", required = true)
    protected FundReferenceDataReportV05 fndRefDataRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, AnnualChargePaymentType1Code.class, BusinessDayConvention1Code.class, CashAccount202 .class, CashAccount203 .class, ChargeType8Choice.class, ContactAttributes5 .class, ContactAttributes6 .class, CostsAndCharges2 .class, DistributionPolicy1Code.class, DistributionStrategy1 .class, DistributionStrategy1Choice.class, DividendPolicy1Code.class, EUSavingsDirective1Code.class, EventFrequency5Code.class, EventFrequency8Code.class, ExPostCostCalculationBasis1Choice.class, ExPostCostCalculationBasis1Code.class, ExtendedParty13 .class, Extension1 .class, FinancialInstrument96 .class, Forms1 .class, Frequency20Choice.class, FundOrderType10Code.class, FundOrderType5Choice.class, FundParties1 .class, FundPaymentType1Choice.class, FundPaymentType1Code.class, FundReferenceDataReport3 .class, FundReferenceDataReportV05 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification36 .class, GenericIdentification47 .class, GovernanceProcess1Choice.class, GovernanceProcessType1Code.class, HoldingTransferable1Code.class, IdentificationSource3Choice.class, IndividualCostOrCharge2 .class, IntendedOrActual2Code.class, InvestmentFundMiFIDFee2Code.class, InvestmentFundPlanType1Choice.class, InvestmentFundPlanType1Code.class, InvestmentNeed2Choice.class, InvestmentNeed2Code.class, InvestmentPlanCharacteristics1 .class, InvestmentRestrictions3 .class, InvestorKnowledge1 .class, InvestorRequirements2 .class, InvestorType2 .class, InvestorType2Code.class, InvestorType3Code.class, InvestorType4Code.class, LocalMarketAnnex4 .class, LossBearing2 .class, MainFundOrderDeskLocation1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxReda00400105 .class, NameAndAddress5 .class, NotionalOrUnitBased1Choice.class, NotionalOrUnitBased1Code.class, OrderDesk1 .class, OtherDistributionStrategy1 .class, OtherIdentification1 .class, OtherInvestmentNeed1 .class, OtherTargetMarket1 .class, OtherTargetMarketInvestor1 .class, OtherTargetMarketInvestorKnowledge1 .class, OtherTargetMarketLossBearing1 .class, OtherTargetMarketRiskTolerance1 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PaymentInstrument16 .class, Period15 .class, PostalAddress1 .class, PriceMethod1Code.class, ProcessingCharacteristics5 .class, ProcessingCharacteristics6 .class, ProcessingCharacteristics7 .class, ProcessingCharacteristics8 .class, ProductStructure1Choice.class, ProductStructure1Code.class, QuotationType1Choice.class, QuotationType1Code.class, ReferToFundOrderDesk1Code.class, RiskLevel1Code.class, RiskTolerance1 .class, RoundingDirection2Code.class, SecurityClassificationType2Choice.class, SecurityIdentification19 .class, SecurityIdentification37 .class, SignatureType1Code.class, TargetMarket1Choice.class, TargetMarket1Code.class, TargetMarket2 .class, TargetMarket2Code.class, TargetMarket3Choice.class, TargetMarket3Code.class, TargetMarket5Choice.class, TimeFrame2Code.class, TimeFrame4 .class, TimeFrame5 .class, TimeFrame6 .class, TimeFrame7 .class, TimeFrame7Choice.class, TimeFrame8Choice.class, TimeFrame9Choice.class, TimeHorizon2Choice.class, UTCOffset1 .class, UnitsOrAmount1Choice.class, ValuationDealingProcessingCharacteristics3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.05";

    public MxReda00400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00400105(final String xml) {
        this();
        MxReda00400105 tmp = parse(xml);
        fndRefDataRpt = tmp.getFndRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundReferenceDataReportV05 }
     *     
     */
    public FundReferenceDataReportV05 getFndRefDataRpt() {
        return fndRefDataRpt;
    }

    /**
     * Sets the value of the fndRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReferenceDataReportV05 }
     *     
     */
    public MxReda00400105 setFndRefDataRpt(FundReferenceDataReportV05 value) {
        this.fndRefDataRpt = value;
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
    public static MxReda00400105 parse(String xml) {
        return ((MxReda00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00400105 parse(String xml, MxRead parserImpl) {
        return ((MxReda00400105) parserImpl.read(MxReda00400105 .class, xml, _classes));
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
     * Creates an MxReda00400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00400105 message
     * @return
     *     a new instance of MxReda00400105
     */
    public static final MxReda00400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00400105 .class);
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
