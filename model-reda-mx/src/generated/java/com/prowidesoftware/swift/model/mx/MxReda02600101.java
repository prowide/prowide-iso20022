
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for reda.026.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "elgblCntrptCSDCreReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.026.001.01")
public class MxReda02600101
    extends AbstractMX
{

    @XmlElement(name = "ElgblCntrptCSDCreReq", required = true)
    protected EligibleCounterpartCSDCreationRequestV01 elgblCntrptCSDCreReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 26;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, EligibilityIdentification3Choice.class, EligibilityType1Code.class, EligibleCounterpart3 .class, EligibleCounterpartCSDCreationRequestV01 .class, GenericIdentification36 .class, MessageHeader1 .class, MxReda02600101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification2Choice.class, SystemPartyIdentification8 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.026.001.01";

    public MxReda02600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda02600101(final String xml) {
        this();
        MxReda02600101 tmp = parse(xml);
        elgblCntrptCSDCreReq = tmp.getElgblCntrptCSDCreReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda02600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the elgblCntrptCSDCreReq property.
     * 
     * @return
     *     possible object is
     *     {@link EligibleCounterpartCSDCreationRequestV01 }
     *     
     */
    public EligibleCounterpartCSDCreationRequestV01 getElgblCntrptCSDCreReq() {
        return elgblCntrptCSDCreReq;
    }

    /**
     * Sets the value of the elgblCntrptCSDCreReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleCounterpartCSDCreationRequestV01 }
     *     
     */
    public MxReda02600101 setElgblCntrptCSDCreReq(EligibleCounterpartCSDCreationRequestV01 value) {
        this.elgblCntrptCSDCreReq = value;
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
    public static MxReda02600101 parse(String xml) {
        return ((MxReda02600101) MxReadImpl.parse(MxReda02600101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda02600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda02600101) MxReadImpl.parse(MxReda02600101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda02600101 parse(String xml, MxRead parserImpl) {
        return ((MxReda02600101) parserImpl.read(MxReda02600101 .class, xml, _classes));
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
     * Creates an MxReda02600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda02600101 message
     * @return
     *     a new instance of MxReda02600101
     */
    public static final MxReda02600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda02600101 .class);
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
