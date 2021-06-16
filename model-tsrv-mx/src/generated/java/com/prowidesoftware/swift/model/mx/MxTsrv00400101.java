
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
 * Class for tsrv.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01")
public class MxTsrv00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgAmdmntReq", required = true)
    protected UndertakingAmendmentRequestV01 udrtkgAmdmntReq;
    public final static transient String BUSINESS_PROCESS = "tsrv";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressOrParty1Choice.class, AddressType2Code.class, Amendment3 .class, Amount1Choice.class, AutoExtend1Choice.class, AutoExtension1 .class, Beneficiary1 .class, CommunicationChannel1 .class, CommunicationMethod1Choice.class, ContactDetails2 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, Document9 .class, DocumentFormat1Choice.class, ExpiryDetails1 .class, ExpiryDetails2 .class, ExpiryTerms1 .class, ExpiryTerms2 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv00400101 .class, NameAndAddress10 .class, NamePrefix1Code.class, Narrative1 .class, NarrativeType1Choice.class, NonExtension1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PartyType1Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, TerminationReason1Choice.class, TerminationReason1Code.class, Undertaking10 .class, Undertaking9 .class, UndertakingAmendmentRequestV01 .class, UndertakingAmount2 .class, UndertakingDocumentType1Choice.class, UndertakingTermination3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01";

    public MxTsrv00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv00400101(final String xml) {
        this();
        MxTsrv00400101 tmp = parse(xml);
        udrtkgAmdmntReq = tmp.getUdrtkgAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentRequestV01 }
     *     
     */
    public UndertakingAmendmentRequestV01 getUdrtkgAmdmntReq() {
        return udrtkgAmdmntReq;
    }

    /**
     * Sets the value of the udrtkgAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentRequestV01 }
     *     
     */
    public MxTsrv00400101 setUdrtkgAmdmntReq(UndertakingAmendmentRequestV01 value) {
        this.udrtkgAmdmntReq = value;
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
    public static MxTsrv00400101 parse(String xml) {
        return ((MxTsrv00400101) MxReadImpl.parse(MxTsrv00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv00400101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv00400101) parserImpl.read(MxTsrv00400101 .class, xml, _classes));
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
     * Creates an MxTsrv00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv00400101 message
     * @return
     *     a new instance of MxTsrv00400101
     */
    public final static MxTsrv00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv00400101 .class);
    }

}
