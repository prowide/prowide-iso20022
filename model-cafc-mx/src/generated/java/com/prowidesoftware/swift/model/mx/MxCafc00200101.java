
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
 * Class for cafc.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "feeColltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafc.002.001.01")
public class MxCafc00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FeeColltnRspn", required = true)
    protected FeeCollectionResponseV01 feeColltnRspn;
    public static final transient String BUSINESS_PROCESS = "cafc";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalAmounts1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation22 .class, Address1 .class, Amount14 .class, Amount4 .class, Amount5 .class, BatchManagementInformation1 .class, CardData2 .class, CardProgrammeMode1 .class, ContentInformationType20 .class, Context9 .class, DetailAmount1Code.class, DetailedAmount19 .class, Environment5 .class, FeeAmount2 .class, FeeCollectionResponse1 .class, FeeCollectionResponseV01 .class, GenericIdentification172 .class, Header48 .class, LifeCycleSupport1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction29Code.class, MxCafc00200101 .class, OriginalDataElements1 .class, OriginalTransactionAmount1 .class, OutputFormat4Code.class, PartyIdentification197 .class, PartyIdentification203 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, Priority3Code.class, ProcessingResult4 .class, Reconciliation3 .class, Response8Code.class, ResultData1 .class, ResultData5 .class, SettlementReportingEntity1 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token1 .class, Traceability7 .class, Transaction103 .class, TransactionAmount1 .class, TransactionAmounts1 .class, TransactionContext3 .class, TransactionIdentification13 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, TypeOfAmount11Code.class, TypeOfAmount12Code.class, UserInterface8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafc.002.001.01";

    public MxCafc00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafc00200101(final String xml) {
        this();
        MxCafc00200101 tmp = parse(xml);
        feeColltnRspn = tmp.getFeeColltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafc00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the feeColltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionResponseV01 }
     *     
     */
    public FeeCollectionResponseV01 getFeeColltnRspn() {
        return feeColltnRspn;
    }

    /**
     * Sets the value of the feeColltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionResponseV01 }
     *     
     */
    public MxCafc00200101 setFeeColltnRspn(FeeCollectionResponseV01 value) {
        this.feeColltnRspn = value;
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
    public static MxCafc00200101 parse(String xml) {
        return ((MxCafc00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafc00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafc00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafc00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCafc00200101) parserImpl.read(MxCafc00200101 .class, xml, _classes));
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
     * Creates an MxCafc00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafc00200101 message
     * @return
     *     a new instance of MxCafc00200101
     */
    public static final MxCafc00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafc00200101 .class);
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
