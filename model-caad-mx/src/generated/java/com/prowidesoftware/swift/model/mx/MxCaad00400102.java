
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
 * Class for caad.004.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "btchTrfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.004.001.02")
public class MxCaad00400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BtchTrfRspn", required = true)
    protected BatchTransferResponseV02 btchTrfRspn;
    public final static transient String BUSINESS_PROCESS = "caad";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalInformation21 .class, AdditionalInformation29 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount17 .class, ApprovalEntity2 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BatchTransferResponse2 .class, BatchTransferResponseV02 .class, BytePadding1Code.class, CardProgrammeMode3 .class, CertificateIssuer1 .class, ClearingBatchData2 .class, ClearingControlTotals2 .class, ClearingMethod2Code.class, ClearingRecordData2 .class, ClearingTotals2 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CreditDebit3Code.class, Destination1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment4 .class, ErrorDetails2 .class, GenericIdentification183 .class, Header60 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageError1Code.class, MessageFunction17Code.class, MxCaad00400102 .class, Originator1 .class, OtherAmount4 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, PartyType22Code.class, PartyType23Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult13 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, Record2 .class, RecordMessage1Choice.class, RelativeDistinguishedName1 .class, Response6Code.class, Response8Code.class, ResultData7 .class, ResultData8 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction141 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, UserInterface6Code.class, UserInterface7Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.004.001.02";

    public MxCaad00400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00400102(final String xml) {
        this();
        MxCaad00400102 tmp = parse(xml);
        btchTrfRspn = tmp.getBtchTrfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the btchTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransferResponseV02 }
     *     
     */
    public BatchTransferResponseV02 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Sets the value of the btchTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransferResponseV02 }
     *     
     */
    public MxCaad00400102 setBtchTrfRspn(BatchTransferResponseV02 value) {
        this.btchTrfRspn = value;
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
    public static MxCaad00400102 parse(String xml) {
        return ((MxCaad00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00400102 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00400102) parserImpl.read(MxCaad00400102 .class, xml, _classes));
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
     * Creates an MxCaad00400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00400102 message
     * @return
     *     a new instance of MxCaad00400102
     */
    public final static MxCaad00400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00400102 .class);
    }

}
