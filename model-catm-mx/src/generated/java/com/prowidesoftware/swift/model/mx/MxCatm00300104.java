
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
 * Class for catm.003.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.04")
public class MxCatm00300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV04 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration4 .class, AcceptorConfigurationContent4 .class, AcceptorConfigurationUpdateV04 .class, AcquirerHostConfiguration3 .class, AcquirerProtocolParameters7 .class, AcquirerProtocolParameters8 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, ApplicationParameters4 .class, AttributeType1Code.class, AuthenticatedData4 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess1Code.class, CertificateIssuer1 .class, ClockSynchronisation1 .class, ContentInformationType10 .class, ContentInformationType12 .class, ContentType2Code.class, CryptographicKey5 .class, CryptographicKeyType3Code.class, DataSetCategory4Code.class, DataSetCategory5Code.class, DataSetIdentification4 .class, DigestedData4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, ExchangeConfiguration6 .class, ExchangeConfiguration7 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification53 .class, GenericIdentification71 .class, Header14 .class, HostCommunicationParameter3 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, KeyUsage1Code.class, LocalDateTime1 .class, MerchantConfigurationParameters1 .class, MessageFunction5Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300104 .class, NetworkParameters2 .class, NetworkParameters3 .class, NetworkParameters4 .class, NetworkType1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, PaymentTerminalParameters2 .class, ProcessRetry2 .class, ProcessTiming4 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SecurityParameters3 .class, SignedData4 .class, Signer3 .class, TMSProtocolParameters1 .class, TerminalManagementDataSet14 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.04";

    public MxCatm00300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300104(final String xml) {
        this();
        MxCatm00300104 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV04 }
     *     
     */
    public AcceptorConfigurationUpdateV04 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV04 }
     *     
     */
    public MxCatm00300104 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV04 value) {
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
    public static MxCatm00300104 parse(String xml) {
        return ((MxCatm00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300104 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300104) parserImpl.read(MxCatm00300104 .class, xml, _classes));
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
     * Creates an MxCatm00300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300104 message
     * @return
     *     a new instance of MxCatm00300104
     */
    public static final MxCatm00300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300104 .class);
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
