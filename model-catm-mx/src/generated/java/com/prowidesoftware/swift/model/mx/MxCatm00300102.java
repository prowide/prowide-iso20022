
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catm.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.02")
public class MxCatm00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV02 accptrCfgtnUpd;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfiguration2 .class, AcceptorConfigurationContent2 .class, AcceptorConfigurationUpdateV02 .class, AcquirerHostConfiguration2 .class, AcquirerProtocolParameters3 .class, AcquirerProtocolParameters4 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm4Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification4 .class, AlgorithmIdentification5 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, ApplicationParameters2 .class, AttributeType1Code.class, AuthenticatedData2 .class, BatchTransactionType1Code.class, CancellationProcess1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType4 .class, ContentInformationType5 .class, ContentType1Code.class, CryptographicKey2 .class, CryptographicKey3 .class, CryptographicKeyType2Code.class, DataSetCategory3Code.class, DataSetIdentification3 .class, DigestedData2 .class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, ExchangeConfiguration2 .class, ExchangeConfiguration3 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification32 .class, GenericIdentification35 .class, Header4 .class, HostCommunicationParameter2 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, KeyUsage1Code.class, MessageFunction3Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300102 .class, NamedKeyEncryptedData2 .class, NetworkParameters1 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, ProcessRetry2 .class, ProcessTiming2 .class, Recipient2Choice.class, RelativeDistinguishedName1 .class, SecurityParameters1 .class, SignedData2 .class, Signer2 .class, TerminalManagementDataSet6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.02";

    public MxCatm00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300102(final String xml) {
        this();
        MxCatm00300102 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV02 }
     *     
     */
    public AcceptorConfigurationUpdateV02 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV02 }
     *     
     */
    public MxCatm00300102 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV02 value) {
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
    public static MxCatm00300102 parse(String xml) {
        return ((MxCatm00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300102) parserImpl.read(MxCatm00300102 .class, xml, _classes));
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
     * Creates an MxCatm00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300102 message
     * @return
     *     a new instance of MxCatm00300102
     */
    public final static MxCatm00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300102 .class);
    }

}
