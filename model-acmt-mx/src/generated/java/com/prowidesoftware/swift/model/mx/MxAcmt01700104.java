
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
 * Class for acmt.017.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMndtMntncReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.04")
public class MxAcmt01700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctMndtMntncReq", required = true)
    protected AccountMandateMaintenanceRequestV04 acctMndtMntncReq;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountContract2 .class, AccountForAction1 .class, AccountIdentification4Choice.class, AccountMandateMaintenanceRequestV04 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AdditionalInformation5 .class, AddressType2Code.class, AddressType3Choice.class, Authorisation2 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, Channel2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod3Code.class, Contact13 .class, ContractDocument1 .class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FixedAmountOrUnlimited1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, Group5 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01700104 .class, NamePrefix2Code.class, OperationMandate6 .class, Organisation44 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyAndAuthorisation6 .class, PartyAndCertificate6 .class, PartyAndCertificate7 .class, PartyAndSignature4 .class, PartyIdentification272 .class, PartyOrGroup3Choice.class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProprietaryBankTransactionCodeStructure1 .class, References4 .class, SkipPayload.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.04";

    public MxAcmt01700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01700104(final String xml) {
        this();
        MxAcmt01700104 tmp = parse(xml);
        acctMndtMntncReq = tmp.getAcctMndtMntncReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMndtMntncReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMandateMaintenanceRequestV04 }
     *     
     */
    public AccountMandateMaintenanceRequestV04 getAcctMndtMntncReq() {
        return acctMndtMntncReq;
    }

    /**
     * Sets the value of the acctMndtMntncReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMandateMaintenanceRequestV04 }
     *     
     */
    public MxAcmt01700104 setAcctMndtMntncReq(AccountMandateMaintenanceRequestV04 value) {
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
    public static MxAcmt01700104 parse(String xml) {
        return ((MxAcmt01700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01700104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01700104) parserImpl.read(MxAcmt01700104 .class, xml, _classes));
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
     * Creates an MxAcmt01700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01700104 message
     * @return
     *     a new instance of MxAcmt01700104
     */
    public static final MxAcmt01700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01700104 .class);
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
