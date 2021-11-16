
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
 * Class for caaa.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.01")
public class MxCaaa00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnReq", required = true)
    protected AcceptorAuthorisationRequestV01 accptrAuthstnReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorAuthorisationRequest1 .class, AcceptorAuthorisationRequestV01 .class, Acquirer1 .class, AddressVerification1 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData1 .class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, CSCManagement1Code.class, CardAccountType1Code.class, CardDataReading1Code.class, CardPaymentContext1 .class, CardPaymentEnvironment1 .class, CardPaymentServiceType1Code.class, CardPaymentServiceType2Code.class, CardPaymentServiceType3Code.class, CardPaymentTransaction1 .class, CardPaymentTransaction8 .class, CardPaymentTransactionDetails1 .class, CardPaymentTransactionResult1 .class, CardSecurityInformation1 .class, Cardholder1 .class, CardholderAuthentication1 .class, CardholderIdentification1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType2 .class, ContentInformationType3 .class, ContentType1Code.class, DetailedAmount1 .class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, Frequency4Code.class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, LocationCategory1Code.class, MessageFunction1Code.class, MxCaaa00100101 .class, OnLineCapability1Code.class, OnLinePIN1 .class, OnLineReason1Code.class, Organisation5 .class, PINFormat1Code.class, POIComponentType1Code.class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard1 .class, PaymentContext1 .class, PersonIdentificationType4Code.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, Product1 .class, Recipient1Choice.class, RecurringTransaction1 .class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TypeOfAmount1Code.class, TypeOfAmount2Code.class, UnitOfMeasure1Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.01";

    public MxCaaa00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00100101(final String xml) {
        this();
        MxCaaa00100101 tmp = parse(xml);
        accptrAuthstnReq = tmp.getAccptrAuthstnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationRequestV01 }
     *     
     */
    public AcceptorAuthorisationRequestV01 getAccptrAuthstnReq() {
        return accptrAuthstnReq;
    }

    /**
     * Sets the value of the accptrAuthstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationRequestV01 }
     *     
     */
    public MxCaaa00100101 setAccptrAuthstnReq(AcceptorAuthorisationRequestV01 value) {
        this.accptrAuthstnReq = value;
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
    public static MxCaaa00100101 parse(String xml) {
        return ((MxCaaa00100101) MxReadImpl.parse(MxCaaa00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00100101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00100101) parserImpl.read(MxCaaa00100101 .class, xml, _classes));
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
     * Creates an MxCaaa00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00100101 message
     * @return
     *     a new instance of MxCaaa00100101
     */
    public final static MxCaaa00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00100101 .class);
    }

}
