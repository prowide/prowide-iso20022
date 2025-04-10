
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
 * Class for auth.031.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.031.001.01")
public class MxAuth03100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgStsAdvc", required = true)
    protected FinancialInstrumentReportingStatusAdviceV01 finInstrmRptgStsAdvc;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {FinancialInstrumentReportingStatusAdviceV01 .class, GenericValidationRuleIdentification1 .class, MessageReportHeader4 .class, MxAuth03100101 .class, NumberOfRecordsPerStatus1 .class, OriginalReportStatistics3 .class, ReportingMessageStatus1Code.class, ReportingRecordStatus1Code.class, StatusAdviceReport3 .class, StatusReportRecord3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ValidationRuleSchemeName1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.031.001.01";

    public MxAuth03100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03100101(final String xml) {
        this();
        MxAuth03100101 tmp = parse(xml);
        finInstrmRptgStsAdvc = tmp.getFinInstrmRptgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingStatusAdviceV01 }
     *     
     */
    public FinancialInstrumentReportingStatusAdviceV01 getFinInstrmRptgStsAdvc() {
        return finInstrmRptgStsAdvc;
    }

    /**
     * Sets the value of the finInstrmRptgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingStatusAdviceV01 }
     *     
     */
    public MxAuth03100101 setFinInstrmRptgStsAdvc(FinancialInstrumentReportingStatusAdviceV01 value) {
        this.finInstrmRptgStsAdvc = value;
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
    public static MxAuth03100101 parse(String xml) {
        return ((MxAuth03100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03100101) parserImpl.read(MxAuth03100101 .class, xml, _classes));
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
     * Creates an MxAuth03100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03100101 message
     * @return
     *     a new instance of MxAuth03100101
     */
    public static final MxAuth03100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03100101 .class);
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
