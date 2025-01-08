
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
 * Class for caaa.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acqrrToAccptrBtchFileXchg"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01")
public class MxCaaa02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcqrrToAccptrBtchFileXchg", required = true)
    protected AcquirerToAcceptorBatchFileExchangeV01 acqrrToAccptrBtchFileXchg;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCancellationAdviceResponse12 .class, AcceptorCompletionAdviceResponse12 .class, Acquirer10 .class, AcquirerToAcceptorBatchFileExchangeV01 .class, AcquirerToAcceptorFileBody1 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, AmountUnit1Code.class, AttributeType1Code.class, AuthenticatedData10 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardIdentificationType1Code.class, CardPaymentBatchTransferResponse11 .class, CardPaymentDataSet35 .class, CardPaymentDataSet36 .class, CardPaymentEnvironment80 .class, CardPaymentTransactionAdviceResponse5 .class, CardPaymentTransactionAdviceResponse8 .class, CardProductType1Code.class, Cardholder21 .class, CardholderAuthentication17 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, CryptographicKey18 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DataSetCategory8Code.class, DataSetIdentification5 .class, DateAndPlaceOfBirth1 .class, DigestedData6 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, Exemption1Code.class, ExternallyDefinedData5 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header56 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MobileData6 .class, MxCaaa02700101 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN11 .class, Organisation41 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard35 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData17 .class, PlainCardData22 .class, PointOfInteraction14 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent15 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics10 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, Recipient13Choice.class, Recipient15Choice.class, RelativeDistinguishedName1 .class, Response11Code.class, Response1Code.class, Response9Code.class, ResponseType10 .class, ResponseType11 .class, RetailerResultDetail1Code.class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SensitiveMobileData1 .class, SignedData9 .class, Signer8 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, TrackData2 .class, TrackFormat1Code.class, TransactionIdentifier1 .class, TransactionTotals12 .class, TransactionVerificationResult4 .class, TypeTransactionTotals2Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01";

    public MxCaaa02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa02700101(final String xml) {
        this();
        MxCaaa02700101 tmp = parse(xml);
        acqrrToAccptrBtchFileXchg = tmp.getAcqrrToAccptrBtchFileXchg();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acqrrToAccptrBtchFileXchg property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerToAcceptorBatchFileExchangeV01 }
     *     
     */
    public AcquirerToAcceptorBatchFileExchangeV01 getAcqrrToAccptrBtchFileXchg() {
        return acqrrToAccptrBtchFileXchg;
    }

    /**
     * Sets the value of the acqrrToAccptrBtchFileXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerToAcceptorBatchFileExchangeV01 }
     *     
     */
    public MxCaaa02700101 setAcqrrToAccptrBtchFileXchg(AcquirerToAcceptorBatchFileExchangeV01 value) {
        this.acqrrToAccptrBtchFileXchg = value;
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
    public static MxCaaa02700101 parse(String xml) {
        return ((MxCaaa02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa02700101 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa02700101) parserImpl.read(MxCaaa02700101 .class, xml, _classes));
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
     * Creates an MxCaaa02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa02700101 message
     * @return
     *     a new instance of MxCaaa02700101
     */
    public static final MxCaaa02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa02700101 .class);
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
