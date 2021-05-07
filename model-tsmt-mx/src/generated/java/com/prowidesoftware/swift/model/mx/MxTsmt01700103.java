
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
 * Class for tsmt.017.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fwdDataSetSubmissnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.03")
public class MxTsmt01700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FwdDataSetSubmissnRpt", required = true)
    protected ForwardDataSetSubmissionReportV03 fwdDataSetSubmissnRpt;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, Action2Code.class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, BICIdentification1 .class, BaselineStatus3Code.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CertificateDataSet1 .class, CertifiedCharacteristics1Choice.class, Charge13 .class, ChargeType8Code.class, ChargesDetails2 .class, CommercialDataSet3 .class, Consignment1 .class, CurrencyAndAmount.class, DataSetSubmissionReferences4 .class, DatePeriodDetails.class, DocumentIdentification1 .class, DocumentIdentification3 .class, DocumentIdentification5 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, ForwardDataSetSubmissionReportV03 .class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1Code.class, Incoterms2 .class, InsuranceClauses1Code.class, InsuranceDataSet1 .class, InvoiceIdentification1 .class, LineItem9 .class, LineItemAndPOIdentification1 .class, LineItemDetails9 .class, MessageIdentification1 .class, MultimodalTransport3 .class, MxTsmt01700103 .class, NameAndAddress6 .class, OtherCertificateDataSet1 .class, PartyIdentification26 .class, PartyIdentification29Choice.class, PaymentPeriod1 .class, PaymentTerms1 .class, PaymentTime1Code.class, PendingActivity2 .class, PostalAddress2 .class, PostalAddress5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity3 .class, Quantity4 .class, SettlementTerms2 .class, SimpleIdentificationInformation.class, SimpleIdentificationInformation2 .class, SingleTransport3 .class, SingleTransport5 .class, Tax12 .class, TaxType9Code.class, TradeCertificateType1Code.class, TradeCertificateType2Code.class, TransportByAir2 .class, TransportByRail2 .class, TransportByRoad2 .class, TransportBySea4 .class, TransportDataSet3 .class, TransportDetails2 .class, TransportMeans2 .class, TransportedGoods1 .class, UnitPrice9 .class, UserDefinedInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.03";

    public MxTsmt01700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01700103(final String xml) {
        this();
        MxTsmt01700103 tmp = parse(xml);
        fwdDataSetSubmissnRpt = tmp.getFwdDataSetSubmissnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fwdDataSetSubmissnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardDataSetSubmissionReportV03 }
     *     
     */
    public ForwardDataSetSubmissionReportV03 getFwdDataSetSubmissnRpt() {
        return fwdDataSetSubmissnRpt;
    }

    /**
     * Sets the value of the fwdDataSetSubmissnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardDataSetSubmissionReportV03 }
     *     
     */
    public MxTsmt01700103 setFwdDataSetSubmissnRpt(ForwardDataSetSubmissionReportV03 value) {
        this.fwdDataSetSubmissnRpt = value;
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
    public static MxTsmt01700103 parse(String xml) {
        return ((MxTsmt01700103) MxReadImpl.parse(MxTsmt01700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01700103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01700103) parserImpl.read(MxTsmt01700103 .class, xml, _classes));
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
     * Creates an MxTsmt01700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01700103 message
     * @return
     *     a new instance of MxTsmt01700103
     */
    public final static MxTsmt01700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt01700103 .class);
    }

}
