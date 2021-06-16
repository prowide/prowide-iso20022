
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.062.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "payInSchdl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.062.001.03")
public class MxCamt06200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PayInSchdl", required = true)
    protected PayInScheduleV03 payInSchdl;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 62;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AgreedRate2 .class, BalanceStatus2 .class, ClearingSystemIdentification2Choice.class, CurrencyFactors1 .class, Entry2Code.class, MxCamt06200103 .class, NameAndAddress8 .class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PayInFactors1 .class, PayInScheduleItems1 .class, PayInScheduleV03 .class, PostalAddress1 .class, ReportData4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.062.001.03";

    public MxCamt06200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06200103(final String xml) {
        this();
        MxCamt06200103 tmp = parse(xml);
        payInSchdl = tmp.getPayInSchdl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the payInSchdl property.
     * 
     * @return
     *     possible object is
     *     {@link PayInScheduleV03 }
     *     
     */
    public PayInScheduleV03 getPayInSchdl() {
        return payInSchdl;
    }

    /**
     * Sets the value of the payInSchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInScheduleV03 }
     *     
     */
    public MxCamt06200103 setPayInSchdl(PayInScheduleV03 value) {
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
    public static MxCamt06200103 parse(String xml) {
        return ((MxCamt06200103) MxReadImpl.parse(MxCamt06200103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06200103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06200103) parserImpl.read(MxCamt06200103 .class, xml, _classes));
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
     * Creates an MxCamt06200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06200103 message
     * @return
     *     a new instance of MxCamt06200103
     */
    public final static MxCamt06200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06200103 .class);
    }

}
