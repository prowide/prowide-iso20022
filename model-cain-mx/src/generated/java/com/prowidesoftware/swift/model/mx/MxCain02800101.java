
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
 * Class for cain.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "chrgBckRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.028.001.01")
public class MxCain02800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ChrgBckRspn", required = true)
    protected ChargeBackResponseV01 chrgBckRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount4 .class, Amount5 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData5 .class, CardProgrammeMode1 .class, CertificateIssuer1 .class, ChargeBackResponse1 .class, ChargeBackResponseV01 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context9 .class, DetailAmount1Code.class, DetailedAmount19 .class, DisputeData1 .class, DisputeIdentification1 .class, DisputeReference1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment14 .class, FeeAmount2 .class, GenericIdentification172 .class, Header40 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction20Code.class, MxCain02800101 .class, OriginalTransactionAmount1 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, PartyType22Code.class, PartyType32Code.class, Priority3Code.class, ProcessingResult7 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, SettlementReportingEntity1 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal2 .class, TerminalIdentification1 .class, Token1 .class, Traceability7 .class, Transaction97 .class, TransactionAmount1 .class, TransactionAmounts1 .class, TransactionContext3 .class, TransactionIdentification10 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, TypeOfAmount11Code.class, UserInterface6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.028.001.01";

    public MxCain02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02800101(final String xml) {
        this();
        MxCain02800101 tmp = parse(xml);
        chrgBckRspn = tmp.getChrgBckRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the chrgBckRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBackResponseV01 }
     *     
     */
    public ChargeBackResponseV01 getChrgBckRspn() {
        return chrgBckRspn;
    }

    /**
     * Sets the value of the chrgBckRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBackResponseV01 }
     *     
     */
    public MxCain02800101 setChrgBckRspn(ChargeBackResponseV01 value) {
        this.chrgBckRspn = value;
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
    public static MxCain02800101 parse(String xml) {
        return ((MxCain02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02800101 parse(String xml, MxRead parserImpl) {
        return ((MxCain02800101) parserImpl.read(MxCain02800101 .class, xml, _classes));
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
     * Creates an MxCain02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02800101 message
     * @return
     *     a new instance of MxCain02800101
     */
    public final static MxCain02800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02800101 .class);
    }

}
