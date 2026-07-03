
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
 * Class for catm.003.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.13")
public class MxCatm00300113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV13 accptrCfgtnUpd;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfiguration13 .class, AcceptorConfigurationContent13 .class, AcceptorConfigurationDataSet5 .class, AcceptorConfigurationUpdateV13 .class, AcquirerHostConfiguration9 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters16 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, ApplicationParameters13 .class, AttributeType1Code.class, AuthenticatedData10 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess2Code.class, CertificateIssuer1 .class, ClockSynchronisation3 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, CryptographicKey18 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory18Code.class, DataSetIdentification10 .class, DigestedData6 .class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, ExternallyDefinedData5 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter6 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier5 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters6 .class, MessageFunction43Code.class, MessageItemCondition2 .class, MessageItemCondition2Code.class, MxCatm00300113 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, PartyType15Code.class, PartyType33Code.class, PartyType7Code.class, PaymentTerminalParameters8 .class, PhysicalInterfaceParameter1 .class, PointOfInteractionComponentIdentification2 .class, ProcessRetry3 .class, ProcessTiming6 .class, Recipient13Choice.class, Recipient15Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, RetailerMessage1Code.class, RetailerService2Code.class, RetailerService8Code.class, SaleToPOIProtocolParameter3 .class, SecurityParameters16 .class, ServiceProviderParameters3 .class, SignedData9 .class, Signer8 .class, TMSHeader1 .class, TMSProtocolParameters7 .class, TerminalManagementAction3Code.class, TerminalPackageType5 .class, TimeUnit1Code.class, Traceability8 .class, TypeOfAmount8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.13";

    public MxCatm00300113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300113(final String xml) {
        this();
        MxCatm00300113 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV13 }
     *     
     */
    public AcceptorConfigurationUpdateV13 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV13 }
     *     
     */
    public MxCatm00300113 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV13 value) {
        this.accptrCfgtnUpd = value;
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
    public static MxCatm00300113 parse(String xml) {
        return ((MxCatm00300113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300113 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300113 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300113) parserImpl.read(MxCatm00300113 .class, xml, _classes));
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
     * Creates an MxCatm00300113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300113 message
     * @return
     *     a new instance of MxCatm00300113
     */
    public final static MxCatm00300113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300113 .class);
    }

}
