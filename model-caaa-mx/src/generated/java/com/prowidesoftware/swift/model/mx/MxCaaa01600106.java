
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
 * Class for caaa.016.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.06")
public class MxCaaa01600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsReq", required = true)
    protected AcceptorCurrencyConversionRequestV06 accptrCcyConvsReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCurrencyConversionRequest6 .class, AcceptorCurrencyConversionRequestV06 .class, Acquirer4 .class, ActionMessage5 .class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AmountUnit1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthenticationResult1Code.class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardPaymentEnvironment68 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken4 .class, CardPaymentTransaction86 .class, CardPaymentTransaction91 .class, CardPaymentTransactionDetails47 .class, CardProductType1Code.class, Cardholder13 .class, CardholderAuthentication11 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics3 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion14 .class, CurrencyConversion15 .class, CurrencyConversion16 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, Frequency3Code.class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification94 .class, GenericInformation1 .class, Header35 .class, IndustryData1 .class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction14Code.class, MxCaaa01600106 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, OnLineReason1Code.class, Organisation32 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard28 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction8 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, Product6 .class, Recipient5Choice.class, Recipient6Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, SignedData5 .class, Signer4 .class, Traceability5 .class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.06";

    public MxCaaa01600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01600106(final String xml) {
        this();
        MxCaaa01600106 tmp = parse(xml);
        accptrCcyConvsReq = tmp.getAccptrCcyConvsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionRequestV06 }
     *     
     */
    public AcceptorCurrencyConversionRequestV06 getAccptrCcyConvsReq() {
        return accptrCcyConvsReq;
    }

    /**
     * Sets the value of the accptrCcyConvsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionRequestV06 }
     *     
     */
    public MxCaaa01600106 setAccptrCcyConvsReq(AcceptorCurrencyConversionRequestV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCaaa01600106 parse(String xml) {
        return ((MxCaaa01600106) MxReadImpl.parse(MxCaaa01600106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01600106 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01600106) parserImpl.read(MxCaaa01600106 .class, xml, _classes));
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
     * Creates an MxCaaa01600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01600106 message
     * @return
     *     a new instance of MxCaaa01600106
     */
    public final static MxCaaa01600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01600106 .class);
    }

}
