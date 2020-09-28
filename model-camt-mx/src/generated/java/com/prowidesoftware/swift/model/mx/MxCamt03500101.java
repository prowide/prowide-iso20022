
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
 * Class for camt.035.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt03500101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.035.001.01")
public class MxCamt03500101
    extends AbstractMX
{

    @XmlElement(name = "camt.035.001.01", required = true)
    protected Camt03500101 camt03500101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt03500101 .class, Case.class, CaseAssignment.class, MxCamt03500101 .class, ProprietaryData.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.035.001.01";

    public MxCamt03500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt03500101(final String xml) {
        this();
        MxCamt03500101 tmp = parse(xml);
        camt03500101 = tmp.getCamt03500101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt03500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt03500101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt03500101 }
     *     
     */
    public Camt03500101 getCamt03500101() {
        return camt03500101;
    }

    /**
     * Sets the value of the camt03500101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt03500101 }
     *     
     */
    public MxCamt03500101 setCamt03500101(Camt03500101 value) {
        this.camt03500101 = value;
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
    public static MxCamt03500101 parse(String xml) {
        return ((MxCamt03500101) MxReadImpl.parse(MxCamt03500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt03500101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt03500101) parserImpl.read(MxCamt03500101 .class, xml, _classes));
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
     * Creates an MxCamt03500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt03500101 message
     * @return
     *     a new instance of MxCamt03500101
     */
    public final static MxCamt03500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt03500101 .class);
    }

}
