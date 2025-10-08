
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
 * Class for acmt.015.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctExcldMndtMntncReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.015.001.04")
public class MxAcmt01500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctExcldMndtMntncReq", required = true)
    protected AccountExcludedMandateMaintenanceRequestV04 acctExcldMndtMntncReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountContract2 .class, AccountExcludedMandateMaintenanceRequestV04 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountStatus3Code.class, AccountStatusModification1 .class, AdditionalInformation5 .class, AddressModification3 .class, AddressType2Code.class, AddressType3Choice.class, AmountModification1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, CommunicationFormat1Choice.class, CommunicationMethod2Choice.class, CommunicationMethod2Code.class, Contact13 .class, ContractDocument1 .class, CustomerAccountModification1 .class, DateAndPlaceOfBirth1 .class, DateModification1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency7Code.class, FullLegalNameModification1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01500104 .class, NameModification1 .class, NamePrefix2Code.class, NumberModification1 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationModification3 .class, OtherContact1 .class, Party52Choice.class, PartyAndSignature4 .class, PartyIdentification272 .class, PartyIdentification274 .class, PartyModification3 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, PurposeModification1 .class, References4 .class, Restriction1 .class, RestrictionModification1 .class, SkipPayload.class, StatementFrequencyAndForm1 .class, StatementFrequencyAndFormModification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingNameModification1 .class, TypeModification1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.015.001.04";

    public MxAcmt01500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01500104(final String xml) {
        this();
        MxAcmt01500104 tmp = parse(xml);
        acctExcldMndtMntncReq = tmp.getAcctExcldMndtMntncReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctExcldMndtMntncReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountExcludedMandateMaintenanceRequestV04 }
     *     
     */
    public AccountExcludedMandateMaintenanceRequestV04 getAcctExcldMndtMntncReq() {
        return acctExcldMndtMntncReq;
    }

    /**
     * Sets the value of the acctExcldMndtMntncReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountExcludedMandateMaintenanceRequestV04 }
     *     
     */
    public MxAcmt01500104 setAcctExcldMndtMntncReq(AccountExcludedMandateMaintenanceRequestV04 value) {
        this.acctExcldMndtMntncReq = value;
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
    public static MxAcmt01500104 parse(String xml) {
        return ((MxAcmt01500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01500104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01500104) parserImpl.read(MxAcmt01500104 .class, xml, _classes));
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
     * Creates an MxAcmt01500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01500104 message
     * @return
     *     a new instance of MxAcmt01500104
     */
    public final static MxAcmt01500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01500104 .class);
    }

}
