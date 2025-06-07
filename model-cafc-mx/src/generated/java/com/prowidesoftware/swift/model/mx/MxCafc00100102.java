
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
 * Class for cafc.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "feeColltnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02")
public class MxCafc00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FeeColltnInitn", required = true)
    protected FeeCollectionInitiationV02 feeColltnInitn;
    public final static transient String BUSINESS_PROCESS = "cafc";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalAmounts3 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation30 .class, Address2 .class, Address3 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount15 .class, Amount17 .class, ApprovalEntity2 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData2 .class, CardProgrammeMode3 .class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context16 .class, CreditDebit3Code.class, DetailedAmount22 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment23 .class, ErrorDetails2 .class, FeeAmount3 .class, FeeCollectionIdentification1 .class, FeeCollectionInitiation2 .class, FeeCollectionInitiationV02 .class, FeeCollectionInitiator1Code.class, FeeCollectionReference1 .class, GenericIdentification183 .class, Header66 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalData1 .class, LocalData4 .class, LocalData5 .class, MACData1 .class, MessageClass1Code.class, MessageError1Code.class, MessageFunction16Code.class, MessageFunction29Code.class, MxCafc00100102 .class, OriginalDataElements2 .class, OriginalTransactionAmount2 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification255 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType26Code.class, PartyType32Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult14 .class, ProtectedData1 .class, ProtectionMethod1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData10 .class, ResultData7 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token2 .class, Traceability9 .class, Transaction156 .class, TransactionAmount1 .class, TransactionAmounts2 .class, TransactionContext8 .class, TransactionIdentification51 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02";

    public MxCafc00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafc00100102(final String xml) {
        this();
        MxCafc00100102 tmp = parse(xml);
        feeColltnInitn = tmp.getFeeColltnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafc00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the feeColltnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionInitiationV02 }
     *     
     */
    public FeeCollectionInitiationV02 getFeeColltnInitn() {
        return feeColltnInitn;
    }

    /**
     * Sets the value of the feeColltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionInitiationV02 }
     *     
     */
    public MxCafc00100102 setFeeColltnInitn(FeeCollectionInitiationV02 value) {
        this.feeColltnInitn = value;
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
    public static MxCafc00100102 parse(String xml) {
        return ((MxCafc00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafc00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafc00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafc00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCafc00100102) parserImpl.read(MxCafc00100102 .class, xml, _classes));
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
     * Creates an MxCafc00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafc00100102 message
     * @return
     *     a new instance of MxCafc00100102
     */
    public final static MxCafc00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafc00100102 .class);
    }

}
