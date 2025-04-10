
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
 * Class for tsin.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyRegnAndGrntAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01")
public class MxTsin01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyRegnAndGrntAck", required = true)
    protected PartyRegistrationAndGuaranteeAcknowledgementV01 ptyRegnAndGrntAck;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgreementItemAction1Code.class, Algorithm5Code.class, AlgorithmAndDigest1 .class, AmountAndPeriod1 .class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessLetter1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, Contacts3 .class, CopyDuplicate1Code.class, CountrySubdivision1Choice.class, DateAndPlaceOfBirth.class, EncapsulatedBusinessMessage1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialItemParameters1Tsin01200101 .class, FinancingAgreementItem1Tsin01200101 .class, FinancingAgreementList1Tsin01200101 .class, FinancingNotificationParties1 .class, FinancingStatusReason1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules2 .class, GuaranteeDetails1Tsin01200101 .class, LegalOrganisation1 .class, Location1 .class, MxTsin01200101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Party10Choice.class, Party8Choice.class, Party9Choice.class, PartyIdentification2Choice.class, PartyIdentification42 .class, PartyIdentification45 .class, PartyRegistrationAndGuaranteeAcknowledgementV01 .class, PaymentInstrumentCode.class, PercentageAndPeriod1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress6 .class, Priority3Code.class, QualifiedDocumentInformation1 .class, QualifiedPartyAndXMLSignature1 .class, QualifiedPartyIdentification1 .class, SignatureEnvelope.class, SingleQualifiedPartyIdentification1 .class, StatusReason4Choice.class, StrictPayload.class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TechnicalValidationStatus1Code.class, TradeMarket1Choice.class, TradeParty1 .class, ValidationStatusInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01";

    public MxTsin01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin01200101(final String xml) {
        this();
        MxTsin01200101 tmp = parse(xml);
        ptyRegnAndGrntAck = tmp.getPtyRegnAndGrntAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyRegnAndGrntAck property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRegistrationAndGuaranteeAcknowledgementV01 }
     *     
     */
    public PartyRegistrationAndGuaranteeAcknowledgementV01 getPtyRegnAndGrntAck() {
        return ptyRegnAndGrntAck;
    }

    /**
     * Sets the value of the ptyRegnAndGrntAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRegistrationAndGuaranteeAcknowledgementV01 }
     *     
     */
    public MxTsin01200101 setPtyRegnAndGrntAck(PartyRegistrationAndGuaranteeAcknowledgementV01 value) {
        this.ptyRegnAndGrntAck = value;
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
    public static MxTsin01200101 parse(String xml) {
        return ((MxTsin01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsin01200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsin01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin01200101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin01200101) parserImpl.read(MxTsin01200101 .class, xml, _classes));
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
     * Creates an MxTsin01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin01200101 message
     * @return
     *     a new instance of MxTsin01200101
     */
    public final static MxTsin01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin01200101 .class);
    }

}
