
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
 * Class for sese.014.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.014.001.08")
public class MxSese01400108
    extends AbstractMX
{

    @XmlElement(name = "PrtflTrfCxlReq", required = true)
    protected PortfolioTransferCancellationRequestV08 prtflTrfCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, GenericIdentification1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01400108 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PortfolioTransferCancellationRequestV08 .class, PostalAddress1 .class, TransferReference13 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.014.001.08";

    public MxSese01400108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01400108(final String xml) {
        this();
        MxSese01400108 tmp = parse(xml);
        prtflTrfCxlReq = tmp.getPrtflTrfCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01400108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferCancellationRequestV08 }
     *     
     */
    public PortfolioTransferCancellationRequestV08 getPrtflTrfCxlReq() {
        return prtflTrfCxlReq;
    }

    /**
     * Sets the value of the prtflTrfCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferCancellationRequestV08 }
     *     
     */
    public MxSese01400108 setPrtflTrfCxlReq(PortfolioTransferCancellationRequestV08 value) {
        this.prtflTrfCxlReq = value;
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
    public static MxSese01400108 parse(String xml) {
        return ((MxSese01400108) MxReadImpl.parse(MxSese01400108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01400108 parse(String xml, MxRead parserImpl) {
        return ((MxSese01400108) parserImpl.read(MxSese01400108 .class, xml, _classes));
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
     * Creates an MxSese01400108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01400108 message
     * @return
     *     a new instance of MxSese01400108
     */
    public final static MxSese01400108 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01400108 .class);
    }

}