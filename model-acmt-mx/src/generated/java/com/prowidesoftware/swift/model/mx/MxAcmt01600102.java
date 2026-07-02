
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
 * Class for acmt.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctExcldMndtMntncAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.016.001.02")
public class MxAcmt01600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctExcldMndtMntncAmdmntReq", required = true)
    protected AccountExcludedMandateMaintenanceAmendmentRequestV02 acctExcldMndtMntncAmdmntReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountContract2 .class, AccountExcludedMandateMaintenanceAmendmentRequestV02 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AccountStatus3Code.class, AccountStatusModification1 .class, AddressModification1 .class, AddressType2Code.class, AmountModification1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, CommunicationFormat1Choice.class, CommunicationMethod2Choice.class, CommunicationMethod2Code.class, ContactDetails2 .class, ContractDocument1 .class, CustomerAccountModification1 .class, DateAndPlaceOfBirth.class, DateModification1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency7Code.class, FullLegalNameModification1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MessageIdentification1 .class, Modification1Code.class, MxAcmt01600102 .class, NameModification1 .class, NamePrefix1Code.class, NumberModification1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationModification1 .class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification40 .class, PartyIdentification43 .class, PartyModification1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, PurposeModification1 .class, References4 .class, Restriction1 .class, RestrictionModification1 .class, StatementFrequencyAndForm1 .class, StatementFrequencyAndFormModification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingNameModification1 .class, TypeModification1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.016.001.02";

    public MxAcmt01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01600102(final String xml) {
        this();
        MxAcmt01600102 tmp = parse(xml);
        acctExcldMndtMntncAmdmntReq = tmp.getAcctExcldMndtMntncAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctExcldMndtMntncAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountExcludedMandateMaintenanceAmendmentRequestV02 }
     *     
     */
    public AccountExcludedMandateMaintenanceAmendmentRequestV02 getAcctExcldMndtMntncAmdmntReq() {
        return acctExcldMndtMntncAmdmntReq;
    }

    /**
     * Sets the value of the acctExcldMndtMntncAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountExcludedMandateMaintenanceAmendmentRequestV02 }
     *     
     */
    public MxAcmt01600102 setAcctExcldMndtMntncAmdmntReq(AccountExcludedMandateMaintenanceAmendmentRequestV02 value) {
        this.acctExcldMndtMntncAmdmntReq = value;
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
    public static MxAcmt01600102 parse(String xml) {
        return ((MxAcmt01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01600102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01600102) parserImpl.read(MxAcmt01600102 .class, xml, _classes));
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
     * Creates an MxAcmt01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01600102 message
     * @return
     *     a new instance of MxAcmt01600102
     */
    public final static MxAcmt01600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01600102 .class);
    }

}
