
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
 * Class for catm.003.001.15 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.15")
public class MxCatm00300115
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV15 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 15;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration15 .class, AcceptorConfigurationContent15 .class, AcceptorConfigurationDataSet7 .class, AcceptorConfigurationUpdateV15 .class, AcquirerHostConfiguration11 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters18 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, ApplicationParameters13 .class, AttributeType1Code.class, AuthenticatedData10 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CAPEEncodingMode1Code.class, CAPEExchangeMode1Code.class, CancellationProcess2Code.class, CertificateIssuer1 .class, ClockSynchronisation3 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, CryptographicKey19 .class, CryptographicKeyType5Code.class, DataSetCategory10Code.class, DataSetCategory20Code.class, DataSetIdentification11 .class, DigestedData6 .class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, ExternallyDefinedData5 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter8 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters6 .class, MessageFunction47Code.class, MessageItemCondition2 .class, MessageItemCondition2Code.class, MxCatm00300115 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, PartyType15Code.class, PartyType33Code.class, PartyType7Code.class, PaymentTerminalParameters8 .class, PhysicalInterfaceParameter1 .class, PointOfInteractionComponentIdentification2 .class, ProcessRetry3 .class, ProcessTiming6 .class, Recipient13Choice.class, Recipient15Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, RetailerMessage1Code.class, RetailerService2Code.class, RetailerService8Code.class, SaleToPOIProtocolParameter4 .class, SecurityParameters17 .class, ServiceProviderParameters5 .class, SignedData9 .class, Signer8 .class, TMSHeader1 .class, TMSProtocolParameters8 .class, TerminalManagementAction3Code.class, TerminalPackageType5 .class, TimeUnit1Code.class, Traceability8 .class, TypeOfAmount8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.15";

    public MxCatm00300115() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300115(final String xml) {
        this();
        MxCatm00300115 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300115(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV15 }
     *     
     */
    public AcceptorConfigurationUpdateV15 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV15 }
     *     
     */
    public MxCatm00300115 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV15 value) {
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
    public static MxCatm00300115 parse(String xml) {
        return ((MxCatm00300115) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300115 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300115 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300115) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300115 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300115 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300115) parserImpl.read(MxCatm00300115 .class, xml, _classes));
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
     * Creates an MxCatm00300115 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300115 message
     * @return
     *     a new instance of MxCatm00300115
     */
    public static final MxCatm00300115 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300115 .class);
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
