
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
 * Class for seev.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "seev00700101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.007.001.01")
public class MxSeev00700101
    extends AbstractMX
{

    @XmlElement(name = "seev.007.001.01", required = true)
    protected Seev00700101 seev00700101;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateFinancialInstrumentIdentification1 .class, EligiblePosition1 .class, InstructionIdentification.class, MeetingReference1 .class, MeetingType1Code.class, MxSeev00700101 .class, NameAndAddress5 .class, PartyIdentification7Choice.class, PostalAddress1 .class, SecurityIdentification3 .class, SecurityPosition3 .class, SecurityPosition4 .class, Seev00700101 .class, Vote1 .class, VoteInstruction1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.007.001.01";

    public MxSeev00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00700101(final String xml) {
        this();
        MxSeev00700101 tmp = parse(xml);
        seev00700101 = tmp.getSeev00700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the seev00700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Seev00700101 }
     *     
     */
    public Seev00700101 getSeev00700101() {
        return seev00700101;
    }

    /**
     * Sets the value of the seev00700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seev00700101 }
     *     
     */
    public MxSeev00700101 setSeev00700101(Seev00700101 value) {
        this.seev00700101 = value;
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
    public static MxSeev00700101 parse(String xml) {
        return ((MxSeev00700101) MxReadImpl.parse(MxSeev00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00700101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00700101) parserImpl.read(MxSeev00700101 .class, xml, _classes));
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
     * Creates an MxSeev00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00700101 message
     * @return
     *     a new instance of MxSeev00700101
     */
    public final static MxSeev00700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00700101 .class);
    }

}
