
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
 * Class for sese.008.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslOfTrfInConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.008.001.08")
public class MxSese00800108
    extends AbstractMX
{

    @XmlElement(name = "RvslOfTrfInConf", required = true)
    protected ReversalOfTransferInConfirmationV08 rvslOfTrfInConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CopyInformation4 .class, GenericIdentification1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00800108 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, ReversalOfTransferInConfirmationV08 .class, TransferInFunction2Code.class, TransferReference12 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.008.001.08";

    public MxSese00800108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00800108(final String xml) {
        this();
        MxSese00800108 tmp = parse(xml);
        rvslOfTrfInConf = tmp.getRvslOfTrfInConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00800108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslOfTrfInConf property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalOfTransferInConfirmationV08 }
     *     
     */
    public ReversalOfTransferInConfirmationV08 getRvslOfTrfInConf() {
        return rvslOfTrfInConf;
    }

    /**
     * Sets the value of the rvslOfTrfInConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalOfTransferInConfirmationV08 }
     *     
     */
    public MxSese00800108 setRvslOfTrfInConf(ReversalOfTransferInConfirmationV08 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese00800108 parse(String xml) {
        return ((MxSese00800108) MxReadImpl.parse(MxSese00800108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00800108 parse(String xml, MxRead parserImpl) {
        return ((MxSese00800108) parserImpl.read(MxSese00800108 .class, xml, _classes));
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
     * Creates an MxSese00800108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00800108 message
     * @return
     *     a new instance of MxSese00800108
     */
    public final static MxSese00800108 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese00800108 .class);
    }

}
