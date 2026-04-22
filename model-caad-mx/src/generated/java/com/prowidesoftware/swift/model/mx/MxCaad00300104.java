
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
 * Class for caad.003.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "btchTrfInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.04")
public class MxCaad00300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BtchTrfInitn", required = true)
    protected BatchTransferInitiationV04 btchTrfInitn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, Address4 .class, BatchTransferInitiationV04 .class, ClearingBatchData4 .class, ClearingControlTotals3 .class, ClearingMethod3Code.class, ContentInformationType41 .class, CreditDebit3Code.class, DestinationData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, Header72 .class, Jurisdiction2 .class, LocalAddress2 .class, LocalData20 .class, MACData1 .class, MxCaad00300104 .class, OriginatorData2 .class, OtherAmount5 .class, ProcessingResult32 .class, ProgrammeMode6 .class, Reconciliation5 .class, Record4 .class, RecordMessage2Choice.class, SettlementService7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.04";

    public MxCaad00300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00300104(final String xml) {
        this();
        MxCaad00300104 tmp = parse(xml);
        btchTrfInitn = tmp.getBtchTrfInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the btchTrfInitn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransferInitiationV04 }
     *     
     */
    public BatchTransferInitiationV04 getBtchTrfInitn() {
        return btchTrfInitn;
    }

    /**
     * Sets the value of the btchTrfInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransferInitiationV04 }
     *     
     */
    public MxCaad00300104 setBtchTrfInitn(BatchTransferInitiationV04 value) {
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
    public static MxCaad00300104 parse(String xml) {
        return ((MxCaad00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00300104 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00300104) parserImpl.read(MxCaad00300104 .class, xml, _classes));
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
     * Creates an MxCaad00300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00300104 message
     * @return
     *     a new instance of MxCaad00300104
     */
    public static final MxCaad00300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00300104 .class);
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
