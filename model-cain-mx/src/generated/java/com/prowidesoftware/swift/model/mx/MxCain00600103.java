
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
 * Class for cain.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.03")
public class MxCain00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RvslRspn", required = true)
    protected ReversalResponseV03 rvslRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails3 .class, Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, AdditionalAction1 .class, AdditionalAmounts3 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation29 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount15 .class, Amount17 .class, ApprovalEntity2 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData10 .class, CardProgrammeMode3 .class, CertificateIssuer1 .class, Contact6 .class, Content1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, CreditDebit3Code.class, DetailedAmount22 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment29 .class, ErrorDetails2 .class, FeeAmount3 .class, FeeCollectionInitiator1Code.class, GenericIdentification183 .class, Header62 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalData1 .class, MACData1 .class, MessageClass1Code.class, MessageError1Code.class, MessageFunction16Code.class, MxCain00600103 .class, OriginalDataElements2 .class, OriginalTransactionAmount2 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification258 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult10 .class, ProtectedData1 .class, ProtectionMethod1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData7 .class, ReversalResponse4 .class, ReversalResponseV03 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal6 .class, TerminalIdentification3 .class, Token2 .class, Traceability9 .class, Transaction137 .class, TransactionAmount1 .class, TransactionAmounts2 .class, TransactionAttribute2Code.class, TransactionContext8 .class, TransactionIdentification51 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.03";

    public MxCain00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00600103(final String xml) {
        this();
        MxCain00600103 tmp = parse(xml);
        rvslRspn = tmp.getRvslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponseV03 }
     *     
     */
    public ReversalResponseV03 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponseV03 }
     *     
     */
    public MxCain00600103 setRvslRspn(ReversalResponseV03 value) {
        this.rvslRspn = value;
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
    public static MxCain00600103 parse(String xml) {
        return ((MxCain00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00600103 parse(String xml, MxRead parserImpl) {
        return ((MxCain00600103) parserImpl.read(MxCain00600103 .class, xml, _classes));
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
     * Creates an MxCain00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00600103 message
     * @return
     *     a new instance of MxCain00600103
     */
    public final static MxCain00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00600103 .class);
    }

}
