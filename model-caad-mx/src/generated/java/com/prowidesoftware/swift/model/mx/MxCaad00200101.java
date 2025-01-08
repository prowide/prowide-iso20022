
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
 * Class for caad.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "btchMgmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.002.001.01")
public class MxCaad00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BtchMgmtRspn", required = true)
    protected BatchManagementResponseV01 btchMgmtRspn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementResponse1 .class, BatchManagementResponseV01 .class, BatchManagementType1Code.class, BytePadding1Code.class, CardProgrammeMode1 .class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context8 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment3 .class, FeeAmount2 .class, GenericIdentification172 .class, Header38 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction18Code.class, MxCaad00200101 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, ProcessingResult3 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, Response6Code.class, Response8Code.class, ResultData1 .class, ResultData2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction95 .class, TransactionContext5 .class, TransactionIdentification10 .class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.002.001.01";

    public MxCaad00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00200101(final String xml) {
        this();
        MxCaad00200101 tmp = parse(xml);
        btchMgmtRspn = tmp.getBtchMgmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the btchMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementResponseV01 }
     *     
     */
    public BatchManagementResponseV01 getBtchMgmtRspn() {
        return btchMgmtRspn;
    }

    /**
     * Sets the value of the btchMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementResponseV01 }
     *     
     */
    public MxCaad00200101 setBtchMgmtRspn(BatchManagementResponseV01 value) {
        this.btchMgmtRspn = value;
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
    public static MxCaad00200101 parse(String xml) {
        return ((MxCaad00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00200101) parserImpl.read(MxCaad00200101 .class, xml, _classes));
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
     * Creates an MxCaad00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00200101 message
     * @return
     *     a new instance of MxCaad00200101
     */
    public static final MxCaad00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00200101 .class);
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
