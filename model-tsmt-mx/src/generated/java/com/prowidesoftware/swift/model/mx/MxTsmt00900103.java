
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
 * Class for tsmt.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "baselnAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.03")
public class MxTsmt00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BaselnAmdmntReq", required = true)
    protected BaselineAmendmentRequestV03 baselnAmdmntReq;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, Adjustment3 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, AssuredType1Code.class, BICIdentification1 .class, Baseline3 .class, BaselineAmendmentRequestV03 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, Charge12 .class, ChargeType8Code.class, ChargesDetails1 .class, ContactIdentification1 .class, ContactIdentification3 .class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1 .class, Incoterms1Code.class, InsuranceClauses1Code.class, LineItem7 .class, LineItemDetails7 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt00900103 .class, NameAndAddress6 .class, NamePrefix1Code.class, PartyIdentification26 .class, PartyIdentification27 .class, PaymentObligation1 .class, PaymentPeriod1 .class, PaymentPeriod2 .class, PaymentTerms1 .class, PaymentTerms2 .class, PaymentTime1Code.class, PaymentTime2Code.class, PercentageTolerance1 .class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity4 .class, RequiredSubmission2 .class, RequiredSubmission3 .class, RequiredSubmission4 .class, RequiredSubmission5 .class, SettlementTerms2 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule1Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation2 .class, SingleTransport4 .class, Tax13 .class, TaxType9Code.class, TradeCertificateType1Code.class, TradeCertificateType2Code.class, TradeFinanceService2Code.class, TransportByAir3 .class, TransportByRail3 .class, TransportByRoad3 .class, TransportBySea3 .class, TransportMeans1 .class, UnitPrice9 .class, UserDefinedInformation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.03";

    public MxTsmt00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00900103(final String xml) {
        this();
        MxTsmt00900103 tmp = parse(xml);
        baselnAmdmntReq = tmp.getBaselnAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the baselnAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineAmendmentRequestV03 }
     *     
     */
    public BaselineAmendmentRequestV03 getBaselnAmdmntReq() {
        return baselnAmdmntReq;
    }

    /**
     * Sets the value of the baselnAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineAmendmentRequestV03 }
     *     
     */
    public MxTsmt00900103 setBaselnAmdmntReq(BaselineAmendmentRequestV03 value) {
        this.baselnAmdmntReq = value;
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
    public static MxTsmt00900103 parse(String xml) {
        return ((MxTsmt00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00900103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00900103) parserImpl.read(MxTsmt00900103 .class, xml, _classes));
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
     * Creates an MxTsmt00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00900103 message
     * @return
     *     a new instance of MxTsmt00900103
     */
    public static final MxTsmt00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt00900103 .class);
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
