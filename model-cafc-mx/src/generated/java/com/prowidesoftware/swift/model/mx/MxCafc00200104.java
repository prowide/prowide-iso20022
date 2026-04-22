
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
 * Class for cafc.002.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "feeColltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafc.002.001.04")
public class MxCafc00200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FeeColltnRspn", required = true)
    protected FeeCollectionResponseV04 feeColltnRspn;
    public static final transient String BUSINESS_PROCESS = "cafc";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData2 .class, AcquirerData1 .class, AdditionalAmounts5 .class, AdditionalFee4 .class, Address4 .class, CardData14 .class, ContentInformationType41 .class, Context29 .class, CreditDebit3Code.class, DateTime2 .class, DestinationData1 .class, DetailedAmount24 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, ErrorDetails4 .class, FeeCollectionReference3 .class, FeeCollectionResponseV04 .class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress2 .class, LocalData18 .class, LocalData20 .class, LocalData22 .class, MACData1 .class, MessageClass2Code.class, MessageFunction16Code.class, MxCafc00200104 .class, OriginalDataElements6 .class, OriginalTransactionAmounts4 .class, OriginalTransactionIdentification2 .class, OriginatorData2 .class, ProcessingResult30 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, ReceiverData1 .class, Reconciliation5 .class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, SubMerchant1 .class, Token4 .class, Token5 .class, TransactionAmounts5 .class, TransactionCharacteristics7 .class, TransactionIdentification58 .class, TransactionInitiator1Code.class, TransactorData1 .class, TypeOfAmount22Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafc.002.001.04";

    public MxCafc00200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafc00200104(final String xml) {
        this();
        MxCafc00200104 tmp = parse(xml);
        feeColltnRspn = tmp.getFeeColltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafc00200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the feeColltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionResponseV04 }
     *     
     */
    public FeeCollectionResponseV04 getFeeColltnRspn() {
        return feeColltnRspn;
    }

    /**
     * Sets the value of the feeColltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionResponseV04 }
     *     
     */
    public MxCafc00200104 setFeeColltnRspn(FeeCollectionResponseV04 value) {
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
    public static MxCafc00200104 parse(String xml) {
        return ((MxCafc00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafc00200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafc00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafc00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafc00200104 parse(String xml, MxRead parserImpl) {
        return ((MxCafc00200104) parserImpl.read(MxCafc00200104 .class, xml, _classes));
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
     * Creates an MxCafc00200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafc00200104 message
     * @return
     *     a new instance of MxCafc00200104
     */
    public static final MxCafc00200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafc00200104 .class);
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
