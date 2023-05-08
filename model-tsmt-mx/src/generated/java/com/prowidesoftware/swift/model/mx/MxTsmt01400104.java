
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
 * Class for tsmt.014.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dataSetSubmissn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.04")
public class MxTsmt01400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DataSetSubmissn", required = true)
    protected DataSetSubmissionV04 dataSetSubmissn;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 14;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, Adjustment6 .class, AdjustmentDirection1Code.class, AdjustmentType1Choice.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, AmountOrPercentage2Choice.class, BICIdentification1 .class, CashAccount24 .class, CashAccountType2Choice.class, CertificateDataSet2 .class, CertifiedCharacteristics2Choice.class, Charge25 .class, ChargeType8Code.class, ChargesDetails4 .class, ChargesType1Choice.class, CommercialDataSet4 .class, Consignment3 .class, CurrencyAndAmount.class, DataSetSubmissionReferences3 .class, DataSetSubmissionV04 .class, DatePeriodDetails.class, DocumentIdentification1 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericAccountIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, Incoterms4 .class, Incoterms4Choice.class, InstructionType3 .class, InstructionType3Code.class, InsuranceClauses1Code.class, InsuranceDataSet1 .class, InvoiceIdentification1 .class, LineItem12 .class, LineItemAndPOIdentification1 .class, LineItemDetails11 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt01400104 .class, NameAndAddress6 .class, OtherCertificateDataSet1 .class, PartyIdentification26 .class, PartyIdentification29Choice.class, PaymentCodeOrOther1Choice.class, PaymentPeriod3 .class, PaymentTerms4 .class, PaymentTime3Code.class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity10 .class, Quantity9 .class, SettlementTerms3 .class, ShipmentDate1Choice.class, SimpleIdentificationInformation.class, SingleTransport3 .class, SingleTransport6 .class, Tax22 .class, TaxType2Choice.class, TaxType9Code.class, TradeCertificateType1Code.class, TradeCertificateType2Code.class, TransportByAir2 .class, TransportByAir4 .class, TransportByRail2 .class, TransportByRail4 .class, TransportByRoad2 .class, TransportByRoad4 .class, TransportBySea4 .class, TransportBySea5 .class, TransportDataSet4 .class, TransportDetails3 .class, TransportMeans4 .class, TransportedGoods1 .class, UnitOfMeasure3Choice.class, UnitPrice18 .class, UserDefinedInformation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.04";

    public MxTsmt01400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01400104(final String xml) {
        this();
        MxTsmt01400104 tmp = parse(xml);
        dataSetSubmissn = tmp.getDataSetSubmissn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dataSetSubmissn property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetSubmissionV04 }
     *     
     */
    public DataSetSubmissionV04 getDataSetSubmissn() {
        return dataSetSubmissn;
    }

    /**
     * Sets the value of the dataSetSubmissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetSubmissionV04 }
     *     
     */
    public MxTsmt01400104 setDataSetSubmissn(DataSetSubmissionV04 value) {
        this.dataSetSubmissn = value;
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
    public static MxTsmt01400104 parse(String xml) {
        return ((MxTsmt01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt01400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt01400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt01400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01400104 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01400104) parserImpl.read(MxTsmt01400104 .class, xml, _classes));
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
     * Creates an MxTsmt01400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01400104 message
     * @return
     *     a new instance of MxTsmt01400104
     */
    public static final MxTsmt01400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01400104 .class);
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
