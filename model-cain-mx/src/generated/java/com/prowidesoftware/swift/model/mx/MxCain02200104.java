
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
 * Class for cain.022.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.022.001.04")
public class MxCain02200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlRspn", required = true)
    protected RetrievalResponseV04 rtrvlRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData2 .class, AcquirerData1 .class, AdditionalData1 .class, AdditionalFee4 .class, Address4 .class, Authority1 .class, CardData17 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardholderName2 .class, ContactPersonal2 .class, ContentInformationType41 .class, Context30 .class, Credentials3 .class, CreditDebit3Code.class, DateTime2 .class, DestinationData1 .class, DisputeData5 .class, ECommerceData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, ErrorDetails4 .class, FinancialInstitution10 .class, Frequency12Code.class, GoodAndServiceDeliveryChannel2Code.class, GoodAndServiceDeliverySchedule2Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType2Code.class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalData10 .class, LocalData18 .class, LocalData20 .class, LocalData21 .class, LocalData22 .class, MACData1 .class, MOTO2Code.class, MxCain02200104 .class, OriginatorData2 .class, PayeeData1 .class, PayerData1 .class, ProcessingResult30 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, QRCodePresentmentMode2Code.class, ReceiptType1Code.class, ReceiverData1 .class, Reconciliation5 .class, RetrievalResponseV04 .class, RiskAssessment1Code.class, SecurityCharacteristics2Code.class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, SubMerchant1 .class, Terminal12 .class, Token4 .class, Token5 .class, TransactionAttribute3Code.class, TransactionCharacteristics6 .class, TransactionIdentification60 .class, TransactionInitiator1Code.class, TransactorData1 .class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.022.001.04";

    public MxCain02200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02200104(final String xml) {
        this();
        MxCain02200104 tmp = parse(xml);
        rtrvlRspn = tmp.getRtrvlRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalResponseV04 }
     *     
     */
    public RetrievalResponseV04 getRtrvlRspn() {
        return rtrvlRspn;
    }

    /**
     * Sets the value of the rtrvlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalResponseV04 }
     *     
     */
    public MxCain02200104 setRtrvlRspn(RetrievalResponseV04 value) {
        this.rtrvlRspn = value;
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
    public static MxCain02200104 parse(String xml) {
        return ((MxCain02200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02200104 parse(String xml, MxRead parserImpl) {
        return ((MxCain02200104) parserImpl.read(MxCain02200104 .class, xml, _classes));
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
     * Creates an MxCain02200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02200104 message
     * @return
     *     a new instance of MxCain02200104
     */
    public static final MxCain02200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02200104 .class);
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
