
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for secl.014.001.01 ISO 20022 message.
 * <p><strong>DRAFT</strong>: generated from an ISO 20022 draft schema (not yet officially registered).
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradGvUpTakeUpCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1secl.014.001.01")
public class MxSecl01400101
    extends AbstractMX
{

    @XmlElement(name = "TradGvUpTakeUpCxlReq", required = true)
    protected TradeGiveUpTakeUpCancellationRequestV01 tradGvUpTakeUpCxlReq;
    public static final transient String BUSINESS_PROCESS = "secl";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CancellationReason28 .class, GenericIdentification30 .class, MxSecl01400101 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeGiveUpTakeUpCancellationRequestV01 .class, TradeReference3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1secl.014.001.01";

    public MxSecl01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl01400101(final String xml) {
        this();
        MxSecl01400101 tmp = parse(xml);
        tradGvUpTakeUpCxlReq = tmp.getTradGvUpTakeUpCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradGvUpTakeUpCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TradeGiveUpTakeUpCancellationRequestV01 }
     *     
     */
    public TradeGiveUpTakeUpCancellationRequestV01 getTradGvUpTakeUpCxlReq() {
        return tradGvUpTakeUpCxlReq;
    }

    /**
     * Sets the value of the tradGvUpTakeUpCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeGiveUpTakeUpCancellationRequestV01 }
     *     
     */
    public MxSecl01400101 setTradGvUpTakeUpCxlReq(TradeGiveUpTakeUpCancellationRequestV01 value) {
        this.tradGvUpTakeUpCxlReq = value;
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
    public static MxSecl01400101 parse(String xml) {
        return ((MxSecl01400101) MxReadImpl.parse(MxSecl01400101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl01400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl01400101) MxReadImpl.parse(MxSecl01400101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl01400101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl01400101) parserImpl.read(MxSecl01400101 .class, xml, _classes));
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
     * Creates an MxSecl01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl01400101 message
     * @return
     *     a new instance of MxSecl01400101
     */
    public static final MxSecl01400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSecl01400101 .class);
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
