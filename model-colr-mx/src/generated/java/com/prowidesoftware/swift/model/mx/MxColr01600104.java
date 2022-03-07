
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
 * Class for colr.016.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collAndXpsrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.04")
public class MxColr01600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollAndXpsrRpt", required = true)
    protected CollateralAndExposureReportV04 collAndXpsrRpt;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CCPMemberType1Code.class, CashCollateral4 .class, Collateral43 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralAmount1 .class, CollateralAndExposureReportV04 .class, CollateralAppliedExcess1Code.class, CollateralDirection1Code.class, CollateralOwnership3 .class, CollateralType8Code.class, CollateralValuation12 .class, DateAndDateTime2Choice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DepositType1Code.class, EventFrequency6Code.class, ExposureType5Code.class, ExposureType8Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, MxColr01600104 .class, NameAndAddress6 .class, Obligation6 .class, OtherCollateral8 .class, OtherIdentification1 .class, OtherTypeOfCollateral2 .class, Pagination1 .class, PartyIdentification178Choice.class, PartyIdentification242 .class, PostalAddress2 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, ReportParameters6 .class, ReturnExcessCash1 .class, ReturnExcessCash1Choice.class, ReturnExcessCash1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCollateral9 .class, SecurityIdentification19 .class, SettlementStatus3Code.class, ShortLong1Code.class, Summary2 .class, SummaryAmounts2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThresholdType1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.04";

    public MxColr01600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01600104(final String xml) {
        this();
        MxColr01600104 tmp = parse(xml);
        collAndXpsrRpt = tmp.getCollAndXpsrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collAndXpsrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAndExposureReportV04 }
     *     
     */
    public CollateralAndExposureReportV04 getCollAndXpsrRpt() {
        return collAndXpsrRpt;
    }

    /**
     * Sets the value of the collAndXpsrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAndExposureReportV04 }
     *     
     */
    public MxColr01600104 setCollAndXpsrRpt(CollateralAndExposureReportV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr01600104 parse(String xml) {
        return ((MxColr01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01600104 parse(String xml, MxRead parserImpl) {
        return ((MxColr01600104) parserImpl.read(MxColr01600104 .class, xml, _classes));
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
     * Creates an MxColr01600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01600104 message
     * @return
     *     a new instance of MxColr01600104
     */
    public final static MxColr01600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01600104 .class);
    }

}
