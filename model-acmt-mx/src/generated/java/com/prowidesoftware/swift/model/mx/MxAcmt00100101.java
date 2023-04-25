
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
 * Class for acmt.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngInstrV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.001.001.01")
public class MxAcmt00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngInstrV01", required = true)
    protected AccountOpeningInstruction acctOpngInstrV01;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountOpeningInstruction.class, AccountOpeningType1Code.class, AccountOwnershipType2Code.class, AccountParties2 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BranchData.class, CardType1Code.class, CashAccount4 .class, CashAccountIdentification1Choice.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CountryAndResidentialStatusType1 .class, DirectDebitMandate3 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FormOfSecurity1Code.class, Frequency1Code.class, FundCashAccount2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification9 .class, IncomePreference1Code.class, IndividualPerson5 .class, Intermediary5 .class, InvestmentAccount16 .class, InvestmentAccountOpeningDetails.class, InvestmentAccountOwnershipInformation2 .class, InvestmentFundCashSettlementInformation1 .class, InvestmentFundRole1Code.class, InvestmentPlan2 .class, MxAcmt00100101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, OldMoneyLaunderingCheck1Code.class, Organisation2 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PaymentCard2 .class, PaymentInstrument6 .class, PaymentInstrument7 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PostalAddress3 .class, ResidentialStatus1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification1Choice.class, SimpleIdentificationInformation.class, TaxWithholdingMethod1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:acmt.001.001.01";

    public MxAcmt00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00100101(final String xml) {
        this();
        MxAcmt00100101 tmp = parse(xml);
        acctOpngInstrV01 = tmp.getAcctOpngInstrV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngInstrV01 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningInstruction }
     *     
     */
    public AccountOpeningInstruction getAcctOpngInstrV01() {
        return acctOpngInstrV01;
    }

    /**
     * Sets the value of the acctOpngInstrV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningInstruction }
     *     
     */
    public MxAcmt00100101 setAcctOpngInstrV01(AccountOpeningInstruction value) {
        this.acctOpngInstrV01 = value;
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
    public static MxAcmt00100101 parse(String xml) {
        return ((MxAcmt00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00100101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00100101) parserImpl.read(MxAcmt00100101 .class, xml, _classes));
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
     * Creates an MxAcmt00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00100101 message
     * @return
     *     a new instance of MxAcmt00100101
     */
    public static final MxAcmt00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00100101 .class);
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
