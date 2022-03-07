
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
 * Class for reda.037.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.037.001.01")
public class MxReda03700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctAudtTrlRpt", required = true)
    protected SecuritiesAccountAuditTrailReportV01 sctiesAcctAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AuditTrail1 .class, AuditTrailOrBusinessError6Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericIdentification30 .class, MessageHeader12 .class, MxReda03700101 .class, OriginalBusinessInstruction1 .class, SecuritiesAccount19 .class, SecuritiesAccountAuditTrailOrOperationalError3Choice.class, SecuritiesAccountAuditTrailReport3 .class, SecuritiesAccountAuditTrailReportV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.037.001.01";

    public MxReda03700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda03700101(final String xml) {
        this();
        MxReda03700101 tmp = parse(xml);
        sctiesAcctAudtTrlRpt = tmp.getSctiesAcctAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda03700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountAuditTrailReportV01 }
     *     
     */
    public SecuritiesAccountAuditTrailReportV01 getSctiesAcctAudtTrlRpt() {
        return sctiesAcctAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesAcctAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountAuditTrailReportV01 }
     *     
     */
    public MxReda03700101 setSctiesAcctAudtTrlRpt(SecuritiesAccountAuditTrailReportV01 value) {
        this.sctiesAcctAudtTrlRpt = value;
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
    public static MxReda03700101 parse(String xml) {
        return ((MxReda03700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda03700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda03700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda03700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda03700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda03700101 parse(String xml, MxRead parserImpl) {
        return ((MxReda03700101) parserImpl.read(MxReda03700101 .class, xml, _classes));
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
     * Creates an MxReda03700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda03700101 message
     * @return
     *     a new instance of MxReda03700101
     */
    public final static MxReda03700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda03700101 .class);
    }

}
