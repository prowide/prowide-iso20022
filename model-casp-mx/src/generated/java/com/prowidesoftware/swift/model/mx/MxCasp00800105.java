
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for casp.008.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIAdmstvRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.008.001.05")
public class MxCasp00800105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIAdmstvRspn", required = true)
    protected SaleToPOIAdministrativeResponseV05 saleToPOIAdmstvRspn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Acquirer10 .class, AddressType2Code.class, AddressVerification1 .class, AdministrativeResponse6 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData9 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BusinessArea2Code.class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext30 .class, CardPaymentEnvironment79 .class, CardProductType1Code.class, Cardholder20 .class, CardholderAuthentication16 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType33 .class, ContentInformationType34 .class, ContentInformationType35 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey17 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData10 .class, Exemption1Code.class, ExternallyDefinedData4 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header41 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport9 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MobileData5 .class, MxCasp00800105 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN10 .class, Organisation26 .class, Organisation41 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType4 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard33 .class, PaymentContext29 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction13 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent14 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics9 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, Recipient13Choice.class, Recipient14Choice.class, RelativeDistinguishedName1 .class, Response11Code.class, ResponseType11 .class, RetailerMessage1Code.class, RetailerResultDetail1Code.class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleToPOIAdministrativeResponseV05 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData8 .class, Signer7 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.008.001.05";

    public MxCasp00800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp00800105(final String xml) {
        this();
        MxCasp00800105 tmp = parse(xml);
        saleToPOIAdmstvRspn = tmp.getSaleToPOIAdmstvRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp00800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIAdmstvRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIAdministrativeResponseV05 }
     *     
     */
    public SaleToPOIAdministrativeResponseV05 getSaleToPOIAdmstvRspn() {
        return saleToPOIAdmstvRspn;
    }

    /**
     * Sets the value of the saleToPOIAdmstvRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIAdministrativeResponseV05 }
     *     
     */
    public MxCasp00800105 setSaleToPOIAdmstvRspn(SaleToPOIAdministrativeResponseV05 value) {
        this.saleToPOIAdmstvRspn = value;
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
    public static MxCasp00800105 parse(String xml) {
        return ((MxCasp00800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp00800105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp00800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp00800105 parse(String xml, MxRead parserImpl) {
        return ((MxCasp00800105) parserImpl.read(MxCasp00800105 .class, xml, _classes));
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
     * Creates an MxCasp00800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp00800105 message
     * @return
     *     a new instance of MxCasp00800105
     */
    public final static MxCasp00800105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp00800105 .class);
    }

}
