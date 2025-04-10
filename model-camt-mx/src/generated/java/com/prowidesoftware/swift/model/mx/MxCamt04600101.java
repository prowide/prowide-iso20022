
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
 * Class for camt.046.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.046.001.01")
public class MxCamt04600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.046.001.01", required = true)
    protected Camt04600101 camt04600101;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 46;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, Camt04600101 .class, CashClearingSystem1Code.class, MessageIdentification.class, MxCamt04600101 .class, QueryType1Code.class, ReservationCriteria1 .class, ReservationCriteriaDefinition1Choice.class, ReservationQueryDefinition1 .class, ReservationReturnCriteria.class, ReservationSearchCriteria1 .class, ReservationType1Code.class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.046.001.01";

    public MxCamt04600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04600101(final String xml) {
        this();
        MxCamt04600101 tmp = parse(xml);
        camt04600101 = tmp.getCamt04600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04600101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04600101 }
     *     
     */
    public Camt04600101 getCamt04600101() {
        return camt04600101;
    }

    /**
     * Sets the value of the camt04600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04600101 }
     *     
     */
    public MxCamt04600101 setCamt04600101(Camt04600101 value) {
        this.camt04600101 = value;
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
    public static MxCamt04600101 parse(String xml) {
        return ((MxCamt04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04600101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04600101) parserImpl.read(MxCamt04600101 .class, xml, _classes));
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
     * Creates an MxCamt04600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04600101 message
     * @return
     *     a new instance of MxCamt04600101
     */
    public static final MxCamt04600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04600101 .class);
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
