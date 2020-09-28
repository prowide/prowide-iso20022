
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sese01100101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.011.001.01")
public class MxSese01100101
    extends AbstractMX
{

    @XmlElement(name = "sese.011.001.01", required = true)
    protected Sese01100101 sese01100101;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference2 .class, GenericIdentification1 .class, InRepairStatus2Choice.class, InRepairStatusReason2 .class, LongPostalAddress1Choice.class, MxSese01100101 .class, NameAndAddress2 .class, NoReasonCode.class, PartyIdentification1Choice.class, PendingSettlementStatusChoice.class, PendingSettlementStatusReason1 .class, PendingSettlementStatusReason1Code.class, RejectedStatus3Choice.class, RejectedStatusReason5 .class, Sese01100101 .class, StructuredLongPostalAddress1 .class, TransferInstructionStatus.class, TransferRejectedStatusReason1Code.class, TransferStatus1Code.class, TransferStatusAndReason.class, TransferUnmatchedReason1Code.class, TransferUnmatchedStatus.class, TransferUnmatchedStatusReason1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.011.001.01";

    public MxSese01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100101(final String xml) {
        this();
        MxSese01100101 tmp = parse(xml);
        sese01100101 = tmp.getSese01100101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sese01100101 property.
     * 
     * @return
     *     possible object is
     *     {@link Sese01100101 }
     *     
     */
    public Sese01100101 getSese01100101() {
        return sese01100101;
    }

    /**
     * Sets the value of the sese01100101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sese01100101 }
     *     
     */
    public MxSese01100101 setSese01100101(Sese01100101 value) {
        this.sese01100101 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese01100101 parse(String xml) {
        return ((MxSese01100101) MxReadImpl.parse(MxSese01100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100101 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100101) parserImpl.read(MxSese01100101 .class, xml, _classes));
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
     * Creates an MxSese01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100101 message
     * @return
     *     a new instance of MxSese01100101
     */
    public final static MxSese01100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01100101 .class);
    }

}
