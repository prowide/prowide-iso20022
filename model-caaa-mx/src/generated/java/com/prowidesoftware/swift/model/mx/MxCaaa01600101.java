
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caaa.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.01")
public class MxCaaa01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsReq", required = true)
    protected AcceptorCurrencyConversionRequestV01 accptrCcyConvsReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCurrencyConversionRequest1 .class, AcceptorCurrencyConversionRequestV01 .class, Algorithm10Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, AttributeType1Code.class, AuthenticatedData3 .class, CSCManagement1Code.class, CardDataReading1Code.class, CardPaymentEnvironment30 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentTransaction33 .class, CardPaymentTransaction34 .class, CardPaymentTransactionDetails18 .class, CardSecurityInformation1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, CommunicationCharacteristics2 .class, ContentInformationType7 .class, ContentInformationType8 .class, ContentType1Code.class, CurrencyConversion1 .class, CurrencyConversionResponse1Code.class, DetailedAmount4 .class, DetailedAmount5 .class, DisplayCapabilities2 .class, EncapsulatedContent2 .class, EncryptedContent2 .class, EnvelopedData3 .class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification48 .class, Header7 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa01600101 .class, OnLineCapability1Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard7 .class, PlainCardData4 .class, PointOfInteraction3 .class, PointOfInteractionCapabilities2 .class, PointOfInteractionComponent4 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Recipient3Choice.class, RelativeDistinguishedName1 .class, Traceability1 .class, TrackData1 .class, TransactionIdentifier1 .class, TypeOfAmount1Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.01";

    public MxCaaa01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01600101(final String xml) {
        this();
        MxCaaa01600101 tmp = parse(xml);
        accptrCcyConvsReq = tmp.getAccptrCcyConvsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionRequestV01 }
     *     
     */
    public AcceptorCurrencyConversionRequestV01 getAccptrCcyConvsReq() {
        return accptrCcyConvsReq;
    }

    /**
     * Sets the value of the accptrCcyConvsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionRequestV01 }
     *     
     */
    public MxCaaa01600101 setAccptrCcyConvsReq(AcceptorCurrencyConversionRequestV01 value) {
        this.accptrCcyConvsReq = value;
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
    public static MxCaaa01600101 parse(String xml) {
        return ((MxCaaa01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01600101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01600101) parserImpl.read(MxCaaa01600101 .class, xml, _classes));
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
     * Creates an MxCaaa01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01600101 message
     * @return
     *     a new instance of MxCaaa01600101
     */
    public final static MxCaaa01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01600101 .class);
    }

}
