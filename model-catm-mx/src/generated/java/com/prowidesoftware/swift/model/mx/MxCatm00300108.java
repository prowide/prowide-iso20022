
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
 * Class for catm.003.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.08")
public class MxCatm00300108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV08 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration8 .class, AcceptorConfigurationContent8 .class, AcceptorConfigurationUpdateV08 .class, AcquirerHostConfiguration6 .class, AcquirerProtocolParameters12 .class, AcquirerProtocolParameters8 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, ApplicationParameters8 .class, AttributeType1Code.class, AuthenticatedData5 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess1Code.class, CertificateIssuer1 .class, ClockSynchronisation2 .class, ContentInformationType17 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory12Code.class, DataSetIdentification7 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, ExchangeConfiguration6 .class, ExchangeConfiguration7 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification53 .class, GenericIdentification71 .class, GenericIdentification92 .class, GenericInformation1 .class, Header27 .class, HostCommunicationParameter5 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport5 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters4 .class, MessageFunction15Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300108 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkParameters6 .class, NetworkType1Code.class, NetworkType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType15Code.class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, PaymentTerminalParameters6 .class, PhysicalInterfaceParameter1 .class, ProcessRetry2 .class, ProcessTiming4 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, SaleToPOIProtocolParameter1 .class, SecurityParameters11 .class, SignedData5 .class, Signer4 .class, TMSProtocolParameters4 .class, TerminalManagementAction3Code.class, TerminalManagementDataSet27 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.08";

    public MxCatm00300108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300108(final String xml) {
        this();
        MxCatm00300108 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV08 }
     *     
     */
    public AcceptorConfigurationUpdateV08 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV08 }
     *     
     */
    public MxCatm00300108 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV08 value) {
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
    public static MxCatm00300108 parse(String xml) {
        return ((MxCatm00300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300108 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300108 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300108) parserImpl.read(MxCatm00300108 .class, xml, _classes));
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
     * Creates an MxCatm00300108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300108 message
     * @return
     *     a new instance of MxCatm00300108
     */
    public static final MxCatm00300108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300108 .class);
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
