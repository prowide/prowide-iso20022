
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
 * Class for tsmt.019.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "initlBaselnSubmissn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.04")
public class MxTsmt01900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InitlBaselnSubmissn", required = true)
    protected InitialBaselineSubmissionV04 initlBaselnSubmissn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, Adjustment7 .class, AdjustmentDirection1Code.class, AdjustmentType1Choice.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, AmountOrPercentage2Choice.class, AssuredType1Code.class, BICIdentification1 .class, BPOApplicableRules1Choice.class, BankContactPerson1Choice.class, BankRole1Code.class, Baseline4 .class, CashAccount24 .class, CashAccountType2Choice.class, Charge24 .class, ChargeType8Code.class, Charges5 .class, ChargesDetails3 .class, ChargesType1Choice.class, ContactIdentification1 .class, ContactIdentification3 .class, CountrySubdivision1Choice.class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, Incoterms4 .class, Incoterms4Choice.class, InitialBaselineSubmissionV04 .class, InstructionType1 .class, InstructionType1Code.class, InsuranceClauses1Code.class, LineItem11 .class, LineItemDetails10 .class, Location2 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt01900104 .class, NameAndAddress6 .class, NamePrefix1Code.class, PartyIdentification26 .class, PartyIdentification27 .class, PaymentCodeOrOther1Choice.class, PaymentCodeOrOther2Choice.class, PaymentObligation2 .class, PaymentPeriod3 .class, PaymentPeriod4 .class, PaymentTerms4 .class, PaymentTerms5 .class, PaymentTime3Code.class, PaymentTime4Code.class, PercentageTolerance1 .class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity9 .class, RequiredSubmission2 .class, RequiredSubmission3 .class, RequiredSubmission4 .class, RequiredSubmission5 .class, SettlementTerms3 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SimpleIdentificationInformation.class, SingleTransport7 .class, Tax23 .class, TaxType2Choice.class, TaxType9Code.class, TradeCertificateType1Code.class, TradeCertificateType2Code.class, TradeFinanceService2Code.class, TransportByAir5 .class, TransportByRail5 .class, TransportByRoad5 .class, TransportBySea6 .class, TransportMeans5 .class, UnitOfMeasure3Choice.class, UnitPrice18 .class, UserDefinedInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.04";

    public MxTsmt01900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01900104(final String xml) {
        this();
        MxTsmt01900104 tmp = parse(xml);
        initlBaselnSubmissn = tmp.getInitlBaselnSubmissn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the initlBaselnSubmissn property.
     * 
     * @return
     *     possible object is
     *     {@link InitialBaselineSubmissionV04 }
     *     
     */
    public InitialBaselineSubmissionV04 getInitlBaselnSubmissn() {
        return initlBaselnSubmissn;
    }

    /**
     * Sets the value of the initlBaselnSubmissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialBaselineSubmissionV04 }
     *     
     */
    public MxTsmt01900104 setInitlBaselnSubmissn(InitialBaselineSubmissionV04 value) {
        this.initlBaselnSubmissn = value;
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
    public static MxTsmt01900104 parse(String xml) {
        return ((MxTsmt01900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01900104 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01900104 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01900104) parserImpl.read(MxTsmt01900104 .class, xml, _classes));
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
     * Creates an MxTsmt01900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01900104 message
     * @return
     *     a new instance of MxTsmt01900104
     */
    public final static MxTsmt01900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01900104 .class);
    }

}
