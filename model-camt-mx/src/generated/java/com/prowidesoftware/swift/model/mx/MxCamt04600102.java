
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.046.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.046.001.02")
public class MxCamt04600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetRsvatn", required = true)
    protected GetReservationV02 getRsvatn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 46;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, CashClearingSystem1Code.class, GetReservationV02 .class, MessageIdentification.class, MxCamt04600102 .class, QueryType2Code.class, ReservationCriteria1 .class, ReservationCriteriaDefinition1Choice.class, ReservationQueryDefinition2 .class, ReservationReturnCriteria.class, ReservationSearchCriteria1 .class, ReservationType1Code.class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.046.001.02";

    public MxCamt04600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04600102(final String xml) {
        this();
        MxCamt04600102 tmp = parse(xml);
        getRsvatn = tmp.getGetRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link GetReservationV02 }
     *     
     */
    public GetReservationV02 getGetRsvatn() {
        return getRsvatn;
    }

    /**
     * Sets the value of the getRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReservationV02 }
     *     
     */
    public MxCamt04600102 setGetRsvatn(GetReservationV02 value) {
        this.getRsvatn = value;
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
    public static MxCamt04600102 parse(String xml) {
        return ((MxCamt04600102) MxReadImpl.parse(MxCamt04600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04600102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04600102) parserImpl.read(MxCamt04600102 .class, xml, _classes));
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
     * Creates an MxCamt04600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04600102 message
     * @return
     *     a new instance of MxCamt04600102
     */
    public final static MxCamt04600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04600102 .class);
    }

}
