
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
 * Class for catm.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.03")
public class MxCatm00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV03 accptrCfgtnUpd;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfiguration3 .class, AcceptorConfigurationContent3 .class, AcceptorConfigurationUpdateV03 .class, AcquirerHostConfiguration2 .class, AcquirerProtocolParameters5 .class, AcquirerProtocolParameters6 .class, Algorithm10Code.class, Algorithm4Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification4 .class, AlgorithmIdentification5 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, ApplicationParameters3 .class, AttributeType1Code.class, AuthenticatedData3 .class, BatchTransactionType1Code.class, CancellationProcess1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ClockSynchronisation1 .class, ContentInformationType7 .class, ContentInformationType9 .class, ContentType1Code.class, CryptographicKey3 .class, CryptographicKey4 .class, CryptographicKeyType2Code.class, DataSetCategory3Code.class, DataSetIdentification3 .class, DigestedData3 .class, EncapsulatedContent2 .class, EncryptedContent2 .class, EnvelopedData3 .class, ExchangeConfiguration4 .class, ExchangeConfiguration5 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification32 .class, GenericIdentification35 .class, Header4 .class, HostCommunicationParameter2 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, KeyUsage1Code.class, MessageFunction3Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300103 .class, NetworkParameters1 .class, NetworkParameters2 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, PaymentTerminalParameters1 .class, ProcessRetry2 .class, ProcessTiming3 .class, Recipient3Choice.class, RelativeDistinguishedName1 .class, SecurityParameters2 .class, SignedData3 .class, Signer2 .class, TerminalManagementDataSet11 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.03";

    public MxCatm00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300103(final String xml) {
        this();
        MxCatm00300103 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV03 }
     *     
     */
    public AcceptorConfigurationUpdateV03 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV03 }
     *     
     */
    public MxCatm00300103 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV03 value) {
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
    public static MxCatm00300103 parse(String xml) {
        return ((MxCatm00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300103 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300103) parserImpl.read(MxCatm00300103 .class, xml, _classes));
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
     * Creates an MxCatm00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300103 message
     * @return
     *     a new instance of MxCatm00300103
     */
    public static final MxCatm00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300103 .class);
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
