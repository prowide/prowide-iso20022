
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
 * Class for acmt.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMndtMntncReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.02")
public class MxAcmt01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctMndtMntncReq", required = true)
    protected AccountMandateMaintenanceRequestV02 acctMndtMntncReq;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountContract2 .class, AccountForAction1 .class, AccountIdentification4Choice.class, AccountMandateMaintenanceRequestV02 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AdditionalInformation5 .class, AddressType2Code.class, Authorisation2 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Channel2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod3Code.class, ContactDetails2 .class, ContractDocument1 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FixedAmountOrUnlimited1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Group2 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01700102 .class, NamePrefix1Code.class, OperationMandate3 .class, Organisation14 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndAuthorisation3 .class, PartyAndCertificate2 .class, PartyAndCertificate3 .class, PartyAndSignature2 .class, PartyIdentification43 .class, PartyOrGroup1Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryData3 .class, References4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.02";

    public MxAcmt01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01700102(final String xml) {
        this();
        MxAcmt01700102 tmp = parse(xml);
        acctMndtMntncReq = tmp.getAcctMndtMntncReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMndtMntncReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMandateMaintenanceRequestV02 }
     *     
     */
    public AccountMandateMaintenanceRequestV02 getAcctMndtMntncReq() {
        return acctMndtMntncReq;
    }

    /**
     * Sets the value of the acctMndtMntncReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMandateMaintenanceRequestV02 }
     *     
     */
    public MxAcmt01700102 setAcctMndtMntncReq(AccountMandateMaintenanceRequestV02 value) {
        this.acctMndtMntncReq = value;
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
    public static MxAcmt01700102 parse(String xml) {
        return ((MxAcmt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01700102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01700102) parserImpl.read(MxAcmt01700102 .class, xml, _classes));
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
     * Creates an MxAcmt01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01700102 message
     * @return
     *     a new instance of MxAcmt01700102
     */
    public static final MxAcmt01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01700102 .class);
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
