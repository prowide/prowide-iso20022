
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
 * Class for acmt.016.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctExcldMndtMntncAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.016.001.04")
public class MxAcmt01600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctExcldMndtMntncAmdmntReq", required = true)
    protected AccountExcludedMandateMaintenanceAmendmentRequestV04 acctExcldMndtMntncAmdmntReq;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountContract2 .class, AccountExcludedMandateMaintenanceAmendmentRequestV04 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountStatus3Code.class, AccountStatusModification1 .class, AddressModification3 .class, AddressType2Code.class, AddressType3Choice.class, AmountModification1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, CommunicationFormat1Choice.class, CommunicationMethod2Choice.class, CommunicationMethod2Code.class, Contact13 .class, ContractDocument1 .class, CustomerAccountModification1 .class, DateAndPlaceOfBirth1 .class, DateModification1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency7Code.class, FullLegalNameModification1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01600104 .class, NameModification1 .class, NamePrefix2Code.class, NumberModification1 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationModification3 .class, OtherContact1 .class, Party52Choice.class, PartyAndSignature4 .class, PartyIdentification272 .class, PartyIdentification274 .class, PartyModification3 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, PurposeModification1 .class, References4 .class, Restriction1 .class, RestrictionModification1 .class, SkipPayload.class, StatementFrequencyAndForm1 .class, StatementFrequencyAndFormModification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingNameModification1 .class, TypeModification1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.016.001.04";

    public MxAcmt01600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01600104(final String xml) {
        this();
        MxAcmt01600104 tmp = parse(xml);
        acctExcldMndtMntncAmdmntReq = tmp.getAcctExcldMndtMntncAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctExcldMndtMntncAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountExcludedMandateMaintenanceAmendmentRequestV04 }
     *     
     */
    public AccountExcludedMandateMaintenanceAmendmentRequestV04 getAcctExcldMndtMntncAmdmntReq() {
        return acctExcldMndtMntncAmdmntReq;
    }

    /**
     * Sets the value of the acctExcldMndtMntncAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountExcludedMandateMaintenanceAmendmentRequestV04 }
     *     
     */
    public MxAcmt01600104 setAcctExcldMndtMntncAmdmntReq(AccountExcludedMandateMaintenanceAmendmentRequestV04 value) {
        this.acctExcldMndtMntncAmdmntReq = value;
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
    public static MxAcmt01600104 parse(String xml) {
        return ((MxAcmt01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01600104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01600104) parserImpl.read(MxAcmt01600104 .class, xml, _classes));
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
     * Creates an MxAcmt01600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01600104 message
     * @return
     *     a new instance of MxAcmt01600104
     */
    public static final MxAcmt01600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01600104 .class);
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
