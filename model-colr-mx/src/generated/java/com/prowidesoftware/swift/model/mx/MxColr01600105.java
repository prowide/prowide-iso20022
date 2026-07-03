
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
 * Class for colr.016.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collAndXpsrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.05")
public class MxColr01600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollAndXpsrRpt", required = true)
    protected CollateralAndExposureReportV05 collAndXpsrRpt;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, BlockChainAddressWallet3 .class, BlockChainAddressWallet5 .class, CCPMemberType1Code.class, CashCollateral4 .class, Collateral53 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralAmount1 .class, CollateralAndExposureReportV05 .class, CollateralAppliedExcess1Code.class, CollateralDirection1Code.class, CollateralOwnership3 .class, CollateralType8Code.class, CollateralValuation13 .class, DateAndDateTime2Choice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DepositType1Code.class, EventFrequency6Code.class, ExposureType11Code.class, ExposureType13Code.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, MxColr01600105 .class, NameAndAddress6 .class, Obligation11 .class, OtherCollateral10 .class, OtherIdentification1 .class, OtherTypeOfCollateral3 .class, Pagination1 .class, PartyIdentification178Choice.class, PartyIdentification242 .class, PostalAddress2 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, ReportParameters6 .class, ReturnExcessCash1 .class, ReturnExcessCash1Choice.class, ReturnExcessCash1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCollateral13 .class, SecurityIdentification19 .class, SettlementStatus3Code.class, ShortLong1Code.class, Summary3 .class, SummaryAmounts2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThresholdType1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.016.001.05";

    public MxColr01600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01600105(final String xml) {
        this();
        MxColr01600105 tmp = parse(xml);
        collAndXpsrRpt = tmp.getCollAndXpsrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collAndXpsrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAndExposureReportV05 }
     *     
     */
    public CollateralAndExposureReportV05 getCollAndXpsrRpt() {
        return collAndXpsrRpt;
    }

    /**
     * Sets the value of the collAndXpsrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAndExposureReportV05 }
     *     
     */
    public MxColr01600105 setCollAndXpsrRpt(CollateralAndExposureReportV05 value) {
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
    public static MxColr01600105 parse(String xml) {
        return ((MxColr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01600105 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01600105 parse(String xml, MxRead parserImpl) {
        return ((MxColr01600105) parserImpl.read(MxColr01600105 .class, xml, _classes));
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
     * Creates an MxColr01600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01600105 message
     * @return
     *     a new instance of MxColr01600105
     */
    public final static MxColr01600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01600105 .class);
    }

}
