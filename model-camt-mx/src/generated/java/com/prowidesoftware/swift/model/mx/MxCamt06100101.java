
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
 * Class for camt.061.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "payInCall"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.061.001.01")
public class MxCamt06100101
    extends AbstractMX
{

    @XmlElement(name = "PayInCall", required = true)
    protected PayInCallV01 payInCall;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 61;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, CallIn1Code.class, MxCamt06100101 .class, NameAndAddress8 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PayInCallItem.class, PayInCallV01 .class, PostalAddress1 .class, ReportData1 .class, Value.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.061.001.01";

    public MxCamt06100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06100101(final String xml) {
        this();
        MxCamt06100101 tmp = parse(xml);
        payInCall = tmp.getPayInCall();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the payInCall property.
     * 
     * @return
     *     possible object is
     *     {@link PayInCallV01 }
     *     
     */
    public PayInCallV01 getPayInCall() {
        return payInCall;
    }

    /**
     * Sets the value of the payInCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInCallV01 }
     *     
     */
    public MxCamt06100101 setPayInCall(PayInCallV01 value) {
        this.payInCall = value;
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
    public static MxCamt06100101 parse(String xml) {
        return ((MxCamt06100101) MxReadImpl.parse(MxCamt06100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06100101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06100101) parserImpl.read(MxCamt06100101 .class, xml, _classes));
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
     * Creates an MxCamt06100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06100101 message
     * @return
     *     a new instance of MxCamt06100101
     */
    public final static MxCamt06100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt06100101 .class);
    }

}
