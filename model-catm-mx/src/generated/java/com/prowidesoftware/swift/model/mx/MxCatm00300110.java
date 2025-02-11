
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
 * Class for catm.003.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.10")
public class MxCatm00300110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV10 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration10 .class, AcceptorConfigurationContent10 .class, AcceptorConfigurationDataSet2 .class, AcceptorConfigurationUpdateV10 .class, AcquirerHostConfiguration8 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters14 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, ApplicationParameters10 .class, AttributeType1Code.class, AuthenticatedData7 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess2Code.class, CertificateIssuer1 .class, ClockSynchronisation3 .class, ContentInformationType25 .class, ContentInformationType26 .class, ContentInformationType28 .class, ContentType2Code.class, CryptographicKey15 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory14Code.class, DataSetIdentification8 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData8 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, ExternallyDefinedData2 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter6 .class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport7 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters6 .class, MessageFunction43Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300110 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType1Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, PackageType2 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType15Code.class, PartyType33Code.class, PaymentTerminalParameters8 .class, PhysicalInterfaceParameter1 .class, PointOfInteractionComponentIdentification2 .class, ProcessRetry3 .class, ProcessTiming6 .class, Recipient10Choice.class, Recipient9Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, SaleToPOIProtocolParameter1 .class, SecurityParameters13 .class, ServiceProviderParameters1 .class, SignedData6 .class, Signer5 .class, TMSHeader1 .class, TMSProtocolParameters5 .class, TerminalManagementAction3Code.class, TerminalPackageType2 .class, TimeUnit1Code.class, Traceability8 .class, TypeOfAmount8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.10";

    public MxCatm00300110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300110(final String xml) {
        this();
        MxCatm00300110 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV10 }
     *     
     */
    public AcceptorConfigurationUpdateV10 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV10 }
     *     
     */
    public MxCatm00300110 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV10 value) {
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
    public static MxCatm00300110 parse(String xml) {
        return ((MxCatm00300110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300110 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300110) parserImpl.read(MxCatm00300110 .class, xml, _classes));
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
     * Creates an MxCatm00300110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300110 message
     * @return
     *     a new instance of MxCatm00300110
     */
    public static final MxCatm00300110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300110 .class);
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
