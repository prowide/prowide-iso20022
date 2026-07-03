
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
 * Class for tsmt.055.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyEvtAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01")
public class MxTsmt05500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyEvtAdvc", required = true)
    protected PartyEventAdviceV01 ptyEvtAdvc;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 55;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, Algorithm5Code.class, AlgorithmAndDigest1 .class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessLetter1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, Contacts3 .class, CopyDuplicate1Code.class, CountrySubdivision1Choice.class, DateAndPlaceOfBirth.class, EncapsulatedBusinessMessage1 .class, EventDescription1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancingStatusReason1Code.class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules2 .class, LegalOrganisation1 .class, Location1 .class, MxTsmt05500101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Party10Choice.class, Party8Choice.class, Party9Choice.class, PartyEventAdviceV01 .class, PartyIdentification2Choice.class, PartyIdentification42 .class, PartyIdentification45 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress6 .class, Priority3Code.class, QualifiedDocumentInformation1 .class, QualifiedPartyAndXMLSignature1 .class, QualifiedPartyIdentification1 .class, SignatureEnvelope.class, SingleQualifiedPartyIdentification1 .class, StatusReason4Choice.class, StrictPayload.class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TechnicalValidationStatus1Code.class, TradeParty1 .class, ValidationStatusInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01";

    public MxTsmt05500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt05500101(final String xml) {
        this();
        MxTsmt05500101 tmp = parse(xml);
        ptyEvtAdvc = tmp.getPtyEvtAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt05500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyEvtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEventAdviceV01 }
     *     
     */
    public PartyEventAdviceV01 getPtyEvtAdvc() {
        return ptyEvtAdvc;
    }

    /**
     * Sets the value of the ptyEvtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEventAdviceV01 }
     *     
     */
    public MxTsmt05500101 setPtyEvtAdvc(PartyEventAdviceV01 value) {
        this.ptyEvtAdvc = value;
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
    public static MxTsmt05500101 parse(String xml) {
        return ((MxTsmt05500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt05500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt05500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt05500101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt05500101) parserImpl.read(MxTsmt05500101 .class, xml, _classes));
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
     * Creates an MxTsmt05500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt05500101 message
     * @return
     *     a new instance of MxTsmt05500101
     */
    public final static MxTsmt05500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt05500101 .class);
    }

}
