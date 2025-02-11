
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
 * Class for canm.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "keyXchgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:canm.003.001.03")
public class MxCanm00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "KeyXchgInitn", required = true)
    protected KeyExchangeInitiationV03 keyXchgInitn;
    public static final transient String BUSINESS_PROCESS = "canm";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode3 .class, CardServiceType5Code.class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CreditDebit3Code.class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, FeeAmount3 .class, GenericIdentification183 .class, Header63 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyExchangeData1 .class, KeyExchangeInitiation2 .class, KeyExchangeInitiationV03 .class, KeyTransport6 .class, KeyType1Code.class, MACData1 .class, MessageFunction23Code.class, MxCanm00300103 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, Priority3Code.class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction133 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount21Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:canm.003.001.03";

    public MxCanm00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCanm00300103(final String xml) {
        this();
        MxCanm00300103 tmp = parse(xml);
        keyXchgInitn = tmp.getKeyXchgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCanm00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the keyXchgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeInitiationV03 }
     *     
     */
    public KeyExchangeInitiationV03 getKeyXchgInitn() {
        return keyXchgInitn;
    }

    /**
     * Sets the value of the keyXchgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeInitiationV03 }
     *     
     */
    public MxCanm00300103 setKeyXchgInitn(KeyExchangeInitiationV03 value) {
        this.keyXchgInitn = value;
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
    public static MxCanm00300103 parse(String xml) {
        return ((MxCanm00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCanm00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCanm00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCanm00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCanm00300103 parse(String xml, MxRead parserImpl) {
        return ((MxCanm00300103) parserImpl.read(MxCanm00300103 .class, xml, _classes));
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
     * Creates an MxCanm00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCanm00300103 message
     * @return
     *     a new instance of MxCanm00300103
     */
    public static final MxCanm00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCanm00300103 .class);
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
