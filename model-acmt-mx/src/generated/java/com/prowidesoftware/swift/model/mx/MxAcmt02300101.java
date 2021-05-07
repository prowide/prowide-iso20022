
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
 * Class for acmt.023.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "idVrfctnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.01")
public class MxAcmt02300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IdVrfctnReq", required = true)
    protected IdentificationVerificationRequestV01 idVrfctnReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, IdentificationAssignment1 .class, IdentificationInformation1 .class, IdentificationVerification1 .class, IdentificationVerificationRequestV01 .class, MxAcmt02300101 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Party6Choice.class, Party7Choice.class, PartyIdentification32 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.023.001.01";

    public MxAcmt02300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt02300101(final String xml) {
        this();
        MxAcmt02300101 tmp = parse(xml);
        idVrfctnReq = tmp.getIdVrfctnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt02300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the idVrfctnReq property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationVerificationRequestV01 }
     *     
     */
    public IdentificationVerificationRequestV01 getIdVrfctnReq() {
        return idVrfctnReq;
    }

    /**
     * Sets the value of the idVrfctnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationVerificationRequestV01 }
     *     
     */
    public MxAcmt02300101 setIdVrfctnReq(IdentificationVerificationRequestV01 value) {
        this.idVrfctnReq = value;
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
    public static MxAcmt02300101 parse(String xml) {
        return ((MxAcmt02300101) MxReadImpl.parse(MxAcmt02300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt02300101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt02300101) parserImpl.read(MxAcmt02300101 .class, xml, _classes));
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
     * Creates an MxAcmt02300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt02300101 message
     * @return
     *     a new instance of MxAcmt02300101
     */
    public final static MxAcmt02300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt02300101 .class);
    }

}
