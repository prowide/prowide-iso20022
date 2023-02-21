
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
 * Class for acmt.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctDtlsConfV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.002.001.01")
public class MxAcmt00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctDtlsConfV01", required = true)
    protected AccountDetailsConfirmation acctDtlsConfV01;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountDetailsConfirmation.class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountManagementConfirmation1 .class, AccountManagementType2Code.class, AccountOwnershipType2Code.class, AccountParties2 .class, AccountStatus1Code.class, AccountStatus2Code.class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BranchData.class, CardType1Code.class, CashAccount4 .class, CashAccount5 .class, CashAccountIdentification1Choice.class, CashAccountType1Code.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CountryAndResidentialStatusType1 .class, DirectDebitMandate3 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FormOfSecurity1Code.class, Frequency1Code.class, FundCashAccount2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification9 .class, IncomePreference1Code.class, IndividualPerson5 .class, Intermediary5 .class, InvestmentAccount17 .class, InvestmentAccountOwnershipInformation2 .class, InvestmentFundCashSettlementInformation1 .class, InvestmentFundRole1Code.class, InvestmentPlan2 .class, MxAcmt00200101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, OldMoneyLaunderingCheck1Code.class, Organisation2 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PaymentCard2 .class, PaymentInstrument6 .class, PaymentInstrument7 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PostalAddress3 .class, ResidentialStatus1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecuritiesAccount1 .class, SecurityIdentification1Choice.class, SimpleIdentificationInformation.class, TaxWithholdingMethod1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.002.001.01";

    public MxAcmt00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00200101(final String xml) {
        this();
        MxAcmt00200101 tmp = parse(xml);
        acctDtlsConfV01 = tmp.getAcctDtlsConfV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctDtlsConfV01 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetailsConfirmation }
     *     
     */
    public AccountDetailsConfirmation getAcctDtlsConfV01() {
        return acctDtlsConfV01;
    }

    /**
     * Sets the value of the acctDtlsConfV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetailsConfirmation }
     *     
     */
    public MxAcmt00200101 setAcctDtlsConfV01(AccountDetailsConfirmation value) {
        this.acctDtlsConfV01 = value;
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
    public static MxAcmt00200101 parse(String xml) {
        return ((MxAcmt00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00200101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00200101) parserImpl.read(MxAcmt00200101 .class, xml, _classes));
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
     * Creates an MxAcmt00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00200101 message
     * @return
     *     a new instance of MxAcmt00200101
     */
    public final static MxAcmt00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00200101 .class);
    }

}
