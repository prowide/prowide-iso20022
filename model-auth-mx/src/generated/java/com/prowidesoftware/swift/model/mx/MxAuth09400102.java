
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
 * Class for auth.094.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.094.001.02")
public class MxAuth09400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxQry", required = true)
    protected SecuritiesFinancingReportingTransactionQueryV02 sctiesFincgRptgTxQry;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 94;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AnyMIC1Code.class, CollateralType6Code.class, CorporateSectorCriteria5 .class, DateOrBlankQuery2Choice.class, DatePeriod1 .class, DateTimePeriod1 .class, ExposureType10Code.class, FinancialPartySectorType2Code.class, Frequency14Code.class, GenericIdentification1 .class, MxAuth09400102 .class, NameAndAddress5 .class, NotReported1Code.class, Operation3Code.class, PartyIdentification121Choice.class, PartyNatureType1Code.class, PostalAddress1 .class, SecuritiesFinancingReportingTransactionQueryV02 .class, SecuritiesTradeVenueCriteria1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAdditionalQueryCriteria7 .class, TradeDateTimeQueryCriteria2 .class, TradePartyIdentificationQuery8 .class, TradePartyIdentificationQuery9 .class, TradePartyQueryCriteria5 .class, TradeQueryCriteria10 .class, TradeQueryExecutionFrequency3 .class, TradeRecurrentQuery5 .class, TradeReportQuery13Choice.class, TradeTypeQueryCriteria2 .class, TransactionOperationType6Code.class, WeekDay3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.094.001.02";

    public MxAuth09400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09400102(final String xml) {
        this();
        MxAuth09400102 tmp = parse(xml);
        sctiesFincgRptgTxQry = tmp.getSctiesFincgRptgTxQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionQueryV02 }
     *     
     */
    public SecuritiesFinancingReportingTransactionQueryV02 getSctiesFincgRptgTxQry() {
        return sctiesFincgRptgTxQry;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionQueryV02 }
     *     
     */
    public MxAuth09400102 setSctiesFincgRptgTxQry(SecuritiesFinancingReportingTransactionQueryV02 value) {
        this.sctiesFincgRptgTxQry = value;
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
    public static MxAuth09400102 parse(String xml) {
        return ((MxAuth09400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09400102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09400102) parserImpl.read(MxAuth09400102 .class, xml, _classes));
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
     * Creates an MxAuth09400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09400102 message
     * @return
     *     a new instance of MxAuth09400102
     */
    public final static MxAuth09400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09400102 .class);
    }

}
