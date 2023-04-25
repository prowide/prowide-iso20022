
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
 * Class for camt.051.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyDbtTfr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.051.001.02")
public class MxCamt05100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LqdtyDbtTfr", required = true)
    protected LiquidityDebitTransferV02 lqdtyDbtTfr;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 51;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationDetails.class, AmountChoice.class, BICIdentification1 .class, CashAccountType2Code.class, CurrencyAndAmount.class, LiquidityDebitTransferV02 .class, MessageIdentification.class, MxCamt05100102 .class, SimpleIdentificationInformation.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.051.001.02";

    public MxCamt05100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05100102(final String xml) {
        this();
        MxCamt05100102 tmp = parse(xml);
        lqdtyDbtTfr = tmp.getLqdtyDbtTfr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lqdtyDbtTfr property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityDebitTransferV02 }
     *     
     */
    public LiquidityDebitTransferV02 getLqdtyDbtTfr() {
        return lqdtyDbtTfr;
    }

    /**
     * Sets the value of the lqdtyDbtTfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityDebitTransferV02 }
     *     
     */
    public MxCamt05100102 setLqdtyDbtTfr(LiquidityDebitTransferV02 value) {
        this.lqdtyDbtTfr = value;
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
    public static MxCamt05100102 parse(String xml) {
        return ((MxCamt05100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05100102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05100102) parserImpl.read(MxCamt05100102 .class, xml, _classes));
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
     * Creates an MxCamt05100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05100102 message
     * @return
     *     a new instance of MxCamt05100102
     */
    public static final MxCamt05100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05100102 .class);
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
