
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
 * Class for auth.101.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmFlsAnlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.101.001.01")
public class MxAuth10100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmFlsAnlRpt", required = true)
    protected SettlementFailsAnnualReportV01 sttlmFlsAnlRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 101;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Contact9 .class, DatePeriod2 .class, MxAuth10100101 .class, SecuritiesSettlementSystemIdentification2 .class, SettlementDataRate1Choice.class, SettlementDataRate2 .class, SettlementDataVolume2 .class, SettlementFailsAnnualReportV01 .class, SettlementFailsData4 .class, SettlementFailsDerogation1 .class, SettlementFailsJustification1 .class, SettlementFailsReportHeader2 .class, SettlementFailureReason2 .class, SettlementFailureReason3 .class, SettlementTotalData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType4Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.101.001.01";

    public MxAuth10100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10100101(final String xml) {
        this();
        MxAuth10100101 tmp = parse(xml);
        sttlmFlsAnlRpt = tmp.getSttlmFlsAnlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmFlsAnlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsAnnualReportV01 }
     *     
     */
    public SettlementFailsAnnualReportV01 getSttlmFlsAnlRpt() {
        return sttlmFlsAnlRpt;
    }

    /**
     * Sets the value of the sttlmFlsAnlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsAnnualReportV01 }
     *     
     */
    public MxAuth10100101 setSttlmFlsAnlRpt(SettlementFailsAnnualReportV01 value) {
        this.sttlmFlsAnlRpt = value;
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
    public static MxAuth10100101 parse(String xml) {
        return ((MxAuth10100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10100101) parserImpl.read(MxAuth10100101 .class, xml, _classes));
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
     * Creates an MxAuth10100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10100101 message
     * @return
     *     a new instance of MxAuth10100101
     */
    public static final MxAuth10100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10100101 .class);
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
