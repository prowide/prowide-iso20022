
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.013.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01300101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.013.001.01")
public class MxCamt01300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.013.001.01", required = true)
    protected Camt01300101 camt01300101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt01300101 .class, ClearingSystemMemberIdentificationChoice.class, MemberCriteria.class, MemberCriteriaDefinitionChoice.class, MemberIdentificationChoice.class, MemberQueryDefinition.class, MemberReturnCriteria.class, MemberSearchCriteria.class, MemberStatus1Code.class, MemberType1Code.class, MessageIdentification.class, MxCamt01300101 .class, QueryType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.013.001.01";

    public MxCamt01300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01300101(final String xml) {
        this();
        MxCamt01300101 tmp = parse(xml);
        camt01300101 = tmp.getCamt01300101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01300101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01300101 }
     *     
     */
    public Camt01300101 getCamt01300101() {
        return camt01300101;
    }

    /**
     * Sets the value of the camt01300101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01300101 }
     *     
     */
    public MxCamt01300101 setCamt01300101(Camt01300101 value) {
        this.camt01300101 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt01300101 parse(String xml) {
        return ((MxCamt01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01300101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01300101) parserImpl.read(MxCamt01300101 .class, xml, _classes));
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
     * Creates an MxCamt01300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01300101 message
     * @return
     *     a new instance of MxCamt01300101
     */
    public final static MxCamt01300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01300101 .class);
    }

}
