
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
 * Class for camt.050.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyCdtTfr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.050.001.02")
public class MxCamt05000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LqdtyCdtTfr", required = true)
    protected LiquidityCreditTransferV02 lqdtyCdtTfr;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 50;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationDetails.class, AmountChoice.class, BICIdentification1 .class, CashAccountType2Code.class, CurrencyAndAmount.class, LiquidityCreditTransferV02 .class, MessageIdentification.class, MxCamt05000102 .class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.050.001.02";

    public MxCamt05000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05000102(final String xml) {
        this();
        MxCamt05000102 tmp = parse(xml);
        lqdtyCdtTfr = tmp.getLqdtyCdtTfr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lqdtyCdtTfr property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityCreditTransferV02 }
     *     
     */
    public LiquidityCreditTransferV02 getLqdtyCdtTfr() {
        return lqdtyCdtTfr;
    }

    /**
     * Sets the value of the lqdtyCdtTfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityCreditTransferV02 }
     *     
     */
    public MxCamt05000102 setLqdtyCdtTfr(LiquidityCreditTransferV02 value) {
        this.lqdtyCdtTfr = value;
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
    public static MxCamt05000102 parse(String xml) {
        return ((MxCamt05000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05000102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05000102) parserImpl.read(MxCamt05000102 .class, xml, _classes));
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
     * Creates an MxCamt05000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05000102 message
     * @return
     *     a new instance of MxCamt05000102
     */
    public final static MxCamt05000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05000102 .class);
    }

}
