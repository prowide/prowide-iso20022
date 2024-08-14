
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
 * Class for caad.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.006.001.03")
public class MxCaad00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RcncltnRspn", required = true)
    protected ReconciliationResponseV03 rcncltnRspn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee2 .class, AdditionalFeeReconciliation2 .class, AdditionalInformation30 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount16 .class, ApprovalEntity2 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode3 .class, CardServiceType4Code.class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CreditDebit3Code.class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment33 .class, ErrorDetails2 .class, FeeAmount3 .class, FinancialReconciliation2 .class, GenericIdentification183 .class, Header60 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalData1 .class, MACData1 .class, MessageError1Code.class, MessageFunction17Code.class, MessageReconciliation3 .class, MxCaad00600103 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult19 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, ReconciliationActivityType1Code.class, ReconciliationCategory1Code.class, ReconciliationFunction1Code.class, ReconciliationImpact1Code.class, ReconciliationMessageType2Code.class, ReconciliationResponse7 .class, ReconciliationResponseV03 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData10 .class, ResultData7 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction135 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TransactionTotals13 .class, TypeOfAmount21Code.class, UserInterface8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.006.001.03";

    public MxCaad00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00600103(final String xml) {
        this();
        MxCaad00600103 tmp = parse(xml);
        rcncltnRspn = tmp.getRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationResponseV03 }
     *     
     */
    public ReconciliationResponseV03 getRcncltnRspn() {
        return rcncltnRspn;
    }

    /**
     * Sets the value of the rcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationResponseV03 }
     *     
     */
    public MxCaad00600103 setRcncltnRspn(ReconciliationResponseV03 value) {
        this.rcncltnRspn = value;
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
    public static MxCaad00600103 parse(String xml) {
        return ((MxCaad00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00600103 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00600103) parserImpl.read(MxCaad00600103 .class, xml, _classes));
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
     * Creates an MxCaad00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00600103 message
     * @return
     *     a new instance of MxCaad00600103
     */
    public static final MxCaad00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00600103 .class);
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
