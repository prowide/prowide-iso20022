
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
 * Class for setr.037.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "listExctInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.037.001.01")
public class MxSetr03700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ListExctInstr", required = true)
    protected ListExecuteInstruction listExctInstr;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, ListExecuteInstruction.class, ListExecution1 .class, MxSetr03700101 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.037.001.01";

    public MxSetr03700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr03700101(final String xml) {
        this();
        MxSetr03700101 tmp = parse(xml);
        listExctInstr = tmp.getListExctInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr03700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the listExctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link ListExecuteInstruction }
     *     
     */
    public ListExecuteInstruction getListExctInstr() {
        return listExctInstr;
    }

    /**
     * Sets the value of the listExctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListExecuteInstruction }
     *     
     */
    public MxSetr03700101 setListExctInstr(ListExecuteInstruction value) {
        this.listExctInstr = value;
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
    public static MxSetr03700101 parse(String xml) {
        return ((MxSetr03700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr03700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr03700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr03700101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr03700101) parserImpl.read(MxSetr03700101 .class, xml, _classes));
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
     * Creates an MxSetr03700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr03700101 message
     * @return
     *     a new instance of MxSetr03700101
     */
    public static final MxSetr03700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr03700101 .class);
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
