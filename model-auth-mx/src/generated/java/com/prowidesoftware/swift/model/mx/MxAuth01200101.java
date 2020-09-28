
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktScrdMktSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.012.001.01")
public class MxAuth01200101
    extends AbstractMX
{

    @XmlElement(name = "MnyMktScrdMktSttstclRpt", required = true)
    protected MoneyMarketSecuredMarketStatisticalReportV01 mnyMktScrdMktSttstclRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, BrokeredDeal1Code.class, Collateral14 .class, CollateralPool1Code.class, CollateralValuation6 .class, CollateralValuation7 .class, CounterpartyIdentification2Choice.class, DateAndDateTimeChoice.class, DateTimePeriod1 .class, FloatingRateNote2 .class, InterestRateType1Code.class, MoneyMarketReportHeader1 .class, MoneyMarketSecuredMarketStatisticalReportV01 .class, MoneyMarketTransactionType1Code.class, MxAuth01200101 .class, NameOrSector1Choice.class, Rate2 .class, ReportPeriodActivity1Code.class, ReportedPartyIdentification1 .class, SecuredCollateral2Choice.class, SecuredMarketReport3Choice.class, SecuredMarketTransaction3 .class, SpecialCollateral1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.012.001.01";

    public MxAuth01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01200101(final String xml) {
        this();
        MxAuth01200101 tmp = parse(xml);
        mnyMktScrdMktSttstclRpt = tmp.getMnyMktScrdMktSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktScrdMktSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketSecuredMarketStatisticalReportV01 }
     *     
     */
    public MoneyMarketSecuredMarketStatisticalReportV01 getMnyMktScrdMktSttstclRpt() {
        return mnyMktScrdMktSttstclRpt;
    }

    /**
     * Sets the value of the mnyMktScrdMktSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketSecuredMarketStatisticalReportV01 }
     *     
     */
    public MxAuth01200101 setMnyMktScrdMktSttstclRpt(MoneyMarketSecuredMarketStatisticalReportV01 value) {
        this.mnyMktScrdMktSttstclRpt = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAuth01200101 parse(String xml) {
        return ((MxAuth01200101) MxReadImpl.parse(MxAuth01200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01200101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01200101) parserImpl.read(MxAuth01200101 .class, xml, _classes));
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
     * Creates an MxAuth01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01200101 message
     * @return
     *     a new instance of MxAuth01200101
     */
    public final static MxAuth01200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth01200101 .class);
    }

}
