
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
 * Class for reda.040.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cshAcctAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT4reda.040.001.01")
public class MxReda04000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CshAcctAudtTrlRpt", required = true)
    protected CashAccountAuditTrailReportV01Draft4 cshAcctAudtTrlRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 40;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AuditTrail1 .class, AuditTrailOrBusinessError6Choice.class, CashAccount38 .class, CashAccountAuditTrailOrOperationalError3Choice.class, CashAccountAuditTrailReport3 .class, CashAccountAuditTrailReportV01Draft4 .class, CashAccountType2Choice.class, CopyDuplicate1Code.class, DateAndDateTime2Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DocumentIdentification50 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericAccountIdentification1 .class, GenericIdentification36 .class, MxReda04000101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT4reda.040.001.01";

    public MxReda04000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04000101(final String xml) {
        this();
        MxReda04000101 tmp = parse(xml);
        cshAcctAudtTrlRpt = tmp.getCshAcctAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cshAcctAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountAuditTrailReportV01Draft4 }
     *     
     */
    public CashAccountAuditTrailReportV01Draft4 getCshAcctAudtTrlRpt() {
        return cshAcctAudtTrlRpt;
    }

    /**
     * Sets the value of the cshAcctAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountAuditTrailReportV01Draft4 }
     *     
     */
    public MxReda04000101 setCshAcctAudtTrlRpt(CashAccountAuditTrailReportV01Draft4 value) {
        this.cshAcctAudtTrlRpt = value;
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
    public static MxReda04000101 parse(String xml) {
        return ((MxReda04000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04000101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04000101) parserImpl.read(MxReda04000101 .class, xml, _classes));
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
     * Creates an MxReda04000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04000101 message
     * @return
     *     a new instance of MxReda04000101
     */
    public static final MxReda04000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda04000101 .class);
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
