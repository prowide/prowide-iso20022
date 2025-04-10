
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
 * Class for caad.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "btchTrfInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.02")
public class MxCaad00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BtchTrfInitn", required = true)
    protected BatchTransferInitiationV02 btchTrfInitn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalInformation21 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount17 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BatchTransferInitiation2 .class, BatchTransferInitiationV02 .class, BytePadding1Code.class, CardProgrammeMode3 .class, CertificateIssuer1 .class, ClearingBatchData2 .class, ClearingControlTotals2 .class, ClearingMethod2Code.class, ClearingRecordData2 .class, ClearingTotals2 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CreditDebit3Code.class, Destination1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment4 .class, GenericIdentification183 .class, Header60 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction17Code.class, MxCaad00300102 .class, Originator1 .class, OtherAmount4 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyType17Code.class, PartyType18Code.class, PartyType23Code.class, Priority3Code.class, ProcessingResult20 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, Record2 .class, RecordMessage1Choice.class, RelativeDistinguishedName1 .class, Response6Code.class, Response8Code.class, ResultData7 .class, ResultData8 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction141 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, UserInterface7Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.02";

    public MxCaad00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00300102(final String xml) {
        this();
        MxCaad00300102 tmp = parse(xml);
        btchTrfInitn = tmp.getBtchTrfInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the btchTrfInitn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransferInitiationV02 }
     *     
     */
    public BatchTransferInitiationV02 getBtchTrfInitn() {
        return btchTrfInitn;
    }

    /**
     * Sets the value of the btchTrfInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransferInitiationV02 }
     *     
     */
    public MxCaad00300102 setBtchTrfInitn(BatchTransferInitiationV02 value) {
        this.btchTrfInitn = value;
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
    public static MxCaad00300102 parse(String xml) {
        return ((MxCaad00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00300102) parserImpl.read(MxCaad00300102 .class, xml, _classes));
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
     * Creates an MxCaad00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00300102 message
     * @return
     *     a new instance of MxCaad00300102
     */
    public static final MxCaad00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00300102 .class);
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
