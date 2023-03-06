
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for fxtr.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradCaptrRptAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.033.001.01")
public class MxFxtr03300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradCaptrRptAck", required = true)
    protected ForeignExchangeTradeCaptureReportAcknowledgementV01 fxTradCaptrRptAck;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReferences.class, ForeignExchangeTradeCaptureReportAcknowledgementV01 .class, MessageIdentification1 .class, MxFxtr03300101 .class, PartyIdentification.class, Status5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.033.001.01";

    public MxFxtr03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03300101(final String xml) {
        this();
        MxFxtr03300101 tmp = parse(xml);
        fxTradCaptrRptAck = tmp.getFXTradCaptrRptAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradCaptrRptAck property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeCaptureReportAcknowledgementV01 }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV01 getFXTradCaptrRptAck() {
        return fxTradCaptrRptAck;
    }

    /**
     * Sets the value of the fxTradCaptrRptAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeCaptureReportAcknowledgementV01 }
     *     
     */
    public MxFxtr03300101 setFXTradCaptrRptAck(ForeignExchangeTradeCaptureReportAcknowledgementV01 value) {
        this.fxTradCaptrRptAck = value;
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
    public static MxFxtr03300101 parse(String xml) {
        return ((MxFxtr03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03300101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03300101) parserImpl.read(MxFxtr03300101 .class, xml, _classes));
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
     * Creates an MxFxtr03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03300101 message
     * @return
     *     a new instance of MxFxtr03300101
     */
    public final static MxFxtr03300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03300101 .class);
    }

}
