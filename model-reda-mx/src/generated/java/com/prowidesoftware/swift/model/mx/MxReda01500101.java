
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
 * Class for reda.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.015.001.01")
public class MxReda01500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyQry", required = true)
    protected PartyQueryV01 ptyQry;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTimeSearch4Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimeSearch2Choice.class, GenericIdentification1 .class, GenericIdentification36 .class, LockStatus1Code.class, MessageHeader2 .class, MxReda01500101 .class, NameAndAddress5 .class, PartyDataReturnCriteria2 .class, PartyDataSearchCriteria2 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyQueryV01 .class, PostalAddress1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ResidenceType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.015.001.01";

    public MxReda01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01500101(final String xml) {
        this();
        MxReda01500101 tmp = parse(xml);
        ptyQry = tmp.getPtyQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyQry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyQueryV01 }
     *     
     */
    public PartyQueryV01 getPtyQry() {
        return ptyQry;
    }

    /**
     * Sets the value of the ptyQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyQueryV01 }
     *     
     */
    public MxReda01500101 setPtyQry(PartyQueryV01 value) {
        this.ptyQry = value;
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
    public static MxReda01500101 parse(String xml) {
        return ((MxReda01500101) MxReadImpl.parse(MxReda01500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01500101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01500101) parserImpl.read(MxReda01500101 .class, xml, _classes));
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
     * Creates an MxReda01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01500101 message
     * @return
     *     a new instance of MxReda01500101
     */
    public final static MxReda01500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01500101 .class);
    }

}
