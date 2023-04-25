
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
 * Class for reda.018.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctCreReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.018.001.01")
public class MxReda01800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctCreReq", required = true)
    protected SecuritiesAccountCreationRequestV01 sctiesAcctCreReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 18;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, GenericIdentification30 .class, GenericIdentification36 .class, MarketSpecificAttribute1 .class, MessageHeader1 .class, MxReda01800101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, SecuritiesAccountCreationRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemRestriction1 .class, SystemSecuritiesAccount7 .class, SystemSecuritiesAccountType1Choice.class, SystemSecuritiesAccountType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.018.001.01";

    public MxReda01800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01800101(final String xml) {
        this();
        MxReda01800101 tmp = parse(xml);
        sctiesAcctCreReq = tmp.getSctiesAcctCreReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctCreReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountCreationRequestV01 }
     *     
     */
    public SecuritiesAccountCreationRequestV01 getSctiesAcctCreReq() {
        return sctiesAcctCreReq;
    }

    /**
     * Sets the value of the sctiesAcctCreReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountCreationRequestV01 }
     *     
     */
    public MxReda01800101 setSctiesAcctCreReq(SecuritiesAccountCreationRequestV01 value) {
        this.sctiesAcctCreReq = value;
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
    public static MxReda01800101 parse(String xml) {
        return ((MxReda01800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda01800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda01800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01800101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01800101) parserImpl.read(MxReda01800101 .class, xml, _classes));
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
     * Creates an MxReda01800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01800101 message
     * @return
     *     a new instance of MxReda01800101
     */
    public static final MxReda01800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01800101 .class);
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
