
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
 * Class for acmt.007.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.007.001.02")
public class MxAcmt00700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngReq", required = true)
    protected AccountOpeningRequestV02 acctOpngReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountContract2 .class, AccountIdentification4Choice.class, AccountOpeningRequestV02 .class, AccountSchemeName1Choice.class, AccountStatus3Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Authorisation2 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, Channel2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, CommunicationFormat1Choice.class, CommunicationMethod2Choice.class, CommunicationMethod2Code.class, CommunicationMethod3Code.class, ContactDetails2 .class, ContractDocument1 .class, CustomerAccount4 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FixedAmountOrUnlimited1Choice.class, Frequency7Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Group1 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, MxAcmt00700102 .class, NamePrefix1Code.class, OperationMandate2 .class, Organisation12 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndAuthorisation1 .class, PartyAndCertificate2 .class, PartyAndSignature2 .class, PartyIdentification40 .class, PartyIdentification43 .class, PartyOrGroup1Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryData3 .class, References4 .class, Restriction1 .class, StatementFrequencyAndForm1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.007.001.02";

    public MxAcmt00700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00700102(final String xml) {
        this();
        MxAcmt00700102 tmp = parse(xml);
        acctOpngReq = tmp.getAcctOpngReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningRequestV02 }
     *     
     */
    public AccountOpeningRequestV02 getAcctOpngReq() {
        return acctOpngReq;
    }

    /**
     * Sets the value of the acctOpngReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningRequestV02 }
     *     
     */
    public MxAcmt00700102 setAcctOpngReq(AccountOpeningRequestV02 value) {
        this.acctOpngReq = value;
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
    public static MxAcmt00700102 parse(String xml) {
        return ((MxAcmt00700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00700102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00700102) parserImpl.read(MxAcmt00700102 .class, xml, _classes));
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
     * Creates an MxAcmt00700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00700102 message
     * @return
     *     a new instance of MxAcmt00700102
     */
    public final static MxAcmt00700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00700102 .class);
    }

}
