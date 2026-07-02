
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
 * Class for cain.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.02")
public class MxCain00600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RvslRspn", required = true)
    protected ReversalResponseV02 rvslRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails2 .class, Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, AdditionalAction1 .class, AdditionalAmounts1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount14 .class, Amount4 .class, Amount5 .class, ApprovalData1 .class, ApprovalEntity1 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData5 .class, CardProgrammeMode1 .class, CertificateIssuer1 .class, Content1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, DetailAmount1Code.class, DetailedAmount19 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment14 .class, FeeAmount2 .class, GenericIdentification172 .class, Header42 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction16Code.class, MxCain00600102 .class, OriginalDataElements1 .class, OriginalTransactionAmount1 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult2 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, ReversalResponse2 .class, ReversalResponseV02 .class, SettlementReportingEntity1 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal2 .class, TerminalIdentification1 .class, Token1 .class, Traceability7 .class, Transaction86 .class, TransactionAmount1 .class, TransactionAmounts1 .class, TransactionAttribute1Code.class, TransactionContext3 .class, TransactionIdentification8 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, TypeOfAmount11Code.class, TypeOfAmount12Code.class, UserInterface6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.02";

    public MxCain00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00600102(final String xml) {
        this();
        MxCain00600102 tmp = parse(xml);
        rvslRspn = tmp.getRvslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponseV02 }
     *     
     */
    public ReversalResponseV02 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponseV02 }
     *     
     */
    public MxCain00600102 setRvslRspn(ReversalResponseV02 value) {
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
    public static MxCain00600102 parse(String xml) {
        return ((MxCain00600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00600102 parse(String xml, MxRead parserImpl) {
        return ((MxCain00600102) parserImpl.read(MxCain00600102 .class, xml, _classes));
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
     * Creates an MxCain00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00600102 message
     * @return
     *     a new instance of MxCain00600102
     */
    public final static MxCain00600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00600102 .class);
    }

}
