
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
 * Class for canm.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "keyXchgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.003.001.02")
public class MxCanm00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "KeyXchgInitn", required = true)
    protected KeyExchangeInitiationV02 keyXchgInitn;
    public final static transient String BUSINESS_PROCESS = "canm";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode1 .class, CardServiceType5Code.class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context8 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, FeeAmount2 .class, GenericIdentification172 .class, Header44 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyExchangeData1 .class, KeyExchangeInitiation1 .class, KeyExchangeInitiationV02 .class, KeyTransport6 .class, KeyType1Code.class, MACData1 .class, MessageFunction25Code.class, MxCanm00300102 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction100 .class, TransactionContext5 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount10Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.003.001.02";

    public MxCanm00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00300102(final String xml) {
        this();
        MxCanm00300102 tmp = parse(xml);
        keyXchgInitn = tmp.getKeyXchgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the keyXchgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeInitiationV02 }
     *     
     */
    public KeyExchangeInitiationV02 getKeyXchgInitn() {
        return keyXchgInitn;
    }

    /**
     * Sets the value of the keyXchgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeInitiationV02 }
     *     
     */
    public MxCanm00300102 setKeyXchgInitn(KeyExchangeInitiationV02 value) {
        this.keyXchgInitn = value;
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
    public static MxCanm00300102 parse(String xml) {
        return ((MxCanm00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00300102) parserImpl.read(MxCanm00300102 .class, xml, _classes));
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
     * Creates an MxCanm00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00300102 message
     * @return
     *     a new instance of MxCanm00300102
     */
    public final static MxCanm00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00300102 .class);
    }

}
