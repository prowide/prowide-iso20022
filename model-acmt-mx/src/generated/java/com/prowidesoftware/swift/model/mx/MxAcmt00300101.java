
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
 * Class for acmt.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctModInstrV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.003.001.01")
public class MxAcmt00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctModInstrV02", required = true)
    protected AccountModificationInstruction acctModInstrV02;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountModificationInstruction.class, AccountOwnershipType2Code.class, AccountParties3 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BranchData.class, CardType1Code.class, CashAccount4 .class, CashAccountIdentification1Choice.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CountryAndResidentialStatusType1 .class, DataModification1Code.class, DataModification2Code.class, DirectDebitMandate3 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument6 .class, FormOfSecurity1Code.class, Frequency1Code.class, FundCashAccount2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, GenericIdentification9 .class, IncomePreference1Code.class, IndividualPerson4 .class, IndividualPerson6 .class, IndividualPersonIdentificationChoice.class, Intermediary6 .class, Intermediary7 .class, InvestmentAccount18 .class, InvestmentAccount19 .class, InvestmentAccountModificationDetails.class, InvestmentAccountOwnershipInformation3 .class, InvestmentAccountSelection1 .class, InvestmentFundCashSettlementInformation2 .class, InvestmentFundRole1Code.class, InvestmentPlan3 .class, ModificationScope1 .class, ModificationScope2 .class, ModificationScope3 .class, ModificationScope4 .class, ModificationScope5 .class, MxAcmt00300101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, OldMoneyLaunderingCheck1Code.class, Organisation3 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentification5Choice.class, PaymentCard2 .class, PaymentInstrument6 .class, PaymentInstrument7 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PostalAddress3 .class, ResidentialStatus1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification1Choice.class, SimpleIdentificationInformation.class, TaxWithholdingMethod1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.003.001.01";

    public MxAcmt00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00300101(final String xml) {
        this();
        MxAcmt00300101 tmp = parse(xml);
        acctModInstrV02 = tmp.getAcctModInstrV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctModInstrV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountModificationInstruction }
     *     
     */
    public AccountModificationInstruction getAcctModInstrV02() {
        return acctModInstrV02;
    }

    /**
     * Sets the value of the acctModInstrV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountModificationInstruction }
     *     
     */
    public MxAcmt00300101 setAcctModInstrV02(AccountModificationInstruction value) {
        this.acctModInstrV02 = value;
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
    public static MxAcmt00300101 parse(String xml) {
        return ((MxAcmt00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00300101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00300101) parserImpl.read(MxAcmt00300101 .class, xml, _classes));
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
     * Creates an MxAcmt00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00300101 message
     * @return
     *     a new instance of MxAcmt00300101
     */
    public final static MxAcmt00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00300101 .class);
    }

}
