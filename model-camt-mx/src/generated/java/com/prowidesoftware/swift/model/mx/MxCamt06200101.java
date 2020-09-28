
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
 * Class for camt.062.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "payInSchdl"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.062.001.01")
public class MxCamt06200101
    extends AbstractMX
{

    @XmlElement(name = "PayInSchdl", required = true)
    protected PayInScheduleV01 payInSchdl;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 62;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, BalanceStatus.class, Entry2Code.class, MxCamt06200101 .class, NameAndAddress8 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PayInScheduleItems.class, PayInScheduleV01 .class, PostalAddress1 .class, ReportData2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.062.001.01";

    public MxCamt06200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06200101(final String xml) {
        this();
        MxCamt06200101 tmp = parse(xml);
        payInSchdl = tmp.getPayInSchdl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the payInSchdl property.
     * 
     * @return
     *     possible object is
     *     {@link PayInScheduleV01 }
     *     
     */
    public PayInScheduleV01 getPayInSchdl() {
        return payInSchdl;
    }

    /**
     * Sets the value of the payInSchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInScheduleV01 }
     *     
     */
    public MxCamt06200101 setPayInSchdl(PayInScheduleV01 value) {
        this.payInSchdl = value;
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
    public static MxCamt06200101 parse(String xml) {
        return ((MxCamt06200101) MxReadImpl.parse(MxCamt06200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06200101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06200101) parserImpl.read(MxCamt06200101 .class, xml, _classes));
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
     * Creates an MxCamt06200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06200101 message
     * @return
     *     a new instance of MxCamt06200101
     */
    public final static MxCamt06200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt06200101 .class);
    }

}
