
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
 * Class for catm.003.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.07")
public class MxCatm00300107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV07 accptrCfgtnUpd;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfiguration7 .class, AcceptorConfigurationContent7 .class, AcceptorConfigurationUpdateV07 .class, AcquirerHostConfiguration5 .class, AcquirerProtocolParameters11 .class, AcquirerProtocolParameters8 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, ApplicationParameters7 .class, AttributeType1Code.class, AuthenticatedData5 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess1Code.class, CertificateIssuer1 .class, ClockSynchronisation2 .class, ContentInformationType17 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory12Code.class, DataSetIdentification7 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, ExchangeConfiguration6 .class, ExchangeConfiguration7 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification53 .class, GenericIdentification71 .class, GenericIdentification92 .class, GenericInformation1 .class, Header27 .class, HostCommunicationParameter5 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport5 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters3 .class, MessageFunction15Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300107 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkParameters6 .class, NetworkType1Code.class, NetworkType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType15Code.class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, PaymentTerminalParameters5 .class, PhysicalInterfaceParameter1 .class, ProcessRetry2 .class, ProcessTiming4 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, SaleToPOIProtocolParameter1 .class, SecurityParameters11 .class, SignedData5 .class, Signer4 .class, TMSProtocolParameters3 .class, TerminalManagementAction3Code.class, TerminalManagementDataSet23 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.07";

    public MxCatm00300107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300107(final String xml) {
        this();
        MxCatm00300107 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV07 }
     *     
     */
    public AcceptorConfigurationUpdateV07 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV07 }
     *     
     */
    public MxCatm00300107 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCatm00300107 parse(String xml) {
        return ((MxCatm00300107) MxReadImpl.parse(MxCatm00300107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300107 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300107) parserImpl.read(MxCatm00300107 .class, xml, _classes));
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
     * Creates an MxCatm00300107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300107 message
     * @return
     *     a new instance of MxCatm00300107
     */
    public final static MxCatm00300107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300107 .class);
    }

}
