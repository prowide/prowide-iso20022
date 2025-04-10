
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
 * Class for caad.007.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "err"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.007.001.02")
public class MxCaad00700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "Err", required = true)
    protected ErrorV02 err;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode1 .class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context8 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Error1 .class, ErrorDetails1 .class, ErrorV02 .class, FeeAmount2 .class, GenericIdentification172 .class, Header45 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageError1Code.class, MessageFunction39Code.class, MxCaad00700102 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction101 .class, TransactionContext5 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount10Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.007.001.02";

    public MxCaad00700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00700102(final String xml) {
        this();
        MxCaad00700102 tmp = parse(xml);
        err = tmp.getErr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorV02 }
     *     
     */
    public ErrorV02 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorV02 }
     *     
     */
    public MxCaad00700102 setErr(ErrorV02 value) {
        this.err = value;
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
    public static MxCaad00700102 parse(String xml) {
        return ((MxCaad00700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00700102 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00700102) parserImpl.read(MxCaad00700102 .class, xml, _classes));
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
     * Creates an MxCaad00700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00700102 message
     * @return
     *     a new instance of MxCaad00700102
     */
    public static final MxCaad00700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00700102 .class);
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
