
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
 * Class for camt.061.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "payInCall"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.061.001.02")
public class MxCamt06100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PayInCall", required = true)
    protected PayInCallV02 payInCall;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 61;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, CallIn1Code.class, ClearingSystemIdentification2Choice.class, MxCamt06100102 .class, NameAndAddress8 .class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PayInCallItem.class, PayInCallV02 .class, PostalAddress1 .class, ReportData5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Value.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.061.001.02";

    public MxCamt06100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06100102(final String xml) {
        this();
        MxCamt06100102 tmp = parse(xml);
        payInCall = tmp.getPayInCall();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the payInCall property.
     * 
     * @return
     *     possible object is
     *     {@link PayInCallV02 }
     *     
     */
    public PayInCallV02 getPayInCall() {
        return payInCall;
    }

    /**
     * Sets the value of the payInCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInCallV02 }
     *     
     */
    public MxCamt06100102 setPayInCall(PayInCallV02 value) {
        this.payInCall = value;
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
    public static MxCamt06100102 parse(String xml) {
        return ((MxCamt06100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06100102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06100102) parserImpl.read(MxCamt06100102 .class, xml, _classes));
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
     * Creates an MxCamt06100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06100102 message
     * @return
     *     a new instance of MxCamt06100102
     */
    public static final MxCamt06100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06100102 .class);
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
