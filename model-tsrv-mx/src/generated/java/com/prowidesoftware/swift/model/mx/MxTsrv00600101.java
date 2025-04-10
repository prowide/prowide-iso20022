
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
 * Class for tsrv.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgAmdmntAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01")
public class MxTsrv00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgAmdmntAdvc", required = true)
    protected UndertakingAmendmentAdviceV01 udrtkgAmdmntAdvc;
    public static final transient String BUSINESS_PROCESS = "tsrv";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AdvisingPartyAdditionalInformation1 .class, Amendment1 .class, Amendment2 .class, Amount1Choice.class, AutoExtend1Choice.class, AutoExtension1 .class, CommunicationChannel1 .class, CommunicationMethod1Choice.class, ContactDetails2 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, Document9 .class, DocumentFormat1Choice.class, ExpiryDetails1 .class, ExpiryTerms1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv00600101 .class, NamePrefix1Code.class, Narrative1 .class, NarrativeType1Choice.class, NonExtension1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PartyType1Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, TerminationReason1Choice.class, TerminationReason1Code.class, Undertaking11 .class, Undertaking7 .class, UndertakingAmendmentAdviceV01 .class, UndertakingAmendmentMessage1 .class, UndertakingAmount2 .class, UndertakingConfirmation1 .class, UndertakingDocumentType1Choice.class, UndertakingTermination3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.006.001.01";

    public MxTsrv00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv00600101(final String xml) {
        this();
        MxTsrv00600101 tmp = parse(xml);
        udrtkgAmdmntAdvc = tmp.getUdrtkgAmdmntAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgAmdmntAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentAdviceV01 }
     *     
     */
    public UndertakingAmendmentAdviceV01 getUdrtkgAmdmntAdvc() {
        return udrtkgAmdmntAdvc;
    }

    /**
     * Sets the value of the udrtkgAmdmntAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentAdviceV01 }
     *     
     */
    public MxTsrv00600101 setUdrtkgAmdmntAdvc(UndertakingAmendmentAdviceV01 value) {
        this.udrtkgAmdmntAdvc = value;
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
    public static MxTsrv00600101 parse(String xml) {
        return ((MxTsrv00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsrv00600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsrv00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv00600101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv00600101) parserImpl.read(MxTsrv00600101 .class, xml, _classes));
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
     * Creates an MxTsrv00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv00600101 message
     * @return
     *     a new instance of MxTsrv00600101
     */
    public static final MxTsrv00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv00600101 .class);
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
