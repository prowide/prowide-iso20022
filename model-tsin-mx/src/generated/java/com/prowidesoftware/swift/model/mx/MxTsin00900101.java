
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
 * Class for tsin.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyRegnAndGrntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01")
public class MxTsin00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyRegnAndGrntReq", required = true)
    protected PartyRegistrationAndGuaranteeRequestV01 ptyRegnAndGrntReq;
    public static final transient String BUSINESS_PROCESS = "tsin";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgreementItemAction1Code.class, Algorithm5Code.class, AlgorithmAndDigest1 .class, AmountAndPeriod1 .class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessLetter1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, Contacts3 .class, CopyDuplicate1Code.class, CountrySubdivision1Choice.class, DateAndPlaceOfBirth.class, EncapsulatedBusinessMessage1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialItemParameters1Tsin00900101 .class, FinancingAgreementItem1Tsin00900101 .class, FinancingAgreementList1Tsin00900101 .class, FinancingNotificationParties1Tsin00900101 .class, FinancingStatusReason1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules2 .class, GuaranteeDetails1Tsin00900101 .class, LegalOrganisation1 .class, Location1 .class, MxTsin00900101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Party10Choice.class, Party8Choice.class, Party9Choice.class, PartyIdentification2Choice.class, PartyIdentification42 .class, PartyIdentification45 .class, PartyRegistrationAndGuaranteeRequestV01 .class, PaymentInstrumentCode.class, PercentageAndPeriod1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress6 .class, Priority3Code.class, QualifiedDocumentInformation1 .class, QualifiedPartyAndXMLSignature1 .class, QualifiedPartyIdentification1 .class, SignatureEnvelope.class, SingleQualifiedPartyIdentification1 .class, StatusReason4Choice.class, StrictPayload.class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TechnicalValidationStatus1Code.class, TradeMarket1Choice.class, TradeParty1 .class, ValidationStatusInformation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01";

    public MxTsin00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00900101(final String xml) {
        this();
        MxTsin00900101 tmp = parse(xml);
        ptyRegnAndGrntReq = tmp.getPtyRegnAndGrntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyRegnAndGrntReq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRegistrationAndGuaranteeRequestV01 }
     *     
     */
    public PartyRegistrationAndGuaranteeRequestV01 getPtyRegnAndGrntReq() {
        return ptyRegnAndGrntReq;
    }

    /**
     * Sets the value of the ptyRegnAndGrntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRegistrationAndGuaranteeRequestV01 }
     *     
     */
    public MxTsin00900101 setPtyRegnAndGrntReq(PartyRegistrationAndGuaranteeRequestV01 value) {
        this.ptyRegnAndGrntReq = value;
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
    public static MxTsin00900101 parse(String xml) {
        return ((MxTsin00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsin00900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsin00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00900101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00900101) parserImpl.read(MxTsin00900101 .class, xml, _classes));
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
     * Creates an MxTsin00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00900101 message
     * @return
     *     a new instance of MxTsin00900101
     */
    public static final MxTsin00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin00900101 .class);
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
