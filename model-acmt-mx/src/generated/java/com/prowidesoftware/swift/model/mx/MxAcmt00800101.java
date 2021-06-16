
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.008.001.01")
public class MxAcmt00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngAmdmntReq", required = true)
    protected AccountOpeningAmendmentRequestV01 acctOpngAmdmntReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountContract2 .class, AccountIdentification4Choice.class, AccountOpeningAmendmentRequestV01 .class, AccountSchemeName1Choice.class, AccountStatus3Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Authorisation1 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, ContactDetails2 .class, ContractDocument1 .class, CustomerAccount1 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, Frequency3Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, MxAcmt00800101 .class, NamePrefix1Code.class, OperationMandate1 .class, Organisation6 .class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, Party8Choice.class, PartyAndCertificate1 .class, PartyAndSignature1 .class, PartyIdentification40 .class, PartyIdentification41 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryData3 .class, References4 .class, Restriction1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.008.001.01";

    public MxAcmt00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00800101(final String xml) {
        this();
        MxAcmt00800101 tmp = parse(xml);
        acctOpngAmdmntReq = tmp.getAcctOpngAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningAmendmentRequestV01 }
     *     
     */
    public AccountOpeningAmendmentRequestV01 getAcctOpngAmdmntReq() {
        return acctOpngAmdmntReq;
    }

    /**
     * Sets the value of the acctOpngAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningAmendmentRequestV01 }
     *     
     */
    public MxAcmt00800101 setAcctOpngAmdmntReq(AccountOpeningAmendmentRequestV01 value) {
        this.acctOpngAmdmntReq = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAcmt00800101 parse(String xml) {
        return ((MxAcmt00800101) MxReadImpl.parse(MxAcmt00800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00800101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00800101) parserImpl.read(MxAcmt00800101 .class, xml, _classes));
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
     * Creates an MxAcmt00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00800101 message
     * @return
     *     a new instance of MxAcmt00800101
     */
    public final static MxAcmt00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00800101 .class);
    }

}
