
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
 * Class for acmt.001.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08")
public class MxAcmt00100108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngInstr", required = true)
    protected AccountOpeningInstructionV08 acctOpngInstr;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account23 .class, Account32 .class, AccountDesignation1Choice.class, AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountOpeningInstructionV08 .class, AccountOpeningType1Choice.class, AccountOpeningType1Code.class, AccountOwnershipType4Code.class, AccountParties12Choice.class, AccountParties17 .class, AccountSchemeName1Choice.class, AccountType2Choice.class, AccountUsageType2Choice.class, AccountUsageType2Code.class, AccountingStatus1Choice.class, AccountingStatus1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference13 .class, AdditiononalInformation13 .class, AddressType1Choice.class, AddressType1Code.class, AddressType2Choice.class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BlockedHoldingDetails2 .class, BlockedReason2Choice.class, BlockedReason2Code.class, BlockedStatusReason2 .class, BlockedStatusReason2Choice.class, BranchData4 .class, CRSForm1Choice.class, CRSFormType1Code.class, CRSSource1Choice.class, CRSSourceStatus1Code.class, CRSStatus1Code.class, CRSStatus3Choice.class, CRSStatus4 .class, CardType1Code.class, CashAccount204 .class, CashAccountType3Choice.class, CashAccountType5Code.class, CashSettlement3 .class, CertificateType2Code.class, CertificationType1Choice.class, Cheque4 .class, CitizenshipInformation2 .class, CivilStatus1Choice.class, CivilStatus1Code.class, ClearingSystemMemberIdentification4Choice.class, Collateral1Code.class, CommunicationAddress6 .class, CommunicationMethod1Code.class, CommunicationMethod3Choice.class, CompanyLink1Choice.class, CompanyLink1Code.class, ConductClassification1Code.class, ConsolidationType1Choice.class, ConsolidationType1Code.class, CountryAndResidentialStatusType2 .class, CreditDebit3Code.class, CustomerConductClassification1Choice.class, DataBaseCheck1 .class, DateAndAmount1 .class, DateAndDateTime1Choice.class, DateTimePeriod2 .class, DeMinimus1Choice.class, DeMinimusApplicable1 .class, DeMinimusNotApplicable1 .class, DirectDebitMandate7 .class, DistributionPolicy1Code.class, DocumentToSend4 .class, Eligible1Code.class, EventFrequency10Code.class, EventFrequency1Code.class, EventFrequency8Code.class, EventFrequency9Code.class, ExtendedParty14 .class, Extension1 .class, FATCAForm1Choice.class, FATCAFormType1Code.class, FATCASource1Choice.class, FATCASourceStatus1Code.class, FATCAStatus1Code.class, FATCAStatus2 .class, FATCAStatus2Choice.class, FinancialInstitutionIdentification11Choice.class, FinancialInstrument87 .class, FiscalYear1Choice.class, FormOfSecurity1Code.class, Frequency20Choice.class, FundCashAccount4Code.class, FundIntention1Code.class, FundOwnership1Code.class, GDPRData1 .class, GDPRDataConsent1Choice.class, GDPRDataConsent1Code.class, Gender1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification47 .class, GenericIdentification82 .class, HighFrequencyTradingProfile1 .class, Holding1Code.class, IdentificationSource1Choice.class, IncomePreference2Code.class, IndividualPerson29 .class, IndividualPerson37 .class, InformationDistribution1Choice.class, InformationDistribution2Code.class, InitialAmount1Choice.class, Insurance1Code.class, InsuranceType2Choice.class, Intermediary46 .class, InvestmentAccount73 .class, InvestmentAccountCategory1Choice.class, InvestmentAccountCategory1Code.class, InvestmentAccountOpening4 .class, InvestmentAccountOwnershipInformation16 .class, InvestmentFundOrder4 .class, InvestmentFundRole6Code.class, InvestmentFundRole7Code.class, InvestmentFundTransactionType1Code.class, InvestmentPlan17 .class, InvestorProfile2 .class, InvestorProfileStatus1Choice.class, InvestorProfileStatus1Code.class, KYCCheckType1Choice.class, KnowYourCustomerCheckType1Code.class, LetterIntent1 .class, LevelOfControl1Choice.class, LevelOfControl1Code.class, Liability1Choice.class, Liability1Code.class, MailType1Choice.class, MailType1Code.class, MarketMakerProfile2 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MiFIDClassification1 .class, MoneyLaunderingCheck1Choice.class, MoneyLaunderingCheck1Code.class, MxAcmt00100108 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Choice.class, NamePrefix1Code.class, NewIssueAllocation2 .class, NoReasonCode.class, Notification2 .class, OperationalStatus1Code.class, OrderOriginatorEligibility1Code.class, Organisation23 .class, Organisation39 .class, OrganisationType1Choice.class, OrganisationType1Code.class, OtherIdentification3Choice.class, OwnershipBeneficiaryRate1 .class, OwnershipType2Choice.class, Party47Choice.class, PartyIdentification125Choice.class, PartyIdentification177Choice.class, PartyIdentificationType7Code.class, PartyProfileInformation5 .class, PartyRole1Code.class, PartyRole2Choice.class, PartyRole4Choice.class, PartyRole5Choice.class, PaymentCard29 .class, PaymentInstrument17 .class, PaymentInstrument19Choice.class, PaymentInstrument24Choice.class, PersonalInformation1 .class, PlanStatus1Code.class, PlanStatus2Choice.class, PoliticalExposureType2Choice.class, PoliticalExposureType2Code.class, PoliticallyExposedPerson1 .class, PoliticallyExposedPersonStatus1Choice.class, PoliticallyExposedPersonStatus1Code.class, PositionEffect3Code.class, PostalAddress1 .class, PostalAddress21 .class, ProfileType1Choice.class, ProfileType1Code.class, Provided1Code.class, Rank1Code.class, Referred1Code.class, ReferredAgent3 .class, RegisteredShareholderName1Choice.class, RegulatoryInformation1 .class, Reinvestment4 .class, Repartition6 .class, ResidentialStatus1Code.class, RestrictionStatus1Choice.class, RestrictionStatus1Code.class, RiskLevel1Code.class, RiskLevel2Choice.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification25Choice.class, SettlementFrequency1Choice.class, SettlementInstructionReason1Choice.class, SettlementInstructionReason1Code.class, SimpleIdentificationInformation4 .class, StatementFrequencyReason2Choice.class, TaxExemptionReason2Choice.class, TaxReporting3 .class, TaxWithholdingMethod3Code.class, ThirdPartyRights2 .class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, TransactionType5Choice.class, TreasuryProfile1 .class, UnitsOrAmount1Choice.class, UnitsOrAmountOrPercentage1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08";

    public MxAcmt00100108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00100108(final String xml) {
        this();
        MxAcmt00100108 tmp = parse(xml);
        acctOpngInstr = tmp.getAcctOpngInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00100108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningInstructionV08 }
     *     
     */
    public AccountOpeningInstructionV08 getAcctOpngInstr() {
        return acctOpngInstr;
    }

    /**
     * Sets the value of the acctOpngInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningInstructionV08 }
     *     
     */
    public MxAcmt00100108 setAcctOpngInstr(AccountOpeningInstructionV08 value) {
        this.acctOpngInstr = value;
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
    public static MxAcmt00100108 parse(String xml) {
        return ((MxAcmt00100108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00100108 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00100108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00100108 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00100108) parserImpl.read(MxAcmt00100108 .class, xml, _classes));
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
     * Creates an MxAcmt00100108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00100108 message
     * @return
     *     a new instance of MxAcmt00100108
     */
    public final static MxAcmt00100108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00100108 .class);
    }

}
