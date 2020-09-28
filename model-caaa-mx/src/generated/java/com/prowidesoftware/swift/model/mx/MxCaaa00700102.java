
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caaa.007.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.02")
public class MxCaaa00700102
    extends AbstractMX
{

    @XmlElement(name = "AccptrCxlAdvc", required = true)
    protected AcceptorCancellationAdviceV02 accptrCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationAdvice2 .class, AcceptorCancellationAdviceV02 .class, Acquirer2 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData2 .class, AuthorisationResult2 .class, CardDataReading1Code.class, CardPaymentContext2 .class, CardPaymentEnvironment18 .class, CardPaymentServiceType2Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType4Code.class, CardPaymentTransaction16 .class, CardPaymentTransaction17 .class, CardPaymentTransactionDetails7 .class, CardPaymentTransactionResult1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, CommunicationCharacteristics1 .class, ContentInformationType5 .class, ContentInformationType6 .class, ContentType1Code.class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, FailureReason2Code.class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, GenericIdentification48 .class, Header2 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction1Code.class, MxCaaa00700102 .class, OnLineCapability1Code.class, Organisation8 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard6 .class, PaymentContext2 .class, PlainCardData2 .class, PointOfInteraction2 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent3 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics1 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Recipient2Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.02";

    public MxCaaa00700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00700102(final String xml) {
        this();
        MxCaaa00700102 tmp = parse(xml);
        accptrCxlAdvc = tmp.getAccptrCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceV02 }
     *     
     */
    public AcceptorCancellationAdviceV02 getAccptrCxlAdvc() {
        return accptrCxlAdvc;
    }

    /**
     * Sets the value of the accptrCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceV02 }
     *     
     */
    public MxCaaa00700102 setAccptrCxlAdvc(AcceptorCancellationAdviceV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCaaa00700102 parse(String xml) {
        return ((MxCaaa00700102) MxReadImpl.parse(MxCaaa00700102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00700102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00700102) parserImpl.read(MxCaaa00700102 .class, xml, _classes));
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
     * Creates an MxCaaa00700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00700102 message
     * @return
     *     a new instance of MxCaaa00700102
     */
    public final static MxCaaa00700102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa00700102 .class);
    }

}
