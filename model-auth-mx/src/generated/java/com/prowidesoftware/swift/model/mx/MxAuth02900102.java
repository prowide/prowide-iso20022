
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
 * Class for auth.029.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRptQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.029.001.02")
public class MxAuth02900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRptQry", required = true)
    protected DerivativesTradeReportQueryV02 derivsTradRptQry;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AnyMIC1Code.class, CorporateSectorCriteria3 .class, DateOrBlankQuery2Choice.class, DatePeriod1 .class, DateTimePeriod1 .class, DerivativesTradeReportQueryV02 .class, FinancialPartySectorType1Code.class, Frequency14Code.class, GenericIdentification1 .class, MxAuth02900102 .class, NameAndAddress5 .class, NonFinancialPartySector1Code.class, NotAvailable1Code.class, NotReported1Code.class, Operation3Code.class, PartyIdentification121Choice.class, PartyNatureType1Code.class, PostalAddress1 .class, ProductClassificationCriteria1 .class, ProductType4Code.class, SecuritiesTradeVenueCriteria1Choice.class, SecurityIdentification20Choice.class, SecurityIdentificationQuery3Choice.class, SecurityIdentificationQueryCriteria1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAdditionalQueryCriteria3 .class, TradeDateTimeQueryCriteria2 .class, TradePartyIdentificationQuery8 .class, TradePartyQueryCriteria3 .class, TradeQueryCriteria4 .class, TradeQueryExecutionFrequency3 .class, TradeRecurrentQuery5 .class, TradeReportQuery10Choice.class, TradeSecurityIdentificationQueryCriteria2 .class, TransactionOperationType3Code.class, WeekDay3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.029.001.02";

    public MxAuth02900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02900102(final String xml) {
        this();
        MxAuth02900102 tmp = parse(xml);
        derivsTradRptQry = tmp.getDerivsTradRptQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRptQry property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReportQueryV02 }
     *     
     */
    public DerivativesTradeReportQueryV02 getDerivsTradRptQry() {
        return derivsTradRptQry;
    }

    /**
     * Sets the value of the derivsTradRptQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReportQueryV02 }
     *     
     */
    public MxAuth02900102 setDerivsTradRptQry(DerivativesTradeReportQueryV02 value) {
        this.derivsTradRptQry = value;
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
    public static MxAuth02900102 parse(String xml) {
        return ((MxAuth02900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02900102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02900102) parserImpl.read(MxAuth02900102 .class, xml, _classes));
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
     * Creates an MxAuth02900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02900102 message
     * @return
     *     a new instance of MxAuth02900102
     */
    public static final MxAuth02900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02900102 .class);
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
