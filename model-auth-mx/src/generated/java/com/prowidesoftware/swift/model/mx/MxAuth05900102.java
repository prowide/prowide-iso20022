
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
 * Class for auth.059.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpIncmStmtAndCptlAdqcyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.059.001.02")
public class MxAuth05900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPIncmStmtAndCptlAdqcyRpt", required = true)
    protected CCPIncomeStatementAndCapitalAdequacyReportV02 ccpIncmStmtAndCptlAdqcyRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 59;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection102 .class, CCPIncomeStatementAndCapitalAdequacyReportV02 .class, CapitalRequirement1 .class, ClearingMemberFee1 .class, GenericIdentification168 .class, HypotheticalCapitalMeasure1 .class, IncomeStatement2 .class, MxAuth05900102 .class, PartyIdentification118Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.059.001.02";

    public MxAuth05900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth05900102(final String xml) {
        this();
        MxAuth05900102 tmp = parse(xml);
        ccpIncmStmtAndCptlAdqcyRpt = tmp.getCCPIncmStmtAndCptlAdqcyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth05900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpIncmStmtAndCptlAdqcyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPIncomeStatementAndCapitalAdequacyReportV02 }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV02 getCCPIncmStmtAndCptlAdqcyRpt() {
        return ccpIncmStmtAndCptlAdqcyRpt;
    }

    /**
     * Sets the value of the ccpIncmStmtAndCptlAdqcyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPIncomeStatementAndCapitalAdequacyReportV02 }
     *     
     */
    public MxAuth05900102 setCCPIncmStmtAndCptlAdqcyRpt(CCPIncomeStatementAndCapitalAdequacyReportV02 value) {
        this.ccpIncmStmtAndCptlAdqcyRpt = value;
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
    public static MxAuth05900102 parse(String xml) {
        return ((MxAuth05900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth05900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth05900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth05900102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth05900102) parserImpl.read(MxAuth05900102 .class, xml, _classes));
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
     * Creates an MxAuth05900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth05900102 message
     * @return
     *     a new instance of MxAuth05900102
     */
    public final static MxAuth05900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth05900102 .class);
    }

}
