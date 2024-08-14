
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
 * Class for tsmt.018.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fullPushThrghRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05")
public class MxTsmt01800105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FullPushThrghRpt", required = true)
    protected FullPushThroughReportV05 fullPushThrghRpt;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 18;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, Action2Code.class, ActiveCurrencyAndAmount.class, Adjustment7 .class, AdjustmentDirection1Code.class, AdjustmentType1Choice.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, AmountOrPercentage2Choice.class, AssuredType1Code.class, BICIdentification1 .class, BPOApplicableRules1Choice.class, BankRole1Code.class, Baseline5 .class, BaselineStatus3Code.class, CashAccount24 .class, CashAccountType2Choice.class, Charge24 .class, ChargeType8Code.class, Charges5 .class, ChargesDetails3 .class, ChargesType1Choice.class, ContactIdentification1 .class, ContactIdentification3 .class, CountrySubdivision1Choice.class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, FullPushThroughReportV05 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, Incoterms4 .class, Incoterms4Choice.class, InsuranceClauses1Code.class, LineItem13 .class, LineItemDetails13 .class, Location2 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt01800105 .class, NameAndAddress6 .class, NamePrefix1Code.class, PartyIdentification26 .class, PartyIdentification27 .class, PaymentCodeOrOther1Choice.class, PaymentCodeOrOther2Choice.class, PaymentObligation2 .class, PaymentPeriod3 .class, PaymentPeriod4 .class, PaymentTerms4 .class, PaymentTerms5 .class, PaymentTime3Code.class, PaymentTime4Code.class, PendingActivity2 .class, PercentageTolerance1 .class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity9 .class, ReportType1 .class, ReportType1Code.class, RequiredSubmission2 .class, RequiredSubmission3 .class, RequiredSubmission4 .class, RequiredSubmission6 .class, SettlementTerms3 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SimpleIdentificationInformation.class, SingleTransport7 .class, Tax23 .class, TaxType2Choice.class, TaxType9Code.class, TradeCertificateType1Code.class, TradeFinanceService2Code.class, TransactionStatus4 .class, TransportByAir5 .class, TransportByRail5 .class, TransportByRoad5 .class, TransportBySea6 .class, TransportMeans5 .class, UnitOfMeasure3Choice.class, UnitPrice18 .class, UserDefinedInformation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05";

    public MxTsmt01800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01800105(final String xml) {
        this();
        MxTsmt01800105 tmp = parse(xml);
        fullPushThrghRpt = tmp.getFullPushThrghRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fullPushThrghRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FullPushThroughReportV05 }
     *     
     */
    public FullPushThroughReportV05 getFullPushThrghRpt() {
        return fullPushThrghRpt;
    }

    /**
     * Sets the value of the fullPushThrghRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullPushThroughReportV05 }
     *     
     */
    public MxTsmt01800105 setFullPushThrghRpt(FullPushThroughReportV05 value) {
        this.fullPushThrghRpt = value;
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
    public static MxTsmt01800105 parse(String xml) {
        return ((MxTsmt01800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01800105 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01800105 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01800105) parserImpl.read(MxTsmt01800105 .class, xml, _classes));
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
     * Creates an MxTsmt01800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01800105 message
     * @return
     *     a new instance of MxTsmt01800105
     */
    public static final MxTsmt01800105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01800105 .class);
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
