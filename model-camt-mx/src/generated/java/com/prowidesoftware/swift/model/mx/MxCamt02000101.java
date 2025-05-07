
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
 * Class for camt.020.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02000101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.020.001.01")
public class MxCamt02000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.020.001.01", required = true)
    protected Camt02000101 camt02000101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessInformationCriteria.class, BusinessInformationQueryDefinition.class, Camt02000101 .class, CharacterSearchChoice.class, GeneralBusinessInformationCriteriaDefinitionChoice.class, GeneralBusinessInformationReturnCriteria.class, GeneralBusinessInformationSearchCriteria.class, InformationQualifierType.class, MessageIdentification.class, MxCamt02000101 .class, Priority1Code.class, QueryType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.020.001.01";

    public MxCamt02000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02000101(final String xml) {
        this();
        MxCamt02000101 tmp = parse(xml);
        camt02000101 = tmp.getCamt02000101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02000101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02000101 }
     *     
     */
    public Camt02000101 getCamt02000101() {
        return camt02000101;
    }

    /**
     * Sets the value of the camt02000101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02000101 }
     *     
     */
    public MxCamt02000101 setCamt02000101(Camt02000101 value) {
        this.camt02000101 = value;
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
    public static MxCamt02000101 parse(String xml) {
        return ((MxCamt02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02000101) parserImpl.read(MxCamt02000101 .class, xml, _classes));
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
     * Creates an MxCamt02000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02000101 message
     * @return
     *     a new instance of MxCamt02000101
     */
    public final static MxCamt02000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02000101 .class);
    }

}
