
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
 * Class for reda.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.04")
public class MxReda00400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndRefDataRpt", required = true)
    protected FundReferenceDataReportV04 fndRefDataRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, AnnualChargePaymentType1Code.class, BusinessDayConvention1Code.class, CashAccount202 .class, CashAccount203 .class, ChargeType7Choice.class, ContactAttributes5 .class, CostsAndCharges1 .class, DistributionPolicy1Code.class, DistributionStrategy1 .class, DistributionStrategy1Choice.class, DividendPolicy1Code.class, EUSavingsDirective1Code.class, EventFrequency5Code.class, EventFrequency8Code.class, ExtendedParty13 .class, Extension1 .class, FinancialInstrument66 .class, Forms1 .class, Frequency20Choice.class, FundOrderType10Code.class, FundOrderType5Choice.class, FundParties1 .class, FundPaymentType1Choice.class, FundPaymentType1Code.class, FundReferenceDataReport2 .class, FundReferenceDataReportV04 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification36 .class, GenericIdentification47 .class, GovernanceProcess1Choice.class, GovernanceProcessType1Code.class, HoldingTransferable1Code.class, IdentificationSource3Choice.class, IndividualCostOrCharge1 .class, IntendedOrActual2Code.class, InvestmentFundMiFIDFee1Code.class, InvestmentFundPlanType1Choice.class, InvestmentFundPlanType1Code.class, InvestmentNeed1Choice.class, InvestmentNeed1Code.class, InvestmentPlanCharacteristics1 .class, InvestmentRestrictions3 .class, InvestorKnowledge1 .class, InvestorRequirements1 .class, InvestorType1 .class, InvestorType2Code.class, InvestorType3Code.class, LegalStructure1Choice.class, LegalStructureFinancialInstrument1Code.class, LocalMarketAnnex3 .class, LossBearing1 .class, MainFundOrderDeskLocation1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxReda00400104 .class, NameAndAddress5 .class, OrderDesk1 .class, OtherDistributionStrategy1 .class, OtherIdentification1 .class, OtherInvestmentNeed1 .class, OtherTargetMarket1 .class, OtherTargetMarketInvestor1 .class, OtherTargetMarketInvestorKnowledge1 .class, OtherTargetMarketLossBearing1 .class, OtherTargetMarketRiskTolerance1 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PaymentInstrument16 .class, Period15 .class, PostalAddress1 .class, PriceMethod1Code.class, ProcessingCharacteristics4 .class, ProcessingCharacteristics5 .class, ProcessingCharacteristics6 .class, ProcessingCharacteristics7 .class, QuotationType1Choice.class, QuotationType1Code.class, ReferToFundOrderDesk1Code.class, RiskLevel1Code.class, RiskTolerance1 .class, RoundingDirection2Code.class, SecurityClassificationType2Choice.class, SecurityIdentification19 .class, SecurityIdentification36 .class, SignatureType1Code.class, TargetMarket1 .class, TargetMarket1Choice.class, TargetMarket1Code.class, TargetMarket2Code.class, TargetMarket3Choice.class, TargetMarket4Choice.class, TimeFrame1Code.class, TimeFrame4 .class, TimeFrame5 .class, TimeFrame6 .class, TimeFrame6Choice.class, TimeFrame7Choice.class, TimeFrame8Choice.class, TimeHorizon1Choice.class, UTCOffset1 .class, UnitsOrAmount1Choice.class, ValuationDealingProcessingCharacteristics3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.04";

    public MxReda00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00400104(final String xml) {
        this();
        MxReda00400104 tmp = parse(xml);
        fndRefDataRpt = tmp.getFndRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundReferenceDataReportV04 }
     *     
     */
    public FundReferenceDataReportV04 getFndRefDataRpt() {
        return fndRefDataRpt;
    }

    /**
     * Sets the value of the fndRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReferenceDataReportV04 }
     *     
     */
    public MxReda00400104 setFndRefDataRpt(FundReferenceDataReportV04 value) {
        this.fndRefDataRpt = value;
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
    public static MxReda00400104 parse(String xml) {
        return ((MxReda00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00400104 parse(String xml, MxRead parserImpl) {
        return ((MxReda00400104) parserImpl.read(MxReda00400104 .class, xml, _classes));
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
     * Creates an MxReda00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00400104 message
     * @return
     *     a new instance of MxReda00400104
     */
    public final static MxReda00400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00400104 .class);
    }

}
