
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.017.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMndtMntncReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.03")
public class MxAcmt01700103
    extends AbstractMX
{

    @XmlElement(name = "AcctMndtMntncReq", required = true)
    protected AccountMandateMaintenanceRequestV03 acctMndtMntncReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountContract2 .class, AccountForAction1 .class, AccountIdentification4Choice.class, AccountMandateMaintenanceRequestV03 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AdditionalInformation5 .class, AddressType2Code.class, AddressType3Choice.class, Authorisation2 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, Channel2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod3Code.class, Contact4 .class, ContractDocument1 .class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FixedAmountOrUnlimited1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Group3 .class, MaximumAmountByPeriod1 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01700103 .class, NamePrefix2Code.class, OperationMandate5 .class, Organisation34 .class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyAndAuthorisation5 .class, PartyAndCertificate4 .class, PartyAndCertificate5 .class, PartyAndSignature3 .class, PartyIdentification135 .class, PartyOrGroup2Choice.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProprietaryBankTransactionCodeStructure1 .class, References4 .class, SkipPayload.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.03";

    public MxAcmt01700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01700103(final String xml) {
        this();
        MxAcmt01700103 tmp = parse(xml);
        acctMndtMntncReq = tmp.getAcctMndtMntncReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMndtMntncReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMandateMaintenanceRequestV03 }
     *     
     */
    public AccountMandateMaintenanceRequestV03 getAcctMndtMntncReq() {
        return acctMndtMntncReq;
    }

    /**
     * Sets the value of the acctMndtMntncReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMandateMaintenanceRequestV03 }
     *     
     */
    public MxAcmt01700103 setAcctMndtMntncReq(AccountMandateMaintenanceRequestV03 value) {
        this.acctMndtMntncReq = value;
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
    public static MxAcmt01700103 parse(String xml) {
        return ((MxAcmt01700103) MxReadImpl.parse(MxAcmt01700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01700103 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01700103) parserImpl.read(MxAcmt01700103 .class, xml, _classes));
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
     * Creates an MxAcmt01700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01700103 message
     * @return
     *     a new instance of MxAcmt01700103
     */
    public final static MxAcmt01700103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt01700103 .class);
    }

}
