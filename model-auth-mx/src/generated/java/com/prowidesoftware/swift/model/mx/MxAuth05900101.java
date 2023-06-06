
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
 * Class for auth.059.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpIncmStmtAndCptlAdqcyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.059.001.01")
public class MxAuth05900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPIncmStmtAndCptlAdqcyRpt", required = true)
    protected CCPIncomeStatementAndCapitalAdequacyReportV01 ccpIncmStmtAndCptlAdqcyRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 59;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection102 .class, CCPIncomeStatementAndCapitalAdequacyReportV01 .class, CapitalRequirement1 .class, HypotheticalCapitalMeasure1 .class, IncomeStatement1 .class, MxAuth05900101 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.059.001.01";

    public MxAuth05900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth05900101(final String xml) {
        this();
        MxAuth05900101 tmp = parse(xml);
        ccpIncmStmtAndCptlAdqcyRpt = tmp.getCCPIncmStmtAndCptlAdqcyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth05900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpIncmStmtAndCptlAdqcyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPIncomeStatementAndCapitalAdequacyReportV01 }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 getCCPIncmStmtAndCptlAdqcyRpt() {
        return ccpIncmStmtAndCptlAdqcyRpt;
    }

    /**
     * Sets the value of the ccpIncmStmtAndCptlAdqcyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPIncomeStatementAndCapitalAdequacyReportV01 }
     *     
     */
    public MxAuth05900101 setCCPIncmStmtAndCptlAdqcyRpt(CCPIncomeStatementAndCapitalAdequacyReportV01 value) {
        this.ccpIncmStmtAndCptlAdqcyRpt = value;
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
    public static MxAuth05900101 parse(String xml) {
        return ((MxAuth05900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth05900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth05900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth05900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth05900101) parserImpl.read(MxAuth05900101 .class, xml, _classes));
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
     * Creates an MxAuth05900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth05900101 message
     * @return
     *     a new instance of MxAuth05900101
     */
    public static final MxAuth05900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth05900101 .class);
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
