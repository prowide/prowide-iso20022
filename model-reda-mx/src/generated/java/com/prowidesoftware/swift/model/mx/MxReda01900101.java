
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
 * Class for reda.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.019.001.01")
public class MxReda01900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctQry", required = true)
    protected SecuritiesAccountQueryV01 sctiesAcctQry;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, MessageHeader2 .class, MxReda01900101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SecuritiesAccountQueryV01 .class, SecuritiesAccountReturnCriteria1 .class, SecuritiesAccountSearchCriteria2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemPartyType1Choice.class, SystemSecuritiesAccountType1Choice.class, SystemSecuritiesAccountType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.019.001.01";

    public MxReda01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01900101(final String xml) {
        this();
        MxReda01900101 tmp = parse(xml);
        sctiesAcctQry = tmp.getSctiesAcctQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountQueryV01 }
     *     
     */
    public SecuritiesAccountQueryV01 getSctiesAcctQry() {
        return sctiesAcctQry;
    }

    /**
     * Sets the value of the sctiesAcctQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountQueryV01 }
     *     
     */
    public MxReda01900101 setSctiesAcctQry(SecuritiesAccountQueryV01 value) {
        this.sctiesAcctQry = value;
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
    public static MxReda01900101 parse(String xml) {
        return ((MxReda01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda01900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01900101 parse(String xml, MxRead parserImpl) {
        return ((MxReda01900101) parserImpl.read(MxReda01900101 .class, xml, _classes));
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
     * Creates an MxReda01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01900101 message
     * @return
     *     a new instance of MxReda01900101
     */
    public final static MxReda01900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01900101 .class);
    }

}
