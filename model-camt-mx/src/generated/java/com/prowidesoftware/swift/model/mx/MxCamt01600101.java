
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
 * Class for camt.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.016.001.01")
public class MxCamt01600101
    extends AbstractMX
{

    @XmlElement(name = "camt.016.001.01", required = true)
    protected Camt01600101 camt01600101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt01600101 .class, CurrencyCriteriaDefinitionChoice.class, CurrencyExchangeCriteria.class, CurrencyExchangeSearchCriteria.class, CurrencyQueryDefinition.class, MessageIdentification.class, MxCamt01600101 .class, QueryType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.016.001.01";

    public MxCamt01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01600101(final String xml) {
        this();
        MxCamt01600101 tmp = parse(xml);
        camt01600101 = tmp.getCamt01600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01600101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01600101 }
     *     
     */
    public Camt01600101 getCamt01600101() {
        return camt01600101;
    }

    /**
     * Sets the value of the camt01600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01600101 }
     *     
     */
    public MxCamt01600101 setCamt01600101(Camt01600101 value) {
        this.camt01600101 = value;
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
    public static MxCamt01600101 parse(String xml) {
        return ((MxCamt01600101) MxReadImpl.parse(MxCamt01600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01600101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01600101) parserImpl.read(MxCamt01600101 .class, xml, _classes));
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
     * Creates an MxCamt01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01600101 message
     * @return
     *     a new instance of MxCamt01600101
     */
    public final static MxCamt01600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt01600101 .class);
    }

}
