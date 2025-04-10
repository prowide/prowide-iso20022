
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
 * Class for tsrv.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgIssncNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01")
public class MxTsrv00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgIssncNtfctn", required = true)
    protected UndertakingIssuanceNotificationV01 udrtkgIssncNtfctn;
    public static final transient String BUSINESS_PROCESS = "tsrv";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AmountAndTrigger1 .class, AmountOrPercentage1Choice.class, AutoExtend1Choice.class, AutoExtension1 .class, AutomaticVariation1 .class, Channel1Choice.class, CommunicationChannel1 .class, CommunicationMethod1Choice.class, ContactDetails2 .class, CountrySubdivision1Choice.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateInformation1 .class, Document10 .class, Document8 .class, Document9 .class, DocumentFormat1Choice.class, ExpiryDetails1 .class, ExpiryTerms1 .class, FixedOrRecurrentDate1Choice.class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules1 .class, IssuanceType1Code.class, Location1 .class, ModelFormIdentification1 .class, ModelFormIdentification1Choice.class, MxTsrv00300101 .class, NamePrefix1Code.class, Narrative1 .class, NarrativeType1Choice.class, NonExtension1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyAndType1 .class, PartyIdentification43 .class, PartyType1Choice.class, Percentage1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PlaceOfPresentation1 .class, PlaceOrUnderConfirmationChoice1 .class, PostalAddress12 .class, PostalAddress6 .class, Presentation1 .class, Presentation3 .class, PresentationDocumentFormat1Choice.class, PresentationMedium1Choice.class, PresentationMedium1Code.class, PresentationParty1Code.class, ProprietaryData3 .class, Trigger1 .class, UnderlyingTradeTransaction1 .class, UnderlyingTradeTransactionType1Choice.class, Undertaking3 .class, Undertaking4 .class, UndertakingAdvice2 .class, UndertakingAmount1 .class, UndertakingAmount4 .class, UndertakingDocumentType1Choice.class, UndertakingDocumentType2Choice.class, UndertakingIssuanceMessage.class, UndertakingIssuanceName1Code.class, UndertakingIssuanceNotificationV01 .class, UndertakingName1Code.class, UndertakingType1Choice.class, UndertakingWording1 .class, VariationType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01";

    public MxTsrv00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv00300101(final String xml) {
        this();
        MxTsrv00300101 tmp = parse(xml);
        udrtkgIssncNtfctn = tmp.getUdrtkgIssncNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgIssncNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingIssuanceNotificationV01 }
     *     
     */
    public UndertakingIssuanceNotificationV01 getUdrtkgIssncNtfctn() {
        return udrtkgIssncNtfctn;
    }

    /**
     * Sets the value of the udrtkgIssncNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingIssuanceNotificationV01 }
     *     
     */
    public MxTsrv00300101 setUdrtkgIssncNtfctn(UndertakingIssuanceNotificationV01 value) {
        this.udrtkgIssncNtfctn = value;
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
    public static MxTsrv00300101 parse(String xml) {
        return ((MxTsrv00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsrv00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsrv00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv00300101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv00300101) parserImpl.read(MxTsrv00300101 .class, xml, _classes));
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
     * Creates an MxTsrv00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv00300101 message
     * @return
     *     a new instance of MxTsrv00300101
     */
    public static final MxTsrv00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv00300101 .class);
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
