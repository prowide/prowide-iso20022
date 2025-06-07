
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
 * Class for canm.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "keyXchgRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.004.001.04")
public class MxCanm00400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "KeyXchgRspn", required = true)
    protected KeyExchangeResponseV04 keyXchgRspn;
    public final static transient String BUSINESS_PROCESS = "canm";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardServiceType5Code.class, CertificateIssuer1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CreditDebit3Code.class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, ErrorDetails3 .class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyExchangeData1 .class, KeyExchangeResponseV04 .class, KeyTransport6 .class, KeyType1Code.class, MACData1 .class, MessageError1Code.class, MxCanm00400104 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, PartyType26Code.class, PartyType32Code.class, PartyType9Code.class, ProcessingResult23 .class, ProgrammeMode5 .class, ProtectedData2 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, SettlementService6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability10 .class, TypeOfAmount21Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.004.001.04";

    public MxCanm00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00400104(final String xml) {
        this();
        MxCanm00400104 tmp = parse(xml);
        keyXchgRspn = tmp.getKeyXchgRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the keyXchgRspn property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeResponseV04 }
     *     
     */
    public KeyExchangeResponseV04 getKeyXchgRspn() {
        return keyXchgRspn;
    }

    /**
     * Sets the value of the keyXchgRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeResponseV04 }
     *     
     */
    public MxCanm00400104 setKeyXchgRspn(KeyExchangeResponseV04 value) {
        this.keyXchgRspn = value;
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
    public static MxCanm00400104 parse(String xml) {
        return ((MxCanm00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00400104 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00400104) parserImpl.read(MxCanm00400104 .class, xml, _classes));
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
     * Creates an MxCanm00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00400104 message
     * @return
     *     a new instance of MxCanm00400104
     */
    public final static MxCanm00400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00400104 .class);
    }

}
