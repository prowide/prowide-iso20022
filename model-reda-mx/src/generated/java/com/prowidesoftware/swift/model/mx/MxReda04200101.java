
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
 * Class for reda.042.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyAudtTrlQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.042.001.01")
public class MxReda04200101
    extends AbstractMX
{

    @XmlElement(name = "PtyAudtTrlQry", required = true)
    protected PartyAuditTrailQueryV01 ptyAudtTrlQry;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, GenericIdentification36 .class, MessageHeader1 .class, MxReda04200101 .class, NameAndAddress5 .class, PartyAuditTrailQueryV01 .class, PartyAuditTrailSearchCriteria2 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.042.001.01";

    public MxReda04200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04200101(final String xml) {
        this();
        MxReda04200101 tmp = parse(xml);
        ptyAudtTrlQry = tmp.getPtyAudtTrlQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyAudtTrlQry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuditTrailQueryV01 }
     *     
     */
    public PartyAuditTrailQueryV01 getPtyAudtTrlQry() {
        return ptyAudtTrlQry;
    }

    /**
     * Sets the value of the ptyAudtTrlQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuditTrailQueryV01 }
     *     
     */
    public MxReda04200101 setPtyAudtTrlQry(PartyAuditTrailQueryV01 value) {
        this.ptyAudtTrlQry = value;
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
    public static MxReda04200101 parse(String xml) {
        return ((MxReda04200101) MxReadImpl.parse(MxReda04200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04200101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04200101) parserImpl.read(MxReda04200101 .class, xml, _classes));
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
     * Creates an MxReda04200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04200101 message
     * @return
     *     a new instance of MxReda04200101
     */
    public final static MxReda04200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda04200101 .class);
    }

}
