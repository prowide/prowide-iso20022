
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
 * Class for acmt.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctReqAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.010.001.03")
public class MxAcmt01000103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctReqAck", required = true)
    protected AccountRequestAcknowledgementV03 acctReqAck;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountForAction1 .class, AccountIdentification4Choice.class, AccountRequestAcknowledgementV03 .class, AccountSchemeName1Choice.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MessageIdentification1 .class, MxAcmt01000103 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyAndSignature3 .class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, References5 .class, SkipPayload.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UseCases1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.010.001.03";

    public MxAcmt01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt01000103(final String xml) {
        this();
        MxAcmt01000103 tmp = parse(xml);
        acctReqAck = tmp.getAcctReqAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctReqAck property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRequestAcknowledgementV03 }
     *     
     */
    public AccountRequestAcknowledgementV03 getAcctReqAck() {
        return acctReqAck;
    }

    /**
     * Sets the value of the acctReqAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRequestAcknowledgementV03 }
     *     
     */
    public MxAcmt01000103 setAcctReqAck(AccountRequestAcknowledgementV03 value) {
        this.acctReqAck = value;
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
    public static MxAcmt01000103 parse(String xml) {
        return ((MxAcmt01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt01000103 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt01000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt01000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt01000103 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt01000103) parserImpl.read(MxAcmt01000103 .class, xml, _classes));
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
     * Creates an MxAcmt01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt01000103 message
     * @return
     *     a new instance of MxAcmt01000103
     */
    public static final MxAcmt01000103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt01000103 .class);
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
