
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctModInstrV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.003.001.02")
public class MxAcmt00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctModInstrV02", required = true)
    protected AccountModificationInstructionV02 acctModInstrV02;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, AccountModificationInstructionV02 .class, AccountOwnershipType3Code.class, AccountParties4 .class, ActiveCurrencyAndAmount.class, AdditionalReference3 .class, AddressType1Code.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BranchData.class, CardType1Code.class, CashAccount4 .class, CashAccountIdentification1Choice.class, CertificateType1Code.class, Cheque4 .class, CitizenshipInformation.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddress3 .class, CommunicationMethod1Code.class, CountryAndResidentialStatusType1 .class, DataModification1Code.class, DataModification2Code.class, DeMinimusApplicable1 .class, DeMinimusNotApplicable1 .class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, DocumentToSend1 .class, EventFrequency1Code.class, ExtendedParty1 .class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundCashAccount3Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, GenericIdentification9 .class, IncomePreference1Code.class, IndividualPerson11 .class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, Intermediary13 .class, Intermediary7 .class, InvestmentAccount28 .class, InvestmentAccount29 .class, InvestmentAccountModificationDetails.class, InvestmentAccountOwnershipInformation4 .class, InvestmentAccountSelection2 .class, InvestmentFundCashSettlementInformation4 .class, InvestmentFundRole3Code.class, InvestmentPlan5 .class, MessageIdentification1 .class, ModificationScope1 .class, ModificationScope10 .class, ModificationScope11 .class, ModificationScope12 .class, ModificationScope2 .class, ModificationScope3 .class, ModificationScope7 .class, ModificationScope8 .class, ModificationScope9 .class, MoneyLaunderingCheck1Code.class, MxAcmt00300102 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, NewIssueAllocation1 .class, Organisation3 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentification5Choice.class, PartyProfileInformation1 .class, PaymentCard2 .class, PaymentInstrument8 .class, PaymentInstrument9 .class, PersonIdentificationType1Code.class, PostalAddress1 .class, PostalAddress3 .class, Referred1Code.class, ReferredAgent1 .class, Repartition1 .class, ResidentialStatus1Code.class, RoundingDirection1Code.class, RoundingParameters1 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, TaxWithholdingMethod1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.003.001.02";

    public MxAcmt00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00300102(final String xml) {
        this();
        MxAcmt00300102 tmp = parse(xml);
        acctModInstrV02 = tmp.getAcctModInstrV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctModInstrV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountModificationInstructionV02 }
     *     
     */
    public AccountModificationInstructionV02 getAcctModInstrV02() {
        return acctModInstrV02;
    }

    /**
     * Sets the value of the acctModInstrV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountModificationInstructionV02 }
     *     
     */
    public MxAcmt00300102 setAcctModInstrV02(AccountModificationInstructionV02 value) {
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
    public static MxAcmt00300102 parse(String xml) {
        return ((MxAcmt00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00300102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00300102) parserImpl.read(MxAcmt00300102 .class, xml, _classes));
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
     * Creates an MxAcmt00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00300102 message
     * @return
     *     a new instance of MxAcmt00300102
     */
    public final static MxAcmt00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00300102 .class);
    }

}
