
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
 * Class for catm.003.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.12")
public class MxCatm00300112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV12 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration12 .class, AcceptorConfigurationContent12 .class, AcceptorConfigurationDataSet4 .class, AcceptorConfigurationUpdateV12 .class, AcquirerHostConfiguration9 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters16 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, ApplicationParameters12 .class, AttributeType1Code.class, AuthenticatedData9 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess2Code.class, CertificateIssuer1 .class, ClockSynchronisation3 .class, ContentInformationType33 .class, ContentInformationType34 .class, ContentInformationType35 .class, ContentType2Code.class, CryptographicKey17 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory18Code.class, DataSetIdentification10 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData10 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, ExternallyDefinedData4 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter6 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier5 .class, KEKIdentifier7 .class, KeyTransport9 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters6 .class, MessageFunction43Code.class, MessageItemCondition2 .class, MessageItemCondition2Code.class, MxCatm00300112 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, PackageType4 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType15Code.class, PartyType33Code.class, PaymentTerminalParameters8 .class, PhysicalInterfaceParameter1 .class, PointOfInteractionComponentIdentification2 .class, ProcessRetry3 .class, ProcessTiming6 .class, Recipient13Choice.class, Recipient14Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, RetailerMessage1Code.class, RetailerService2Code.class, RetailerService8Code.class, SaleToPOIProtocolParameter3 .class, SecurityParameters15 .class, ServiceProviderParameters3 .class, SignedData8 .class, Signer7 .class, TMSHeader1 .class, TMSProtocolParameters7 .class, TerminalManagementAction3Code.class, TerminalPackageType4 .class, TimeUnit1Code.class, Traceability8 .class, TypeOfAmount8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.12";

    public MxCatm00300112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300112(final String xml) {
        this();
        MxCatm00300112 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV12 }
     *     
     */
    public AcceptorConfigurationUpdateV12 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV12 }
     *     
     */
    public MxCatm00300112 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV12 value) {
        this.accptrCfgtnUpd = value;
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
    public static MxCatm00300112 parse(String xml) {
        return ((MxCatm00300112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300112 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300112 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300112) parserImpl.read(MxCatm00300112 .class, xml, _classes));
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
     * Creates an MxCatm00300112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300112 message
     * @return
     *     a new instance of MxCatm00300112
     */
    public static final MxCatm00300112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300112 .class);
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
