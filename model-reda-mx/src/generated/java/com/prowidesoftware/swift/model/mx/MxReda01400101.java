
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
 * Class for reda.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyCreReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.014.001.01")
public class MxReda01400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyCreReq", required = true)
    protected PartyCreationRequestV01 ptyCreReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Contact5 .class, GenericIdentification30 .class, GenericIdentification36 .class, LockStatus1Code.class, MarketSpecificAttribute1 .class, MessageHeader1 .class, MxReda01400101 .class, NameAndAddress5 .class, NamePrefix2Code.class, OtherContact1 .class, PartyCreationRequestV01 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyName4 .class, PostalAddress1 .class, PostalAddress25 .class, PreferredContactMethod1Code.class, ResidenceType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemParty4 .class, SystemPartyIdentification9 .class, SystemPartyType1Choice.class, SystemRestriction1 .class, TechnicalIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.014.001.01";

    public MxReda01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01400101(final String xml) {
        this();
        MxReda01400101 tmp = parse(xml);
        ptyCreReq = tmp.getPtyCreReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyCreReq property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCreationRequestV01 }
     *     
     */
    public PartyCreationRequestV01 getPtyCreReq() {
        return ptyCreReq;
    }

    /**
     * Sets the value of the ptyCreReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCreationRequestV01 }
     *     
     */
    public MxReda01400101 setPtyCreReq(PartyCreationRequestV01 value) {
        this.ptyCreReq = value;
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
    public static MxReda01400101 parse(String xml) {
        return ((MxReda01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda01400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01400101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01400101) parserImpl.read(MxReda01400101 .class, xml, _classes));
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
     * Creates an MxReda01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01400101 message
     * @return
     *     a new instance of MxReda01400101
     */
    public final static MxReda01400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01400101 .class);
    }

}
