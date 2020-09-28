
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
 * Class for reda.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.03")
public class MxReda00400103
    extends AbstractMX
{

    @XmlElement(name = "FndRefDataRpt", required = true)
    protected FundReferenceDataReportV03 fndRefDataRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AddressType2Code.class, AnnualChargePaymentType1Code.class, BusinessDayConvention1Code.class, CashAccount202 .class, CashAccount203 .class, ChargeType7Choice.class, ContactAttributes5 .class, CostsAndCharges1 .class, DistributionPolicy1Code.class, DistributionStrategy1 .class, DistributionStrategy1Choice.class, DividendPolicy1Code.class, EUSavingsDirective1Code.class, EventFrequency5Code.class, EventFrequency8Code.class, ExtendedParty13 .class, Extension1 .class, FinancialInstrument66 .class, Forms1 .class, Frequency20Choice.class, FundOrderType10Code.class, FundOrderType5Choice.class, FundParties1 .class, FundPaymentType1Choice.class, FundPaymentType1Code.class, FundReferenceDataReport1 .class, FundReferenceDataReportV03 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification36 .class, GenericIdentification47 .class, GovernanceProcess1Choice.class, GovernanceProcessType1Code.class, HoldingTransferable1Code.class, IdentificationSource3Choice.class, IndividualCostOrCharge1 .class, IntendedOrActual2Code.class, InvestmentFundMiFIDFee1Code.class, InvestmentFundPlanType1Choice.class, InvestmentFundPlanType1Code.class, InvestmentNeed1Choice.class, InvestmentNeed1Code.class, InvestmentPlanCharacteristics1 .class, InvestmentRestrictions3 .class, InvestorKnowledge1 .class, InvestorRequirements1 .class, InvestorType1 .class, InvestorType2Code.class, InvestorType3Code.class, LegalStructure1Choice.class, LegalStructureFinancialInstrument1Code.class, LocalMarketAnnex3 .class, LossBearing1 .class, MainFundOrderDeskLocation1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxReda00400103 .class, NameAndAddress5 .class, OrderDesk1 .class, OtherDistributionStrategy1 .class, OtherIdentification1 .class, OtherInvestmentNeed1 .class, OtherTargetMarket1 .class, OtherTargetMarketInvestor1 .class, OtherTargetMarketInvestorKnowledge1 .class, OtherTargetMarketLossBearing1 .class, OtherTargetMarketRiskTolerance1 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PaymentInstrument16 .class, Period15 .class, PostalAddress1 .class, PriceMethod1Code.class, ProcessingCharacteristics4 .class, ProcessingCharacteristics5 .class, ProcessingCharacteristics6 .class, QuotationType1Choice.class, QuotationType1Code.class, ReferToFundOrderDesk1Code.class, RiskLevel1Code.class, RiskTolerance1 .class, RoundingDirection2Code.class, SecurityClassificationType2Choice.class, SecurityIdentification19 .class, SecurityIdentification36 .class, SignatureType1Code.class, TargetMarket1 .class, TargetMarket1Choice.class, TargetMarket1Code.class, TargetMarket2Code.class, TargetMarket3Choice.class, TargetMarket4Choice.class, TimeFrame1Code.class, TimeFrame4 .class, TimeFrame5 .class, TimeFrame6Choice.class, TimeFrame7Choice.class, TimeFrame8Choice.class, TimeHorizon1Choice.class, UTCOffset1 .class, UnitsOrAmount1Choice.class, ValuationDealingProcessingCharacteristics3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.03";

    public MxReda00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00400103(final String xml) {
        this();
        MxReda00400103 tmp = parse(xml);
        fndRefDataRpt = tmp.getFndRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundReferenceDataReportV03 }
     *     
     */
    public FundReferenceDataReportV03 getFndRefDataRpt() {
        return fndRefDataRpt;
    }

    /**
     * Sets the value of the fndRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReferenceDataReportV03 }
     *     
     */
    public MxReda00400103 setFndRefDataRpt(FundReferenceDataReportV03 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxReda00400103 parse(String xml) {
        return ((MxReda00400103) MxReadImpl.parse(MxReda00400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00400103 parse(String xml, MxRead parserImpl) {
        return ((MxReda00400103) parserImpl.read(MxReda00400103 .class, xml, _classes));
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
     * Creates an MxReda00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00400103 message
     * @return
     *     a new instance of MxReda00400103
     */
    public final static MxReda00400103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda00400103 .class);
    }

}
