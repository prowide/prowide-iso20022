
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.019.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "initlBaselnSubmissn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.03")
public class MxTsmt01900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InitlBaselnSubmissn", required = true)
    protected InitialBaselineSubmissionV03 initlBaselnSubmissn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, Adjustment3 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, AssuredType1Code.class, BICIdentification1 .class, Baseline3 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, Charge12 .class, ChargeType8Code.class, ChargesDetails1 .class, ContactIdentification1 .class, ContactIdentification3 .class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1 .class, Incoterms1Code.class, InitialBaselineSubmissionV03 .class, InstructionType1 .class, InstructionType1Code.class, InsuranceClauses1Code.class, LineItem7 .class, LineItemDetails7 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt01900103 .class, NameAndAddress6 .class, NamePrefix1Code.class, PartyIdentification26 .class, PartyIdentification27 .class, PaymentObligation1 .class, PaymentPeriod1 .class, PaymentPeriod2 .class, PaymentTerms1 .class, PaymentTerms2 .class, PaymentTime1Code.class, PaymentTime2Code.class, PercentageTolerance1 .class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity4 .class, RequiredSubmission2 .class, RequiredSubmission3 .class, RequiredSubmission4 .class, RequiredSubmission5 .class, SettlementTerms2 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule1Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation2 .class, SingleTransport4 .class, Tax13 .class, TaxType9Code.class, TradeCertificateType1Code.class, TradeCertificateType2Code.class, TradeFinanceService2Code.class, TransportByAir3 .class, TransportByRail3 .class, TransportByRoad3 .class, TransportBySea3 .class, TransportMeans1 .class, UnitPrice9 .class, UserDefinedInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.03";

    public MxTsmt01900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01900103(final String xml) {
        this();
        MxTsmt01900103 tmp = parse(xml);
        initlBaselnSubmissn = tmp.getInitlBaselnSubmissn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the initlBaselnSubmissn property.
     * 
     * @return
     *     possible object is
     *     {@link InitialBaselineSubmissionV03 }
     *     
     */
    public InitialBaselineSubmissionV03 getInitlBaselnSubmissn() {
        return initlBaselnSubmissn;
    }

    /**
     * Sets the value of the initlBaselnSubmissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialBaselineSubmissionV03 }
     *     
     */
    public MxTsmt01900103 setInitlBaselnSubmissn(InitialBaselineSubmissionV03 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsmt01900103 parse(String xml) {
        return ((MxTsmt01900103) MxReadImpl.parse(MxTsmt01900103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01900103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01900103) parserImpl.read(MxTsmt01900103 .class, xml, _classes));
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
     * Creates an MxTsmt01900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01900103 message
     * @return
     *     a new instance of MxTsmt01900103
     */
    public final static MxTsmt01900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01900103 .class);
    }

}
