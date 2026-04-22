
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
 * Class for cain.026.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "adddmRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.026.001.04")
public class MxCain02600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdddmRspn", required = true)
    protected AddendumResponseV04 adddmRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 26;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData2 .class, AcquirerData1 .class, AddendumResponseV04 .class, AdditionalFee4 .class, Address4 .class, CardData14 .class, ContentInformationType41 .class, CreditDebit3Code.class, DateTime2 .class, DestinationData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, ErrorDetails4 .class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress2 .class, LocalData18 .class, LocalData20 .class, MACData1 .class, MessageClass2Code.class, MessageFunction16Code.class, MxCain02600104 .class, OriginalDataElements6 .class, OriginalTransactionAmounts4 .class, OriginalTransactionIdentification2 .class, OriginatorData2 .class, ProcessingResult30 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, ReceiverData1 .class, Reconciliation5 .class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, Token4 .class, Token5 .class, TransactionIdentification62 .class, TypeOfAmount22Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.026.001.04";

    public MxCain02600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02600104(final String xml) {
        this();
        MxCain02600104 tmp = parse(xml);
        adddmRspn = tmp.getAdddmRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the adddmRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumResponseV04 }
     *     
     */
    public AddendumResponseV04 getAdddmRspn() {
        return adddmRspn;
    }

    /**
     * Sets the value of the adddmRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumResponseV04 }
     *     
     */
    public MxCain02600104 setAdddmRspn(AddendumResponseV04 value) {
        this.adddmRspn = value;
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
    public static MxCain02600104 parse(String xml) {
        return ((MxCain02600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02600104 parse(String xml, MxRead parserImpl) {
        return ((MxCain02600104) parserImpl.read(MxCain02600104 .class, xml, _classes));
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
     * Creates an MxCain02600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02600104 message
     * @return
     *     a new instance of MxCain02600104
     */
    public static final MxCain02600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02600104 .class);
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
