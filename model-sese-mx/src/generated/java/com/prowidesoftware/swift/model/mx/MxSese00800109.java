
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
 * Class for sese.008.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslOfTrfInConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.008.001.09")
public class MxSese00800109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RvslOfTrfInConf", required = true)
    protected ReversalOfTransferInConfirmationV09 rvslOfTrfInConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, CopyInformation5 .class, GenericIdentification1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00800109 .class, NameAndAddress5 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, ReversalOfTransferInConfirmationV09 .class, TransferInFunction2Code.class, TransferReference16 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.008.001.09";

    public MxSese00800109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00800109(final String xml) {
        this();
        MxSese00800109 tmp = parse(xml);
        rvslOfTrfInConf = tmp.getRvslOfTrfInConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00800109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslOfTrfInConf property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalOfTransferInConfirmationV09 }
     *     
     */
    public ReversalOfTransferInConfirmationV09 getRvslOfTrfInConf() {
        return rvslOfTrfInConf;
    }

    /**
     * Sets the value of the rvslOfTrfInConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalOfTransferInConfirmationV09 }
     *     
     */
    public MxSese00800109 setRvslOfTrfInConf(ReversalOfTransferInConfirmationV09 value) {
        this.rvslOfTrfInConf = value;
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
    public static MxSese00800109 parse(String xml) {
        return ((MxSese00800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00800109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00800109 parse(String xml, MxRead parserImpl) {
        return ((MxSese00800109) parserImpl.read(MxSese00800109 .class, xml, _classes));
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
     * Creates an MxSese00800109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00800109 message
     * @return
     *     a new instance of MxSese00800109
     */
    public final static MxSese00800109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00800109 .class);
    }

}
