
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
 * Class for tsmt.028.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt02800102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.028.001.02")
public class MxTsmt02800102
    extends AbstractMX
{

    @XmlElement(name = "tsmt.028.001.02", required = true)
    protected Tsmt02800102 tsmt02800102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action1Code.class, BICIdentification1 .class, BaselineStatus1Code.class, BaselineStatus2Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt02800102 .class, PendingActivity1 .class, Reason2 .class, SimpleIdentificationInformation.class, TransactionStatus1 .class, TransactionStatus3 .class, Tsmt02800102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.028.001.02";

    public MxTsmt02800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02800102(final String xml) {
        this();
        MxTsmt02800102 tmp = parse(xml);
        tsmt02800102 = tmp.getTsmt02800102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt02800102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt02800102 }
     *     
     */
    public Tsmt02800102 getTsmt02800102() {
        return tsmt02800102;
    }

    /**
     * Sets the value of the tsmt02800102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt02800102 }
     *     
     */
    public MxTsmt02800102 setTsmt02800102(Tsmt02800102 value) {
        this.tsmt02800102 = value;
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
    public static MxTsmt02800102 parse(String xml) {
        return ((MxTsmt02800102) MxReadImpl.parse(MxTsmt02800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02800102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02800102) parserImpl.read(MxTsmt02800102 .class, xml, _classes));
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
     * Creates an MxTsmt02800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02800102 message
     * @return
     *     a new instance of MxTsmt02800102
     */
    public final static MxTsmt02800102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt02800102 .class);
    }

}
