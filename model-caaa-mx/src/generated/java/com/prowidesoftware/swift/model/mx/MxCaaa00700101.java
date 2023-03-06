
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
 * Class for caaa.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.01")
public class MxCaaa00700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlAdvc", required = true)
    protected AcceptorCancellationAdviceV01 accptrCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationAdvice1 .class, AcceptorCancellationAdviceV01 .class, Acquirer1 .class, AddressVerification1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData1 .class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, AuthorisationResult2 .class, CardDataReading1Code.class, CardPaymentContext2 .class, CardPaymentEnvironment2 .class, CardPaymentServiceType1Code.class, CardPaymentServiceType2Code.class, CardPaymentServiceType3Code.class, CardPaymentTransaction7 .class, CardPaymentTransaction8 .class, CardPaymentTransactionDetails7 .class, CardPaymentTransactionResult1 .class, Cardholder2 .class, CardholderAuthentication2 .class, CardholderIdentification1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType2 .class, ContentInformationType3 .class, ContentType1Code.class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, FailureReason1Code.class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, Header2 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, LocationCategory1Code.class, MessageFunction1Code.class, MxCaaa00700101 .class, OnLineCapability1Code.class, Organisation5 .class, POIComponentType1Code.class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard3 .class, PaymentContext2 .class, PersonIdentificationType4Code.class, PlainCardData2 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.01";

    public MxCaaa00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00700101(final String xml) {
        this();
        MxCaaa00700101 tmp = parse(xml);
        accptrCxlAdvc = tmp.getAccptrCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceV01 }
     *     
     */
    public AcceptorCancellationAdviceV01 getAccptrCxlAdvc() {
        return accptrCxlAdvc;
    }

    /**
     * Sets the value of the accptrCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceV01 }
     *     
     */
    public MxCaaa00700101 setAccptrCxlAdvc(AcceptorCancellationAdviceV01 value) {
        this.accptrCxlAdvc = value;
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
    public static MxCaaa00700101 parse(String xml) {
        return ((MxCaaa00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00700101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00700101) parserImpl.read(MxCaaa00700101 .class, xml, _classes));
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
     * Creates an MxCaaa00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00700101 message
     * @return
     *     a new instance of MxCaaa00700101
     */
    public final static MxCaaa00700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00700101 .class);
    }

}
