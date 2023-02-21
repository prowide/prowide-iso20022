
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
 * Class for auth.100.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmFlsMnthlyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.100.001.01")
public class MxAuth10000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmFlsMnthlyRpt", required = true)
    protected SettlementFailsMonthlyReportV01 sttlmFlsMnthlyRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 100;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Contact9 .class, DatePeriod2 .class, IdentificationSource3Choice.class, MxAuth10000101 .class, OtherIdentification1 .class, ReportPeriodActivity1Code.class, SecuritiesSettlementSystemIdentification2 .class, SecurityIdentification19 .class, SettlementDailyFailureReason1Choice.class, SettlementDailyFailureReason3 .class, SettlementDataRate2 .class, SettlementDataVolume2 .class, SettlementFailsCurrency2 .class, SettlementFailsDailyCSD1Choice.class, SettlementFailsDailyCSD3 .class, SettlementFailsDailyData3 .class, SettlementFailsDailyInstructionType1Choice.class, SettlementFailsDailyInstructionType3 .class, SettlementFailsDailyInstrument3 .class, SettlementFailsDailyTransactionType1Choice.class, SettlementFailsDailyTransactionType3 .class, SettlementFailsData3 .class, SettlementFailsInstrument2 .class, SettlementFailsMonthlyReportV01 .class, SettlementFailsParticipant1 .class, SettlementFailsParticipantRange1 .class, SettlementFailsReportHeader2 .class, SettlementFailsSecurities1 .class, SettlementFailsSecuritiesRange1 .class, SettlementFailsTransactionType2 .class, SettlementFailureReason2 .class, SettlementFailureReason3 .class, SettlementTotalData1 .class, SettlementTotalData1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.100.001.01";

    public MxAuth10000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10000101(final String xml) {
        this();
        MxAuth10000101 tmp = parse(xml);
        sttlmFlsMnthlyRpt = tmp.getSttlmFlsMnthlyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmFlsMnthlyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsMonthlyReportV01 }
     *     
     */
    public SettlementFailsMonthlyReportV01 getSttlmFlsMnthlyRpt() {
        return sttlmFlsMnthlyRpt;
    }

    /**
     * Sets the value of the sttlmFlsMnthlyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsMonthlyReportV01 }
     *     
     */
    public MxAuth10000101 setSttlmFlsMnthlyRpt(SettlementFailsMonthlyReportV01 value) {
        this.sttlmFlsMnthlyRpt = value;
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
    public static MxAuth10000101 parse(String xml) {
        return ((MxAuth10000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10000101) parserImpl.read(MxAuth10000101 .class, xml, _classes));
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
     * Creates an MxAuth10000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10000101 message
     * @return
     *     a new instance of MxAuth10000101
     */
    public final static MxAuth10000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10000101 .class);
    }

}
