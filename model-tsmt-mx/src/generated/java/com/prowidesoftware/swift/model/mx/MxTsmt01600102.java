
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt01600102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.016.001.02")
public class MxTsmt01600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.016.001.02", required = true)
    protected Tsmt01600102 tsmt01600102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action1Code.class, BICIdentification1 .class, BaselineStatus1Code.class, Count1 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, ElementIdentification3 .class, MessageIdentification1 .class, MxTsmt01600102 .class, PendingActivity1 .class, SimpleIdentificationInformation.class, TransactionStatus1 .class, Tsmt01600102 .class, ValidationResult3 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.016.001.02";

    public MxTsmt01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01600102(final String xml) {
        this();
        MxTsmt01600102 tmp = parse(xml);
        tsmt01600102 = tmp.getTsmt01600102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt01600102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt01600102 }
     *     
     */
    public Tsmt01600102 getTsmt01600102() {
        return tsmt01600102;
    }

    /**
     * Sets the value of the tsmt01600102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt01600102 }
     *     
     */
    public MxTsmt01600102 setTsmt01600102(Tsmt01600102 value) {
        this.tsmt01600102 = value;
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
    public static MxTsmt01600102 parse(String xml) {
        return ((MxTsmt01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01600102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01600102) parserImpl.read(MxTsmt01600102 .class, xml, _classes));
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
     * Creates an MxTsmt01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01600102 message
     * @return
     *     a new instance of MxTsmt01600102
     */
    public final static MxTsmt01600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01600102 .class);
    }

}
