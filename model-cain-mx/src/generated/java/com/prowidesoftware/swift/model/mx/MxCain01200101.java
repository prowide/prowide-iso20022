
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
 * Class for cain.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "keyXchgRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.012.001.01")
public class MxCain01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "KeyXchgRspn", required = true)
    protected KeyExchangeResponse keyXchgRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcquirerKeyExchangeResponse1 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardServiceType3Code.class, CardTransaction14 .class, CardTransactionEnvironment6 .class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType12 .class, ContentType2Code.class, CryptographicKey6 .class, CryptographicKeyType3Code.class, DigestedData4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification73 .class, GenericIdentification74 .class, Header17 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KEKIdentifier3 .class, KeyExchangeResponse.class, KeyTransport4 .class, KeyUsage1Code.class, MessageFunction6Code.class, MxCain01200101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType10Code.class, PartyType9Code.class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response3Code.class, ResponseType2 .class, ResultDetail1Code.class, SignedData4 .class, Signer3 .class, Traceability3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.012.001.01";

    public MxCain01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01200101(final String xml) {
        this();
        MxCain01200101 tmp = parse(xml);
        keyXchgRspn = tmp.getKeyXchgRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the keyXchgRspn property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeResponse }
     *     
     */
    public KeyExchangeResponse getKeyXchgRspn() {
        return keyXchgRspn;
    }

    /**
     * Sets the value of the keyXchgRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeResponse }
     *     
     */
    public MxCain01200101 setKeyXchgRspn(KeyExchangeResponse value) {
        this.keyXchgRspn = value;
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
    public static MxCain01200101 parse(String xml) {
        return ((MxCain01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01200101 parse(String xml, MxRead parserImpl) {
        return ((MxCain01200101) parserImpl.read(MxCain01200101 .class, xml, _classes));
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
     * Creates an MxCain01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01200101 message
     * @return
     *     a new instance of MxCain01200101
     */
    public static final MxCain01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01200101 .class);
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
