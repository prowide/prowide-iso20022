
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
 * Class for casr.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmRptgRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casr.002.001.01")
public class MxCasr00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmRptgRspn", required = true)
    protected SettlementReportingResponseV01 sttlmRptgRspn;
    public static final transient String BUSINESS_PROCESS = "casr";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode1 .class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context6 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment9 .class, FeeAmount2 .class, FinancialInstitution5 .class, GenericIdentification172 .class, Header48 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction29Code.class, MxCasr00200101 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, Priority3Code.class, ProcessingResult3 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, Response6Code.class, Response8Code.class, ResultData1 .class, ResultData2 .class, SettlementReportingEntity1 .class, SettlementReportingResponse1 .class, SettlementReportingResponseV01 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability7 .class, Transaction84 .class, TransactionContext6 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount10Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casr.002.001.01";

    public MxCasr00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasr00200101(final String xml) {
        this();
        MxCasr00200101 tmp = parse(xml);
        sttlmRptgRspn = tmp.getSttlmRptgRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasr00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmRptgRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingResponseV01 }
     *     
     */
    public SettlementReportingResponseV01 getSttlmRptgRspn() {
        return sttlmRptgRspn;
    }

    /**
     * Sets the value of the sttlmRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingResponseV01 }
     *     
     */
    public MxCasr00200101 setSttlmRptgRspn(SettlementReportingResponseV01 value) {
        this.sttlmRptgRspn = value;
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
    public static MxCasr00200101 parse(String xml) {
        return ((MxCasr00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasr00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasr00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasr00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCasr00200101) parserImpl.read(MxCasr00200101 .class, xml, _classes));
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
     * Creates an MxCasr00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasr00200101 message
     * @return
     *     a new instance of MxCasr00200101
     */
    public static final MxCasr00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasr00200101 .class);
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
