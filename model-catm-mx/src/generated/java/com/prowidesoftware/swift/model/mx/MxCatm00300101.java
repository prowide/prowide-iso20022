
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
 * Class for catm.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCfgtnUpd"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.01")
public class MxCatm00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCfgtnUpd", required = true)
    protected AcceptorConfigurationUpdateV01 accptrCfgtnUpd;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfiguration1 .class, AcceptorConfigurationContent1 .class, AcceptorConfigurationUpdateV01 .class, AcquirerHostConfiguration1 .class, AcquirerProtocolParameters1 .class, AcquirerProtocolParameters2 .class, Algorithm1Code.class, AlgorithmIdentification1 .class, ApplicationParameters1 .class, AttributeType1Code.class, AuthenticatedData1 .class, BatchTransactionType1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentInformationType2 .class, ContentType1Code.class, CryptographicKey1 .class, CryptographicKeyType1Code.class, DataSetCategory2Code.class, DataSetIdentification2 .class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, ExchangeConfiguration1 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification32 .class, GenericIdentification35 .class, Header4 .class, HostCommunicationParameter1 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, KeyUsage1Code.class, MessageFunction3Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00300101 .class, NamedKeyEncryptedData1 .class, NetworkParameters1 .class, Parameter1 .class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, ProcessRetry1 .class, ProcessTiming1 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, SignedData1 .class, Signer1 .class, TerminalManagementDataSet3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.01";

    public MxCatm00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00300101(final String xml) {
        this();
        MxCatm00300101 tmp = parse(xml);
        accptrCfgtnUpd = tmp.getAccptrCfgtnUpd();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCfgtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfigurationUpdateV01 }
     *     
     */
    public AcceptorConfigurationUpdateV01 getAccptrCfgtnUpd() {
        return accptrCfgtnUpd;
    }

    /**
     * Sets the value of the accptrCfgtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfigurationUpdateV01 }
     *     
     */
    public MxCatm00300101 setAccptrCfgtnUpd(AcceptorConfigurationUpdateV01 value) {
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
    public static MxCatm00300101 parse(String xml) {
        return ((MxCatm00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00300101 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00300101) parserImpl.read(MxCatm00300101 .class, xml, _classes));
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
     * Creates an MxCatm00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00300101 message
     * @return
     *     a new instance of MxCatm00300101
     */
    public final static MxCatm00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00300101 .class);
    }

}
