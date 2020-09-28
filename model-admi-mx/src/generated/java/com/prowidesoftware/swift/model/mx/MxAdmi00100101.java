
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
 * Class for admi.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rptV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:admi.001.001.01")
public class MxAdmi00100101
    extends AbstractMX
{

    @XmlElement(name = "RptV01", required = true)
    protected Admi00100101 rptV01;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Admi00100101 .class, BulkReportBody.class, BulkReportHeader.class, MxAdmi00100101 .class, ProprietaryReportData.class, ReportHeader1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:admi.001.001.01";

    public MxAdmi00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00100101(final String xml) {
        this();
        MxAdmi00100101 tmp = parse(xml);
        rptV01 = tmp.getRptV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rptV01 property.
     * 
     * @return
     *     possible object is
     *     {@link Admi00100101 }
     *     
     */
    public Admi00100101 getRptV01() {
        return rptV01;
    }

    /**
     * Sets the value of the rptV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Admi00100101 }
     *     
     */
    public MxAdmi00100101 setRptV01(Admi00100101 value) {
        this.rptV01 = value;
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
    public static MxAdmi00100101 parse(String xml) {
        return ((MxAdmi00100101) MxReadImpl.parse(MxAdmi00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00100101 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00100101) parserImpl.read(MxAdmi00100101 .class, xml, _classes));
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
     * Creates an MxAdmi00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00100101 message
     * @return
     *     a new instance of MxAdmi00100101
     */
    public final static MxAdmi00100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAdmi00100101 .class);
    }

}
