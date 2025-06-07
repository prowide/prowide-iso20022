
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
 * Class for supl.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mltplDbtAcctsSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.044.001.01")
public class MxSupl04400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MltplDbtAcctsSD1", required = true)
    protected MultipleDebitAccountsSD1V01 mltplDbtAcctsSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AmountType4Choice.class, CashAccount38 .class, CashAccountType2Choice.class, EquivalentAmount2 .class, ExchangeRateInformation4 .class, ExchangeRateType4Code.class, FXSupplementaryData2 .class, GenericAccountIdentification1 .class, MultipleDebitAccountsSD1V01 .class, MxSupl04400101 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.044.001.01";

    public MxSupl04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl04400101(final String xml) {
        this();
        MxSupl04400101 tmp = parse(xml);
        mltplDbtAcctsSD1 = tmp.getMltplDbtAcctsSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mltplDbtAcctsSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleDebitAccountsSD1V01 }
     *     
     */
    public MultipleDebitAccountsSD1V01 getMltplDbtAcctsSD1() {
        return mltplDbtAcctsSD1;
    }

    /**
     * Sets the value of the mltplDbtAcctsSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleDebitAccountsSD1V01 }
     *     
     */
    public MxSupl04400101 setMltplDbtAcctsSD1(MultipleDebitAccountsSD1V01 value) {
        this.mltplDbtAcctsSD1 = value;
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
    public static MxSupl04400101 parse(String xml) {
        return ((MxSupl04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl04400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl04400101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl04400101) parserImpl.read(MxSupl04400101 .class, xml, _classes));
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
     * Creates an MxSupl04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl04400101 message
     * @return
     *     a new instance of MxSupl04400101
     */
    public final static MxSupl04400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl04400101 .class);
    }

}
