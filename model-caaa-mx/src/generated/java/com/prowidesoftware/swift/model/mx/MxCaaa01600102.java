
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
 * Class for caaa.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.02")
public class MxCaaa01600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsReq", required = true)
    protected AcceptorCurrencyConversionRequestV02 accptrCcyConvsReq;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCurrencyConversionRequest2 .class, AcceptorCurrencyConversionRequestV02 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardDataReading1Code.class, CardPaymentEnvironment44 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentTransaction49 .class, CardPaymentTransaction50 .class, CardPaymentTransactionDetails26 .class, CardholderVerificationCapability1Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, CommunicationCharacteristics2 .class, ContentInformationType10 .class, ContentInformationType11 .class, ContentType2Code.class, CurrencyConversion2 .class, CurrencyConversion3 .class, CurrencyConversionResponse1Code.class, CurrencyDetails1 .class, DetailedAmount4 .class, DetailedAmount7 .class, DisplayCapabilities2 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification32 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, Header10 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa01600102 .class, OnLineCapability1Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard9 .class, PlainCardData7 .class, PointOfInteraction4 .class, PointOfInteractionCapabilities3 .class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Traceability2 .class, TrackData1 .class, TransactionIdentifier1 .class, TypeOfAmount1Code.class, UserInterface2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.02";

    public MxCaaa01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01600102(final String xml) {
        this();
        MxCaaa01600102 tmp = parse(xml);
        accptrCcyConvsReq = tmp.getAccptrCcyConvsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionRequestV02 }
     *     
     */
    public AcceptorCurrencyConversionRequestV02 getAccptrCcyConvsReq() {
        return accptrCcyConvsReq;
    }

    /**
     * Sets the value of the accptrCcyConvsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionRequestV02 }
     *     
     */
    public MxCaaa01600102 setAccptrCcyConvsReq(AcceptorCurrencyConversionRequestV02 value) {
        this.accptrCcyConvsReq = value;
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
    public static MxCaaa01600102 parse(String xml) {
        return ((MxCaaa01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01600102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01600102) parserImpl.read(MxCaaa01600102 .class, xml, _classes));
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
     * Creates an MxCaaa01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01600102 message
     * @return
     *     a new instance of MxCaaa01600102
     */
    public static final MxCaaa01600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01600102 .class);
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
