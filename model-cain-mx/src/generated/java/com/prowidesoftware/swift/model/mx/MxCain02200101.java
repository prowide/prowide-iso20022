
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
 * Class for cain.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.022.001.01")
public class MxCain02200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlRspn", required = true)
    protected RetrievalResponseV01 rtrvlRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation22 .class, Address1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData5 .class, CardDataReading7Code.class, CardProgrammeMode1 .class, CertificateIssuer1 .class, Contact7 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context4 .class, Credentials1 .class, Customer3 .class, DeliveryInformation2 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment13 .class, FeeAmount2 .class, FinancialInstitution4 .class, GenericIdentification172 .class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, Header55 .class, Identification2Code.class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction37Code.class, MxCain02200101 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyIdentification203 .class, PartyIdentification211 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType32Code.class, PointOfServiceContext2 .class, Priority3Code.class, ProcessingResult4 .class, ProtectedData1 .class, ReceiptType1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, ResultData5 .class, RetrievalDeliveryMethod1Choice.class, RetrievalFulfilmentInstructions1 .class, RetrievalResponse1 .class, RetrievalResponseV01 .class, SaleContext7 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal2 .class, TerminalIdentification1 .class, Token1 .class, Traceability7 .class, Transaction89 .class, TransactionContext3 .class, TransactionIdentification11 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, UserInterface8Code.class, Wallet1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.022.001.01";

    public MxCain02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02200101(final String xml) {
        this();
        MxCain02200101 tmp = parse(xml);
        rtrvlRspn = tmp.getRtrvlRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalResponseV01 }
     *     
     */
    public RetrievalResponseV01 getRtrvlRspn() {
        return rtrvlRspn;
    }

    /**
     * Sets the value of the rtrvlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalResponseV01 }
     *     
     */
    public MxCain02200101 setRtrvlRspn(RetrievalResponseV01 value) {
        this.rtrvlRspn = value;
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
    public static MxCain02200101 parse(String xml) {
        return ((MxCain02200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02200101 parse(String xml, MxRead parserImpl) {
        return ((MxCain02200101) parserImpl.read(MxCain02200101 .class, xml, _classes));
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
     * Creates an MxCain02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02200101 message
     * @return
     *     a new instance of MxCain02200101
     */
    public final static MxCain02200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02200101 .class);
    }

}
