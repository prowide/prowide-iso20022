
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
 * Class for acmt.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.001.001.05")
public class MxAcmt00100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngInstr", required = true)
    protected AccountOpeningInstructionV05 acctOpngInstr;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountOpeningInstructionV05 .class, AccountOpeningType1Code.class, AccountOwnershipType3Code.class, AccountParties10 .class, AccountParties5Choice.class, AccountType1Choice.class, AccountUsageType1Choice.class, AccountUsageType1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference2 .class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Blocked1 .class, BlockedHoldingDetails1 .class, BlockedReason1Choice.class, BlockedReason1Code.class, BranchData.class, CardType1Code.class, CashAccount26 .class, CashAccountIdentification1Choice.class, CertificateType2Code.class, CertificationType1Choice.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CommunicationMethod1Code.class, CommunicationMethod3Choice.class, ConductClassification1Code.class, CountryAndResidentialStatusType1 .class, CustomerConductClassification1Choice.class, DataBaseCheck1 .class, DateAndDateTimeChoice.class, DeMinimus1Choice.class, DeMinimusApplicable1 .class, DeMinimusNotApplicable1 .class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, DocumentToSend2 .class, EventFrequency1Code.class, EventFrequency8Code.class, ExtendedParty7 .class, Extension1 .class, FATCAForm1Choice.class, FATCAFormType1Code.class, FATCASource1Choice.class, FATCASourceStatus1Code.class, FATCAStatus1 .class, FATCAStatus1Choice.class, FATCAStatus1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument29 .class, FormOfSecurity1Code.class, Frequency20Choice.class, FundCashAccount2Code.class, FundCashAccount3Code.class, FundOrderType1Choice.class, FundOrderType6Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification29 .class, GenericIdentification41 .class, GenericIdentification46 .class, GenericIdentification47 .class, GenericIdentification55 .class, Holding1Code.class, IncomePreference1Code.class, IndividualPerson23 .class, InformationDistribution1Code.class, Insurance1Code.class, InsuranceType1Choice.class, Intermediary24 .class, InvestmentAccount37 .class, InvestmentAccountCategory1Choice.class, InvestmentAccountCategory1Code.class, InvestmentAccountOpening1 .class, InvestmentAccountOwnershipInformation10 .class, InvestmentAccountType1Choice.class, InvestmentFundCashSettlementInformation7 .class, InvestmentFundOrder4 .class, InvestmentFundRole6Code.class, InvestmentFundRole7Code.class, InvestmentPlan10 .class, KYCCheckType1Choice.class, KnowYourCustomerCheckType1Code.class, LetterIntent1 .class, LongPostalAddress1Choice.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MiFIDClassification1 .class, MoneyLaunderingCheck1Choice.class, MoneyLaunderingCheck1Code.class, MxAcmt00100105 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Choice.class, NamePrefix1Code.class, NewIssueAllocation2 .class, OrderOriginatorEligibility1Code.class, Organisation16 .class, OtherIdentification1Choice.class, OtherIdentification2Choice.class, OwnershipType1Choice.class, Party23Choice.class, PartyIdentification1Choice.class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyProfileInformation4 .class, PartyRole2Choice.class, PartyRole4Choice.class, PaymentCard2 .class, PaymentInstrument11 .class, PaymentInstrument12 .class, PaymentInstrument16Choice.class, PaymentInstrument17Choice.class, PersonIdentificationType5Code.class, PersonIdentificationType6Code.class, PlanStatus1Choice.class, PlanStatus1Code.class, PoliticalExposureType1Choice.class, PoliticalExposureType1Code.class, PostalAddress1 .class, PostalAddress3 .class, Provided1Code.class, Referred1Code.class, ReferredAgent1 .class, RegulatoryInformation1 .class, Reinvestment1 .class, Repartition3 .class, ResidentialStatus1Code.class, RiskLevel1Choice.class, RiskLevel1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, StatementFrequencyReason1Choice.class, StructuredLongPostalAddress1 .class, TaxExemptionReason1Choice.class, TaxIdentification2 .class, TaxIdentificationNumberType1Code.class, TaxIdentificationType1Choice.class, TaxWithholdingMethod2Code.class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, UnitsOrAmount1Choice.class, UnitsOrAmountOrPercentage1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:acmt.001.001.05";

    public MxAcmt00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00100105(final String xml) {
        this();
        MxAcmt00100105 tmp = parse(xml);
        acctOpngInstr = tmp.getAcctOpngInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningInstructionV05 }
     *     
     */
    public AccountOpeningInstructionV05 getAcctOpngInstr() {
        return acctOpngInstr;
    }

    /**
     * Sets the value of the acctOpngInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningInstructionV05 }
     *     
     */
    public MxAcmt00100105 setAcctOpngInstr(AccountOpeningInstructionV05 value) {
        this.acctOpngInstr = value;
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
    public static MxAcmt00100105 parse(String xml) {
        return ((MxAcmt00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00100105 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00100105) parserImpl.read(MxAcmt00100105 .class, xml, _classes));
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
     * Creates an MxAcmt00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00100105 message
     * @return
     *     a new instance of MxAcmt00100105
     */
    public static final MxAcmt00100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00100105 .class);
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
