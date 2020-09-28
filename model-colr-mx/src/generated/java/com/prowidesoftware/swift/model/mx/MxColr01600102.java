
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
 * Class for colr.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collAndXpsrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.02")
public class MxColr01600102
    extends AbstractMX
{

    @XmlElement(name = "CollAndXpsrRpt", required = true)
    protected CollateralAndExposureReportV02 collAndXpsrRpt;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CashCollateral4 .class, Collateral9 .class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralAmount1 .class, CollateralAndExposureReportV02 .class, CollateralOwnership1 .class, CollateralType1Code.class, CollateralValuation2 .class, DateAndDateTimeChoice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DepositType1Code.class, EventFrequency6Code.class, ExposureType1Code.class, ExposureType5Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification29 .class, GenericIdentification30 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, MxColr01600102 .class, NameAndAddress6 .class, Obligation3 .class, OtherCollateral3 .class, OtherIdentification1 .class, OtherTypeOfCollateral2 .class, Pagination.class, PartyIdentification33Choice.class, PostalAddress2 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, ReportParameters2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat7Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount19 .class, SecuritiesCollateral2 .class, SecurityIdentification14 .class, SettlementStatus2Code.class, ShortLong1Code.class, Summary1 .class, SummaryAmounts1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThresholdType1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.02";

    public MxColr01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01600102(final String xml) {
        this();
        MxColr01600102 tmp = parse(xml);
        collAndXpsrRpt = tmp.getCollAndXpsrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collAndXpsrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAndExposureReportV02 }
     *     
     */
    public CollateralAndExposureReportV02 getCollAndXpsrRpt() {
        return collAndXpsrRpt;
    }

    /**
     * Sets the value of the collAndXpsrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAndExposureReportV02 }
     *     
     */
    public MxColr01600102 setCollAndXpsrRpt(CollateralAndExposureReportV02 value) {
        this.collAndXpsrRpt = value;
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
    public static MxColr01600102 parse(String xml) {
        return ((MxColr01600102) MxReadImpl.parse(MxColr01600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01600102 parse(String xml, MxRead parserImpl) {
        return ((MxColr01600102) parserImpl.read(MxColr01600102 .class, xml, _classes));
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
     * Creates an MxColr01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01600102 message
     * @return
     *     a new instance of MxColr01600102
     */
    public final static MxColr01600102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr01600102 .class);
    }

}
