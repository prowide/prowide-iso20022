
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
 * Class for auth.060.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpDalyCshFlowsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.060.001.02")
public class MxAuth06000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPDalyCshFlowsRpt", required = true)
    protected CCPDailyCashFlowsReportV02 ccpDalyCshFlowsRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 60;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection102 .class, AmountAndDirection86 .class, CCPDailyCashFlowsReportV02 .class, ConcentrationAccount1 .class, ConcentrationAgent1 .class, Flows1 .class, MxAuth06000102 .class, PaymentAccount4 .class, SettlementAgent2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.060.001.02";

    public MxAuth06000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth06000102(final String xml) {
        this();
        MxAuth06000102 tmp = parse(xml);
        ccpDalyCshFlowsRpt = tmp.getCCPDalyCshFlowsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth06000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpDalyCshFlowsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPDailyCashFlowsReportV02 }
     *     
     */
    public CCPDailyCashFlowsReportV02 getCCPDalyCshFlowsRpt() {
        return ccpDalyCshFlowsRpt;
    }

    /**
     * Sets the value of the ccpDalyCshFlowsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPDailyCashFlowsReportV02 }
     *     
     */
    public MxAuth06000102 setCCPDalyCshFlowsRpt(CCPDailyCashFlowsReportV02 value) {
        this.ccpDalyCshFlowsRpt = value;
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
    public static MxAuth06000102 parse(String xml) {
        return ((MxAuth06000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth06000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth06000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth06000102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth06000102) parserImpl.read(MxAuth06000102 .class, xml, _classes));
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
     * Creates an MxAuth06000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth06000102 message
     * @return
     *     a new instance of MxAuth06000102
     */
    public final static MxAuth06000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth06000102 .class);
    }

}
