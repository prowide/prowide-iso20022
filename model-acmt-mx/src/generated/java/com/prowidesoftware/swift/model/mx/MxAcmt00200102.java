
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
 * Class for acmt.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctDtlsConfV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.002.001.02")
public class MxAcmt00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctDtlsConfV02", required = true)
    protected AccountDetailsConfirmationV02 acctDtlsConfV02;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account2 .class, AccountDetailsConfirmationV02 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountManagementConfirmation1 .class, AccountManagementType2Code.class, AccountOwnershipType3Code.class, AccountParties5 .class, AccountStatus1Code.class, AccountStatus2Code.class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BranchData.class, CardType1Code.class, CashAccount12 .class, CashAccount4 .class, CashAccountIdentification1Choice.class, CashAccountType1Code.class, CertificateType1Code.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CommunicationMethod1Code.class, CountryAndResidentialStatusType1 .class, DeMinimusApplicable1 .class, DeMinimusNotApplicable1 .class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, DocumentToSend1 .class, EventFrequency1Code.class, ExtendedParty2 .class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundCashAccount3Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification9 .class, IncomePreference1Code.class, IndividualPerson10 .class, Intermediary12 .class, InvestmentAccount27 .class, InvestmentAccountOwnershipInformation5 .class, InvestmentFundCashSettlementInformation3 .class, InvestmentFundOrder4 .class, InvestmentFundRole3Code.class, InvestmentPlan4 .class, MessageIdentification1 .class, MoneyLaunderingCheck1Code.class, MxAcmt00200102 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, NewIssueAllocation1 .class, Organisation2 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyProfileInformation1 .class, PaymentCard2 .class, PaymentInstrument8 .class, PaymentInstrument9 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PostalAddress3 .class, Referred1Code.class, ReferredAgent1 .class, Repartition1 .class, ResidentialStatus1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecuritiesAccount4 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, TaxWithholdingMethod1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:acmt.002.001.02";

    public MxAcmt00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00200102(final String xml) {
        this();
        MxAcmt00200102 tmp = parse(xml);
        acctDtlsConfV02 = tmp.getAcctDtlsConfV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctDtlsConfV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetailsConfirmationV02 }
     *     
     */
    public AccountDetailsConfirmationV02 getAcctDtlsConfV02() {
        return acctDtlsConfV02;
    }

    /**
     * Sets the value of the acctDtlsConfV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetailsConfirmationV02 }
     *     
     */
    public MxAcmt00200102 setAcctDtlsConfV02(AccountDetailsConfirmationV02 value) {
        this.acctDtlsConfV02 = value;
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
    public static MxAcmt00200102 parse(String xml) {
        return ((MxAcmt00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00200102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00200102) parserImpl.read(MxAcmt00200102 .class, xml, _classes));
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
     * Creates an MxAcmt00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00200102 message
     * @return
     *     a new instance of MxAcmt00200102
     */
    public static final MxAcmt00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00200102 .class);
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
