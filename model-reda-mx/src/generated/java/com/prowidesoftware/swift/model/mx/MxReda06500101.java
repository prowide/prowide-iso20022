
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
 * Class for reda.065.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "calRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.065.001.01")
public class MxReda06500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CalRpt", required = true)
    protected CalendarReportV01 calRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 65;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CalendarData1 .class, CalendarOrBusinessError1Choice.class, CalendarReport1 .class, CalendarReportOrError1Choice.class, CalendarReportV01 .class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, GenericIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader11 .class, MxReda06500101 .class, OriginalBusinessQuery1 .class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemAndCurrency1 .class, SystemIdentification2Choice.class, SystemStatus3Choice.class, SystemStatus3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.065.001.01";

    public MxReda06500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06500101(final String xml) {
        this();
        MxReda06500101 tmp = parse(xml);
        calRpt = tmp.getCalRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the calRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarReportV01 }
     *     
     */
    public CalendarReportV01 getCalRpt() {
        return calRpt;
    }

    /**
     * Sets the value of the calRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarReportV01 }
     *     
     */
    public MxReda06500101 setCalRpt(CalendarReportV01 value) {
        this.calRpt = value;
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
    public static MxReda06500101 parse(String xml) {
        return ((MxReda06500101) MxReadImpl.parse(MxReda06500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06500101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06500101) parserImpl.read(MxReda06500101 .class, xml, _classes));
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
     * Creates an MxReda06500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06500101 message
     * @return
     *     a new instance of MxReda06500101
     */
    public final static MxReda06500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06500101 .class);
    }

}
