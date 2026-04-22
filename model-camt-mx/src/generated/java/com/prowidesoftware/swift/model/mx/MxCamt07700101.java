
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
 * Class for camt.077.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bllgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.077.001.01")
public class MxCamt07700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BllgRpt", required = true)
    protected BillingReportV01 bllgRpt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 77;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification38Choice.class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Adjustment5 .class, AdjustmentDirection1Code.class, AmountAndForeignExchange1 .class, BillingCancellationReport3 .class, BillingFeeRecord1 .class, BillingReport6 .class, BillingReportOrError6Choice.class, BillingReportV01 .class, BillingTaxRecord2 .class, CancellationReason16Choice.class, Contact13 .class, CreditDebitCode.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, ForeignExchangeTerms24 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, InvoiceLegalIssue5 .class, InvoiceTotals7 .class, InvoiceTotals8 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader11 .class, MxCamt07700101 .class, NameAndAddress5 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, OtherContact1 .class, Party52Choice.class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentification272 .class, PaymentMethod3Choice.class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress27 .class, PreferredContactMethod2Code.class, RequestType4Choice.class, SecuritiesAccount19 .class, ServiceCategory1Choice.class, ServiceCategoryTotals7 .class, ServiceCategoryTotals8 .class, ServiceItemTotals10 .class, ServiceItemTotals11 .class, ServiceItemTotals12 .class, ServiceItemTotals13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemAndCurrency1 .class, SystemIdentification2Choice.class, TaxExemption1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.077.001.01";

    public MxCamt07700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt07700101(final String xml) {
        this();
        MxCamt07700101 tmp = parse(xml);
        bllgRpt = tmp.getBllgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt07700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bllgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BillingReportV01 }
     *     
     */
    public BillingReportV01 getBllgRpt() {
        return bllgRpt;
    }

    /**
     * Sets the value of the bllgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingReportV01 }
     *     
     */
    public MxCamt07700101 setBllgRpt(BillingReportV01 value) {
        this.bllgRpt = value;
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
    public static MxCamt07700101 parse(String xml) {
        return ((MxCamt07700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt07700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt07700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt07700101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt07700101) parserImpl.read(MxCamt07700101 .class, xml, _classes));
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
     * Creates an MxCamt07700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt07700101 message
     * @return
     *     a new instance of MxCamt07700101
     */
    public static final MxCamt07700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt07700101 .class);
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
