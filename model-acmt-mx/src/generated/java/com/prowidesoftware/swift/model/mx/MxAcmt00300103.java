
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
 * Class for acmt.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctModInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.003.001.03")
public class MxAcmt00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctModInstr", required = true)
    protected AccountModificationInstructionV03 acctModInstr;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountModificationInstructionV03 .class, AccountOwnershipType3Code.class, AccountParties2Choice.class, AccountParties7 .class, AccountType1Choice.class, AccountUsageType1Choice.class, AccountUsageType1Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Blocked1 .class, BlockedHoldingDetails1 .class, BlockedReason1Choice.class, BlockedReason1Code.class, BranchData.class, CardType1Code.class, CashAccount26 .class, CashAccountIdentification1Choice.class, CertificateType2Code.class, CertificationType1Choice.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CommunicationMethod1Code.class, ConductClassification1Code.class, CountryAndResidentialStatusType1 .class, CustomerConductClassification1Choice.class, DataModification1Code.class, DataModification2Code.class, DateAndDateTimeChoice.class, DeMinimusApplicable1 .class, DeMinimusNotApplicable1 .class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, DocumentToSend1 .class, EventFrequency1Code.class, ExtendedParty4 .class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrument29 .class, FormOfSecurity1Code.class, Frequency19Choice.class, FundCashAccount2Code.class, FundCashAccount3Code.class, FundOrderType1Choice.class, FundOrderType6Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, GenericIdentification41 .class, GenericIdentification44 .class, GenericIdentification46 .class, GenericIdentification47 .class, Holding1Code.class, IncomePreference1Code.class, IndividualPerson20 .class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, InformationDistribution1Code.class, Insurance1Code.class, InsuranceType1Choice.class, Intermediary13 .class, Intermediary7 .class, InvestmentAccount29 .class, InvestmentAccount36 .class, InvestmentAccountModificationDetails.class, InvestmentAccountOwnershipInformation7 .class, InvestmentAccountSelection2 .class, InvestmentAccountType1Choice.class, InvestmentFundCashSettlementInformation6 .class, InvestmentFundRole3Code.class, InvestmentPlan7 .class, LetterIntent1 .class, MessageIdentification1 .class, MiFIDClassification1 .class, ModificationScope10 .class, ModificationScope13 .class, ModificationScope14 .class, ModificationScope16 .class, ModificationScope7 .class, ModificationScope9 .class, MoneyLaunderingCheck1Choice.class, MoneyLaunderingCheck1Code.class, MxAcmt00300103 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Choice.class, NamePrefix1Code.class, NewIssueAllocation1 .class, OrderOriginatorEligibility1Code.class, Organisation13 .class, OtherIdentification1Choice.class, OwnershipType1Choice.class, Party14Choice.class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentification5Choice.class, PartyProfileInformation2 .class, PaymentCard2 .class, PaymentInstrument10 .class, PaymentInstrument11 .class, PaymentInstrument16Choice.class, PaymentInstrument17Choice.class, PersonIdentificationType1Code.class, PersonIdentificationType5Code.class, PostalAddress1 .class, PostalAddress3 .class, Provided1Code.class, Referred1Code.class, ReferredAgent1 .class, RegulatoryInformation1 .class, Repartition2 .class, ResidentialStatus1Code.class, RiskLevel1Choice.class, RiskLevel1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, StatementFrequencyReason1Choice.class, TaxExemptionReason1Choice.class, TaxWithholdingMethod2Code.class, UnitsOrAmount1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:acmt.003.001.03";

    public MxAcmt00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00300103(final String xml) {
        this();
        MxAcmt00300103 tmp = parse(xml);
        acctModInstr = tmp.getAcctModInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctModInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountModificationInstructionV03 }
     *     
     */
    public AccountModificationInstructionV03 getAcctModInstr() {
        return acctModInstr;
    }

    /**
     * Sets the value of the acctModInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountModificationInstructionV03 }
     *     
     */
    public MxAcmt00300103 setAcctModInstr(AccountModificationInstructionV03 value) {
        this.acctModInstr = value;
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
    public static MxAcmt00300103 parse(String xml) {
        return ((MxAcmt00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00300103 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00300103) parserImpl.read(MxAcmt00300103 .class, xml, _classes));
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
     * Creates an MxAcmt00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00300103 message
     * @return
     *     a new instance of MxAcmt00300103
     */
    public static final MxAcmt00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00300103 .class);
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
