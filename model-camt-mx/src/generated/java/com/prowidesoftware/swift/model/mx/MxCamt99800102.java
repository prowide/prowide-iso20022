
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
 * Class for camt.998.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtryMsg"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.998.001.02")
public class MxCamt99800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtryMsg", required = true)
    protected ProprietaryMessageV02 prtryMsg;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 998;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {MessageReference.class, MxCamt99800102 .class, ProprietaryData.class, ProprietaryMessageV02 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.998.001.02";

    public MxCamt99800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt99800102(final String xml) {
        this();
        MxCamt99800102 tmp = parse(xml);
        prtryMsg = tmp.getPrtryMsg();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt99800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryMessageV02 }
     *     
     */
    public ProprietaryMessageV02 getPrtryMsg() {
        return prtryMsg;
    }

    /**
     * Sets the value of the prtryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryMessageV02 }
     *     
     */
    public MxCamt99800102 setPrtryMsg(ProprietaryMessageV02 value) {
        this.prtryMsg = value;
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
    public static MxCamt99800102 parse(String xml) {
        return ((MxCamt99800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt99800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt99800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt99800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt99800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt99800102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt99800102) parserImpl.read(MxCamt99800102 .class, xml, _classes));
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
     * Creates an MxCamt99800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt99800102 message
     * @return
     *     a new instance of MxCamt99800102
     */
    public static final MxCamt99800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt99800102 .class);
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
