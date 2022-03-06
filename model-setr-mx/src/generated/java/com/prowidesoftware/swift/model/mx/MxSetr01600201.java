
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
 * Class for setr.016.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.016.002.01")
public class MxSetr01600201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrInstrStsRpt", required = true)
    protected OrderInstructionStatusReportMinusV01 ordrInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference5 .class, CancelledStatus4 .class, CancelledStatusReason8Code.class, Extension1 .class, IndividualOrderStatusAndReason5 .class, MessageIdentification3 .class, MxSetr01600201 .class, OrderInstructionStatusReportMinusV01 .class, OrderStatus7Code.class, RejectedStatus8 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.016.002.01";

    public MxSetr01600201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600201(final String xml) {
        this();
        MxSetr01600201 tmp = parse(xml);
        ordrInstrStsRpt = tmp.getOrdrInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionStatusReportMinusV01 }
     *     
     */
    public OrderInstructionStatusReportMinusV01 getOrdrInstrStsRpt() {
        return ordrInstrStsRpt;
    }

    /**
     * Sets the value of the ordrInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionStatusReportMinusV01 }
     *     
     */
    public MxSetr01600201 setOrdrInstrStsRpt(OrderInstructionStatusReportMinusV01 value) {
        this.ordrInstrStsRpt = value;
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
    public static MxSetr01600201 parse(String xml) {
        return ((MxSetr01600201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600201 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600201) parserImpl.read(MxSetr01600201 .class, xml, _classes));
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
     * Creates an MxSetr01600201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600201 message
     * @return
     *     a new instance of MxSetr01600201
     */
    public final static MxSetr01600201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600201 .class);
    }

}
