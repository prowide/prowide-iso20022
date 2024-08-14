
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
 * Class for acmt.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.014.001.02")
public class MxAcmt01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctRpt", required = true)
    protected AccountReportV02 acctRpt;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountContract3 .class, AccountForAction1 .class, AccountIdentification4Choice.class, AccountReport15 .class, AccountReportV02 .class, AccountSchemeName1Choice.class, AccountStatus3Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Authorisation2 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, Channel2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, CommunicationFormat1Choice.class, CommunicationMethod2Choice.class, CommunicationMethod2Code.class, CommunicationMethod3Code.class, ContactDetails2 .class, ContractDocument1 .class, CustomerAccount5 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FixedAmountOrUnlimited1Choice.class, Frequency7Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Group1 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, MxAcmt01400102 .class, NamePrefix1Code.class, OperationMandate2 .class, Organisation12 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndAuthorisation1 .class, PartyAndCertificate2 .class, PartyAndSignature2 .class, PartyIdentification40 .class, PartyIdentification43 .class, PartyOrGroup1Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryData3 .class, References5 .class, Restriction1 .class, StatementFrequencyAndForm1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UseCases1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.014.001.02";

    public MxAcmt01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01400102(final String xml) {
        this();
        MxAcmt01400102 tmp = parse(xml);
        acctRpt = tmp.getAcctRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReportV02 }
     *     
     */
    public AccountReportV02 getAcctRpt() {
        return acctRpt;
    }

    /**
     * Sets the value of the acctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReportV02 }
     *     
     */
    public MxAcmt01400102 setAcctRpt(AccountReportV02 value) {
        this.acctRpt = value;
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
    public static MxAcmt01400102 parse(String xml) {
        return ((MxAcmt01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01400102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01400102) parserImpl.read(MxAcmt01400102 .class, xml, _classes));
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
     * Creates an MxAcmt01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01400102 message
     * @return
     *     a new instance of MxAcmt01400102
     */
    public static final MxAcmt01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01400102 .class);
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
