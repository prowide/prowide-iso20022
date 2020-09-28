
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
 * Class for camt.039.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt03900102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.039.001.02")
public class MxCamt03900102
    extends AbstractMX
{

    @XmlElement(name = "camt.039.001.02", required = true)
    protected Camt03900102 camt03900102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 39;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt03900102 .class, Case.class, CaseAssignment.class, CaseStatus2 .class, CaseStatus2Code.class, MxCamt03900102 .class, ReportHeader.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.039.001.02";

    public MxCamt03900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt03900102(final String xml) {
        this();
        MxCamt03900102 tmp = parse(xml);
        camt03900102 = tmp.getCamt03900102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt03900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt03900102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt03900102 }
     *     
     */
    public Camt03900102 getCamt03900102() {
        return camt03900102;
    }

    /**
     * Sets the value of the camt03900102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt03900102 }
     *     
     */
    public MxCamt03900102 setCamt03900102(Camt03900102 value) {
        this.camt03900102 = value;
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
    public static MxCamt03900102 parse(String xml) {
        return ((MxCamt03900102) MxReadImpl.parse(MxCamt03900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt03900102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt03900102) parserImpl.read(MxCamt03900102 .class, xml, _classes));
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
     * Creates an MxCamt03900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt03900102 message
     * @return
     *     a new instance of MxCamt03900102
     */
    public final static MxCamt03900102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt03900102 .class);
    }

}
