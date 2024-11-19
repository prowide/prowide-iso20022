
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
 * Class for auth.015.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktOvrnghtIndxSwpsSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.015.001.02")
public class MxAuth01500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktOvrnghtIndxSwpsSttstclRpt", required = true)
    protected MoneyMarketOvernightIndexSwapsStatisticalReportV02 mnyMktOvrnghtIndxSwpsSttstclRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, CounterpartyIdentification3Choice.class, DateAndDateTimeChoice.class, DateTimePeriod1 .class, MoneyMarketOvernightIndexSwapsStatisticalReportV02 .class, MoneyMarketReportHeader1 .class, MxAuth01500102 .class, NameAndLocation1 .class, NovationStatus1Code.class, OvernightIndexSwap4Choice.class, OvernightIndexSwapTransaction4 .class, OvernightIndexSwapType1Code.class, ReportPeriodActivity3Code.class, SectorAndLocation1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.015.001.02";

    public MxAuth01500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01500102(final String xml) {
        this();
        MxAuth01500102 tmp = parse(xml);
        mnyMktOvrnghtIndxSwpsSttstclRpt = tmp.getMnyMktOvrnghtIndxSwpsSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktOvrnghtIndxSwpsSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketOvernightIndexSwapsStatisticalReportV02 }
     *     
     */
    public MoneyMarketOvernightIndexSwapsStatisticalReportV02 getMnyMktOvrnghtIndxSwpsSttstclRpt() {
        return mnyMktOvrnghtIndxSwpsSttstclRpt;
    }

    /**
     * Sets the value of the mnyMktOvrnghtIndxSwpsSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketOvernightIndexSwapsStatisticalReportV02 }
     *     
     */
    public MxAuth01500102 setMnyMktOvrnghtIndxSwpsSttstclRpt(MoneyMarketOvernightIndexSwapsStatisticalReportV02 value) {
        this.mnyMktOvrnghtIndxSwpsSttstclRpt = value;
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
    public static MxAuth01500102 parse(String xml) {
        return ((MxAuth01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth01500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth01500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01500102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01500102) parserImpl.read(MxAuth01500102 .class, xml, _classes));
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
     * Creates an MxAuth01500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01500102 message
     * @return
     *     a new instance of MxAuth01500102
     */
    public static final MxAuth01500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01500102 .class);
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
